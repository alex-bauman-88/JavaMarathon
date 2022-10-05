package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    static final int MAGIC_ATTACK = 15;
    static final int HEAL_HIMSELF = 50;
    static final int HEAL_TEAMMATE = 30;

    @Override
    public void healHimself() {
        setHealth(getHealth() + HEAL_HIMSELF);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth() + HEAL_TEAMMATE);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int i = (int) (hero.getHealth() - (MAGIC_ATTACK - (MAGIC_ATTACK * hero.getMagicDef())));
        hero.setHealth(i);
    }

    public Shaman() {
        super();
        setPhysDef(0.2);
        setMagicDef(0.2);
        setPhysAtt(10);
    }

    @Override
    public String toString() {
        return "Shaman{health=" + this.getHealth() + "}";
    }
}
