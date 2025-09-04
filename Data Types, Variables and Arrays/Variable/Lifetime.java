// Demonstrate lifetime of a variable.
class Lifetime {
    public static void main(String args[]){
        int x;

        for(x=0; x<3; x++){
            int y = -1;// y is reinitialized each time when block enters
            System.out.println("y is: "+ y);// this will always print -1.

            y=100;
            System.out.println("y is now :" + y);
        
        

        }
    }
    
}
