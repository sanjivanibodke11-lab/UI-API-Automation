package anitha;

public class arrayslength {
    public void length( int[] x,int[] y){
        if(x.length==y.length){
            System.out.println("two arrays are same length");
        }
        else{
            System.out.println("two arrays are different length");
        }
    }

    public static void main( String[]args){
        arrayslength l=new arrayslength();
        int[] x = {1, 2, 3, 4};
        int[] y = {5, 6, 7, 8};
          l.length(x,y);
    }



}
