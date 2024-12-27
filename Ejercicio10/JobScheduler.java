package Ejercicio10;

import java.util.ArrayList;
import java.util.List;

public abstract class JobScheduler {
    protected List<JobDescription> jobs = new ArrayList();
    protected String strategy;

    public JobScheduler(String strategy) {
        this.strategy = strategy;
    }

    public JobScheduler() {
        this.strategy = "FIFO";
    }

    public void schedule(JobDescription job) {
        this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
        if (job != null) {
            this.jobs.remove(job);
        }

    }

    public String getStrategy() {
        return this.strategy;
    }

    public List<JobDescription> getJobs() {
        return this.jobs;
    }

    public void setStrategy(String aStrategy) {
        this.strategy = aStrategy;
    }

    public abstract JobDescription jobStrategy(List<JobDescription> var1);

    public JobDescription next() {
        JobDescription nextJob = null;
        nextJob = this.jobStrategy(this.jobs);
        this.unschedule(nextJob);
        return nextJob;
    }
}
