public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cashplus = 100;
        int sum = 0;
        int bonus = 0;
        if (cashplus > 1000) {
            sum = ((cashplus + balance) / 100 + (cashplus + balance));
            bonus = (cashplus + balance) / 100 - 1;
        }
        System.out.println("Ваш баланс состовляет:" + (cashplus + balance + bonus ) + "руб.");
        System.out.println("Вам начислен бонус в размере:" + bonus);
    }
}