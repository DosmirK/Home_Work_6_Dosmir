public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String printInfo() {
        return "Skeleton info: " + "\n" + "Health: " + getHealth() + "\n" + "Damage: " + getDamage() + "\n" + "Weapon: " + getWeapon().getName() + "\n" + "Arrows: " + arrows;
    }
}