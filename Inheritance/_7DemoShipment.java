// Extend BoxWeight to include the shipping cost.
class Box {
    double width;
    double height;
    double depth;

    //Construct clone of an object.
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

// Add Weight.
class BoxWeight extends Box {
    double weight;

    //Construct clone of an object,
    BoxWeight (BoxWeight ob) { // Pass object to the constructor.
        super(ob);
        weight = ob.weight;
    }

    //Constructor used when all dimensions are specified.
    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d); //call superclass constructor.
        weight = m;
    }

    //default constructor
    BoxWeight() {
        super();
        weight = -1;
    }

    // Constructor used when cube is created.
    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

// Add shipping costs.
class Shipment extends BoxWeight {
    double cost;

    //Construct clone of an object,
    Shipment (Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

    //Constructor used when all dimensions are specified.
    Shipment (double w, double h, double d, double m, double c) {
        super(w, h, d, m); 
        cost = c;
    }

    //default constructor
    Shipment() {
        super();
        cost = -1;
    }

    // Constructor used when cube is created.
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}
public class _7DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.076, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Volume of shipment1 is " + vol);
        System.out.println("Weight of shipment1 is " + shipment1.weight);
        System.out.println("Shipping cost: $" + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Volume of shipment2 is " + vol);
        System.out.println("Weight of shipment2 is " + shipment2.weight);
        System.out.println("Shipping Cost: $" + shipment2.cost);

    }
    
}
