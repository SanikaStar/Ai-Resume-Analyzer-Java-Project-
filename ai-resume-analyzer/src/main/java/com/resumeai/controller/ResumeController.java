package com.resumeai.controller;

import com.resumeai.*;
import com.resumeai.dao.ResumeDAO;
import com.resumeai.model.*;

import java.util.List;

public class ResumeController {

    private ResumeParser parser = new ResumeParser();
    private ResumeDAO resumeDAO = new ResumeDAO();
    private AIService aiService = new AIService();
    private JobMatcher matcher = new JobMatcher();

    public Resume parseResume(String text) {
        Resume resume = parser.parseResume(text);
        resumeDAO.saveResume(resume);
        return resume;
    }

    public List<JobMatchResult> matchResume(Resume resume, List<Job> jobs) {
        return matcher.matchResumeWithJobs(resume, jobs, aiService);
    }
}
