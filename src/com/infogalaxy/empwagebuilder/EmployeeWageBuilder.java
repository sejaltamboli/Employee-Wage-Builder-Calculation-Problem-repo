package com.infogalaxy.empwagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome To Employee Wage Made By Sejal Tamboli");
        //UC-2 Calculate Daily Employee Wage
        //UC-6 Calculate 100 hrs
        int working_days = 0;
        int working_hrs = 0;
        Random random = new Random();
        //UC-5 Calculate Wages for Month (20 Working days)
        while(working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS){
            int total_wage = 0;
            working_days++;
            System.out.println("Day : " +working_days);
            int empAttendance = random.nextInt() % 2;
            //UC-1 Check Employee Attendance
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                //UC-3 Add Part Time Employee and Wage
                int emp_Type = random.nextInt() % 2;
                //UC-4 Using switch case
                if(emp_Type < 0) {
                    emp_Type = -emp_Type;
                }
                switch (emp_Type) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part Time");
                        total_wage = Constants.WAGES_PER_HR * Constants.PART_TIME_HR;
                        working_hrs = working_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full Time");
                        total_wage = Constants.WAGES_PER_HR * Constants.FULL_TIME_HR;
                        working_hrs = working_hrs + Constants.FULL_TIME_HR;
                        break;
                }
            }
            System.out.println("Total Wage = " + total_wage);
            System.out.println("Total Working Hrs = " + working_hrs);
        }

    }
}
