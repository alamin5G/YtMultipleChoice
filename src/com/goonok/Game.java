package com.goonok;

import java.util.*;

public class Game {

    private ArrayList<Question> questionsSet;
    public Game(){
        questionsSet = new ArrayList<>();
        String q = "Where does the Sun rise?";
        String[] a = {"East", "West", "North", "South"};
        questionsSet.add(new Question(q, "East", a));

        q = "Who invented the telephone?";
        a = new String[]{"Thomas Edison", "Michael Faraday", "James Watt", "Alexander Bell"};
        questionsSet.add(new Question(q, "Alexander Bell", a));

        q = "Where is the capital of Bangladesh?";
        a = new String[]{"Delhi", "Dhaka", "Karachi", "Sylhet"};
        questionsSet.add(new Question(q, "Dhaka", a));

        Collections.shuffle(questionsSet, new Random());
    }

    ///https://www.youtube.com/watch?v=28kAWFjaugY&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=25
    //19:14 youtube min
    
    public void start(){
        Scanner input = new Scanner(System.in);
        int numCorrect = 0;
        for (int question = 0; question < questionsSet.size(); question++) {
            System.out.println(questionsSet.get(question).getQuestion());
            int numChoices = questionsSet.get(question).getChoices().size();
            // show choices from questions in questionSet
            for (int choice = 0; choice < numChoices; choice++) {
                System.out.println((choice+1)+ ": "+ questionsSet.get(question).getChoices().get(choice));
            }
            int playerAnswer = input.nextInt();
            ArrayList<String> choiceSet = questionsSet.get(question).getChoices();
            String correctAnswer = questionsSet.get(question).getAnswer();
            int correctAnswerIndex = choiceSet.indexOf(correctAnswer);
            if (playerAnswer == correctAnswerIndex+1){
                numCorrect++;
            }
            System.out.println("You got " + numCorrect + " correct answer(s)!");;
        }
    }
}
