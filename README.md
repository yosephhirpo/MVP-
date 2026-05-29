Property Management System

A Java-based property management application that demonstrates core pillars of Object-Oriented Programming (OOP).

1. Encapsulation
Where it's used — Property.java
All fields (propertyId, address, baseRent) are declared private, meaning they cannot be accessed or modified directly from outside the class. Access is controlled through public getters and setters, which also include validation logic.
The same pattern is applied in ResidentialProperty.java (numBedrooms, hoaFee) and CommercialProperty.java (businessType, commercialTaxRate) — all fields are private with controlled public access.

2. Inheritance
Where it's used — ResidentialProperty.java and CommercialProperty.java
Both subclasses extend the Property base class using the extends keyword. They inherit the common fields (propertyId, address, baseRent) and methods, and each adds its own specialised fields on top.
Both constructors call super(propertyId, address, baseRent) to initialise the inherited fields from Property.

3. Polymorphism
Where it's used — calculateTotalMonthlyCost() and displayDetails()
Both methods are defined in Property and overridden in each subclass using @Override.
In PropertyManager.java, the list stores objects as the Property type. When generateFinancialReport() loops through them, Java automatically calls the correct overridden version of each method at runtime — this is dynamic dispatch:
Method overloading (compile-time polymorphism) is also present in PropertyManager.java.

4. Classes and objects are implemented through out the project.
