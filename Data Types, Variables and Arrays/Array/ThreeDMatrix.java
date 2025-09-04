// Demonstrate three dimensional array.
/*
 * int num [], num1, num2 ; //creates one array variable and two simple variable.
 * int [] num, num1, num3; // creates three array variables
 */
class ThreeDMatrix {
    public static void main(String args[]){
        int threeD[][][] = new int [3][4][5];
        int i, j, k;

        for(i=0; i<3; i++)
            for(j=0; j<4; j++)
                for(k=0; k<5; k++) 
                    threeD[i][j][k] = i*j*k;
        for(i= 0; i<3; i++){
            for(j=0; j<4; j++){
                for(k=0; k<5; k++){
                    System.out.print(threeD[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }      
}