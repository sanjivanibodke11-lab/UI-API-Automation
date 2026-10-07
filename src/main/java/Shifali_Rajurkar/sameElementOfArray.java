package Shifali_Rajurkar;

public class sameElementOfArray {
        public void calculateSameElements(int[] x,int[] y){
            for (int j=0;j<x.length;j++){
                for (int k=0;k<y.length;k++){
                    if (x[j]==y[k]){
                        System.out.println("same elements "+y[k]);
                    }
                }
            }
        }

    public  static  void main(String args[]){
        sameElementOfArray obj = new sameElementOfArray();
        int a[]={10,54,78,94,55};
        int b[]={44,55,84,10,84,78,54};
        obj.calculateSameElements(a,b);
    }
}

