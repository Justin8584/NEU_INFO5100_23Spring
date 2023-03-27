public class Monitor {
    private String brand;
    private String model;
    private int screenSize;
    private int resolutionWidth;
    private int resolutionHeight;
    private int refreshRate;
    private String displayType;
    private boolean isCurved;

    public Monitor(String model, int screenSize, int resolutionWidth, int resolutionHeight, int refreshRate,
            String displayType, boolean isCurved) {
        this.model = model;
        this.screenSize = screenSize;
        this.resolutionWidth = resolutionWidth;
        this.resolutionHeight = resolutionHeight;
        this.refreshRate = refreshRate;
        this.displayType = displayType;
        this.isCurved = isCurved;
        System.out.println("A new monitor has been created.");
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void adjustBrightness() {
        System.out.println("Adjusting the monitor's brightness.");
    }

    public void sleepMode() {
        System.out.println("Activating the monitor's sleep mode.");
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

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }

    public void setResolutionHeight(int resolutionHeight) {
        this.resolutionHeight = resolutionHeight;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public boolean isCurved() {
        return isCurved;
    }

    public void setCurved(boolean isCurved) {
        this.isCurved = isCurved;
    }
}
