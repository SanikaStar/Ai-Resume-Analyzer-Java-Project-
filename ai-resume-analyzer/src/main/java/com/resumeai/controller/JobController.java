package com.resumeai.controller;

import com.resumeai.dao.JobDAO;
import com.resumeai.model.Job;

import java.util.List;

public class JobController {

    private JobDAO jobDAO = new JobDAO();

    public void addJob(Job job) {
        jobDAO.addJob(job);
    }

    public List<Job> getAllJobs() {
        return jobDAO.getJobs();
    }
}
