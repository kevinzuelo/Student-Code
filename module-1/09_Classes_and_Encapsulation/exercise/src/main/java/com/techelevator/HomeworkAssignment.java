package com.techelevator;

public class HomeworkAssignment {
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade = "";

    public HomeworkAssignment(int possibleMarks, String submitterName) {
        this.possibleMarks = possibleMarks;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMarks) {
        this.earnedMarks = earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {
        if((double)earnedMarks / possibleMarks >= .90) {
            this.letterGrade = "A";
        }
        else if((double)earnedMarks / possibleMarks >= .80 && (double)earnedMarks / possibleMarks <= .89 ) {
            this.letterGrade = "B";
        }
        else if((double)earnedMarks / possibleMarks >= .70 && (double)earnedMarks / possibleMarks <= .79 ) {
            this.letterGrade = "C";
        }
        else if((double)earnedMarks / possibleMarks >= .60 && (double)earnedMarks / possibleMarks <= .69 ) {
            this.letterGrade = "D";
        }
        else {
            this.letterGrade = "F";
        }
        return letterGrade;
    }
}
