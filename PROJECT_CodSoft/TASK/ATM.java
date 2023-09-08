package TASK;
import java.util.Scanner;

class atmMachine
{
    Scanner in = new Scanner((System.in));
    int balance=0;
    int Pin = 2728;

    public void checkPin()
    {
        System.out.println("enter your pin:");
        int enteredpin= in.nextInt();
        if( enteredpin==Pin)
        {
            menu();
        }
        else
        {
            System.out.println("please enter valid pin!");
        }

    }


    public void menu()
    {
        Scanner sc = new Scanner((System.in));
        System.out.println("1. checkBal");
        System.out.println("2. widthwral");
        System.out.println("3. deposit");
        System.out.println("4. exit");
        System.out.println("choose any one number:");
        int choosemenu=sc.nextInt();

        switch (choosemenu)
        {
            case 1:

                System.out.println("1. checkBal");
                checkBal();
                break;
            case 2:

                System.out.println("2. widthwral");
                widthwral();
                break;
            case 3:
                System.out.println("3. deposit");
                deposit();
                break;
            case 4:
                System.out.println("4. exit");
                break;
        }

    }

    public void checkBal()
    {

        System.out.println("Balance: " +balance);
        menu();
    }

    public void  widthwral()
    {
        System.out.println("enter amount: ");
        Scanner sc =  new Scanner(System.in);
        int amount = sc.nextInt();
        if(amount>balance)
        {
            System.out.println("we can't give youu money");
        }
        else
        {
             balance = balance - amount;
            System.out.println("Money widthwral successfully");
            menu();
        }

    }


    public void  deposit()
    {
        System.out.println("enter amount: ");
        Scanner sc =  new Scanner(System.in);
        int amount = sc.nextInt();
        balance = balance+amount;
        System.out.println("money deposit successful!!!!!");
        menu();
    }
}






public class ATM
{
    public static void main(String[] args)
    {
        atmMachine obj = new atmMachine();
        obj.checkPin();
//        obj.menu();
//        obj.checkBal();
//        obj.widthwral();
//        obj.deposit();
//

    }



}

