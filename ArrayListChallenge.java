import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListChallenge {
    public static void main(String[] args) {


    // Create an arrayList with 10 random numbers
    // Remove all odd from that list
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++)
        {
            list.add((int)(Math.random() * 10));
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) % 2 != 0)
            {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    // Make a guest list that allows the user to enter names
    // if the name exists tell the user that "this person is invited!"
    // continue until you type exit
        ArrayList<String> guestList = new ArrayList<String>();
        String name = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name to add to the guest list (type 'exit' to finish):");
        while (!name.equals("exit"))
        {       name = input.nextLine();
                if (guestList.contains(name))
                {
                    System.out.println("This person is invited!");
                }
            if (!name.equals("exit") && !guestList.contains(name))        {
                guestList.add(name);
            }
        }   

        System.out.println("Guest List: " + guestList);


    // Create a list of grocery items
    // if the user types in a food print out the index
    // If not print "Not Found" and add it to the list
    // continue until you type exit
        ArrayList<String> groceryList = new ArrayList<String>();
        String food = "";
        System.out.println("Enter a food item to add to the grocery list type 'exit' to finish:");
        while (!food.equals("exit"))
        {       food = input.nextLine();
                if (groceryList.contains(food))
                {
                    System.out.println("Index of " + food + ": " + groceryList.indexOf(food));
                }
            if (!food.equals("exit") && !groceryList.contains(food))        {
                groceryList.add(food);
                System.out.println("Not Found");
                System.out.println(food + " added to the grocery list.");
            }


    }
    }
}
