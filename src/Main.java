import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String operation;
        int parameter1;
        int parameter2;
        Scanner read=new Scanner(System.in);
        System.out.println("Que tipo de operacion desea realizar?");
        operation=read.next();
        System.out.println("introduzca el primer operando:");
        parameter1=read.nextInt();
        System.out.println("introduzca el segundo operando:");
        parameter2=read.nextInt();
            switch (operation) {
                case "SUMA" -> System.out.println(parameter1 + "+" + parameter2 + " = " + (parameter1 + parameter2));
                case "RESTA" -> System.out.println(parameter1 + "-" + parameter2 + " = " + (parameter1 - parameter2));
                case "MULTIPLICACION" ->
                        System.out.println(parameter1 + "*" + parameter2 + " = " + (parameter1 * parameter2));
                case "DIVISION" ->
                        System.out.println(parameter1 + "/" + parameter2 + " = " + (parameter1 / parameter2));
            }
    }
}