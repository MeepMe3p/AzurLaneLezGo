package AzurLane;

import java.util.ArrayList;
import java.util.Random;

public abstract class VanguardShips extends Ships{
    Random random = new Random();

    public VanguardShips(String name, int hp, int dmg, int atk_spd,double location,int exp,int level) {
        super(name, hp, dmg, atk_spd,location,exp,level);
    }
public static class Laffey extends VanguardShips implements Destroyer{

    public Laffey() {
        super("Laffey",20,1,1,1,1,1);
        this.location = 2 + random.nextDouble();

    }

    @Override
    public void attack(ArrayList<Ships> s) {
//        s.hp -= dmg;

    }

    @Override
    public void rapidFire() {

    }
}
public static class Javelin extends VanguardShips implements Destroyer{

    public Javelin() {
        super("Javelin", 25, 1, 1,1,1,1);
        this.location = 2 + random.nextDouble();

    }

    @Override
    public void rapidFire() {

    }

    @Override
    public void attack(ArrayList<Ships> s) {

    }
}
public static class Noshiro extends VanguardShips implements Cruiser{

    public Noshiro() {
        super("Noshiro",30,3,2,1,1,1);
        this.location = 2 + random.nextDouble();

    }

    @Override
    public void torp_barrage() {

    }

    @Override
    public void attack(ArrayList<Ships> s) {
//        s.hp -= dmg;

    }
}
public static class Agir extends VanguardShips implements Cruiser{

    public Agir() {
        super("Agir",50,4,2,1,1,1);
        this.location = 2 + random.nextDouble();

    }

    @Override
    public void torp_barrage() {

    }

    @Override
    public void attack(ArrayList<Ships> s) {
//        s.hp -= dmg;

    }
}

}
