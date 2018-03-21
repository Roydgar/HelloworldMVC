//
package ua.training;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.execute();
    }
}

class Model {
    private Scanner scanner = new Scanner(System.in);
    public String getLine() { return scanner.nextLine(); }
}

class ConsoleView {
    public void print(String message) {
        System.out.println(message);
    }
}

class Controller{
    private Model model = new Model();
    private ConsoleView view = new ConsoleView();

    public void execute() {
        view.print("Enter two words:");
        String firstLine = model.getLine();
        String secondLine = model.getLine();

        if (firstLine.equals("hello") && secondLine.equals("world!"))
            view.print(firstLine + secondLine);
        else
            view.print("Input is wrong");
    }
}