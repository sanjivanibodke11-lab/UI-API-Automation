package Bhanu29;

 class votingelligibility {
    public static void main(String[] args){
        char gender ='m';
        int age = 18;
        if(gender=='m'&& age >=18){
            System.out.println("boy is elligible for vote");
        }
          else if (gender=='f' && age >=21) {
            System.out.println("girl is elligible for vote");
        }
        else {
            System.out.println("not elligible for vote");
        }


    }
}
