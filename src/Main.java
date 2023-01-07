public class Main {
    public static void main(String[] args) {
        int shet = 200;
        int popolnenie = 700;
        int bonus = popolnenie / 100;

         if (popolnenie >= 1000){
           bonus = popolnenie / 100;
         }else{
             boolean x = popolnenie < 1000;
             {
             bonus = 0;
             }

         }
        int balans = shet + popolnenie + bonus;
        System.out.println("Начальная сумма:" + shet);
        System.out.println("Сумма пополнения:" + popolnenie);
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

