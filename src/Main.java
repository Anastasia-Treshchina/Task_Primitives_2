public class Main {
    public static void main(String[] args) {

        int starting_Personal_Account = 500; // начальный счет
        int refill = 500; // сумма пополнения
        int rate = 100; // коэффициэнт 100р. = bonus_Point
        int bonus_Point = 1;  // бонусные рубли
        int deposit_Amount = 1000; // минимальный платеж, с которого идет бонус

        int bonus = refill >= deposit_Amount ? refill * bonus_Point / rate : 0;
        int final_Personal_Account = refill >= deposit_Amount ? starting_Personal_Account + refill + bonus : starting_Personal_Account + refill;

        System.out.println("Итоговый счёт: " + final_Personal_Account);
        System.out.println("В том числе, бонусных рублей: " + bonus);
    }
}