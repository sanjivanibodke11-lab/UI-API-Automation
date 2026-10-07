package supriya_kottam;

public class Assignment2 {

        public static void main(String args[]){
            int age = 25;
            char gender = 'M';
            if(age>=18 && gender == 'M'){
                System.out.println("Male is eligible for voting");
            }
            else if(age >= 21 && gender == 'F'){
                System.out.println("Female is eligible for voting");
            }
            else{
                System.out.println("Not Eligible");
            }
        }
    }
