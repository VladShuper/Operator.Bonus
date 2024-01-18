public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cashplus = 100;
        int sum = 0;
        int bonus = 0;
        if (cashplus > 1000) {
            sum = ((balance + cashplus) / 100 + (balance + cashplus));
            bonus = (balance + cashplus) / 100;
        }
        System.out.printf("Баланс Вашего счёта " + (balance + cashplus + bonus) + " руб.");
        System.out.println("");
        System.out.printf("Ваш бонус " + bonus + " руб.");
    }
}