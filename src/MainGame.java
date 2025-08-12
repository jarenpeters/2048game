import java.util.Scanner;
import java.util.Random;

public class MainGame {
    public static int totalScore = 0;
    public static int genNum =2;
    static int[][] grid = new int[4][4];

    public static void moveLeft(String move){
        System.out.print("LEFT");
        int counter = 0;
        for(int i=0; i<4;i++) {
//----------------------counting-------------------------------------------------------
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] != 0) {
                    counter++;}}
//---------------------creating non-zero array---------------------------------------------
            int[] tempArray = new int[counter];
            int k = 0;
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] != 0) {
                    tempArray[k] = grid[i][j];
                    k++;}}
//-------------------------summation and placement----------------------------------------
            int[] finalArray = new int[4];
            int placement = 0;
            for (int m = 0; m < tempArray.length; m++) {
                if (m == tempArray.length - 1) {
                    finalArray[placement] = tempArray[m];
                } else if (tempArray[m] == tempArray[m + 1]) {
                    finalArray[placement] = (tempArray[m] + tempArray[m + 1]);
                    totalScore += ((tempArray[m]) + (tempArray[m + 1]));
                    placement++;
                    m++;
                }else { finalArray[placement] = tempArray[m];
                    placement++;}}
//-----------------------update grid----------------------------------------------------
        for(int n=0; n<4;n++) {
            grid[i][n]=finalArray[n];
            counter=0;}}}








    public static void moveRight(String move){
        System.out.print("RIGHT");
        int counter = 0;
        for(int i=0; i<4;i++) {
//----------------------counting-------------------------------------------------------
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] != 0) {
                    counter++;}}
//---------------------creating non-zero array---------------------------------------------
            int[] tempArray = new int[4];
            int k = 0;
            if (counter == 3){
                k=1;
            }else if(counter == 2){
                k=2;
            }else if(counter ==1){
                k=3;}
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] != 0) {
                    tempArray[k] = grid[i][j];
                    k++;}}
//-------------------------summation and placement----------------------------------------
            int[] finalArray = new int[4];
            int placement = 3;
            for (int m = 3; m > -1; m--) {
                if (m == 0) {
                    finalArray[placement] = tempArray[m];
                } else if (tempArray[m] == tempArray[m - 1]) {
                    finalArray[placement] = (tempArray[m] + tempArray[m - 1]);
                    totalScore += (tempArray[m] + tempArray[m - 1]);
                    placement--;
                    m--;
                }else{ finalArray[placement] = tempArray[m];
                    placement--;}}
//-----------------------update grid----------------------------------------------------
            for(int n=0; n<4;n++) {
                grid[i][n]=finalArray[n];
                counter=0;}}}







    public static void moveUp(String move){
        System.out.print("UP");
        int counter = 0;
        for(int i=0; i<4;i++) {
//----------------------counting-------------------------------------------------------
            for (int j = 0; j < 4; j++) {
                if (grid[j][i] != 0) {
                    counter++;}}
//---------------------creating non-zero array---------------------------------------------
            int[] tempArray = new int[counter];
            int k = 0;
            for (int j = 0; j < 4; j++) {
                if (grid[j][i] != 0) {
                    tempArray[k] = grid[j][i];
                    k++;}}
//-------------------------summation and placement----------------------------------------
            int[] finalArray = new int[4];
            int placement = 0;
            for (int m = 0; m < tempArray.length; m++) {
                if (m == tempArray.length - 1) {
                    finalArray[placement] = tempArray[m];
                } else if (tempArray[m] == tempArray[m + 1]) {
                    finalArray[placement] = (tempArray[m] + tempArray[m + 1]);
                    totalScore += ((tempArray[m]) + (tempArray[m + 1]));
                    placement++;
                    m++;
                }else { finalArray[placement] = tempArray[m];
                    placement++;}}
//-----------------------update grid----------------------------------------------------
            for(int n=0; n<4;n++) {
                grid[n][i]=finalArray[n];
                counter=0;}}}




    public static void moveDown(String move){
        System.out.print("DOWN");
        int counter = 0;
        for(int i=0; i<4;i++) {
//----------------------counting-------------------------------------------------------
            for (int j = 0; j < 4; j++) {
                if (grid[j][i] != 0) {
                    counter++;}}
//---------------------creating non-zero array---------------------------------------------
            int[] tempArray = new int[4];
            int k = 0;
            if (counter == 3){
                k=1;
            }else if(counter == 2){
                k=2;
            }else if(counter ==1){
                k=3;}
            for (int j = 0; j < 4; j++) {
                if (grid[j][i] != 0) {
                    tempArray[k] = grid[j][i];
                    k++;}}
//-------------------------summation and placement----------------------------------------
            int[] finalArray = new int[4];
            int placement = 3;
            for (int m = 3; m > -1; m--) {
                if (m == 0) {
                    finalArray[placement] = tempArray[m];
                } else if (tempArray[m] == tempArray[m - 1]) {
                    finalArray[placement] = (tempArray[m] + tempArray[m - 1]);
                    totalScore += (tempArray[m] + tempArray[m - 1]);
                    placement--;
                    m--;
                }else{ finalArray[placement] = tempArray[m];
                    placement--;}}
//-----------------------update grid----------------------------------------------------
            for(int n=0; n<4;n++) {
                grid[n][i]=finalArray[n];
                counter=0;}}}

public static void randomNumber(){
        int k=0;
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                if (grid[i][j] == 0) {
                    while (k < 10) {
                        double odds1 = Math.random();
                        double odds2 = Math.random();
                        if (odds1 < 0.25) {
                            if (odds2 < 0.25) {
                                if (grid[0][0] == 0) {
                                    grid[0][0] = genNum;
                                    k = 11;
                                }
                                continue;
                            } else if (odds2 > 0.25 & odds2 < 0.50) {
                                if (grid[0][1] == 0) {
                                    grid[0][1] = genNum;
                                    k = 11;
                                }
                                continue;
                            } else if (odds2 > 0.50 && odds2 < 0.75) {
                                if (grid[0][2] == 0) {
                                    grid[0][2] = genNum;
                                    k = 11;
                                }
                                continue;
                            } else {
                                if (grid[0][3] == 0) {
                                    grid[0][3] = genNum;
                                    k = 11;
                                }
                                continue;
                            }
                        } else if (odds1 > 0.25 && odds1 < 0.50) {
                            if (odds2 < 0.25) {
                                if (grid[1][0] == 0) {
                                    grid[1][0] = genNum;
                                    k = 11;
                                }
                                continue;
                            } else if (odds2 > 0.25 & odds2 < 0.50) {
                                if (odds2 < 0.25) {
                                    if (grid[1][1] == 0) {
                                        grid[1][1] = genNum;
                                        k = 11;
                                    }
                                    continue;
                                } else if (odds2 > 0.50 && odds2 < 0.75) {
                                    if (odds2 < 0.25) {
                                        if (grid[1][2] == 0) {
                                            grid[1][2] = genNum;
                                            k = 11;
                                        }
                                        continue;
                                    } else {
                                        if (odds2 < 0.25) {
                                            if (grid[1][3] == 0) {
                                                grid[1][3] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        }
                                    }
                                    }else if (odds1 > 0.50 && odds1 < 0.75) {
                                        if (odds2 < 0.25) {
                                            if (grid[2][0] == 0) {
                                                grid[2][0] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        } else if (odds2 > 0.25 & odds2 < 0.50) {
                                            if (grid[2][1] == 0) {
                                                grid[2][1] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        } else if (odds2 > 0.50 && odds2 < 0.75) {
                                            if (grid[2][2] == 0) {
                                                grid[2][2] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        } else {
                                            if (grid[2][3] == 0) {
                                                grid[2][3] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        }
                                    } else {
                                        if (odds2 < 0.25) {
                                            if (grid[3][0] == 0) {
                                                grid[3][0] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        } else if (odds2 > 0.25 & odds2 < 0.50) {
                                            if (grid[3][1] == 0) {
                                                grid[3][1] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        } else if (odds2 > 0.50 && odds2 < 0.75) {
                                            if (grid[3][2] == 0) {
                                                grid[3][2] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        } else {
                                            if (grid[3][3] == 0) {
                                                grid[3][3] = genNum;
                                                k = 11;
                                            }
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }


                }
            }
        }

    public static void printGame(){
        for (int i=0; i<4;i++){
            for(int j=0; j<4; j++){
                System.out.print("|");
                System.out.print(grid[i][j]);
            }
            System.out.println("|");

        }
    }


//---------------------------------------------------------------------------------------
//-------------------------------MAIN METHOD MAIN METHOD---------------------------------
//---------------------------------------------------------------------------------------
    public static void main(String[] args){
        grid[0][0] = 2;
        grid[1][0] = 2;
        grid[2][0] = 4;
        grid[3][0] = 4;
        Scanner s = new Scanner(System.in);
        while(true){
            randomNumber();
            printGame();
            System.out.print("Enter WASD move: ");
            String move = s.nextLine();
            System.out.println();
            switch (move){
                case "a":
                case "A":
                    moveLeft(move);
                    break;
                case "d":
                case "D":
                    moveRight(move);
                    break;
                case "w":
                case "W":
                    moveUp(move);
                    break;
                case "s":
                case "S":
                    moveDown(move);
                    break;
                default:
                    continue;
    }

            System.out.println(" | Score: "+totalScore);

    }
    }
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
}
