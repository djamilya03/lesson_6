public class Main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setModel("AXE");
        weapon.setWeaponType(WeaponType.AXE);
        Boss boss = new Boss();
        boss.setWeapon(weapon);
        boss.setHealth(1000);
        boss.setDamage(100);
        System.out.println("Health :" + boss.getHealth()+" Damage: "+boss.getDamage() + " WeaponName " +weapon.getModel()+" WeaponType :" +
                weapon.getWeaponType());
    }
}