package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied = true;
    private boolean isDirty = true;

    public Room(int numberOfBed, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBed;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
    public void checkIn() {
        this.isOccupied = true;
        this.isDirty = true;
    }
    public void checkout() {
        this.isOccupied = false;
        this.isDirty = true;
        System.out.println("Clean room");
    }
    public void cleanRoom() {
        this.isDirty = false;
    }
}
