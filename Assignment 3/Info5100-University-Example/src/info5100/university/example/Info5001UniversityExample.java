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
import info5100.university.example.Department.Department;
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
        // TODO code application logic here
        Department department = new Department("Computer Science");
        
        CourseCatalog coursecatalog = department.getCourseCatalog();
        Course coreCourse1 = coursecatalog.newCourse("Algorithms", "cs1222", 4);
        Course coreCourse2 = coursecatalog.newCourse("Programming languages", "cs1223", 4);
        Course electiveCourse1 = coursecatalog.newCourse("Data Science", "cs1224", 4);      
        Course electiveCourse2 = coursecatalog.newCourse("Web Design and User Experience", "cs1233", 4);
        Course electiveCourse3 = coursecatalog.newCourse("Artificial Intelligence", "cs1226", 4);
        Course electiveCourse4 = coursecatalog.newCourse("User Interface and User experience", "cs1999", 4);
        Course electiveCourse5 = coursecatalog.newCourse("Machine Learning", "cs1228", 4);
       
        CourseSchedule courseschedule = department.newCourseSchedule("Fall2020");

        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        if (courseoffer==null)return;
        courseoffer.generatSeats(10);
        PersonDirectory pd = department.getPersonDirectory();
        Person person = pd.newPerson("0112303");
        StudentDirectory sd = department.getStudentDirectory();
        StudentProfile student = sd.newStudentProfile(person);
        CourseLoad courseload = student.newCourseLoad("Fall2020"); 
//        
        courseload.newSeatAssignment(courseoffer); //register student in class
        
        int total = department.calculateRevenuesBySemester("Fall2020");
        System.out.print("Total: " + total);

    }

}
