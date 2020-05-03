public class Customer extends Person {
    String status;

    public Customer(String firstName, String lastName, String city,
                    String street, String homeNumber, int flatNumber, String status) {
        super(firstName, lastName, city, street, homeNumber,
                flatNumber);
        this.status = status;
    }
}
