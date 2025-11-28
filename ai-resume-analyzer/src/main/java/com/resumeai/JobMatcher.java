package com.resumeai;

import com.resumeai.model.*;

import java.util.ArrayList;
import java.util.List;

public class JobMatcher {

    public List<JobMatchResult> matchResumeWithJobs(Resume resume, List<Job> jobs, AIService aiService) {

        List<JobMatchResult> results = new ArrayList<>();

        for (Job job : jobs) {
            double score = aiService.calculateMatchScore(resume.getContent(), job);
            results.add(new JobMatchResult(job, score));
        }

        return results;
    }
}
