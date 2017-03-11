package com.wisely.highlight_spring4.chl.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService{
    public String say(String word){
        return "helloWord!";
    }
}
