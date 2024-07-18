package com.narendhar.AddJobsProject.SimpleDemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Job {
    private  int jobId;
    private String jobTitle;
    private List<String> jobTechStack;
}
