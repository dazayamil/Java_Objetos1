package Ejercicio10;

import java.util.List;

public class SchedulerHighestPriority extends JobScheduler{
    public SchedulerHighestPriority(String strategy) {
        super(strategy);
    }

    public JobDescription jobStrategy(List<JobDescription> jobs) {
        return (JobDescription)jobs.stream().max((j1, j2) -> {
            return Double.compare((double)j1.getPriority(), (double)j2.getPriority());
        }).orElse((JobDescription) null);
    }
}
