public class Main {
    public static void main(String[] args) {
        int ticket = 2465;
        int bonus = 20;
        int mile = ticket / bonus;

        if (ticket >= 0) {
            System.out.println("Колличество миль " + mile);
        } else  {
            System.out.println("Сумма заполнена неверно");
        }




    }
}
