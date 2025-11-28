
package com.resumeai.model;

public class JobMatchResult {

    private Job job;
    private double score;

    public JobMatchResult(Job job, double score) {
        this.job = job;
        this.score = score;
    }

    public Job getJob() {
        return job;
    }

    public double getScore() {
        return score;
    }
}
