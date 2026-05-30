public class Main {
    public static void main(String[] args) {
        System.out.println(" Property Management System ");

        PropertyManager manager = new PropertyManager();

        Property apt1 = new ResidentialProperty("R-101", "CMC, Apt 4B", 1200.00, 2, 150.00);
        Property house1 = new ResidentialProperty("R-102", "Yerer Gerji", 2500.00, 4, 0.00);
        Property store1 = new CommercialProperty("C-201", "Addisu gebeya", 3000.00, "Retail", 0.15);


        System.out.println("\n   Registering Properties   ");
        manager.addProperty(apt1);
        manager.addProperty(house1, "Pending roof inspection next month.");
        manager.addProperty(store1, "Commercial lease expires in 2 years.");


        manager.generateFinancialReport();
    }
}