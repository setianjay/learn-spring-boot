package com.setianjay.springboot.learnspringboot;

public class Course {
    private final int id;
    private final String title;
    private final String author;

    public Course(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
