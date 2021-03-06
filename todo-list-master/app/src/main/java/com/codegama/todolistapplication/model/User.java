package com.codegama.todolistapplication.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @PrimaryKey()
    @ColumnInfo(name = "username")
    String username;
    @ColumnInfo(name = "name")
    String name;
    @ColumnInfo(name = "password")
    String password;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
