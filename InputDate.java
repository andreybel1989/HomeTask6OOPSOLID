import java.util.Scanner;

/**
 * InputDate
 */
public class InputDate {

    private Scanner scanner = new Scanner(System.in);

    public InputDate() {
    }
    public Order getOrderFromConsole(){
        String clientName = prompt("Имя клиента: ");
        String product = prompt("Продукт: ");
        int qnt = Integer.parseInt(prompt("Кол-во: "));
        int price = Integer.parseInt(prompt("Цена: "));
        return new Order(clientName, product, qnt, price);
    }
    private String prompt(String message){
        System.out.println(message);
        return scanner.nextLine();
    }
}