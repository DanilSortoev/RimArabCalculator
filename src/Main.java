import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner scan = new Scanner(System.in);
        String expression = scan.nextLine();
        Initialization initialization = new Initialization();
        initialization.initial(expression);
    }
}
