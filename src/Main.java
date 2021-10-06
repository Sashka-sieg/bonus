public class Main {
    public static void main(String[] args) {
        int customerAccount = 500;
        int replenishmentAmount = 3000;
        int bonus = 0;
        int bonusAmount = 1000;
        int overallBalance = 0;
        if (replenishmentAmount >= bonusAmount) {
            bonus = replenishmentAmount / 100;
            overallBalance = customerAccount +replenishmentAmount + bonus;
        }
            System.out.println("Бонус начислений:" + bonus + "руб");
            System.out.println("Баланс лицевого счета:" + overallBalance + "руб");
    }

    }
