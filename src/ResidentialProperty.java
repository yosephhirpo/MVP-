public class ResidentialProperty extends Property {
    private int numBedrooms;
    private double hoaFee;

    public ResidentialProperty(String propertyId, String address, double baseRent, int numBedrooms, double hoaFee) {
        super(propertyId, address, baseRent);
        this.numBedrooms = numBedrooms;
        this.hoaFee = hoaFee;
    }

    public int getNumBedrooms() { return numBedrooms; }
    public void setNumBedrooms(int numBedrooms) { this.numBedrooms = numBedrooms; }

    public double getHoaFee() { return hoaFee; }
    public void setHoaFee(double hoaFee) { this.hoaFee = hoaFee; }

    @Override
    public double calculateTotalMonthlyCost() {
        return super.calculateTotalMonthlyCost() + this.hoaFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Residential  Bedrooms: " + numBedrooms + "  HOA Fee: $" + String.format("%.2f", hoaFee));
    }
}