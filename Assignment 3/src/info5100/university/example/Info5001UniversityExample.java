/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Degree.Degree;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Department department = new Department("Computer Science");
        
        CourseCatalog coursecatalog = department.getCourseCatalog();
        Course coreCourse1 = coursecatalog.newCourse("Algorithms", "cs1222", 4);
        Course coreCourse2 = coursecatalog.newCourse("Programming languages", "cs1223", 4);
        Course electiveCourse1 = coursecatalog.newCourse("Data Science", "cs1224", 4);      
        Course electiveCourse2 = coursecatalog.newCourse("Web Design and User Experience", "cs1233", 4);
        Course electiveCourse3 = coursecatalog.newCourse("Artificial Intelligence", "cs1226", 4);
        Course electiveCourse4 = coursecatalog.newCourse("User Interface and User experience", "cs1999", 4);
        Course electiveCourse5 = coursecatalog.newCourse("Machine Learning", "cs1228", 4);
        
        coursecatalog.displayCourses();
        
        Degree degree = department.getDegree();
        degree.addCoreCourse(coreCourse1);
        degree.addCoreCourse(coreCourse2);
        degree.addElectiveCourse(electiveCourse1);
        degree.addCoreCourse(electiveCourse2);
        degree.addCoreCourse(electiveCourse3);
        degree.addCoreCourse(electiveCourse4);
        degree.addCoreCourse(electiveCourse5);
        
            
        CourseSchedule courseSchedule = department.newCourseSchedule("Spring2024");
        
        PersonDirectory persons = department.getPersonDirectory();
        
        FacultyProfile prof1 = new FacultyProfile(persons.newPerson("1111", "Alex"));
        FacultyProfile prof2 = new FacultyProfile(persons.newPerson("1112", "Kal Bhugrara"));
        FacultyProfile prof3 = new FacultyProfile(persons.newPerson("1113", "Akash Murthy"));
        FacultyProfile prof4 = new FacultyProfile(persons.newPerson("1114", "dino"));
        FacultyProfile prof5 = new FacultyProfile(persons.newPerson("1115", "Amuthan"));
        FacultyProfile prof6 = new FacultyProfile(persons.newPerson("1116", "Vishal chawla"));
        FacultyProfile prof7 = new FacultyProfile(persons.newPerson("1117", "Roberta"));
        FacultyProfile prof8 = new FacultyProfile(persons.newPerson("1118", "Alec"));
        
        
        CourseOffer coreOffer1 = courseSchedule.newCourseOffer("cs1222");
        coreOffer1.AssignAsTeacher(prof1);
        coreOffer1.generatSeats(25);
        
        CourseOffer coreOffer2 = courseSchedule.newCourseOffer("cs1223");
        coreOffer2.AssignAsTeacher(prof2);
        coreOffer2.generatSeats(33);       
        
        CourseOffer electiveOffer3 = courseSchedule.newCourseOffer("cs1224");
        electiveOffer3.AssignAsTeacher(prof3);
        electiveOffer3.generatSeats(30);  
        
        CourseOffer electiveOffer4 = courseSchedule.newCourseOffer("cs1233");
        electiveOffer4.AssignAsTeacher(prof4);
        electiveOffer4.generatSeats(100);         
 
        CourseOffer electiveOffer5 = courseSchedule.newCourseOffer("cs1226");
        electiveOffer5.AssignAsTeacher(prof5);
        electiveOffer5.generatSeats(150);
        
        CourseOffer electiveOffer6 = courseSchedule.newCourseOffer("cs1999");
        electiveOffer6.AssignAsTeacher(prof6);
        electiveOffer6.generatSeats(50);         
        
        CourseOffer electiveOffer7 = courseSchedule.newCourseOffer("cs1228");
        electiveOffer7.AssignAsTeacher(prof7);
        electiveOffer7.generatSeats(60); 
        
        CourseOffer electiveOffer3_1 = courseSchedule.newCourseOffer("cs1224");
        electiveOffer3_1.AssignAsTeacher(prof2);
        electiveOffer3_1.generatSeats(80);  
        
        CourseOffer coreOffer1_1 = courseSchedule.newCourseOffer("cs1222");
        coreOffer1_1.AssignAsTeacher(prof5);
        coreOffer1_1.generatSeats(45);
        
        CourseOffer electiveOffer6_1 = courseSchedule.newCourseOffer("cs1999");
        electiveOffer6_1.AssignAsTeacher(prof8);
        electiveOffer6_1.generatSeats(150);  
        
        courseSchedule.displayCourses();
        
        
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student1 = sd.newStudentProfile(persons.newPerson("0001", "V Sai Guna Vardhan"));
        StudentProfile student2 = sd.newStudentProfile(persons.newPerson("0002", "Hotragn"));
        StudentProfile student3 = sd.newStudentProfile(persons.newPerson("0003", "Varun"));
        StudentProfile student4 = sd.newStudentProfile(persons.newPerson("0004", "Krithik"));
        StudentProfile student5 = sd.newStudentProfile(persons.newPerson("0005", "Tirdesh"));
        StudentProfile student6 = sd.newStudentProfile(persons.newPerson("0006", "Abhinav"));
        StudentProfile student7 = sd.newStudentProfile(persons.newPerson("0007", "Aparna"));
        StudentProfile student8 = sd.newStudentProfile(persons.newPerson("0008", "Krithik"));
        StudentProfile student9 = sd.newStudentProfile(persons.newPerson("0009", "Krishna"));
        StudentProfile student10 = sd.newStudentProfile(persons.newPerson("00010", "Harsha"));
        
        CourseLoad courseLoad = student1.newCourseLoad("Spring2024");       
        courseLoad.newSeatAssignment(coreOffer1);
        courseLoad.newSeatAssignment(electiveOffer3);
        
        CourseLoad courseLoad2 = student2.newCourseLoad("Spring2024");       
        courseLoad2.newSeatAssignment(coreOffer1);
        courseLoad2.newSeatAssignment(electiveOffer5);
        
        CourseLoad courseLoad3 = student3.newCourseLoad("Spring2024");       
        courseLoad3.newSeatAssignment(coreOffer1);
        courseLoad3.newSeatAssignment(electiveOffer4);
        
        CourseLoad courseLoad4 = student4.newCourseLoad("Spring2024");       
        courseLoad4.newSeatAssignment(coreOffer2);
        courseLoad4.newSeatAssignment(electiveOffer7);
        
        CourseLoad courseLoad5 = student5.newCourseLoad("Spring2024");       
        courseLoad5.newSeatAssignment(coreOffer1);
        courseLoad5.newSeatAssignment(electiveOffer6);
        
        CourseLoad courseLoad6 = student6.newCourseLoad("Spring2024");       
        courseLoad6.newSeatAssignment(coreOffer1);
        courseLoad6.newSeatAssignment(electiveOffer6_1);
        
        CourseLoad courseLoad7 = student7.newCourseLoad("Spring2024");       
        courseLoad7.newSeatAssignment(coreOffer2);
        courseLoad7.newSeatAssignment(electiveOffer3_1);
        
        CourseLoad courseLoad8 = student8.newCourseLoad("Spring2024");       
        courseLoad8.newSeatAssignment(coreOffer2);
        courseLoad8.newSeatAssignment(electiveOffer3_1);
        
        CourseLoad courseLoad9 = student9.newCourseLoad("Spring2024");       
        courseLoad9.newSeatAssignment(coreOffer1_1);
        courseLoad9.newSeatAssignment(electiveOffer6);
        
        CourseLoad courseLoad10 = student10.newCourseLoad("Spring2024");       
        courseLoad10.newSeatAssignment(coreOffer1);
        courseLoad10.newSeatAssignment(electiveOffer7);
        
        courseLoad.getSeatAssignments().get(0).setGrade(3.7f); 
        courseLoad.getSeatAssignments().get(1).setGrade(3.3f); 

        courseLoad2.getSeatAssignments().get(0).setGrade(3.0f); 
        courseLoad2.getSeatAssignments().get(1).setGrade(3.7f); 

        courseLoad3.getSeatAssignments().get(0).setGrade(4.0f); 
        courseLoad3.getSeatAssignments().get(1).setGrade(3.3f); 

        courseLoad4.getSeatAssignments().get(0).setGrade(3.3f); 
        courseLoad4.getSeatAssignments().get(1).setGrade(3.7f); 

        courseLoad5.getSeatAssignments().get(0).setGrade(3.0f);
        courseLoad5.getSeatAssignments().get(1).setGrade(3.3f); 

        courseLoad6.getSeatAssignments().get(0).setGrade(3.7f);
        courseLoad6.getSeatAssignments().get(1).setGrade(4.0f);

        courseLoad7.getSeatAssignments().get(0).setGrade(3.0f); 
        courseLoad7.getSeatAssignments().get(1).setGrade(3.3f); 

        courseLoad8.getSeatAssignments().get(0).setGrade(4.0f); 
        courseLoad8.getSeatAssignments().get(1).setGrade(3.0f); 

        courseLoad9.getSeatAssignments().get(0).setGrade(3.7f); 
        courseLoad9.getSeatAssignments().get(1).setGrade(3.3f);

        courseLoad10.getSeatAssignments().get(0).setGrade(4.0f); 
        courseLoad10.getSeatAssignments().get(1).setGrade(3.0f); 

        department.generateSemesterReport("Spring2024");
 
                
                }

}
