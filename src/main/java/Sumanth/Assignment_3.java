package Sumanth;

public class Assignment_3 {
    public static void main(String[] args) {
        char gender = 'm';
        int age = 51;
        if (gender == 'm' && age >= 18 && age <= 80) {
            System.out.println("Male is Eligible to vote");
        }
        else if (gender == 'f' && age >= 18 && age <= 80) {
            System.out.println("Female is Eligible to vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }
    }

