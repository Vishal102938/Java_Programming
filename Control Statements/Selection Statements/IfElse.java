// Demonstrate the if else statements.
class IfElse {
    public static void main(String[] args) {
        int i =4;
        String season;
        if (i==12 || i ==1|| i==2)
            season = "Winter";
        else if(i==3 || i ==4 ||i ==5)
            season = "Spring";
        else if(i==6 || i== 7 || i ==8)
            season = "Summer";
        else if(i ==9 || i ==10 || i ==11)
            season  = "Autumn";
        else 
            season = "Bogus month";
        System.out.println("April is in the " + season +".");
    }
}