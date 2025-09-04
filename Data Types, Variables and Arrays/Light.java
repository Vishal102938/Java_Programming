//Compute distance light travels using long.
class Light {
    public static void main(String args[]){
        int lightspeed;
        int days;
        long seconds;
        long distance; 

        // aproximate speed of light in miles per second.
        
        lightspeed = 186000;
        days = 1000;
        seconds = days*24*60*60; // Compute seconds

        distance = lightspeed*seconds; // Compute distance

        System.out.print("In ṇ" + days);
        System.out.println(" days light will travel about ");
        System.out.println(distance + " miles.");
    }
}
