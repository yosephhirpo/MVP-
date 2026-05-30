import java.util.List;
import java.util.ArrayList;

public class PropertyManager {

    private List<Property> managedProperties;

    public PropertyManager() {
        this.managedProperties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        if (property != null) {
            managedProperties.add(property);
            System.out.println("Successfully added property: " + property.getPropertyId());
        }
    }

    public void addProperty(Property property, String adminNote) {
        if (property != null) {
            managedProperties.add(property);
            System.out.println("Successfully added property: " + property.getPropertyId());
            System.out.println("    Admin Note: " + adminNote);
        }
    }


    public void generateFinancialReport() {
        System.out.println("\n      MONTHLY PROPERTY FINANCIAL REPORT      ");

        for (Property p : managedProperties) {
            p.displayDetails();
            System.out.println("\nTOTAL MONTHLY DUE: $" + String.format("%.2f", p.calculateTotalMonthlyCost()));
        }
    }
}