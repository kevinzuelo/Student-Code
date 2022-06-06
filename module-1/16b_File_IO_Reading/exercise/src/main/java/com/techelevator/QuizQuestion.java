package com.techelevator;

public class QuizQuestion {
    private String question;
    private String[] answers;
    private String correctAnswer;

    public QuizQuestion(String[] splitLine) {
        answers = new String[]{splitLine[1],splitLine[2],splitLine[3],splitLine[4]};
        question = splitLine[0];
        setCorrectAnswer();
    }

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer() {
        for(String str : answers) {
            if(str.endsWith("*")) {
                correctAnswer = str;
            }
        }
    }

    public void printAnswers() {
        int questionCounter = 1;
        for(String str: answers) {
            if(str.endsWith("*")) {
                System.out.println(questionCounter + ". " + str.substring(0,str.length() - 1));
                questionCounter++;
            }
            else{
                System.out.println(questionCounter + ". " + str);
                questionCounter++;
            }

        }
    }

}
