class Box {
    double width;
    double height;
    double depth;

    // Construct clone of an object.
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    //Contructor used when all dimensions are specified.
    Box(double w, double h, double d ) {
        width = w;
        height = h;
        depth = d;
    }

    // Constructor when no dimension are specified.
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // Contstuctor use when cube is created.
    Box(double len) {
        width = height = depth = len;
    }

    // Compute and return volume.
    double volume() {
        return width * height * depth;
    }
}

// Here, Box is extended to include the weight.
class BoxWeight extends Box{
    double weight; // weight of Box.
    
    // Constructor for BoxWeight.
    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class _4RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Volume of weightbox is " + vol);
        System.out.println("Weight of weightbox is " + weightbox.weight);
        System.out.println();

        //assign BoxWeight reference to Box regference.
        plainbox = weightbox;

        vol = plainbox.volume();
        System.out.println("Volume of plainbox is " + vol);
    //    System.out.println("Weight of plainbox is " + plainbox.weight);

    }
}