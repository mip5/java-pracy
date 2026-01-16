public class ArrayEx1 {

    public static void main(String args[]) {
        
       //int[] primeNum = new long[20];
        //int even=new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);
        byte[] values = new byte[10];
        values[0] = 1;
        values[1] = 1;
        values[2] = 1;
        values[3] = 1;
        values[4] = 1;
        values[5] = 1;
        values[6] = 1;
        values[7] = 1;
        values[8] = 1;
        values[9] = 1;

        int[] score = new int[9];
        score[0] = 1;
        score[1] = 2;
        score[2] = 3;
        score[3] = 4;
        score[4] = 5;
        score[5] = 6;
        score[6] = 7;
        score[7] = 8;
        score[8] = 9;

        System.out.println()

        int[] array = {-20, 19, 1,5,-1,27,19,5};
        int min = array[0];
         for (int index=0; index < array.length; index++ )
            if (array[index]< min);
                min = array[index];
        System.out.println("the min of this ");

        
        int target = 6;
        int[] numbers = {0,2,4,6,8};
        boolean targetFound = false;

        for( int index=0; index < numbers.length; index ++)
        {
            if (numbers[index == target]){
                targetFound = true;
                break;
            }
        }

        int[] numbers = {0,0,0,1,0};
        boolean allSame = true;
        for( int index = 1; index < numbers.length; index++ ) {
            if(numbers[0] !- numbers[index]){
                allSame = false;
                break;

            }
        }       
        String names []={"tom","david","make"};
        for (String name : names) {
            System.out.println("My name is"+name);
        }

    }

}
