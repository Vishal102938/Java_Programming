
// for-each for loop is best for search in unsorted in array.

public class Search {
    public static void main(String[] args) {
        int nums [] = {6, 3, 8, 7, 5, 6, 1, 4};
        int val = 5;
        boolean Found = false;
        

        for(int x: nums)  {
            if(x== val) Found = true;
            
        }
        if(Found) System.out.println("Value found.");
        else System.out.println("Not found.");
    }
    
}
