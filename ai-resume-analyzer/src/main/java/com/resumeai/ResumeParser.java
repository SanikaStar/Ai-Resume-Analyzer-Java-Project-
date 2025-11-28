package com.resumeai;

import com.resumeai.model.Resume;

public class ResumeParser {

    public Resume parseResume(String resumeText) {
        Resume resume = new Resume();
        resume.setContent(resumeText);
        return resume;
    }
}
