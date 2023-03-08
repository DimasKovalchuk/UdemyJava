package HW;

public class BankAccount {
    int id;
    String name;
    double balance;


    void popvnennjaCard(double sumPopovnennja){
        System.out.println("Balance bank account" + balance);
        System.out.println("SumPpovnennja " + sumPopovnennja);
        balance += sumPopovnennja;
        System.out.println("Balance after + " + balance );
        System.out.println();

    }

    void znjattjaCard(double sumZnjattja){
        System.out.println("Balance card " + balance);
        System.out.println("Sum znjattja " + sumZnjattja);
        balance -= sumZnjattja;
        System.out.println("Balance after - ");
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount yourAccount = new BankAccount();
        BankAccount hisAccount = new BankAccount();

        myAccount.id = 1;
        myAccount.name = "Dima";
        myAccount.balance = 1000.50;
        myAccount.popvnennjaCard(220);

        yourAccount.id = 2;
        yourAccount.name = "Zina";
        yourAccount.balance = 1080.50;
        yourAccount.znjattjaCard(700);

        hisAccount.id = 3;
        hisAccount.name = "Kira";
        hisAccount.balance = 1020.50;


        System.out.println("balance= "+ hisAccount.balance + " id " + hisAccount.id + " name " + hisAccount.name);
        System.out.println("balance= "+ myAccount.balance + " id " + myAccount.id + " name " + myAccount.name);
        System.out.println("balance= "+ yourAccount.balance + " id " + yourAccount.id + " name " + yourAccount.name);

    }
}
