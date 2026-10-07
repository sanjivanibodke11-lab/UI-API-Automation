package Shifali_Rajurkar;
public class VotingAgeRange {
    public static void main(String args[]) {
        String gender = "M";
        int age = 87;
        switch (gender) {
            case "F":
                if (age >= 20 && age <= 75) {
                    System.out.println("this female person is eligible for voting");
                } else {
                    System.out.println("this female person not eligible for voting");
                }
                break;
            case "M":
                if (age >= 18 && age <= 80) {
                    System.out.println("this male person is eligible for voting");
                } else {
                    System.out.println("this male person is not eligible for voting");
                }
                break;
            default:
                System.out.println("invalid");
        }
    }
}


