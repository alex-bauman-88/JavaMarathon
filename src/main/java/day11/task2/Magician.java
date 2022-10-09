package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack {

    static final int MAGIC_ATTACK = 20;

    @Override
    public void magicalAttack(Hero hero) {
        int i = (int) (hero.health - (MAGIC_ATTACK - (MAGIC_ATTACK * hero.magicDef)));
        hero.setHealth(i);
    }

    public Magician() {
        super();
        physDef = 0;
        magicDef =  0.8;
        physAtt = 5;
    }

    @Override
    public String toString() {
        return "Magician{health=" + this.health + "}";
    }
}
