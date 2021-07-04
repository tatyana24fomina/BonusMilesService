public class BonusMilesService {
    public int calculate(int coastInRubbles) {
        int bonusInMiles = 1;
        int everyAmountSpent = 20;
        int totalBonus = coastInRubbles / everyAmountSpent * bonusInMiles;
        return totalBonus;
    }
}
