import java.util.Scanner;
public class ComputeAvg {
    public static void main(String args[]){
        double scores[] = new double[5];
        Scanner input = new Scanner(System.in);
        double sum =0.0, avg = 0.0;
        System.out.println();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }
        System.out.println("The Scores:");

        for(int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
            avg = sum / scores.length;


        }
        System.out.println("The avg score of the class: "+ avg);
        
    }

}