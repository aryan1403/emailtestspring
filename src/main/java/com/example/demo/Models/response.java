package com.example.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class response {
    int statusCode;
    String msg;
    Object result;
}
