package com.codingrecipe.project01;

import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
public class User {
    @Id
    private String id; // _id로 지정
    private String password;

    public User() {}

    public User(String userId, String password) {
        this.id = userId;
        this.password = password;
    }

    public String toString() {
        return String.format("User[userId:%s, password: %s]", id, password);
    }

}