public class Main {
    public static void main(String[] args) {
        int customerAccount = 500;
        int replenishmentAmount = 3000;
        int bonus = 0;
        int bonusAmount = 1000;
        int balance = 0;
        if (replenishmentAmount >= bonusAmount) {
            bonus = replenishmentAmount / 100;
            balance = customerAccount +replenishmentAmount + bonus;
        }
            System.out.println(bonus + "руб");
            System.out.println(balance + "руб");
    }

    }
