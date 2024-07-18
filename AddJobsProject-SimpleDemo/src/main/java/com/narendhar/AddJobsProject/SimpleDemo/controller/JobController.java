package com.narendhar.AddJobsProject.SimpleDemo.controller;

import com.narendhar.AddJobsProject.SimpleDemo.model.Job;
import com.narendhar.AddJobsProject.SimpleDemo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JobController {

    @Autowired
    JobService jobservice;

    @RequestMapping({"/","/home"})
    public String home(){
        return  "home";
    }

    @RequestMapping("addJob")
    public String addJob(){
       // System.out.println("hello");
        return "addjob";
    }


    @PostMapping("/success")
    public String success(Job j, Model m){
        //System.out.println(j.getJobTechStack());
        m.addAttribute("jobposted",j);
        jobservice.addJob(j);
        return "success";
    }



    @GetMapping("viewAllJobs")
    public String viewAllJobs(Model jobmodel){
        List<Job> alljobList=jobservice.allJobs();
        jobmodel.addAttribute("alljobList",alljobList);

        System.out.println(alljobList);
        return "alljobs";
    }
}
