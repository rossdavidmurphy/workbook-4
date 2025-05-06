package com.pluralsight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Room room = new Room(1, 109, false, false);
        System.out.println(room.isAvailable());

        Reservation reservation = new Reservation("King", 139.00,1, true);
        System.out.println(reservation.getReservationTotal());

        Employee employee = new Employee(111, "Max", "Customer Service", 50.00, 80);
        System.out.println(employee.getTotalPay());
    }
}
