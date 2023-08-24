abstract class Hero implements HavingSuperAbility {
    public int health;
    public int damage;
    public String supAbility;
    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.supAbility = superAbility;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getSuperAbility() {
        return supAbility;
    }
    public void setSuperAbility(String superAbility) {
        this.supAbility = superAbility;
    }
}
