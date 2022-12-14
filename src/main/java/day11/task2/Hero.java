package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    double physDef;
    double magicDef;
    int physAtt;
    public static final int HEALTH_MAX = 100;
    public static final int HEALTH_MIN = 0;

//    public int getHealth() {
//        return health;
//    }

    public void setHealth(int health) {
        if (health >= HEALTH_MIN && health <= HEALTH_MAX) {
            this.health = health;
        } else if (health > HEALTH_MAX) {
            this.health = HEALTH_MAX;
        } else
            this.health = HEALTH_MIN;
    }

    public void physicalAttack(Hero hero) {
        int i = (int) (hero.health - (physAtt - (physAtt * hero.physDef)));
        hero.setHealth(i);
    }

//    public double getPhysDef() {
//        return physDef;
//    }
//
//    public double getMagicDef() {
//        return magicDef;
//    }
//
//    public void setPhysDef(double physDef) {
//        this.physDef = physDef;
//    }
//
//    public void setMagicDef(double magicDef) {
//        this.magicDef = magicDef;
//    }
//
//    public int getPhysAtt() {
//        return physAtt;
//    }
//
//    public void setPhysAtt(int physAtt) {
//        this.physAtt = physAtt;
//    }

    public Hero() {
        health = HEALTH_MAX;
    }
}
