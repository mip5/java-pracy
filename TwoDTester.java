import java.util.Scanner;
public class TwoDTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nums = new int[3][4];

        // Print the 2D array
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print("enter a value for row: " + i + " column: " + j + ": ");
                nums[i][j] = input.nextInt();
                
               
            }
            



        }



        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]);
            }
            System.out.println();

    }

    input.close();
    }
}