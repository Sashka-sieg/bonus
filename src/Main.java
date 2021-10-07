public class Main {
    public static void main(String[] args) {
        int customerAccount = 500;
        int replenishmentAmount = 1199;
        int bonus = 0;
        int bonusAmount = 1000;
        if (replenishmentAmount > bonusAmount) {
            bonus = replenishmentAmount / 100;
        }
        System.out.println("Бонус начислений:" + bonus + "руб");
        System.out.println(customerAccount+replenishmentAmount+bonus );
    }

}
