package com.resumeai.dao;

import com.resumeai.model.Job;
import java.util.ArrayList;
import java.util.List;

public class JobDAO {

    private List<Job> jobList = new ArrayList<>();

    public void addJob(Job job) {
        jobList.add(job);
    }

    public List<Job> getJobs() {
        return jobList;
    }
}
