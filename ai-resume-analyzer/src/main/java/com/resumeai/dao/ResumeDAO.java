package com.resumeai.dao;

import com.resumeai.model.Resume;

public class ResumeDAO {

    private Resume savedResume;

    public void saveResume(Resume resume) {
        this.savedResume = resume;
    }

    public Resume getResume() {
        return savedResume;
    }
}
