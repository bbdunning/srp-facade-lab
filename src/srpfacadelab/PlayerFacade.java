package srpfacadelab;

public class PlayerFacade{
    RpgPlayer player;
    InventoryManager im = new InventoryManager(player);
    DamageCalculator dcalc = new DamageCalculator(player);

    public PlayerFacade() {}

    public void takeDamage(int damage) {
        dcalc.takeDamage(damage);
    }

    public int calculateInventoryWeight() {
        return im.calculateInventoryWeight();
    }

    public boolean checkIfItemExistsInInventory(Item item) {
        return im.checkIfItemExistsInInventory(item);
    }

    public void useItem(Item item) {
        im.useItem(item);
    }
    public boolean pickUpItem(Item item) {
        return im.pickUpItem(item);
    }
}