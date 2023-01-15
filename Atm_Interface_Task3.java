import java.util.Scanner;
public class Atm_Interface_Task3 {
    public static void fun(){
        System.out.println("***** Select option from below *****");
        System.out.println("1. Balance enquiry");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Transfer");
        System.out.println("5. Transaction");
        System.out.println("6. Quit");
    }
    public static void main(String[] args) {
        int amount = 5000;
        int cpin = 123456;
        int wamount = 0;
        int damount = 0;
        String name = " ";
        int tamount = 0;
        String cname = "Abhijeet";
        Scanner obj = new Scanner(System.in);
        System.out.println("Welcome! Insert your card");
        System.out.println("Enter your pin "+cname+" : ");
        int pin = obj.nextInt();
        System.out.println("   ");
        if(cpin==pin){
            System.out.println("Successfully login");
        }
        else{
            System.out.println("Invalid credentials");
        }
        fun();
        System.out.println(" ");
        int op1 = obj.nextInt();
        if(op1 ==1){
            System.out.println("----- Your balance -----");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("Your Balance : "+amount);
            System.out.println("   ");
            System.out.println("   ");
        }
        fun();
        System.out.println(" ");
        int op2 = obj.nextInt();
        if(op2==2){
            System.out.println("Enter amount to withdraw : ");
            wamount = obj.nextInt();
            if(wamount>amount){
                System.out.println("Transaction failed due to insufficient storage");
            }
            amount = amount - wamount;
            System.out.println("----- successfully withdraw-----");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("Current Balance : "+amount);
            System.out.println("   ");
            System.out.println("   ");
        }
        fun();
        System.out.println(" ");
        int op3 = obj.nextInt();
        if(op3==3){
            System.out.println("Enter amount to Deposit : ");
            damount = obj.nextInt();
            amount = amount + damount;
            System.out.println("----- successfully Deposited -----");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("Current Balance : "+amount);
            System.out.println("   ");
            System.out.println("   ");
        }
        fun();
        System.out.println(" ");
        int op4 = obj.nextInt();
        if(op4==4){
            System.out.println("Enter Recipient Name :");
            name = obj.next();
            System.out.println("Enter amount to transfer : ");
            tamount = obj.nextInt();
            if(tamount>amount){
                System.out.println("Unable to proceed Due to insufficient balance");
            }
            amount = amount -tamount;
            System.out.println("----- successfully transfered -----");
            System.out.println("   ");
            System.out.println("   ");
            System.out.println("Current Balance : "+amount);
            System.out.println("   ");
            System.out.println("   ");
        }
        fun();
        System.out.println(" ");
        int op5 = obj.nextInt();
        if(op5==5){
            System.out.println("Current Balance : "+amount);
            System.out.println("----- Your Transactions -----");
            System.out.println(tamount+" transfer to : "+name);
            System.out.println("Deposited : "+damount);
            System.out.println("Credited : "+wamount);
            System.out.println("   ");
            System.out.println("   ");
        }
        fun();
        System.out.println(" ");
        int op6 = obj.nextInt();
        if(op6==6){
            System.out.println("----- Thank You -----");
            System.out.println("!!!Don't forget to take your card!!!");
            System.out.println("   ");
        }
        obj.close(); 
    }
}
