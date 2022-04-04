package fh.campus02;

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account("Mike","AT12345678","RZ619T4356");
        Account account2 = new Account("Jack","AT78965312", "RYT7899T2");
        Account account3 = new Account("Jack","AT145265312", "RYFG899T2");
        account1.add(25000);
        account1.deposit(15000);
        account2.add(123000);
        account2.deposit(11000);
        account3.add(58000);
        account3.deposit(14000);
        Account[] arr= new Account[]{account1, account2, account3};

        for(int i=0; i<3;i++){
            System.out.println(arr[i].getBalance());
        }

        for(Account a:arr){
            System.out.println(a.getBalance());
        }
        for(Account a:arr){
            System.out.println(a);
        }



    }
}
