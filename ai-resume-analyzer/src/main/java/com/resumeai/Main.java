package com.resumeai;

import com.resumeai.controller.ResumeController;
import com.resumeai.controller.JobController;
import com.resumeai.model.Resume;
import com.resumeai.model.Job;
import com.resumeai.model.JobMatchResult;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ResumeController resumeController = new ResumeController();
        JobController jobController = new JobController();

        // Simulated resume input text
        String resumeText = "Java developer with experience in Spring Boot, REST APIs, SQL, Selenium";

        // Parse resume
        Resume resume = resumeController.parseResume(resumeText);

        // Add some sample jobs
        jobController.addJob(new Job(1, "Java Developer", "Java Spring SQL APIs"));
        jobController.addJob(new Job(2, "Automation Tester", "Selenium Java Testing Frameworks"));

        // Fetch all jobs
        List<Job> jobs = jobController.getAllJobs();

        // Match resume with jobs
        List<JobMatchResult> results = resumeController.matchResume(resume, jobs);

        // Show results
        System.out.println("\n--- MATCH RESULTS ---");
        for (JobMatchResult result : results) {
            System.out.println(result.getJob().getTitle() + " => " + result.getScore() + "%");
        }
    }
}
