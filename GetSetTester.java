import java.util.Scanner;

public class GetSetTester {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GetSet gs = new GetSet();

        System.out.print("Enter username: ");
        String name = input.nextLine();

        System.out.print("Enter rank: ");
        String rank = input.nextLine();

        System.out.print("Enter id: ");
        int id = input.nextInt();

        gs.setUsername(name);
        gs.setRank(rank);
        gs.setId(id);

        System.out.println("Username: " + gs.getUsername());
        System.out.println("Rank: " + gs.getRank());
        System.out.println("ID: " + gs.getId());

        if rank.equals("haker") {
            System.out.println("You are a haker");
        } else {
            System.out.println("You do not have haker privileges");
        }


    }
}

class GetSet {

    private String username;
    private int id;
    
    private String rank;

    public String getUsername() {
        return username;
    }

    public int getId() {

        return id;

    }

    public String getRank() {
        return rank;
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
    public void setRank(String newRank) {
        this.rank = newRank;
    }
    public void setId(int newId) {
        this.id = newId;
    }
}
