package AzurLane;

import java.util.ArrayList;
import java.util.Random;
public abstract class EnemyShip extends Ships{

    double speed;
    Ships nearest;
    Random random = new Random();
    public EnemyShip(String name, int hp, int dmg, int atk_spd,double location) {
        super(name, hp, dmg, atk_spd,location);
    }


    public static class BossDestroyer extends EnemyShip implements Destroyer,Boss{
        public BossDestroyer() {
            super("BossDes", 80, 3, 2,10);
        }

        @Override
        public void rapidFire() {

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there!");
            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }

        @Override
        public void skill() {

        }
    }
    public static class BossCruiser extends EnemyShip implements Cruiser,Boss{

        public BossCruiser() {
            super("BossCruiser",100,2,2,10);
        }

        @Override
        public void torp_barrage() {

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there!");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }

        @Override
        public void skill() {

        }
    }
    public static class BossBattleship extends EnemyShip implements Battleship{

        public BossBattleship() {
            super("BossBattleship",90,6,5,10);
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
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there!");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }
    }
    public static class BossCarrier extends EnemyShip implements Carrier,Boss{

        public BossCarrier() {
            super("BossCarrier",50,5,4,10);
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
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there!");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }

        @Override
        public void skill() {

        }
    }
    public static class EnemyDes extends EnemyShip implements Destroyer{

        public EnemyDes() {
            super("EnemyDes",25,1,1,1);
            this.location = 10 + random.nextDouble();
        }

        @Override
        public void rapidFire() {

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there!");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }
    }
    public static class EnemyCruiser extends EnemyShip implements Cruiser{

        public EnemyCruiser() {
            super("EnemyCruiser",15,2,2,1);
            this.location = 10 + random.nextDouble();

        }

        @Override
        public void torp_barrage() {

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there!");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }
    }
    public static class EnemyBattleship extends EnemyShip implements Battleship{

        public EnemyBattleship() {
            super("EnemyBattleship",30,4,5,1);
            this.location = 10 + random.nextDouble();

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
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }
    }
    public static class EnemyCarrier extends EnemyShip  implements Carrier{

        public EnemyCarrier() {
            super("EnemyAircraftCarrier",30,6,7,1);
            this.location = 10 + random.nextDouble();

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
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);

        }
    }
    public static class SuicideShip extends EnemyShip{

        public SuicideShip() {
            super("SuicideShip", 10, 4, 0, 10);
            this.location = 10 + random.nextDouble();

        }

        @Override
        public void attack(ArrayList<Ships> s) {
            if(s.isEmpty()){
                return;
            }
            nearest = s.get(0);
//            System.out.println(nearest.name+" "+nearest.hp+" "+nearest.location);
            s.get(0).hp -= dmg;
            if(s.get(0).hp <0){
                s.get(0).hp = 0;
                System.out.println(nearest.name + " is now dedz there there");

            }
            System.out.println(this.name+" attacked "+ nearest.name+" dealing "+ this.dmg+ " Enemy HP: "+nearest.hp);
        }
    }
}

