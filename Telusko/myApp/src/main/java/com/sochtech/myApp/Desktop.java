package com.sochtech.myApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary
public class Desktop implements Computer
{
    @Override
    public void compile()
    {
        System.out.println("Compiling with 404 bugs but faster.");
    }
}
