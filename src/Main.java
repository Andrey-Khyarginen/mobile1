public class Main {
    public static void main(String[] args) {
        int check = 800;
        int replenishment = 1700;
        int bonus = replenishment / 100;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            boolean x = replenishment < 1000;
            {
                bonus = 0;
            }

        }
        int balans = check + replenishment + bonus;
        System.out.println("Начальная сумма:" + check);
        System.out.println("Сумма пополнения:" + replenishment);
        System.out.println("итоговый счет:" + balans);
        System.out.println("бонус:" + bonus);
        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
    }
}

