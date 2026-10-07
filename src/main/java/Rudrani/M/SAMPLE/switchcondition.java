package Rudrani.M.SAMPLE;

public class switchcondition {
    public static void main(String[] args){
        int f = 21, m=18;
        int vote = 1;
        switch (vote) {
            case 1:
                if (f >= 21)
                    System.out.println("girl is eligible");
                else
                    System.out.println("girl is not eligible");
break;
            case 2:
                if (m >= 18)
                    System.out.println("boy is eligible");
                else
                    System.out.println("boy is not eligible");

        }
    }
}