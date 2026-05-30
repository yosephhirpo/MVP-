public class CommercialProperty extends Property {
    private String businessType;
    private double commercialTaxRate;

    public CommercialProperty(String propertyId, String address, double baseRent, String businessType, double commercialTaxRate) {
        super(propertyId, address, baseRent);
        this.businessType = businessType;
        this.commercialTaxRate = commercialTaxRate;
    }

    public String getBusinessType() { return businessType; }
    public void setBusinessType(String businessType) { this.businessType = businessType; }

    public double getCommercialTaxRate() { return commercialTaxRate; }
    public void setCommercialTaxRate(double commercialTaxRate) { this.commercialTaxRate = commercialTaxRate; }


    @Override
    public double calculateTotalMonthlyCost() {
        double base = super.calculateTotalMonthlyCost();
        return base + (base * commercialTaxRate);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Commercial  Business: " + businessType + "  Tax Rate: " + (commercialTaxRate * 100) + "%");
    }
}