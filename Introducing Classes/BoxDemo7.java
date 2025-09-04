// Here, Box uses the parameterized constructor to initialize the  dimension of a box.
class Box {
    double width;
    double height;
    double depth;
    
    // This is the constructor for the box.
    Box(double w, double h, double d) {
        width = w;
        height = h; 
        depth = d; 

    }

    // Compute the volume of the box.
    double volume() {
        return width*height*depth;
    }

}
public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        double vol;

        // get the volume of the first box.
        vol = mybox1.volume();
        System.out.println("Volume is: " + vol);

        // get the volume of the second box.
        vol = mybox2.volume();
        System.out.println("Volume is: " + vol);
    }
    
}
