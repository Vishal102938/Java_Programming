//Demonstrate when constructor are called.

//create a super class.
class A {
    A() {
        System.out.println("Inside A's constructor.");
    }
}

//Create a subclass by extending class A.
class B extends A {
    B() {
        System.out.println("Inside B's constructor.");
    }
}

//create another subclass by extending class B.
class C extends B {
    C() {
        System.out.println("Inside C's constructor.");
    }
}
class _8CallingCons {
    public static void main(String args[]) {
        C c = new C ();
    }
    
}
