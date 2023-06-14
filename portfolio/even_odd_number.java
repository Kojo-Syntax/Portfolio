import java.util.*;
public class even_odd_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
   
        System.out.println("***************************");
        System.out.println("1. Send Money");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Buy Airtime or Data");
        System.out.println("4. Exit");
        System.out.println("***************************");

        System.out.println("Please select menu: ");
        int menu_input = sc.nextInt();

        switch (menu_input) {
            case 1:
            System.out.println("Send Money");
            break;
            case 2:
            System.out.println("Withdraw Cash");
            break;
            case 3:
            System.out.println("Buy Airtime or Data");
            break;
            case 4:
            System.exit(0);
        }
  
    }


}

