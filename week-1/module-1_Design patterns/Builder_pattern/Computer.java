public class Computer {

    private String processor;
    private int ram;
    private int storage;
    private String gpu;
    private String coolingSystem;
    private String cabinet;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.gpu = builder.gpu;
        this.coolingSystem = builder.coolingSystem;
        this.cabinet = builder.cabinet;
    }

    public void display() {
        System.out.println("\n===== Computer Configuration =====");
        System.out.println("Processor      : " + processor);
        System.out.println("RAM            : " + ram + " GB");
        System.out.println("Storage        : " + storage + " GB");
        System.out.println("Graphics Card  : " + gpu);
        System.out.println("Cooling System : " + coolingSystem);
        System.out.println("Cabinet        : " + cabinet);
    }

    public static class Builder {

        private String processor;
        private int ram;
        private int storage;
        private String gpu;
        private String coolingSystem;
        private String cabinet;

        public Builder processor(String processor) {
            this.processor = processor;
            return this;
        }

        public Builder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder gpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public Builder coolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        public Builder cabinet(String cabinet) {
            this.cabinet = cabinet;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}