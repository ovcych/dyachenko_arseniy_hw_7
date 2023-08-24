public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(200, 20, "Fireball"),
                new Medic(150, 15, "Heal", 50),
                new Warrior(180, 18, "Critical Damage")
        };
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}