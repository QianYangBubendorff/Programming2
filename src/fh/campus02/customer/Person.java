package fh.campus02.customer;

public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void doSomething(){
        System.out.println(firstName + " " +lastName+ " talks");
    }
}
