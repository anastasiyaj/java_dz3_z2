public class Main {
    public static void main(String[] args) {
        int bank = 300;
        int refill = 1100;
        int bonus;
        if (refill>1000) {
            bonus = refill/100;
            bank = bank + refill + bonus;
            System.out.println("Зачислено бонусов за пополнение счета = "+bonus);
            System.out.println("Сумма на счету = "+bank);
        }
        else{
            bank = bank + refill;
            System.out.println("Сумма на счету = "+bank);
        }
            }
}