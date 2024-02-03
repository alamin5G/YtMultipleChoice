package com.goonok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Question {
    private String question;
    private ArrayList<String> choices;
    private String answer;

    public Question(String question, String answer, String... choice) {
        this.question = question;
        this.choices = new ArrayList<>();
        this.choices.addAll(Arrays.asList(choice));
        Collections.shuffle(this.choices);
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<String> choices) {
        this.choices = choices;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
