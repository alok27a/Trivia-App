package com.alok.triviaapp;

public class Question {
    private String question;
    private Boolean correctAnswer;

    public String getQuestion() {
        return question;
    }

    public Question(String question, Boolean correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}