import java.io.Console;

public class App {
    public static void main(String[] args){
        Console myConsole = System.console();
        System.out.println("Enter message: ");
        String cipheredString = myConsole.readLine();
    }
}
