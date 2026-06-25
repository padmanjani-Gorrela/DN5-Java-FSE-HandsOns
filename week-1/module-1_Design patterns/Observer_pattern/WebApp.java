public class WebApp implements Observer {

    private String browser;

    public WebApp(String browser) {
        this.browser = browser;
    }

    @Override
    public void update(String stockName, double price) {

        System.out.println(" Web App (" + browser + ") received update:");
        System.out.println(stockName + " = ₹" + price);

    }

}