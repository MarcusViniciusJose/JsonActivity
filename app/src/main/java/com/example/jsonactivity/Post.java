package com.example.jsonactivity;

import java.io.Serializable;

public class Post implements Serializable {
    private int id;
    private int userId;
    private String title;
    private String body;

    public Post(){

    }

    public Post (int id, int userId, String title, String body){
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.body = body;

    }

    public int getId(){

        return id;
    }
    public void setId(int id){

        this.id = id;
    }

    public int getUserId(){

        return userId;
    }

    public void setUserId(int userId){

        this.userId = userId;
    }

    public String getTitle(){

        return title;
    }
    public void setTitle(String title){

        this.title = title;
    }

    public String getBody(){

        return body;
    }

    public void setBody(String body){

        this.body = body;
    }

    @Override
    public String toString(){

        return id + " - " + title;
    }

}
