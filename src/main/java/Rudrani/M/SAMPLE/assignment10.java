package Rudrani.M.SAMPLE;

public class assignment10 {
    public void array(int []a,int[]b){
        if(a.length==b.length){
            System.out.println("array is of same length");
        }
        else{
            System.out.println("array is not of same length");
        }
    }
    public static void main(String[] args){
        int[]a= new int[3];
        int[]b=new int[4];
        assignment10 ar= new assignment10();
        ar.array(a,b);
    }
}
