// A program that use the Box class.
/*
 * Call this file BoxDemo.java
 */

 class Box {
    double width;
    double height;
    double depth;

 }
 // This class declare an object of type Box.
class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // assign values to mybox instance variable. 
        mybox.width = 10;
        mybox.height = 20; 
        mybox.depth = 15;

        // Compute the volume of box.
        vol = mybox.width*mybox.height*mybox.depth;

        System.out.println("Volume is: " + vol);

        
    }
    
}
