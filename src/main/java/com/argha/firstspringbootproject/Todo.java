package com.argha.firstspringbootproject;

public class Todo {

    private int userId;
    public Todo(int id, boolean completed, String title, int userId){
        this.id = id;
        this.completed = completed;
        this.title = title;
        this.userId = userId;

    }

    private int id;
    private String title;
    private boolean completed;

    public Todo() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /*
     JSON reference (API response)

     {
       "userId": 1,
       "id": 1,
       "title": "delectus aut autem",
       "completed": false
     }
    */
}

