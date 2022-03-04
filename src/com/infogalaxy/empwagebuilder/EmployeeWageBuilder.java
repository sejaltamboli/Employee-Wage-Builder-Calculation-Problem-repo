package com.infogalaxy.empwagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[]args){
        System.out.println("Welcome To Employee Wage Made By Sejal Tamboli");
        //Create Random object and generate the 0 or 1 using % operator
        Random random=new Random();
        int empAttendance= random.nextInt()%2;{
            System.out.println(empAttendance);
        }
        //Checking for employee present or absent
        if(empAttendance==0) {
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is Present");
        }
    }
}
