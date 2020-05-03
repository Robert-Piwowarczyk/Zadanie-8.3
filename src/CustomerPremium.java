public class CustomerPremium extends Customer {
    double discount;

    public CustomerPremium(String firstName, String lastName,
                           String city, String street,
                           String homeNumber, int flatNumber,
                           String status, double discount) {
        super(firstName, lastName, city, street, homeNumber,
                flatNumber, status);
        this.discount = discount;
    }
}

