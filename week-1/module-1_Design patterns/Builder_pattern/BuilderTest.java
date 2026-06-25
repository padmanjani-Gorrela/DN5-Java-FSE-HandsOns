public class BuilderTest {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .processor("AMD Ryzen 9")
                .ram(32)
                .storage(2000)
                .gpu("RTX 4080")
                .coolingSystem("Liquid Cooling")
                .cabinet("Corsair RGB")
                .build();

        Computer officePC = new Computer.Builder()
                .processor("Intel i5")
                .ram(16)
                .storage(512)
                .build();

        gamingPC.display();
        officePC.display();
    }
}