package day11.task2;

public class Warrior extends Hero implements PhysAttack {

    public Warrior() {
        super();
        setPhysDef(0.8);
        setMagicDef(0);
        setPhysAtt(30);
    }

    @Override
    public String toString() {
        return "Warrior{health=" + this.getHealth() + "}";
    }
}
