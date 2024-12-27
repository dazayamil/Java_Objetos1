package Ejercicio10;

import java.util.List;

public class SchedulerLIFO extends JobScheduler{
        public SchedulerLIFO(String strategy) {
            super(strategy);
        }

        public JobDescription jobStrategy(List<JobDescription> jobs) {
            return (JobDescription)jobs.get(jobs.size() - 1);
        }
}