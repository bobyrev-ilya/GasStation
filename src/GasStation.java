import java.util.Scanner;

public class GasStation {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите код операции: 1 - заправить; 2 - оплатить.");
        Scanner console = new Scanner(System.in);
        int operationCode = console.nextInt();
        startService(operationCode, console);
        console.close();
    }
    public static void startService(int operationCode, Scanner console) throws Exception {
        String parameterInputMessage = "Введите номер колонки и";
        String [] params = new String[3];
        switch (operationCode){
            case 1 :
                parameterInputMessage += " количество литров";
                params[2] = "л";
                break;
            case 2 :
                parameterInputMessage += " сумму денег";
                params[2] = "$";
                break;
            default:
                throw new Exception("Неверный код операции");
        }
        System.out.println(parameterInputMessage);
        console.useDelimiter("\n");
        for (int i = 0; i < params.length-1; i++) {
            params[i] = console.next();
        }
        System.out.printf("Машина заправлена на колонке №%s на %s%s",params[0],params[1],params[2]);
    }
}


