package com.infogalaxy.empwagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome To Employee Wage Made By Sejal Tamboli");
        //u-2 Calculate Daily Employee Wage
        final int WAGE_PER_HR = 20;
        final int PART_TIME = 4;
        final int FULL_TIME = 8;

        Random random = new Random();
        //UC-5 Calculate Wages for Month (20 Working days)
        for (int i = 1; i <= 20; i++) {
            int total_wage = 0;
            int empAttendance = random.nextInt() % 2;
            //UC-1 Check Employee Attendance
            System.out.println(empAttendance);
            if (empAttendance == 0) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                //UC-3 Add Part Time Employee and Wage
                int emp_Type = random.nextInt() % 2;
                //UC-4 Using switch case
                switch (emp_Type) {
                    case 0:
                        System.out.println("Employee is Part Time");
                        total_wage = WAGE_PER_HR * PART_TIME;
                        break;
                    case 1:
                    case -1:
                        System.out.println("Employee is Full Time");
                        total_wage = WAGE_PER_HR * FULL_TIME;
                        break;
                }
            }
            System.out.println("Total Wage = " + total_wage);
        }

    }
}
