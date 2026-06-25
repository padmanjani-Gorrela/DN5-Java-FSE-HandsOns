public class ObserverTest {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Anjani");
        Observer web = new WebApp("Chrome");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStock("TCS", 3680.50);

        stockMarket.setStock("Infosys", 1595.75);

        stockMarket.removeObserver(web);

        stockMarket.setStock("Reliance", 2890.20);

    }

}