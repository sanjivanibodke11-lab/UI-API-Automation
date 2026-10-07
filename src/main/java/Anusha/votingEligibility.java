package Anusha;

public class votingEligibility {
    public static void main(String[] args) {
        int Age = 18 ;
        char Gender = 'm';
        if (Gender == 'm' && Age>=18){
            System.out.println("Male: Eligible for voting");
        }
        else if (Gender == 'f' && Age>=21) {
            System.out.println("Female: Eligible for voting");
        }
        else {
            System.out.println("Not specified");
        }
    }
}