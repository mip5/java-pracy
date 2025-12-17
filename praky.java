public class praky {
    public static void main(String[] args)
    {
        for (int i = 0; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("foobar");
            else if (i % 3 == 0)
                System.out.println("foo");
            else if (i % 5 ==0)
                System.out.println("bar");
            
    
        }
        for (int a = 0; a <= 12; a++)
        {
            for (int b = 0; b <= 12; b++)
            {
                System.out.print((b * a)+"\t");

            }   

            System.out.println("");
        
        }
    }

}
