public class Main {
    public static void main(String[] args) {

        int startingPersonalAccount = 100; // начальный счет
        int refill = 1100; // сумма пополнения
        int rate = 100; // коэффициэнт 100р. = bonus_Point
        int bonusPoint = 1;  // бонусные рубли
        int depositAmount = 1000; // минимальный платеж, с которого идет бонус

        int bonus = refill >= depositAmount ? refill * bonusPoint / rate : 0;
        int finalPersonalAccount = refill >= depositAmount ? startingPersonalAccount + refill + bonus : startingPersonalAccount + refill;

        System.out.println("Итоговый счёт: " + finalPersonalAccount);
        System.out.println("В том числе, бонусных рублей: " + bonus);
    }
}