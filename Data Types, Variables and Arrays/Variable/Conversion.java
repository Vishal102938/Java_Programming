// Demontrate casts.
class Conversion {
    public static void main(String args[]){
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion of int to byte:");
        b = (byte)i;
        System.out.println("i: "+ i+" and b: "+b);
        
        System.out.println("\nConversion of double to int");
        i = (int)d;
        System.out.println("d: " + d +" and i: " + i);
        
        System.out.println("\nConversion of double to byte");
        b = (byte)d;
        System.out.println("d: "+ d + " and b: "+ b);
        /*
          char s ='x', t ='y';
          s+t ; // will display 241 as x =120 and y =121 in unicode.
          also 
          int i = (int)s; //is valid 
          but 
          String s = "x";
          int i = (int)s; throw an error.
         */


    }
    
}
