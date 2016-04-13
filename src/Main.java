import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        // this is my scanner. this is how I read input from the command line
        Scanner scanner = new Scanner(System.in);

        // get the user's name
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        // this next bit gets the user's age as an integer
        int age = 0;

        // this bit makes sure that if the user provides something that's not an integer that we keep trying untill we get a valid integer.
        do {
            System.out.println("What is your age?");
            String ageIn = scanner.nextLine();

            try {
                age = Integer.parseInt(ageIn);

                if(age <= 0){
                    System.out.println("Common.... a 0 or negative age?! Really!??");
                }
            } catch (NumberFormatException e) {
                System.out.println("Sorry, I didn't understand that. Did you provide a number?");
            }

        } while(age <= 0);

        // get the user's eye color
        System.out.println("What color are your eyes?");
        String eyeColor = scanner.nextLine();

        // create our person

        Person user = new Person();
        user.age = age;
        user.eyeColor = eyeColor;
        user.name = name;

        System.out.println(user);

    }
}
