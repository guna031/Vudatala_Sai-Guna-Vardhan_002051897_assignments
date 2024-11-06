/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Department;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Employer.EmployerDirectory;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Department {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CourseCatalog getCoursecatalog() {
        return coursecatalog;
    }

    public void setCoursecatalog(CourseCatalog coursecatalog) {
        this.coursecatalog = coursecatalog;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }

    public void setFacultydirectory(FacultyDirectory facultydirectory) {
        this.facultydirectory = facultydirectory;
    }

    public EmployerDirectory getEmployerdirectory() {
        return employerdirectory;
    }

    public void setEmployerdirectory(EmployerDirectory employerdirectory) {
        this.employerdirectory = employerdirectory;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public HashMap<String, CourseSchedule> getMastercoursecatalog() {
        return mastercoursecatalog;
    }

    public void setMastercoursecatalog(HashMap<String, CourseSchedule> mastercoursecatalog) {
        this.mastercoursecatalog = mastercoursecatalog;
    }

    String name;
    CourseCatalog coursecatalog;
    PersonDirectory persondirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    EmployerDirectory employerdirectory;
    Degree degree;

    HashMap<String, CourseSchedule> mastercoursecatalog;

    public Department(String n) {
        name = n;
        mastercoursecatalog = new HashMap<>();
        coursecatalog = new CourseCatalog(this);
        studentdirectory = new StudentDirectory(this); //pass the department object so it stays linked to it
        persondirectory = new PersonDirectory();
        degree = new Degree("MSIS");
        
    }
    public void addCoreCourse(Course c){
        degree.addCoreCourse(c);
        
    }
public void addElectiveCourse(Course c){
        degree.addElectiveCourse(c);
        
    }
    public PersonDirectory getPersonDirectory() {

        return persondirectory;

    }

    public StudentDirectory getStudentDirectory() {
    return studentdirectory;
    }

    public CourseSchedule newCourseSchedule(String semester) {

        CourseSchedule cs = new CourseSchedule(semester, coursecatalog);
        mastercoursecatalog.put(semester, cs);
        return cs;
    }

    public CourseSchedule getCourseSchedule(String semester) {

        return mastercoursecatalog.get(semester);

    }

    public CourseCatalog getCourseCatalog() {

        return coursecatalog;

    }

    public Course newCourse(String n, String nm, int cr) {

        Course c = coursecatalog.newCourse(n, nm, cr);
        return c;
    }

    public int calculateRevenuesBySemester(String semester) {

        CourseSchedule css = mastercoursecatalog.get(semester);

        return css.calculateTotalRevenues();

    }

    public void RegisterForAClass(String studentid, String cn, String semester) {

        StudentProfile sp = studentdirectory.findStudent(studentid);

        CourseLoad cl = sp.getCurrentCourseLoad();

        CourseSchedule cs = mastercoursecatalog.get(semester);

        CourseOffer co = cs.getCourseOfferByNumber(cn);

        co.assignEmptySeat(cl);

    }
    
    @Override
    public String toString(){
        return getName();
    }
    
    public void generateSemesterReport(String semester) {
    System.out.println("*****************************");
    System.out.println("Semester Report for " + semester);
    System.out.println("*****************************");

    int totalStudents = 0;
    float totalSemesterGPA = 0;
    int totalSemesterFees = 0;

    for (StudentProfile student : studentdirectory.getStudentlist()) {
        CourseLoad courseLoad = student.getCourseLoadBySemester(semester);
        if (courseLoad == null) continue; 

        totalStudents++;
        float totalGradePoints = 0;
        int totalCredits = 0;
        int totalFees = 0;

        printStudentHeader(student);

        for (SeatAssignment sa : courseLoad.getSeatAssignments()) {
            CourseOffer courseOffer = sa.getCourseOffer();
            FacultyProfile professor = courseOffer.getFacultyProfile();
            Course course = courseOffer.getCourse();
            float grade = sa.getGrade();
            int credits = course.getCredits();
            int fee = course.getCoursePrice();

            printCourseDetails(course, professor, grade, credits, fee);

            totalGradePoints += grade * credits;
            totalCredits += credits;
            totalFees += fee;
        }

        float gpa = totalCredits == 0 ? 0 : totalGradePoints / totalCredits;
        totalSemesterGPA += gpa;
        totalSemesterFees += totalFees;

        printStudentSummary(gpa, totalFees);
    }

    printSemesterSummary(totalStudents, totalSemesterGPA, totalSemesterFees);
}

private void printStudentHeader(StudentProfile student) {
    System.out.println("Student: " + student.getPerson().getName());
    System.out.println("Courses Registered:");
}

private void printCourseDetails(Course course, FacultyProfile professor, float grade, int credits, int fee) {
    String letterGrade = mapToLetterGrade(grade);
    System.out.println("  - " + course.getName() +
                       " | Professor: " + (professor != null ? professor.getPerson().getName() : "N/A") +
                       " | Grade: " + grade + " (" + letterGrade + ")" +
                       " | Credits: " + credits +
                       " | Fee: $" + fee);
    System.out.println("    --------------------------");
}

private void printStudentSummary(float gpa, int totalFees) {
    System.out.println("Average GPA: " + String.format("%.2f", gpa));
    System.out.println("Total Tuition Fees Paid: $" + totalFees);
    System.out.println("**************************");
}

private void printSemesterSummary(int totalStudents, float totalGPA, int totalFees) {
    System.out.println("========= Semester Summary =========");
    System.out.println("Total Students Enrolled: " + totalStudents);
    System.out.println("Average GPA for Semester: " + (totalStudents == 0 ? 0 : String.format("%.2f", totalGPA / totalStudents)));
    System.out.println("Total Tuition Fees Collected: $" + totalFees);
    System.out.println("**************************");
}

private String mapToLetterGrade(float grade) {
    if (grade >= 4.0) return "A";
    else if (grade >= 3.7) return "A-";
    else if (grade >= 3.3) return "B+";
    else if (grade >= 3.0) return "B";
    else if (grade >= 2.7) return "B-";
    else if (grade >= 2.3) return "C+";
    else if (grade >= 2.0) return "C";
    else if (grade >= 1.7) return "C-";
    else if (grade >= 1.3) return "D+";
    else if (grade >= 1.0) return "D";
    else return "F";
}

    
    
}
