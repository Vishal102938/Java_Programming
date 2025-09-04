// Here, Bos uses the constructor to initialize the dimension of a box.

class Box {
    double width;
    double height;
    double depth;

    // this is the constructor for Box.
    Box() {
        width =10;
        height = 10;
        depth = 10;

    }

    // Compute the volume of Box. 
    double volume() {
        return width*height*depth;


    }
}
public class BoxDemo6 {
    public static void  main(String args[]){
        Box mybox1  = new Box();
        Box mybox2 = new Box();
        double vol;

        // get the volume of first box. 
        vol = mybox1.volume();
        System.out.println("Volume is: "+ vol);

        // get the volume of the second box. 
        vol = mybox2.volume();
        System.out.println("Volume is: " + vol);

        }
    
}
