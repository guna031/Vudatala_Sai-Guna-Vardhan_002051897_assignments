/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseSchedule {

    CourseCatalog coursecatalog;

    ArrayList<CourseOffer> schedule;
    String semester;

    public CourseSchedule(String s, CourseCatalog cc) {
        semester = s;
        coursecatalog = cc;
        schedule = new ArrayList();

    }

    public CourseOffer newCourseOffer(String  n) {

        Course c = coursecatalog.getCourseByNumber(n);
        if(c==null) return null;
        CourseOffer co;
        co = new CourseOffer(c);
        schedule.add(co);
        return co;
    }

    public CourseOffer getCourseOfferByNumber(String n) {

        for (CourseOffer co : schedule) {

            if (co.getCourseNumber().equals(n)) {
                return co;
            }
        }
        return null;
    }

    public int calculateTotalRevenues() {
        int sum = 0;
        for (CourseOffer co : schedule) {

            sum = sum + co.getTotalCourseRevenues();

        }
        return sum;
    }
    
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Course Schedule for Semester: ").append(semester).append("\n");
//        for (CourseOffer co : schedule) {
//            sb.append("Course: ").append(co.getCourseNumber())
//              .append(" - ").append(co.getSubjectCourse().getName()).append("\n");
//        }
//        return sb.toString();
//    }
    
     public void displayCourses() {
    if (schedule.isEmpty()) {
        System.out.println("No courses available in the catalog.");
    } else {
        System.out.println("Courses in the catalog:");
        for (CourseOffer co : schedule) {
            System.out.println("Course Name: " + co.getCourse().getName()
                    + ", Faculty: " + co.getFacultyProfile()
                    + ", Total number of Seats: " + co.getNumberOfSeats());
        }
    }
}


}
