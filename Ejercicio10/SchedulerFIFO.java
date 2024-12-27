package Ejercicio10;

import java.util.List;

public class SchedulerFIFO extends JobScheduler{
    public SchedulerFIFO(String strategy) {
        super(strategy);
    }

    public JobDescription jobStrategy(List<JobDescription> jobs) {
        return (JobDescription)jobs.get(0);
    }
}
