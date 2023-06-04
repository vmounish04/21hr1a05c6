class Account
{
    int acc_no;
    String name;
    double ammount;

    void insert(int a,String b,double c)
    {
        acc_no=a;
        name =b;
        ammount=c;
    }

    void deposit(float c)
    {
        ammount=ammount+c;
        System .out.println(c+" Deposited");
    }

    void withdraw(float amt)
    {
        if(ammount<amt)
        {
            System.out.println("Insuffcient Balance");
        }

        else{
            ammount=ammount-1;
            System.out.println(amt+"Withdraw");
        }

    }


    void checkBalance()
    {
        System.out.println("Balance is "+ammount);
    }

    void display()
    {
        System.out.println(acc_no+" "+name+" "+ammount);
    }


}

public class AccountDeposite {

    public static void main(String[] args)
    {
      
        Account acc = new Account();
        acc.insert(832345,"mounish",1000);
        acc.display();
        acc.checkBalance();
        acc.deposit(30000);
        acc.checkBalance();
        acc.withdraw(15000);
        acc.checkBalance();
    }

    

    
    
}
