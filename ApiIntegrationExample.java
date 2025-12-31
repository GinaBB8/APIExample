import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;

public class AutomatedApiProcess {

    public static void main(String[] args) {

        // Timer to simulate an automated scheduled task
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                callApiAndProcessData();
            }
        }, 0, 5000); // runs every 5 seconds
    }

    private static void callApiAndProcessData() {
        try {
            String apiUrl = "https://jsonplaceholder.typicode.com/todos/1";

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Simulated automated processing
            System.out.println("Automated API Check:");
            System.out.println("Response received at " + System.currentTimeMillis());
            System.out.println(response.toString());
            System.out.println("----------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
