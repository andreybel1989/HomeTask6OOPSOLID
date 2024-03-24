public class Program {
    public static void main(String[] args) {
        InputDate inputDate = new InputDate();
        Order order = inputDate.getOrderFromConsole();
        ConverterToJson converterToJson = new ConverterToJson();

        converterToJson.saveToJson(order);
    }
}
