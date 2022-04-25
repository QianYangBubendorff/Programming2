package fh.campus02.customer;

import java.util.ArrayList;

public class Customer extends Person{
    private int customernumber;
     private ArrayList<Address> addresses;
//    private ArrayList<Address> addresses= new ArrayList<>();


    public Customer(int customernumber,String firstName, String lastName) {
        super(firstName,lastName);
        this.customernumber = customernumber;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address a){
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customernumber=" + customernumber +
                ", addresses=" + addresses +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
