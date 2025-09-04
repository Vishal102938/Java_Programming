/* Here, Box define the three constructors to initialize 
  the dimensionn of a Box various ways.
*/
class Box  {
    double width; 
    double height; 
    double depth;

    // Constructor used when all dimensions are specified.
    Box (double w, double h , double d) {
        width = w; 
        height = h; 
        depth = d ; 

    }

    // Constructor used when no dimension are specified.

     Box (){
        width = -1;
        height = -1; 
        depth = -1; 

     }
    // constructor used when cube is created
    Box ( double len) {
        width = height = depth = len ;
    }

    // Compute and return Volume.
    double volume () {
        return width*height*depth;
    }


}

class _3OverloadCons {
    public static void main(String[] args) {
        Box mybox1  = new Box(10, 20 , 15);
        Box mybox2   = new  Box ();
        Box mycube = new Box (7);

        double vol;

        vol = mybox1.volume();
        System.out.println("volume of mybox1 is:" + vol); 
        
        // Volume of mybox2
        vol = mybox2.volume();
        System.out.print(" Volume of mybox2 is: " +vol);

        // Volume of mycube.

        vol = mycube.volume();
        System.out.println("volume of mycube is: "+ vol);

    }
    // 

}
