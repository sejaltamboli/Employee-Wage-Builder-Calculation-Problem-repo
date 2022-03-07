package com.infogalaxy.empwagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[]args){
        //Welcome message for User
        System.out.println("Welcome To Employee Wage Made By Sejal Tamboli");
        //u-2 Calculate Daily Employee Wage
        final int WAGE_PER_HR = 20;
        final int FULL_DAY_HR = 8;
        int total_wage = 0;
        //UC-1 Employee Attendance
        Random random=new Random();
        int empAttendance= random.nextInt()%2;
            System.out.println(empAttendance);
        if(empAttendance == 0) {
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is Present");
            total_wage = WAGE_PER_HR * FULL_DAY_HR;
        }
        System.out.println("Total Wage = " + total_wage);
    }

}
