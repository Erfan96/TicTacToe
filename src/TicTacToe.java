import java.util.Scanner;
public class TicTacToe {
    static Person1 p1;
    static Person2 p2;
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
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

        p1 = new Person1(name1, bead1);
        p2 = new Person2(name2, bead2);
        startGame();


    }

    public static void startGame(){
        Play play = new Play();
        for (int i=0 ; i<=4 ; i++){
            p1.display();
            p2.display();
            play.displayGame();

            int check1 = 0;
            do {
                System.out.println(p1.getName() + " please enter your number :");
                int num = s.nextInt();
                if (num <= 9) {
                    check1 = play.game(p1.getBead(), num);
                }
                else{
                    System.out.println("You should enter right number.");
                }
            } while (check1 == 0);

            if (i != 4){
               int check2 = 0;
                do {
                    System.out.println(p2.getName() + " please enter your number :");
                    int num = s.nextInt();
                    if (num <= 9 ) {
                        check2 = play.game(p2.getBead(), num);
                    }
                    else {
                        System.out.println("You should enter right number.");
                    }
                } while (check2 == 0);
            }

            play.displayGame();
        }
    }
}
