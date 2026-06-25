public class RealImage implements Image {

    private String imageName;

    public RealImage(String imageName) {
        this.imageName = imageName;
        loadImage();
    }

    private void loadImage() {
        System.out.println("Loading " + imageName + " from Cloud Server...");
    }

    @Override
    public void display() {
        System.out.println("Displaying " + imageName);
    }
}