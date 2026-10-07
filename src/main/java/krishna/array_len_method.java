package krishna;

public class array_len_method {   public void compare(int[] x, int[] y) {
    if (x.length == y.length)
    {
        System.out.println("they are of equal length");
    }
    else
    {
        System.out.println("they are not equal");
    }
}

    public static void main(String[] args) {
        array_len_method m = new array_len_method();
        int[] x = {1,3,4,6,7,8};
        int[] y = {4,5,3,6,7,8,9};
        m.compare(x,y);
    }
}
