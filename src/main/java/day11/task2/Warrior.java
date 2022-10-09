package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super();
        physDef = 0.8;
        magicDef = 0;
        physAtt = 30;
    }

    @Override
    public String toString() {
        return "Warrior{health=" + this.health + "}";
    }
}
