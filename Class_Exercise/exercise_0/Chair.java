public class Chair {
    private int id;
    private String color;
    private String material;
    private int height;
    private int price;
    private String brand;
    private boolean isComfortable;
    private String type;

    public Chair(int id, String color, String material, int height, int price, String brand, boolean isComfortable,
            String type) {
        this.id = id;
        this.color = color;
        this.material = material;
        this.height = height;
        this.price = price;
        this.brand = brand;
        this.isComfortable = isComfortable;
        this.type = type;
        System.out.println("Chair instance created, id: " + id);
    }

    public void sit() {
        System.out.print("You are currently sitting on the chair.");
    }

    public void stand() {
        System.out.print("You are currently standing on the chair.");
    }

    public void adjustHeight(int height) {
        this.height = height;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isComfortable() {
        return isComfortable;
    }

    public void setComfortable(boolean isComfortable) {
        this.isComfortable = isComfortable;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
