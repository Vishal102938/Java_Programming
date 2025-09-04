// This program will not compile.
class ScopeErr {
    public static void main(String args[]){
        int bar =1;
            {
                int bar= 2;
                // By changing bar to bar1
                //This program will work after changing

            }
    }
    
}
