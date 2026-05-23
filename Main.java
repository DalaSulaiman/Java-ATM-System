import java.util.Scanner;
//  Methods-functions
public class Main {
    static double balance = 1000;
    // method to show balance
    public static void showBalane(){
        System.out.println("your balance is :$"+balance);
    }
    // method to deposit money
    public static void deposit(double amount){
        balance = balance+amount;
        System.out.println("$"+amount+"deposited successfull.");
    }
    // method to withdraw money
    public static void withdraw(double amount){
        if (amount>balance){
            System.out.println("Not enough money!!" );
        }else {
            balance= balance-amount;
            System.out.println("$"+amount+" withdrawn successfully.");
        }

    }
    public static void main(String[] args) {
        // step to call a functions 1st is Return value type:نوع القيمه الراجعه DataTYPES String,int,float, double also using var
        //void dose not need a return type
        //call the funcition
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n=====ATM MENU ====");
            System.out.println("1- Show Balance");
            System.out.println("2- Deposit ");
            System.out.println("3- Withdraw");
            System.out.println("4- Exit");


            System.out.println("Choose: ");
            choice=input.nextInt();

            switch (choice){
                case 1:
                    showBalane();
                    break;
                case 2:
                System.out.println("Enter deposit amount:\t");
                double depositAmount = input.nextInt();
                   deposit (depositAmount);
                   break;
                case  3:
                    System.out.println("Enter withdraw amount:\t");
                    double withdrawAmount = input.nextDouble();
                    withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.println("Goodbye!!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }while (choice!=4);







    }
}