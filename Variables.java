class student {
    
    String studentName;
    static int studnetCount = 0;
    static final String SCHOOL_NAME = "CSAEA";


    student(String n) {
        studentName = n;
        System.out.println(n + " is a studnet at "+ SCHOOL_NAME);
        studnetCount++;
        System.out.println("Number of students: " + studnetCount);
    }



}
public class Variables {
    public static void main(String[] args) {
        new student("Nav");
        new student("Nav");
        new student("Nav");
        new student("Nav");
        new student("Nav");
        new student("Nav");
        new student("Nav");

        new student("Nav");

        new student("Nav");
        

    }
}