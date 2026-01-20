import java.util.Random;

public class Tiktac {
    public static void main(String[] args) {

        Random rand = new Random();

        char[][] board = new char[3][3];
        int x = 0;
        int o = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int player = rand.nextInt(2); // 0 = O, 1 = X

                if (x > o) {
                    player = 0;
                } else if (o > x) {
                    player = 1;
                }

                if (player == 1) {
                    board[i][j] = 'X';
                    x++;
                } else {
                    board[i][j] = 'O';
                    o++;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                System.out.println(board[i][0] + " wins!");
                return;
            }

            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                System.out.println(board[0][i] + " wins!");
                return;
            }
        }

        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            System.out.println(board[0][0] + " wins!");
            return;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            System.out.println(board[0][2] + " wins!");
            return;
        }
        System.out.println("Draw");
    }
}
