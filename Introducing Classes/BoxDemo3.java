// This program includes the method inside the box class.
class Box {
    double width; 
    double height; 
    double depth;

    // display a Volume of Box.
    void volume () {
        System.out.print("Volume is: ");
        System.out.println(width*height*depth);
    }
}
class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // assign the values of mybox1's instance variable.
        mybox1.width = 10;
        mybox1.height = 20; 
        mybox1.depth = 15;

        // Assign the different values to mybox2's instance variable.
        mybox2.width = 3;
        mybox2. height = 6;
        mybox2. depth = 9 ;

        // Compute the volume of first box.
        mybox1.volume();

        // Compute the volume of Second box. 
        mybox2.volume();

    }
}