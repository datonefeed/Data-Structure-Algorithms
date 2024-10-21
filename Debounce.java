import java.util.Timer;
import java.util.TimerTask;

public class Debounce {
    private static Timer timer = new Timer();

    public static void debounce(Runnable func, int delay) {
        timer.cancel();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                func.run();
            }
        }, delay);
    }

    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Function executed!");

        System.out.println("Calling debounce function multiple times...");
        debounce(task, 1000);
        debounce(task, 1000);
        debounce(task, 1000);

        // Only the last call will execute after 1 second
    }
}
