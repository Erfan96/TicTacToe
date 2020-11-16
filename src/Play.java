public class Play {
     static char[] ticTac = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
     public int game(char bead, int number){
        if (ticTac[number - 1] != 'X' && ticTac[number - 1] != 'O') {
               switch (number) {
                    case 1:
                        ticTac[0] = bead;
                        break;
                    case 2:
                        ticTac[1] = bead;
                        break;
                    case 3:
                        ticTac[2] = bead;
                        break;
                    case 4:
                        ticTac[3] = bead;
                        break;
                    case 5:
                        ticTac[4] = bead;
                        break;
                    case 6:
                        ticTac[5] = bead;
                        break;
                    case 7:
                        ticTac[6] = bead;
                        break;
                    case 8:
                        ticTac[7] = bead;
                        break;
                    case 9:
                        ticTac[8] = bead;
                        break;
                }
            }

        else {
            System.out.println("This is already selected .");
            return 0;
        }
        return 1;
     }

    public void displayGame(){
        System.out.println(ticTac[0] + "  |  " + ticTac[1] + "  |  " + ticTac[2]);
        System.out.println("--------------");
        System.out.println(ticTac[3] + "  |  " + ticTac[4] + "  |  " + ticTac[5]);
        System.out.println("--------------");
        System.out.println(ticTac[6] + "  |  " + ticTac[7] + "  |  " + ticTac[8]);
    }

    public static void main(String[] args) {

    }
}
