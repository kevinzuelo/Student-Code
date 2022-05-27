package com.techelevator;

public class Elevator {
    private int currentFloor;
    private int numberOfFloors;
    private boolean doorOpen;

    public Elevator(int numberOfLevels) {
        this.numberOfFloors = numberOfLevels;
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public boolean isDoorOpen() {
        return doorOpen;
    }

    public void openDoor() {
        if(!doorOpen) {
            this.doorOpen = true;
        }
    }

    public void closeDoor() {
        if(doorOpen) {
            this.doorOpen = false;
        }
    }

    public void goUp(int desiredFloor) {
        if(!doorOpen && desiredFloor <= numberOfFloors && desiredFloor > currentFloor) {
            this.currentFloor = desiredFloor;
        }
    }

    public void goDown(int desiredFloor) {
        if(!doorOpen && desiredFloor >= 1 && desiredFloor < currentFloor) {
            this.currentFloor = desiredFloor;
        }
    }
}
