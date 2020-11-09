package ch.java.interview.domain;

/**
 * Domain object representing a Question in e.g. a job-interview
 */
public class Question {
    public String question;

    public Question (String question){
        this.question = question;
    }

    public String getQuestion(){
        return question;
    }
}
