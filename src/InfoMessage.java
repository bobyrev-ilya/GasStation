public class InfoMessage {
    final String mainPart;
    private String categoryPart;
    private String measurePart;

    public InfoMessage(String mainPart){
         this.mainPart = mainPart;
    }
    public void printMessage(){
        System.out.println(mainPart);
    }

    public void printMessage(int operationCode) throws Exception{
        defineCategoryPart(operationCode);
        System.out.printf("%s %s\n",mainPart,categoryPart);
    }
    public void printMessage(String[] params){
        System.out.printf("Машина заправлена на колонке №%s на %s%s\n",params[0],params[1],measurePart);
    }

    private void defineCategoryPart(int operationCode) throws Exception{
        switch (operationCode) {
            case 1:
                categoryPart = "количество литров";
                measurePart = "л";
                break;
            case 2:
                categoryPart = "сумму денег";
                measurePart = "$";
                break;
            default:
                throw new Exception("Неверный код операции");
        }
    }
}
