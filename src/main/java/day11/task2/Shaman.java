package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer {

    static final int MAGIC_ATTACK = 15;
    static final int HEAL_HIMSELF = 50;
    static final int HEAL_TEAMMATE = 30;

    @Override
    public void healHimself() {
        setHealth(health + HEAL_HIMSELF);
    }

    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.health + HEAL_TEAMMATE);
    }

    @Override
    public void magicalAttack(Hero hero) {
        int i = (int) (hero.health - (MAGIC_ATTACK - (MAGIC_ATTACK * hero.magicDef)));
        hero.setHealth(i);
    }

    public Shaman() {
        super();
        physDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
    }

    @Override
    public String toString() {
        return "Shaman{health=" + this.health + "}";
    }
}
