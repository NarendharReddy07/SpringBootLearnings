package com.narendhar.AnnotationsInSpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void compute() {
        System.out.println("compiling with Desktop");
    }
}
