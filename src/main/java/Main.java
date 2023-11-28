public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();
        long sumBonus = service.calcBonus(5000, true);
        System.out.println("Ваши бонусы составляют  " + sumBonus + "  баллов");
    }
}
