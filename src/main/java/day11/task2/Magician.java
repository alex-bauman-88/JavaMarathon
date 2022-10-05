package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    static final int MAGIC_ATTACK = 20;

    @Override
    public void magicalAttack(Hero hero) {
        int i = (int) (hero.getHealth() - (MAGIC_ATTACK - (MAGIC_ATTACK * hero.getMagicDef())));
        hero.setHealth(i);
    }

    public Magician() {
        super();
        setPhysDef(0);
        setMagicDef(0.8);
        setPhysAtt(5);
    }

    @Override
    public String toString() {
        return "Magician{health=" + this.getHealth() + "}";
    }
}
