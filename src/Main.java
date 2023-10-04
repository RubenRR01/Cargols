import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cargol cargol = new Cargol(1);
        Cargol cargol2 = new Cargol(2);
        MonitorCargol mc = new MonitorCargol(cargol);
        MonitorCargol mc2 = new MonitorCargol(cargol2);

        final ScheduledExecutorService schExService = Executors.newScheduledThreadPool(3);
        schExService.scheduleWithFixedDelay(cargol, 2, 4, TimeUnit.SECONDS);
        schExService.scheduleWithFixedDelay(cargol2, 5, 3, TimeUnit.SECONDS);
        schExService.scheduleWithFixedDelay(mc, 1, 10, TimeUnit.SECONDS);
        schExService.scheduleWithFixedDelay(mc2, 1, 10, TimeUnit.SECONDS);



        schExService.awaitTermination(30, TimeUnit.SECONDS);
        schExService.shutdownNow();
        System.out.println(cargol.toString());
        System.out.println(cargol2.toString());



    }
}