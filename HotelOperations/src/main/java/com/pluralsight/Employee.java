package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private double endTime;

    public Employee(long employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.startTime = -1;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    public double getTotalPay() {
        return (getRegularHours() * payRate) + (getOvertimeHours() * payRate);
    }

    public void punchIn(double time) {
        if (startTime == -1) {
            startTime = time;
        }
    }
    public void punchIn() {
    LocalTime now = LocalTime.now();

    if (startTime == -1) {
        startTime = now.getHour();
        }
    }
    public  void punchout(double time) {
        if (startTime != -1) {
            double worked = time - startTime;
            hoursWorked += worked;
            startTime = -1;
        }
    }
    public void punchOut() {
        LocalTime now = LocalTime.now();

        if (startTime != -1) {
            double endTime = now.getHour();
            double worked = endTime - startTime;
            hoursWorked += worked;
            startTime = -1;
        }
    }
}

