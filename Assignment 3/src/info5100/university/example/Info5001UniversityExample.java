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
        
        
       
 
                
                }

}
