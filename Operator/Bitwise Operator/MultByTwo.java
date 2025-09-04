// Left shifting as a quick way to multiply by 2.
class MultByTwo {
    public static void main(String args[]){
        int i ,num ;
        num = 0xFFFFFFE;
        System.out.println(num);

        for(i = 0; i<4; i++ ){
            num = num<<1;
            System.out.println(num);
        }
            
    }
    
}
