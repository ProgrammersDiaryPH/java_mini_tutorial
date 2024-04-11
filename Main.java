import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Person person = new Person();
    public static void askForName(){ // walang parameter/argument
        System.out.print("Enter name: ");
        String input = scanner.nextLine();
        // error handling
        try {
            person.setName(input);
        } catch(Error e){
            askForName(true);
            return;
        }
        System.out.println("END OF THE PROGRAM");
    }

    public static void askForName(boolean didRepeatToAsk){ // merong argument na didRepeatToAsk
        System.out.print("Name is invalid. Re-enter your name: ");
        String input = scanner.nextLine();
        // error handling
        try {
            person.setName(input);
        } catch(Error e){
            askForName(true);
            return;
        }
        System.out.println("END OF THE PROGRAM");
    }
    public static void main(String[] args) {
        askForName();
    }
}