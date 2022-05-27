package com.techelevator;

public class Airplane {
    private String planeNumber;
    private int totalFirstClassSeats;
    private int bookedFirstClassSeats;
    private int availableFirstClassSeats;
    private int totalCoachSeats;
    private int bookedCoachSeats;
    private int availableCoachSeats;

    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;
    }

    public String getPlaneNumber() {
        return this.planeNumber;
    }

    public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }

    public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }

    public int getAvailableFirstClassSeats() {
        this.availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
        return availableFirstClassSeats;
    }

    public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

    public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }

    public int getAvailableCoachSeats() {
        this.availableCoachSeats = totalCoachSeats - bookedCoachSeats;
        return availableCoachSeats;
    }

    public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
        if(forFirstClass) {
            if(bookedFirstClassSeats + totalNumberOfSeats <= this.getAvailableFirstClassSeats()) {
                bookedFirstClassSeats += totalNumberOfSeats;
                return true;
            }
            return false;
        }
        else {
            if(bookedCoachSeats + totalNumberOfSeats <= this.getAvailableCoachSeats()) {
                bookedCoachSeats += totalNumberOfSeats;
                return true;
            }
            return false;
        }
    }
}
