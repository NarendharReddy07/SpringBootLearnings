package com.narendhar.MvcDemoUsingModelAttribute;

public class Student {
    private int srollno;
    private String name;

    public int getSrollno() {
        return srollno;
    }

    public void setSrollno(int srollno) {
        this.srollno = srollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "srollno=" + srollno +
                ", name='" + name + '\'' +
                '}';
    }
}
