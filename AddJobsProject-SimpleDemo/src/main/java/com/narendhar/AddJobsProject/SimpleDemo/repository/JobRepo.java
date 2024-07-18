package com.narendhar.AddJobsProject.SimpleDemo.repository;

import com.narendhar.AddJobsProject.SimpleDemo.model.Job;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {

    //here all jobs stored in arraylist instead of database.
    //not using any database
    List<Job> data=new ArrayList<>();
    public JobRepo(){
        data.add(new Job(121,"fullstack java developer",List.of("java","springboot")));
        data.add(new Job(122,"fullstack mern developer",List.of("js","web")));
        data.add(new Job(123,"android developer",List.of("java","kotlin")));
    }

    public List<Job> allJobs(){
        return data;
    }

    public void addJob(Job j){
        data.add(j);
    }
}
