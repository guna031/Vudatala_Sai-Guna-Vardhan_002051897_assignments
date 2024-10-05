/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author gunav
 */
public class Address {
    
    String streetAdd;
    char unitNum;
    String city;
    String state;
    int zipcode;
    long phnNum;

    public String getStreetAdd() {
        return streetAdd;
    }

    public void setStreetAdd(String streetAdd) {
        this.streetAdd = streetAdd;
    }

    public char getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(char unitNum) {
        this.unitNum = unitNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public long getPhnNum() {
        return phnNum;
    }

    public void setPhnNum(long phnNum) {
        this.phnNum = phnNum;
    }
    
}
