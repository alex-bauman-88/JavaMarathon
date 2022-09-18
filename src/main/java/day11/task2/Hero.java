package day11.task2;

public abstract class Hero {
    private int health;
    private double physDef;
    private double magicDef;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else if (health > 100) {
            this.health = 100;
        } else
            this.health = 0;
    }

    public double getPhysDef() {
        return physDef;
    }

    public double getMagicDef() {
        return magicDef;
    }

    public void setPhysDef(double physDef) {
        this.physDef = physDef;
    }

    public void setMagicDef(double magicDef) {
        this.magicDef = magicDef;
    }

    public Hero() {
        this.health = 100;
    }
}
