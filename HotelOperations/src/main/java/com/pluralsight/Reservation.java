package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, double price, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

//    public String getRoomType() {
//        return roomType;
//
//    }

    public double getPrice() {
        if (this.roomType.equalsIgnoreCase("king")) {
            this.price = 139.00;
        } else if (this.roomType.equalsIgnoreCase("double")) {
            this.price = 124.00;
        } else
            throw new RuntimeException("Error: Invalid room option.");
        return price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public boolean isWeekend() {
        return this.isWeekend;

    }
    public double getReservationTotal() {
        if (isWeekend) {
            return (price * 1.10) * numberOfNights;
        } else {
            return price * numberOfNights;
        }
    }
}
