package srpfacadelab;

public class DamageCalculator {

    RpgPlayer player;

    DamageCalculator(RpgPlayer player) {
        this.player = player;
    }

    public int takeDamage(int damage) {
        if (damage < player.getArmour()) {
            player.gameEngine.playSpecialEffect("parry");
        }
        int damageToDeal = damage - player.getArmour();

        if (player.currentWeight < (.5 * player.getCarryingCapacity())) {
            damageToDeal = (int) (.75 * damageToDeal);
        }

        player.gameEngine.playSpecialEffect("lots_of_gore");
        return damageToDeal;
    }

    public void calculateStats() {
        for (Item i: inventory) {
            armour += i.getArmour();
        }
    }
}