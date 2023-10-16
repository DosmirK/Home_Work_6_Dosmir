public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String printInfo() {
        return "Boss info:" + "\n" + "Health: " + getHealth() + "\n" + "Damage: " + getDamage() + "\n" + "Weapon: " + weapon.getName();
    }
}
