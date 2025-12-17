import java.util.Scanner;
public class pracy {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password: ");
        String pass = input.nextLine();

        System.out.println("Enter your password again: ");
        String pass2 = input.nextLine();
        
        if (pass.equals(pass2)){
            System.out.println("Accsess granted!!");
        }
        else {
            System.out.println("Accsess Blocked!!");
        }
        // challenge 2 
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num )

    }
}