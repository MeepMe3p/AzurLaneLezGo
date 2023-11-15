package AzurLane;

public abstract class MainShips extends Ships{
    public MainShips(String name, int hp, int dmg, int atk_spd,double location,int exp,int level) {
        super(name, hp, dmg, atk_spd, location,exp,level);
    }

    public static class Nagato extends MainShips implements Battleship{
        @Override
        public void attack(Ships s) {
            s.hp -= dmg;

        }

        public Nagato(){
            super("Nagato",40,5,3,0,0,1);
        }

        @Override
        public void barrage() {

        }
    }
    public static class NewJersey extends MainShips implements Battleship{

        public NewJersey() {
            super("New Jersey",40,5,3,0,0,1);
        }

        @Override
        public void barrage() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= dmg;

        }
    }
    public static class Unicorn extends MainShips implements Carrier{

        public Unicorn() {
            super("Unicorn",30,3,3,0,0,1);
        }

        @Override
        public void airStrike() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= dmg;

        }
    }
    public static class Shinano extends MainShips implements Carrier{

        public Shinano() {
            super("Shinano",45,3,4,0,0,1);
        }

        @Override
        public void airStrike() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= dmg;

        }
    }
}
