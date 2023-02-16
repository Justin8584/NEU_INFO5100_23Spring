public class CoffeeMug {
    private String material;
    private String color;
    private int capacity;
    private boolean hasHandle;
    private boolean isDishwasherSafe;
    private boolean isMicrowaveSafe;
    private boolean isInsulated;
    private boolean isLeakProof;

    public CoffeeMug(String material, String color, int capacity, boolean hasHandle, boolean isDishwasherSafe,
            boolean isMicrowaveSafe, boolean isInsulated, boolean isLeakProof) {
        this.material = material;
        this.color = color;
        this.capacity = capacity;
        this.hasHandle = hasHandle;
        this.isDishwasherSafe = isDishwasherSafe;
        this.isMicrowaveSafe = isMicrowaveSafe;
        this.isInsulated = isInsulated;
        this.isLeakProof = isLeakProof;
        System.out.println("A new " + color + " coffee mug made of " + material + " has been created.");
    }

    public void fillWithCoffee() {
        System.out.println("Filling the mug with coffee...");
    }

    public void clean() {
        System.out.println("Cleaning the mug...");
    }

    public void keepWarm() {
        System.out.println("Keeping the coffee warm...");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasHandle() {
        return hasHandle;
    }

    public void setHasHandle(boolean hasHandle) {
        this.hasHandle = hasHandle;
    }

    public boolean isDishwasherSafe() {
        return isDishwasherSafe;
    }

    public void setDishwasherSafe(boolean isDishwasherSafe) {
        this.isDishwasherSafe = isDishwasherSafe;
    }

    public boolean isMicrowaveSafe() {
        return isMicrowaveSafe;
    }

    public void setMicrowaveSafe(boolean isMicrowaveSafe) {
        this.isMicrowaveSafe = isMicrowaveSafe;
    }

    public boolean isInsulated() {
        return isInsulated;
    }

    public void setInsulated(boolean isInsulated) {
        this.isInsulated = isInsulated;
    }

    public boolean isLeakProof() {
        return isLeakProof;
    }

    public void setLeakProof(boolean isLeakProof) {
        this.isLeakProof = isLeakProof;
    }
}
