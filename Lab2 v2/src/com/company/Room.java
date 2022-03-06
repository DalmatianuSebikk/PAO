package com.company;

public class Room {
    private long roomNumber;
    private String roomType;
    private int roomFloor;

    public Room(long roomNumber, String roomType, int roomFloor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
    }

    public void printStats()
    {
        System.out.println("Camera " + getRoomNumber() + " este la etajul " + getRoomFloor() + " si este de tipul " + getRoomType());
    }

    public long getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int roomFloor) {
        this.roomFloor = roomFloor;
    }
}
