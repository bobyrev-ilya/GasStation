import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) throws Exception {
        new InfoMessage("Введите код операции: 1 - заправить; 2 - оплатить.").printMessage();
        Scanner console = new Scanner(System.in);
        int operationCode = console.nextInt();
        startService(operationCode, console);
        console.close();
    }
    public static void startService(int operationCode, Scanner console) throws Exception {
        InfoMessage processMessage = new InfoMessage("Введите номер колонки и");
        processMessage.printMessage(operationCode);
        String [] params = new String[3];
        for (int i = 0; i < params.length-1; i++) {
            params[i] = console.next();
        }
        processMessage.printMessage(params);
    }
}


