import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.print("welcome: "+  name);

        System.out.println("Enter your age: ");
        String age = input.nextLine();
        int ageConverted = Integer.parseInt(age);
        System.out.print("Next year "+ name + " will be: " + (ageConverted + 1));

        System.out.println("What is your hight in meters: ");
        double h = Double.parseDouble(input.nextLine());
        System.out.println("You are "+ h +" meters tall ")

    }
}
