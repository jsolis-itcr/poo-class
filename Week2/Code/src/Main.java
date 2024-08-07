import Models.Character;
import Models.Enums.Status;

public class Main {
    public static void main(String[] args) {
        // String bool int byte double float
        /**
        String name = "Jonathan";
        int age = 29;
        boolean isProfessor = true;
        char gender = 'M';
         **/

        // Creating a new instance of Character
        Character myFirstCharacter = new Character(1, "Jonathan", Status.Alive);
    }
}