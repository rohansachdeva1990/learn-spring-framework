package com.rohan.springmvc.demo.model;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;

    private String lastName;

    private String country;

    private String course;

    private String status;

    private String favLanguage;

    private String[] operatingSystems;
    
    private LinkedHashMap<String, String> courseOptions;

    public Student() {
        // To be used by spring to instantiate the model object

        courseOptions = new LinkedHashMap<>();

        courseOptions.put("MS", "Master of Science");
        courseOptions.put("BTech", "Bacheclor of Technology");
        courseOptions.put("MBA", "Master of Businees Administration");
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LinkedHashMap<String, String> getCourseOptions() {
        return courseOptions;
    }

    public String getFavLanguage() {
        return favLanguage;
    }

    public void setFavLanguage(String favLanguage) {
        this.favLanguage = favLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    
    @Override
    public String toString() {
        return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country + ", course=" + course + ", status=" + status
                + ", favLanguage=" + favLanguage + "]";
    }
}
