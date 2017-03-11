package com.wisely.highlight_spring4.chl.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description: TODO
 * @Author:You.Hu
 * @Create:2017-03-11 14:54
 */
@Service
public class UseFunctionService {

    @Autowired
    private FunctionService functionService;

    public String sayHello(String word){

        return functionService.say(word);
    }


}
