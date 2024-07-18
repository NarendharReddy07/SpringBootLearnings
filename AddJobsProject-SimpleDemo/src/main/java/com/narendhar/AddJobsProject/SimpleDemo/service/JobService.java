package com.narendhar.AddJobsProject.SimpleDemo.service;

import com.narendhar.AddJobsProject.SimpleDemo.model.Job;
import com.narendhar.AddJobsProject.SimpleDemo.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepo repo;

    public void addJob(Job j){
        repo.addJob(j);
    }

    public List<Job> allJobs(){
         return  repo.allJobs();
    }

}
