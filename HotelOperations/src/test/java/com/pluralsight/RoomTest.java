package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        //arrange
        Room room = new Room(1, 139.99, true, true);
        //act
        room.checkIn();
        //assert
        assertFalse(room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void checkout() {
        //arrange
        Room room = new Room(1, 139.99, true, true);
        //act
        room.checkout();
        //assert
        assertFalse(room.isAvailable());
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        //arrange
        Room room = new Room(1, 139.99, false, true);
        //act
        room.cleanRoom();
        //assert
        assertFalse(room.isDirty());
        assertTrue(room.isAvailable());
    }
}