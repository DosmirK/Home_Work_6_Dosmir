public class Main {
    public static void main(String[] args) {
        Weapon bossweapon = new Weapon(WeaponType.LASER, "Blaster");

        Boss boss = new Boss();
        boss.setDamage(50);
        boss.setHealth(700);
        boss.setWeapon(bossweapon);

        System.out.println(boss.printInfo());
        System.out.println("__________");


        Weapon skeweapon = new Weapon(WeaponType.FIREARM, "Bow");
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(5);
        skeleton1.setWeapon(skeweapon);
        skeleton1.setArrows(81);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(100);
        skeleton2.setDamage(5);
        skeleton2.setWeapon(skeweapon);
        skeleton2.setArrows(94);

        System.out.println(skeleton1.printInfo());
        System.out.println("__________");
        System.out.println(skeleton2.printInfo());
    }
}