import java.util.Scanner;

public class EmailGen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String w1 = input.nextLine();
        System.out.println("Enter a second word: ");
        String w2 = input.nextLine();
        System.out.println("Enter a number: ");
        String n1 = input.nextLine();
        System.out.println("Enter a second number: ");
        String n2 = input.nextLine();
        if (n1 + n2 > 99)
        {
            System.out.println("error fix it")
        }
        else{
            
            System.out.println(w1+w2+n1+n2+"@gmail.com");

        }
}