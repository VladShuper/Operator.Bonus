public class Main {
    public static void main(String[] args) {
        int bonus;
        int balans = 100;
        int cashplus = 500;
        if (cashplus > 1000) {
            bonus = 1;
        } else {
            bonus = 0;
            int cash = (cashplus + balans);
        }
        int cash = (cashplus + balans) / 100 + bonus - 1 + (cashplus + balans);

        System.out.println("Итоговая сумма с бонусом:" + cash);
    }
}