package com.course.model;

import lombok.Data;

@Data
public class GetUserInfoCase{
    private int id;
    private int userId;
    private String expected;

}
