package day11.task2;

public class Shaman extends Hero implements PhysAttack, MagicAttack, Healer {

    private int physAtt = 10;
    private int magicAtt = 15;

    @Override
    public void healHimself() {
        setHealth(getHealth() + 50);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
    }

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

    public Shaman() {
        super();
        setPhysDef(0.2);
        setMagicDef(0.2);
    }

    @Override
    public String toString() {
        return "Shaman{health=" + this.getHealth() + "}";
    }
}
