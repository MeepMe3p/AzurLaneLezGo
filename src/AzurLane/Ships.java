package AzurLane;

import java.util.ArrayList;
import java.util.Comparator;

public abstract class Ships {
    String name;

    int hp;
    int dmg;
    int atk_spd;
    double location;
    int exp;
    int level;

    public abstract void attack(ArrayList<Ships> s);
    public Ships(String name, int hp, int dmg, int atk_spd, double location,int exp,int level) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.atk_spd = atk_spd;
        this.location = location;
        this.exp = exp;
        this.level = level;
    }

    public Ships(String name, int hp, int dmg, int atk_spd, double location) {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.atk_spd = atk_spd;
        this.location = location;
    }

    public void setLocation(double location) {
        this.location = location;
    }
    public static class CompareDistance implements Comparator<Ships>{

        @Override
        public int compare(Ships o1, Ships o2) {
            return Double.compare(o1.location, o2.location);
        }
    }
}
