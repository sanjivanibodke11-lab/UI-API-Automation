package Prangya;

public class VoteCheck {
    public static void main(String[] args) {
        char gender='M';
        int age = 21;

        if(gender=='M' && age>=18 && age<=80)
        {
            System.out.println("Eligible for Voting");
        }
        else if(gender=='F' && age>=21 && age<=75)
        {
            System.out.println("Eligible for Voting");
        }
        else{
            System.out.println("Not Eligible for Voting");
        }

    }
}
