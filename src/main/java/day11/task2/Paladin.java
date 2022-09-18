package day11.task2;

public class Paladin extends Hero implements PhysAttack, Healer {

    private int physAtt = 15;

    @Override
    public void healHimself() {
        setHealth(getHealth() + 25);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 10);
    }

    @Override
    public void physicalAttack(Hero hero) {
        int i = (int) (hero.getHealth() - (physAtt - (physAtt * hero.getPhysDef())));
        hero.setHealth(i);
    }

    public Paladin() {
        super();
        setPhysDef(0.5);
        setMagicDef(0.2);
    }

    @Override
    public String toString() {
        return "Paladin{health=" + this.getHealth() + "}";
    }
}
