public class Main {
    public static void main(String[] args) {
        int initialBalance = 100;
        int refill = 1100;

        int bonus = 0;
        if (refill > 1000) {
            bonus = refill / 100;
        }
        int finishBalance = initialBalance + refill + bonus;
        System.out.println("Итоговый баланс:" + finishBalance);
        System.out.println("Бонус:" + bonus);
    }
}