import java.util.Scanner;
public class MainGame {
    static int[][] grid = new int[4][4];

    public static void moveLeft(String move){
        System.out.println("IM MOVING LEFT");
        int k = 0;
        int counter = 0;
//----------------------counting-------------------------------------------------------
            for (int j=0; j<4; j++) {
                if (grid[0][j] != 0) {
                    counter++;
                }
            }
//---------------------creating non-zero array---------------------------------------------
        int[] tempArray = new int[counter];
            for (int j =0; j<4; j++){
                if (grid[0][j] != 0){
                    tempArray[k] = grid[0][j];
                    k++;
                }
            }
//---------------------------------------------------------------------------------------
int[] finalArray = new int[4];
            int placement = 0;
        for (int m=0;m<tempArray.length;m++ ){
            if(tempArray[m] == tempArray[m+1]){
                finalArray[placement] = (tempArray[m] + tempArray[m+1]);
                placement++;
            }else{
             finalArray[placement] = tempArray[m];
            }
}




        }





//---------------------------------------------------------------------------------------
//-------------------------------MAIN METHOD MAIN METHOD---------------------------------
//---------------------------------------------------------------------------------------
    public static void main(String[] args){
        grid[0][1] = 2;
        grid[0][3] = 2;
        grid[0][2] = 4;

        Scanner s = new Scanner(System.in);
    System.out.println("What move do you want to play?");
    String move = s.nextLine();

    switch (move){
        case "a":
            moveLeft(move);
            break;
        case "w":
            break;
    }


    }
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
//---------------------------------------------------------------------------------------
}
