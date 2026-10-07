package Bhanu29;

public class assign12 {
    int count;
    public int times(int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]==10){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        assign12 b = new assign12();
        int[] a = {1,2,3,4,5,10,6,7,8,9,10};
        int x = b.times(a);
        System.out.println(x);

    }
}

