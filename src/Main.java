import com.ironyard.Person;
import javafx.scene.paint.Color;

public class Main {

    public static void main(String[] args) {


        Person doug = new Person("Doug", 38, 6);
        doug.getName();

        doug.jump(12);

        /*
        Person liz = new Person("Liz", 5.5);
        liz.receiveHighFive();
        liz.receiveHighFive();
        liz.receiveHighFive();
        liz.receiveHighFive();
        liz.receiveHighFive();
        liz.receiveHighFive();

        if(doug.getNumberOfHighFivesReceived() > liz.getNumberOfHighFivesReceived()){
            System.out.println("gloat!");
        } else {
            System.out.println("hang head in shame");

        }*/

    }
}
