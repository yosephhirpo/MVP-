public class Property {
    private String propertyId;
    private String address;
    private double baseRent;

    public Property(String propertyId, String address, double baseRent) {
        this.propertyId = propertyId;
        this.address = address;
        setBaseRent(baseRent);
    }


    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        if (propertyId != null && !propertyId.trim().isEmpty()) {
            this.propertyId = propertyId;
        } else {
            System.out.println("Error: Property ID cannot be empty.");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address != null && !address.trim().isEmpty()) {
            this.address = address;
        } else {
            System.out.println("Error: Address cannot be empty.");
        }
    }

    public double getBaseRent() {
        return baseRent;
    }

    public void setBaseRent(double baseRent) {
        if (baseRent >= 0) {
            this.baseRent = baseRent;
        } else {
            System.out.println("Error: Base rent cannot be negative.");
            this.baseRent = 0.0;
        }
    }

    public double calculateTotalMonthlyCost() {
        return this.baseRent;
    }

    public void displayDetails() {
        System.out.println("Property ID: " + propertyId + "  Address: " + address);
        System.out.println("Base Rent: $" + String.format("%.2f", baseRent));
    }
}