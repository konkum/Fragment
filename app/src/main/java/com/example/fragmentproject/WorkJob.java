package com.example.fragmentproject;

public class WorkJob {
    private int id;
    private String jobName;
    private String jobInfomation;
    private String finishDate;
    private String status;
    private boolean isAlone;

    public WorkJob(String jobName, String jobInfomation, String finishDate, String status, boolean isAlone) {
        this.jobName = jobName;
        this.jobInfomation = jobInfomation;
        this.finishDate = finishDate;
        this.status = status;
        this.isAlone = isAlone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobInfomation() {
        return jobInfomation;
    }

    public void setJobInfomation(String jobInfomation) {
        this.jobInfomation = jobInfomation;
    }

    public String getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(String finishDate) {
        this.finishDate = finishDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isAlone() {
        return isAlone;
    }

    public void setAlone(boolean alone) {
        isAlone = alone;
    }
}
