package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    private int physAtt = 5;
    private int magicAtt = 20;

    @Override
    public void magicalAttack(Hero hero) {
        int i = (int) (hero.getHealth() - (magicAtt - (magicAtt * hero.getMagicDef())));
        hero.setHealth(i);
    }

    @Override
    public void physicalAttack(Hero hero) {
        int i = (int) (hero.getHealth() - (physAtt - (physAtt * hero.getPhysDef())));
        hero.setHealth(i);
    }

    public Magician() {
        super();
        setPhysDef(0);
        setMagicDef(0.8);
    }

    @Override
    public String toString() {
        return "Magician{health=" + this.getHealth() + "}";
    }
}
