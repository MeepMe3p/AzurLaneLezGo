package AzurLane;

import java.util.ArrayList;


public abstract class MainShip extends Ships{
    Ships nearest;

    public MainShip(String name, int hp, int dmg, int atk_spd, double location, int exp, int level) {
        super(name, hp, dmg, atk_spd, location,exp,level);
    }

    public static class Nagato extends MainShip implements Battleship{
        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
            }
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);



        }

        public Nagato(){
            super("Nagato",40,5,3,1,0,1);
        }

        @Override
        public void barrage() {

        }
    }
    public static class NewJersey extends MainShip implements Battleship{

        public NewJersey() {
            super("New Jersey",40,5,3,1,0,1);

        }

        @Override
        public void barrage() {

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
            }
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);

        }
    }
    public static class Unicorn extends MainShip implements Carrier{

        public Unicorn() {
            super("Unicorn",30,3,3,1,0,1);
        }

        @Override
        public void airStrike() {

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
            }
            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);

        }
    }
    public static class Shinano extends MainShip implements Carrier{

        public Shinano() {
            super("Shinano",45,3,4,1,0,1);
        }

        @Override
        public void airStrike() {

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
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
