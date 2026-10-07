package GaddamAravind21;

public class assignment10 {
    void array(int[] a , int[] b){
        if(a.length==b.length){
            System.out.println("the length of arrays are same");
        }
        else{
            System.out.println("length of arrays are not same ");
        }
    }
    public static void main(String[] args) {
        assignment10 a1=new assignment10();
        int[] a={1,2,3,4,5};
        int[] b={1,2,3,4,5,6};
        a1.array(a,b);
    }
}
