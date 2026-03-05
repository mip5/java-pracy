public class WrapperClassTester {
    public static void main(String[] args) {
        wrapper.demo();
        wrapper.demo2();

    }
}

class wrapper { 
    public static void demo() {
        int prim = 10;
        Integer myInt = 5;
        
        System.out.println(prim);
        System.out.println(myInt);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        int parsed = Integer.parseInt("25");
        int add = parsed + 5;

        
    }
    public static void demo2() {
        Boolean myBool = Boolean.valueOf(true);
        boolean primbool = true;

        System.out.println("primitive boolean: "+ primbool);
        System.out.println("bool"+ myBool);

        boolean parsed = Boolean.parseBoolean("false");
        
        System.out.print(parsed);

    }
    public static void box(){
        Integer number = 5;
        // takes prim data type and wrappes it in a integer class
    }
}   

