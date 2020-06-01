package com.gopal.springannotations.model;

public class JobName {

    public String taskName;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "JobName{" +
                "taskName='" + taskName + '\'' +
                '}';
    }
}
