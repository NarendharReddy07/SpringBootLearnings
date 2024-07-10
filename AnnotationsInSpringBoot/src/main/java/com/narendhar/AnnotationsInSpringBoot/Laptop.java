package com.narendhar.AnnotationsInSpringBoot;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Laptop  implements  Computer{

    @Override
    public void compute() {
        System.out.println("compiling with laptop");
    }
}
