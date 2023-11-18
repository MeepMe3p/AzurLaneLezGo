package AzurLane;

import java.util.ArrayList;
import java.util.Random;

public abstract class VanguardShip extends Ships{
    Random random = new Random();
    Ships nearest;

    public VanguardShip(String name, int hp, int dmg, int atk_spd, double location, int exp, int level) {
        super(name, hp, dmg, atk_spd,location,exp,level);
    }
public static class Laffey extends VanguardShip implements Destroyer{

    public Laffey() {
        super("Laffey",20,1,1,1,1,1);
        this.location = 2 + random.nextDouble();

    }

    @Override
    public void attack(ArrayList<Ships> s) {
        if(s.isEmpty()){
            return;
        }
            s.sort(new CompareDistance());
            nearest = s.get(0);
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
        if(s.get(0).hp <0){
            s.get(0).hp = 0;
        }
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
//            System.out.println("qqqq");



    }

    @Override
    public void rapidFire() {

    }
}
public static class Javelin extends VanguardShip implements Destroyer{

    public Javelin() {
        super("Javelin", 25, 1, 1,1,1,1);
        this.location = 2 + random.nextDouble();

    }

    @Override
    public void rapidFire() {

    }

    @Override
    public void attack(ArrayList<Ships> s) {
        if(s.isEmpty()){
            return;
        }
        s.sort(new CompareDistance());
        nearest = s.get(0);
        System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
        s.get(0).hp -= dmg;
        if(s.get(0).hp <0){
            s.get(0).hp = 0;
        }
        System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
    }
}
public static class Noshiro extends VanguardShip implements Cruiser{

    public Noshiro() {
        super("Noshiro",30,3,2,1,1,1);
        this.location = 2 + random.nextDouble();

    }

    @Override
    public void torp_barrage() {

    }

    @Override
    public void attack(ArrayList<Ships> s) {
        if(s.isEmpty()){
            return;
        }
        s.sort(new CompareDistance());
        nearest = s.get(0);
        System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
        s.get(0).hp -= dmg;
        if(s.get(0).hp <0){
            s.get(0).hp = 0;
        }
        System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
    }
}
public static class Agir extends VanguardShip implements Cruiser{

    public Agir() {
        super("Agir",50,4,2,1,1,1);
        this.location = 2 + random.nextDouble();
    }

    @Override
    public void torp_barrage() {

    }

    @Override
    public void attack(ArrayList<Ships> s) {
        if(s.isEmpty()){
            return;
        }
        s.sort(new CompareDistance());
        nearest = s.get(0);
        System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
        s.get(0).hp -= dmg;
        if(s.get(0).hp <0){
            s.get(0).hp = 0;
        }
        System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
    }
}

}
