public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int cashplus = 800;
        int sum = 0;
        int bonus = 0;
        if (cashplus > 1000) {
            sum = ((cashplus) / 100 + (balance + cashplus));
            bonus = (cashplus) / 100;
        } else {
            sum = (balance + cashplus + bonus);
        }
        System.out.printf("Баланс Вашего счёта " + (sum) + " руб.");
        System.out.println("");
        System.out.printf("Ваш бонус " + bonus + " руб.");
    }
}