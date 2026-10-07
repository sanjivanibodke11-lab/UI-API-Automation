package supriya_kottam;

public class Assignment3 {
    public static void main(String[] args){
        char gender = 'F';
        int age = 50;
        if(gender == 'M' && age>=18 && age<=80)
        {
            System.out.println("Male is eligible for voting");
        }
        else if(gender =='F' && age >= 21 && age<=75)
        {
            System.out.println("Female is eligible for voting");
        }
        else
        {
            System.out.println("not eligible for voting");
        }

    }
}


//using if else
/*public class Assignment3 {
    public static void main(String[] args) {
        int male = 18, female = 22;
        if (male >= 18 && male <= 80) {
            System.out.println("Male is eligible for voting");
        } else {
            System.out.println("Male is not eligible for voting");
        }
        if (female >= 21 && female <= 75) {
            System.out.println("Female is eligible for voting");
        } else {
            System.out.println("Female is not eligible for voting");
        }
    }
}*/


/*public class Assignment3 {
    public static void main(String[] args){
        int male = 18, female = 20 ;
        if(male>=18 && male<=80)
        {
            System.out.println("Male is eligible for voting");
        }
        if(female >= 21 && female<=75)
        {
            System.out.println("Female is eligible for voting");
        }
        else
        {
            System.out.println("not eligible for voting");
        }
}
}*/


 /* using nested if
public class Assignment3 {
    public static void main(String[] args) {
        int male = 18, female = 8;
        if (male >= 18) {
            if (male <= 80) {
                System.out.println("Male eligible");
            } else {
                System.out.println("Male not eligible");
            }
        }
        if (female >= 21) {
            if (female <= 75) {
                System.out.println("female eligible");
            } else {
                System.out.println("female not eligible");
            }
        }
    }
}*/



