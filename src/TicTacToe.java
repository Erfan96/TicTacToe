import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter name of the first player :");
        String name1 = s.next();
        System.out.println("Please enter [X] or [O] for first player :");
        char bead1 = s.next().charAt(0);
        if (bead1 != 'X') {
            bead1 = 'O';
        }

        System.out.println("Please enter name of the second player :");
        String name2 = s.next();
        char bead2;
        if (bead1 == 'X') {
            bead2 = 'O';
        }
        else
            bead2 = 'X';

        Person1 p1 = new Person1(name1, bead1);
        Person2 p2 = new Person2(name2, bead2);

    }
}
