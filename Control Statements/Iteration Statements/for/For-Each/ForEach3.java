/*
 * in case of for-each style for loop the iteration variable recieve (N-1) dimension array if array is of N dimensions. 
 */

public class ForEach3 {
    public static void main(String[] args) {
        int nums [] [] = new int [3] [5];
        int sum = 0;
        for(int i = 0; i<3; i++){
            for(int j = 0; j<5; j++)
                nums[i][j] = (i+1)* (j+1);
        }
        
        for(int x[]: nums){
            for(int y : x) {
                System.out.println("Value is: " +y);
                sum += y;
            }
        }
        System.out.println("Summation: "+ sum);
    }
    
}
