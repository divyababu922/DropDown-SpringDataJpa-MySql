package com.example.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType; 
import javax.persistence.Id;

@Entity
public class SelectUsers {
    @Id
    private String[] uname;
    public SelectUsers(){

    }
    public void setSelectUsers(String[] uname){
        this.uname=uname;
    }
}

