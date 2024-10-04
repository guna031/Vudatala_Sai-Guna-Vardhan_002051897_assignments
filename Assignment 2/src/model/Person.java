/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gunav
 */
public class Person {

    String firstName;
    String lastName;
    String socialSecurityNumber;
    int age;
    Address homeAdd;
    Address workAdd;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getHomeAdd() {
        return homeAdd;
    }

    public void setHomeAdd(Address homeAdd) {
        this.homeAdd = homeAdd;
    }

    public Address getWorkAdd() {
        return workAdd;
    }

    public void setWorkAdd(Address workAdd) {
        this.workAdd = workAdd;
    }

}
