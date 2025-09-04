// Left shift a byte values.
class ByteShift {
    public static void main(String args[]){
        byte a = 64, b;
        int i;
        i = a<<2;
        b = (byte)i;
        System.out.println("Original value of a: " + a);
        System.out .println("i and b is: " + i +" " + b );
    }
    
}
