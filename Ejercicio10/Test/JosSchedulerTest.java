package Ejercicio10.Test;

import Ejercicio10.JobDescription;
import Ejercicio10.JobScheduler;
import Ejercicio10.SchedulerFIFO;
import Ejercicio10.SchedulerLIFO;
import Ejercicio10.SchedulerHighestPriority;
import Ejercicio10.SchedulerMostEffort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JosSchedulerTest {
    protected JobDescription firstJob;
    protected JobDescription highestPriorityJob;
    protected JobDescription mostEffortJob;
    protected JobDescription lastJob;


    private void initializeJobs() {
        this.firstJob = new JobDescription(1.0, 1, "Este es el primero");
        this.highestPriorityJob = new JobDescription(1.0, 100, "Este es el de m\u00e1s prioridad");
        this.mostEffortJob = new JobDescription(100.0, 1, "Este es el de m\u00e1s esfuerzo");
        this.lastJob = new JobDescription(1.0, 1, "Este es el \u00faltimo");
    }

    @BeforeEach
    void setUp() {
        this.initializeJobs();
    }

    private JobScheduler newFifoScheduler() {
        return new SchedulerFIFO("FIFO");
    }

    private JobScheduler newLifoScheduler() {
        return new SchedulerLIFO("LIFO");
    }

    private JobScheduler newPriorityScheduler() {
        return new SchedulerHighestPriority("HighestPriority");
    }

    private JobScheduler newEffortScheduler() {
        return new SchedulerMostEffort("MostEffort");
    }

    private void scheduleJobsIn(JobScheduler aJobScheduler) {
        aJobScheduler.schedule(this.firstJob);
        aJobScheduler.schedule(this.highestPriorityJob);
        aJobScheduler.schedule(this.mostEffortJob);
        aJobScheduler.schedule(this.lastJob);
    }

    @Test
    void testSchedule() {
        JobScheduler aScheduler = new SchedulerFIFO("FIFO");
        aScheduler.schedule(this.highestPriorityJob);
        Assertions.assertTrue(aScheduler.getJobs().contains(this.highestPriorityJob));
    }

    @Test
    void testUnschedule() {
        JobScheduler aScheduler = new SchedulerLIFO("LIFO");
        this.scheduleJobsIn(aScheduler);
        aScheduler.unschedule(this.highestPriorityJob);
        Assertions.assertFalse(aScheduler.getJobs().contains(this.highestPriorityJob));
    }

    @Test
    void testNext() {
        JobScheduler scheduler = this.newFifoScheduler();
        this.scheduleJobsIn(scheduler);
        Assertions.assertEquals(scheduler.next(), this.firstJob);
        Assertions.assertEquals(scheduler.getJobs().size(), 3);
        scheduler = this.newLifoScheduler();
        this.scheduleJobsIn(scheduler);
        Assertions.assertEquals(scheduler.next(), this.lastJob);
        Assertions.assertEquals(scheduler.getJobs().size(), 3);
        scheduler = this.newPriorityScheduler();
        this.scheduleJobsIn(scheduler);
        Assertions.assertEquals(scheduler.next(), this.highestPriorityJob);
        Assertions.assertEquals(scheduler.getJobs().size(), 3);
        scheduler = this.newEffortScheduler();
        this.scheduleJobsIn(scheduler);
        Assertions.assertEquals(scheduler.next(), this.mostEffortJob);
        Assertions.assertEquals(scheduler.getJobs().size(), 3);
    }
}
