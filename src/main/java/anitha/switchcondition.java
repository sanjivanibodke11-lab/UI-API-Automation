package anitha;

public class switchcondition {
    public static void main( String[]args){
        int male=18,female=21;
        switch( male & female) {
            case 0: {
                if (male >= 18 & male <= 80) ;
                System.out.println("Eligibile to vote");
                break;
            }
            case 1: {
                System.out.println("Not eligible to vote");
                break;
            }
            case 2:{
                if ( female >= 21 & female <= 75 );
                System.out.println("Eligibile to vote");
                    break;
                }
            case 3: {
                System.out.println(" Not Eligibile to vote");
                break;
            }
            default:System.out.println("Default Block");

        }
        System.out.println("Out of Switch");
        }

    }



