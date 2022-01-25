package com.company;

import java.util.*;

 class student{
     int id;
    String firstName;
    String lastName;
    double percentage;
    String location;

    private void setId(int id) {
        this.id = id;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    private void setLocation(String location) {
        this.location = location;
    }


//    public void setData(int id,String firstName,String lastName,double percentage,String location) {
//        this.id = id;
//        this.firstName=firstName;
//        this.lastName=lastName;
//        this.percentage=percentage;
//        this.location = location;
//    }

    public void print(){
        System.out.println(id + " | " + firstName + " | " + lastName + " | " + percentage + " | " + location);
    }

}
public class getterSetter extends student{
    public static void main(String[] args) {
        student st = new student();
        st.id=44;
        st.firstName="nuehekw";
        st.lastName="dhew";
        st.percentage=90.77;
        st.location="cuba";

        student st1 = new student();
        st1.id = 43;
        st1.firstName ="dijeu";
        st1.lastName = "snqenc";
        st1.percentage =80.88;
        st1.location="newyork";

        student st2 = new student();
       // st2.setData(42,"rajdeep","khachar",99.99,"Rajkot");
        st2.id=4;
        st2.firstName="salman";
        st2.lastName="khan";
        st2.percentage=77.08;
        st2.location="mumbai";

        st2.print();
//        st.print();
//        st1.print();

    }

}
