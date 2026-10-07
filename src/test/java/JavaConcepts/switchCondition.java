package JavaConcepts;

public class switchCondition {

    public static void main(String[] args) {
        int a = 1,b=1;

        switch (a+b){ //switch(condition)
            case 0:   //if((a+b)==0) //case <value>
                System.out.println("Sunday");
                break;

            case 2: //if((a+b)==2)
                System.out.println("Tuesday");
                break;

            case 1:  // if((a+b)==1)
                System.out.println("Monday");
                break;

            default:  //else
                System.out.println("Default Block");

        }
        System.out.println("Out of Switch");
    }
}
