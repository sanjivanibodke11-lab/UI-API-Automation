package Bhanu29;

class votecheck {
    public static void main(String[] args){
        char gender ='m'; // use 'm for boy or use 'f for girl
        int age = 18; // change age here
        if(gender=='m'&& age >=18 && age <=80){
            System.out.println("you are  elligible for vote");
        }
         if (gender=='f' && age >=21 && age <=80) {
            System.out.println("you are elligible for vote");
        }
        else {
            System.out.println("not elligible for vote");
        }


    }
}
