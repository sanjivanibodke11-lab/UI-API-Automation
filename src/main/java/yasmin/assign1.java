package yasmin;

public class assign1
{
    public static void main(String[] args) {
        int male=3,female=10;
        if(male>=18)
        {
            System.out.println("yes the person can vote");
        }
        else if(male!=18)
        {
            System.out.println("no the person cannot vote because he is not 18");
        }
        else if(female>=21)
        {
            System.out.println("yes the person can vote");
        }
        else if (female<21)
        {
            System.out.println("no the person cannot vote because she is not 21");
        }
        else
        {
            System.out.println("no one gender is eligible for voting");
        }


    }
}
