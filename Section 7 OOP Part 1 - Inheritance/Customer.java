public class Customer {
    private String name;
    private double limit;
    private  String address;

public Customer(String name, String address) {
    this(name, 1000, address);
}


    public Customer(String name, double limit, String address) {
        this.name = name;
        this.limit = limit;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getAdress() {
        return address;
    }

}
