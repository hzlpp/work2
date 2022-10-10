package com.work.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private Long StudentId;
    private String StudentName;
    private String StudentPassword;
    private String PhoneNumber;
}
