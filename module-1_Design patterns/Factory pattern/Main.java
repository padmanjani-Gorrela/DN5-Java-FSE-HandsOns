public class Main {

    public static void main(String[] args) {

        LogisticsService service = new LogisticsService();

        service.send("road");
        service.send("air");
    }
}

// output:
// Sending by Road
// Sending by Air