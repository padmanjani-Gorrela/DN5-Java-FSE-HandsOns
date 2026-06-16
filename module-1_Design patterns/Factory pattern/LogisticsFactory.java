public class LogisticsFactory {

    public static Logistics getLogistics(String mode) {

        if (mode.equalsIgnoreCase("road")) {
            return new Road();
        }

        if (mode.equalsIgnoreCase("air")) {
            return new Air();
        }

        throw new IllegalArgumentException("Invalid mode");
    }
}