public class Lamp {
    private int id;
    private String color;
    private int height;
    private boolean isOn;
    private int brightness;
    private String brand;
    private String material;
    private double price;

    public Lamp(int id, String color, int height, boolean isOn, int brightness, String brand, String material,
            double price) {
        this.id = id;
        this.color = color;
        this.height = height;
        this.isOn = isOn;
        this.brightness = brightness;
        this.brand = brand;
        this.material = material;
        this.price = price;
        System.out.println("Lamp instance created, id: " + id);
    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void adjustBrightness(int brightness) {
        brightness = brightness + 10;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
