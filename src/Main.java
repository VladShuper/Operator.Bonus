public class Main {
    public static void main(String[] args) {
        int balans;
        int cashplus;
        int bonus;
        balans = 100;
        cashplus = 1100;
        if (cashplus > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
        }

        int cash = cashplus / 100 * bonus + balans + cashplus;

        System.out.println("Итоговая сумма с бонусом:" + cash);
    }
}