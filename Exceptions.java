
import java.util.Scanner;


public class Exceptions {
    public static void age_check(int age){
        if(age < 18){
            throw new InvalidAgeException("you cant enter this venue..");
         
        }
        else{
            System.out.println("welcome...");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your age");
        int age=scanner.nextInt();
       try {
          age_check(age);  
        }
        catch (InvalidAgeException e){
            e.printStackTrace();
           
        }
        
    }
}
