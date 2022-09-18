package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    private int physAtt = 30;

    @Override
    public void physicalAttack(Hero hero) {
        int i = (int) (hero.getHealth() - (physAtt - (physAtt * hero.getPhysDef())));
        hero.setHealth(i);
    }

    public Warrior() {
        super();
        setPhysDef(0.8);
        setMagicDef(0);
    }

    @Override
    public String toString() {
        return "Warrior{health=" + this.getHealth() + "}";
    }
}
