package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    static final int HEAL_HIMSELF = 25;
    static final int HEAL_TEAMMATE = 10;

    @Override
    public void healHimself() {
        setHealth(health + HEAL_HIMSELF);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.health + HEAL_TEAMMATE);
    }

    public Paladin() {
        super();
        physDef = 0.5;
        magicDef = 0.2;
        physAtt = 15;
    }

    @Override
    public String toString() {
        return "Paladin{health=" + this.health + "}";
    }
}
