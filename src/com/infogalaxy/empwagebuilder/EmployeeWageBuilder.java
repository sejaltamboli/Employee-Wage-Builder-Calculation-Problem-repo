package com.infogalaxy.empwagebuilder;

import java.util.Random;

public class EmployeeWageBuilder {

    int working_days = 0;
    int working_hrs = 0;
    int total_wage = 0;
    Random random = new Random();

     public void  calculationwage() {
        System.out.println("Welcome To Employee Wage Made By Sejal Tamboli");
        while (working_hrs <= Constants.TOTAL_WORKING_HRS && working_days < Constants.WORKING_DAYS) {
            working_days++;
            System.out.println("Day : " + working_days);
            int empAttendance = random.nextInt() % 2;
            if (empAttendance == Constants.IS_ABSENT) {
                System.out.println("Employee is Absent");
            } else {
                System.out.println("Employee is Present");
                int emp_Type = random.nextInt() % 2;
                if (emp_Type < 0) {
                    emp_Type = -emp_Type;
                }
                switch (emp_Type) {
                    case Constants.IS_PART_TIME:
                        System.out.println("Employee is Part Time");
                        total_wage = total_wage + (Constants.WAGES_PER_HR * Constants.PART_TIME_HR);
                        working_hrs = working_hrs + Constants.PART_TIME_HR;
                        break;
                    case Constants.IS_FULL_TIME:
                        System.out.println("Employee is Full Time");
                        total_wage = total_wage + (Constants.WAGES_PER_HR * Constants.FULL_TIME_HR);
                        working_hrs = working_hrs + Constants.FULL_TIME_HR;
                        break;
                }
            }
        }
    }
    public void  displaywage() {
        System.out.println("Total Wage = " + total_wage);
        System.out.println("Total Working Hrs = " + working_hrs);
    }

    public static void main(String[] args) {
        EmployeeWageBuilder E1 = new EmployeeWageBuilder();
        E1.calculationwage();
        E1.displaywage();
    }
}


