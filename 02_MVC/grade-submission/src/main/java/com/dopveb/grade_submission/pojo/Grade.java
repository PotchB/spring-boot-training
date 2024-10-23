package com.dopveb.grade_submission.pojo;

import java.util.Objects;

public class Grade {
    private String name;
    private String subject;
    private String score;

    public Grade() {
    }

    public Grade(String name, String subject, String score) {
        this.name = name;
        this.subject = subject;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getScore() {
        return this.score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    /* @Override
    public int hashCode() {
        return Objects.hash(name, subject, score);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Grade))
            return false;
        Grade other = (Grade) obj;
        return Objects.equals(name, other.name) && Objects.equals(subject, other.subject)
                && Objects.equals(score, other.score);
    } */
}