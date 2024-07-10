package com.narendhar.AnnotationsInSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employe {
    //private  int experience=15;//this is hardCoded value to do this we have annotation @Value

    @Value("10")
    private  int experience;

    private  Computer com;
    public Computer getCom() {
        return com;
    }

    @Autowired
    //@Qualifier("desktop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public  void  compute(){
        System.out.println("Writing code with experience "+ experience);
        com.compute();
    }


}
