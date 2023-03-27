public class Smartphone {
    private String brand;
    private String model;
    private int screenSize;
    private int storageCapacity;
    private int RAM;
    private String color;
    private int productionYear;
    private Battery battery;
    private Camera camera;

    public Smartphone(String brand, String model, int screenSize, int storageCapacity, int RAM, String color,
            int productionYear,
            Battery battery, Camera camera) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.storageCapacity = storageCapacity;
        this.RAM = RAM;
        this.color = color;
        this.battery = battery;
        this.camera = camera;
    }

    public void turnOn() {
        System.out.println("Your phone is turning on, hang one here.");
    }

    public void takePhoto() {
        System.out.println("Camera is working, you can take a photo.");
    }

    public int getRemainingBatteryPercentage() {
        return battery.getRemainingPercentage();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int rAM) {
        RAM = rAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public class Battery {
        private int capacity;
        private int remainingPercentage;

        public Battery(int capacity, int remainingPercentage) {
            this.capacity = capacity;
            this.remainingPercentage = remainingPercentage;
        }

        public void recharge() {
            remainingPercentage = remainingPercentage + 1;
        }

        public int getRemainingPercentage() {
            return remainingPercentage;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }

    public class Camera {
        private int resolution;
        private boolean flashSupported;

        public Camera(int resolution, boolean flashSupported) {
            this.resolution = resolution;
            this.flashSupported = flashSupported;
        }

        public void turnOnFlash() {
            System.out.println("Now, your flash is turned on");
        }

        public void takePhoto() {
            System.out.println("Now, you have taken a photo");
        }

        public int getResolution() {
            return resolution;
        }

        public void setResolution(int resolution) {
            this.resolution = resolution;
        }

        public boolean isFlashSupported() {
            return flashSupported;
        }

        public void setFlashSupported(boolean flashSupported) {
            this.flashSupported = flashSupported;
        }
    }
}
