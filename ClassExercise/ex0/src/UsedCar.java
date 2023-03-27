public class UsedCar {

    private int id;
    private String color;
    private String make;
    private String model;
    private int productionYear;
    private int millage;
    private boolean certificate;
    private String transmission;

    public UsedCar(int id, String color, String make, String model, int productionYear, int millage,
            boolean certificate, String transmission) {
        this.id = id;
        this.color = color;
        this.make = make;
        this.model = model;
        this.productionYear = productionYear;
        this.millage = millage;
        this.certificate = certificate;
        this.transmission = transmission;
        System.out.println("UsedCar instance created, id: " + id);
    }

    public void changeColor(String color) {
        this.color = color;
    }

    public void driveCar(int drivingMillage) {
        millage = millage + drivingMillage;
    }

    public void renewCertificate() {
        certificate = true;
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }

    public boolean isCertificate() {
        return certificate;
    }

    public void setCertificate(boolean certificate) {
        this.certificate = certificate;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

}
