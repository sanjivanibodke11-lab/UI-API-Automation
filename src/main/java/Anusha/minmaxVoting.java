package Anusha;

public class minmaxVoting {
    public static void main(String[] args) {
        int Age = 35 ;
        char Gender = 'f';
        if (Gender == 'm' && Age>=18 && Age<=80){
            System.out.println("Male: Eligible for voting");
        }
        else if (Gender == 'f' && Age>=21 && Age<=75) {
            System.out.println("Female: Eligible for voting");
        }
        else {
            System.out.println("Not specified");
        }
    }
}
