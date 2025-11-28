**📂 Project Structure**
AI-Resume-Analyzer/
│
├── Main.java               # Entry point for the application
├── ResumeParser.java       # Parses resume files (PDF/DOCX)
├── AIService.java          # Handles AI-based analysis and scoring
├── JobMatcher.java         # Matches resumes to job descriptions
├── DatabaseManager.java    # Manages storage of resumes and results
├── controller/             # Handles user interface logic
│   ├── ResumeController.java
│   └── JobController.java
├── dao/                    # Data access objects for database operations
│   └── ...
└── README.md               # Project documentation


**Features**
**Resume Parsing:**
Extracts information such as name, contact details, skills, education, and experience.
AI-Based Analysis:
Uses AI techniques to evaluate resumes.
Scores candidates based on skill match, experience, and job relevance.
**Job Matching:**
Compares candidate resumes against job descriptions.
Provides a ranking of suitable candidates for each role.
**Database Integration:**
Stores parsed resumes and analysis results.
Supports easy retrieval and reporting.
**User-Friendly Interface:**
Controllers handle input/output efficiently.
Easy to extend for web or desktop integration.
****How to Run****
Open the project in Eclipse or any Java IDE.
Ensure you have Java 8+ installed.
Run the Main.java file.
Upload resumes and job descriptions to test analysis and matching.
**⚡Technologies Used**
Java (Core, OOP, File Handling)
AI/ML Algorithms for scoring and matching
Database: MySQL / SQLite (for storing resumes and results)
File Parsing: PDF/DOCX libraries
**✨Author**
Sanika Star
Feel free to ⭐ star this repository if you find it useful!**
