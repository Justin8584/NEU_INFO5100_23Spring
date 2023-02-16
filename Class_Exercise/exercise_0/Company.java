public class Company {
    private String name;
    private String industry;
    private int yearFounded;
    private String headquartersLocation;
    private int totalEmployees;
    private int revenue;
    private boolean isPubliclyTraded;
    private String website;

    public Company(String name, String industry, int yearFounded, String headquartersLocation, int totalEmployees,
            int revenue, boolean isPubliclyTraded, String website) {
        this.name = name;
        this.industry = industry;
        this.yearFounded = yearFounded;
        this.headquartersLocation = headquartersLocation;
        this.totalEmployees = totalEmployees;
        this.revenue = revenue;
        this.isPubliclyTraded = isPubliclyTraded;
        this.website = website;
        System.out.println("A new company has been created.");
    }

    public void hireEmployee() {
        System.out.println("Hiring a new employee.");
    }

    public void layoffEmployee() {
        System.out.println("Laying off an employee.");
    }

    public void acquireCompany() {
        System.out.println("Acquiring another company.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public int getYearFounded() {
        return yearFounded;
    }

    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }

    public String getHeadquartersLocation() {
        return headquartersLocation;
    }

    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    public int getTotalEmployees() {
        return totalEmployees;
    }

    public void setTotalEmployees(int totalEmployees) {
        this.totalEmployees = totalEmployees;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public boolean isPubliclyTraded() {
        return isPubliclyTraded;
    }

    public void setPubliclyTraded(boolean isPubliclyTraded) {
        this.isPubliclyTraded = isPubliclyTraded;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
