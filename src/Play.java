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

    public int checkResult(){
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:
                    line = ticTac[0] + String.valueOf(ticTac[1]) + ticTac[2];
                    break;
                case 1:
                    line = ticTac[3] + String.valueOf(ticTac[4]) + ticTac[5];
                    break;
                case 2:
                    line = ticTac[6] + String.valueOf(ticTac[7]) + ticTac[8];
                    break;
                case 3:
                    line = ticTac[0] + String.valueOf(ticTac[3]) + ticTac[6];
                    break;
                case 4:
                    line = ticTac[1] + String.valueOf(ticTac[4]) + ticTac[7];
                    break;
                case 5:
                    line = ticTac[2] + String.valueOf(ticTac[5]) + ticTac[8];
                    break;
                case 6:
                    line = ticTac[0] + String.valueOf(ticTac[4]) + ticTac[8];
                    break;
                case 7:
                    line = ticTac[2] + String.valueOf(ticTac[4]) + ticTac[6];
                    break;
            }
            //For X winner
            if (line.equals("XXX")) {
                return 20;
            }

            // For O winner
            else if (line.equals("OOO")) {
                return 20;
            }
        }
        return 0;
    }

    public static void reset(){
        for (int i=0 ; i<9 ; i++){
            int cou = i + 1;
            ticTac[i] = (char)(cou + '0');
        }
    }
}
