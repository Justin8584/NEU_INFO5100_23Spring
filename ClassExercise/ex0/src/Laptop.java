public class Laptop {
    private int id;
    private String color;
    private int size;
    private String cpuModel;
    private int diskSize;
    private int memorySize;
    private int productionYear;
    private int price;

    public Laptop(int id, String color, int size, String cpuModel, int diskSize, int memorySize,
            int productionYear, int price) {

        this.id = id;
        this.color = color;
        this.size = size;
        this.cpuModel = cpuModel;
        this.diskSize = diskSize;
        this.memorySize = memorySize;
        this.productionYear = productionYear;
        this.price = price;
        System.out.println("Laptop instance created, id: " + id);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
