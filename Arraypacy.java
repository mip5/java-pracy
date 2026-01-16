public class Arraypacy {    
    public static void main(String[] args) {
        int[] price = new int[10];

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 4;
            System.out.println(numbers[i]);
        }


        int[] numb = {10, 20, 30, 40, 50, 60};  
        if ((numb.length+1) % 2 > 0) {
            System.out.println(numb[numb.length / 2]);
            System.out.println(numb[numb.length / 2 - 1]);
        } else {
            System.out.println(numb[numb.length / 2]);
        }

    }
}
    