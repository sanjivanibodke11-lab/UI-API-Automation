package Prangya;

public class ConditionAssignmnt {
    public static void main(String[] args){
        int age=17;
        char gender='M';
        if(age>=18 && gender=='M'){
            System.out.println("Eligible for voting");
        }
        else if(age>=21 && gender=='F'){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligible for voting");
        }
    }
}
