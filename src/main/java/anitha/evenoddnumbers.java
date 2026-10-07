package anitha;

public class evenoddnumbers {
    public void sumnumbers(int x,int y){
        if((x+y)% 2!=0){
            System.out.println("sum twonumbers is odd ");
        }
        else{
            System.out.println(" sum twonumbers is even ");

    }
}

    public static void main( String[] args){
        evenoddnumbers sm = new evenoddnumbers();
           sm.sumnumbers(2,3);
           sm. sumnumbers(4,6);
    }



}
