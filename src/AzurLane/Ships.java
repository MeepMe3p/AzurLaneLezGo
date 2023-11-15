package AzurLane;

public abstract class Ships {
    String name;

    int hp;
    int dmg;
    int atk_spd;
    double location;
    int exp;
    int level;

    public abstract void attack(Ships ships);
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
}
