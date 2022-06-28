public class Main {
    public static void main(String[] args) {
        int account = 200;

        int refill = 700;

        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }


        System.out.println("Вы пополнили счет на: " + refill + "рублей,");
        if (refill >= 1000) {

            System.out.println("бонус равен " + bonus + " рублям, итоговая сумма на вашем счету " + (account + refill + bonus) + " рублей.");
        } else {

            System.out.println("бонус не начисляется, итоговая сумма на вашем счету " + (account + refill + bonus) + " рублей");
        }

    }
}
