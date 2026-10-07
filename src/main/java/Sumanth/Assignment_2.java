package Sumanth;

public class Assignment_2 {
    public static void main(String[] args){
        char gender = 'f';
        int age = 18;
        if (gender == 'm' && age >= 18) {
            System.out.println("Male is eligible for vote");
        }
        else if (gender == 'f' && age >= 18) {
            System.out.println("Female is eligible for vote");
        }
        else {
            System.out.println("Not eligible for vote");
        }
        }
    }

