package GaddamAravind21;

public class assignment3 {
    public static void main(String[] args) {
        char gender ='F';
        int age =22;
        if(gender == 'M' && age >=18 && age <= 80 ){
            System.out.println(" Male : your are eligible to vote ");
        }
        else if(gender == 'F' && age >=21 && age<=75){
            System.out.println("FeMale  : you are not eligible to vote");
        }
        else{
            System.out.println(" you are not eligible to vote ");
        }
    }
}
