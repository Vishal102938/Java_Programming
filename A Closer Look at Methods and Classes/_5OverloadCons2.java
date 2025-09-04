// Here, Box allows one object to initialize another.
class Box {
    double width;
    double height; 
    double depth; 

    // Notice this constructor , it takes object of  type of type Box .
    Box(Box ob) {
        width = ob.width;
        height = ob.height; 
        depth = ob. depth; 
    }

    // Constructor used when all dimension are specified.

    Box(double w, double h, double  d) {
        width = w ;
        height = h; 
        depth = d;

    }

    // Constructor used when no dimension are specified.
    Box (){
        width = -1;
        height = -1 ;
         depth = -1;

    }

    // Constructor used when one dimension is specified. 
    Box (double len) {
        width = height = depth = len;
    }

    // Compute the volume and return.

    double volume() {
        return width*height*depth;
    }
}
class _5OverloadCons2 {
    public static void main(String[] args) {

        // creating boxes using various constructor.
        Box mybox1 = new Box (10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box (7);

        Box myclone  = new Box (mybox1); // Create a copy of mybox1.

        double vol;

        // get the volume  of first box.
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " +  vol);

        // get the volume of second box.
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        // get the volume of cube.
        vol = mycube.volume();
        System.out.println("Volume of Cube is " + vol);

        // get the volume of clone.
        vol = myclone.volume();
        System.out.println("Volume of Clone is " + vol);


        
    }

}