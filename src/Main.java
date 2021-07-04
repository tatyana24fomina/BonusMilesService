public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int сoastInRubbles = 10_000;
        int totalBonus = service.calculate(сoastInRubbles);
        System.out.println(totalBonus);
    }
}
