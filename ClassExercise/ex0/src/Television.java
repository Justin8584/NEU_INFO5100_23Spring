public class Television {
    private int id;
    private String brand;
    private int size;
    private int resolution;
    private boolean isSmartTV;
    private String color;
    private int volume;
    private int price;

    public Television(int id, String brand, int size, int resolution, boolean isSmartTV, String color, int price,
            int volume) {
        this.id = id;
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
        this.isSmartTV = isSmartTV;
        this.color = color;
        this.price = price;
        this.volume = volume;
        System.out.println("Television instance created, id: " + id);
    }

    public void turnOn() {
        System.out.println("The TV is working now.");
    }

    public void changeChannel(int channel) {
        System.out.println("The channel is changed.");
    }

    public void adjustVolume(int volume) {
        System.out.println("The volume is adjusted.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public boolean isSmartTV() {
        return isSmartTV;
    }

    public void setSmartTV(boolean isSmartTV) {
        this.isSmartTV = isSmartTV;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
