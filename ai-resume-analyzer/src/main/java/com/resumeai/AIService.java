package com.resumeai;

import com.resumeai.model.Job;

public class AIService {

    public double calculateMatchScore(String resumeText, Job job) {

        String resume = resumeText.toLowerCase();
        String jobDesc = job.getDescription().toLowerCase();

        String[] keywords = jobDesc.split(" ");

        int total = 0;
        int matched = 0;

        for (String word : keywords) {
            if (word.length() < 4) continue;
            total++;

            if (resume.contains(word)) {
                matched++;
            }
        }

        if (total == 0) return 0;
        return (matched * 100.0) / total;
    }
}
