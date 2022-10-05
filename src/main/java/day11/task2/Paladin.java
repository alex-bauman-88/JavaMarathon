package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    static final int HEAL_HIMSELF = 25;
    static final int HEAL_TEAMMATE = 10;
    @Override
    public void healHimself() {
        setHealth(getHealth() + HEAL_HIMSELF);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + HEAL_TEAMMATE);
    }

    public Paladin() {
        super();
        setPhysDef(0.5);
        setMagicDef(0.2);
        setPhysAtt(15);
    }

    @Override
    public String toString() {
        return "Paladin{health=" + this.getHealth() + "}";
    }
}
