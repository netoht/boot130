package boot;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    private static AtomicInteger ai = new AtomicInteger(1);

    @Scheduled(fixedRate = 30000)
    public void reportCurrentTime() {
        System.out.println("start " + ai.get() + " " + dateFormat.format(new Date()));
        for (long i = 0; i < 5_000_000_000_0l; i++) {
        }
        System.out.println("end " + ai.getAndIncrement() + " " + dateFormat.format(new Date()));
    }
}
