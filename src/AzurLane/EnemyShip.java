package AzurLane;

import java.util.Random;
public abstract class EnemyShip extends Ships{

    double speed;
    Random random = new Random();
    public EnemyShip(String name, int hp, int dmg, int atk_spd,double location) {
        super(name, hp, dmg, atk_spd,location);
    }


    public static class BossDestroyer extends EnemyShip implements Destroyer{
        public BossDestroyer() {
            super("BossDes", 80, 3, 2,10);
        }

        @Override
        public void rapidFire() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= dmg;
        }
    }
    public static class BossCruiser extends EnemyShip implements Cruiser{
        double loc = 10+ random.nextDouble();

        public BossCruiser() {
            super("BossCruiser",100,2,2,10);
        }

        @Override
        public void torp_barrage() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= dmg;
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
        public void attack(Ships s) {
            s.hp -= this.dmg;

        }
    }
    public static class BossCarrier extends EnemyShip implements Carrier{

        public BossCarrier() {
            super("BossCarrier",50,5,4,10);
        }

        @Override
        public void airStrike() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= this.dmg;

        }
    }
    public static class EnemyDes extends EnemyShip implements Destroyer{

        public EnemyDes() {
            super("EnemyDes",25,1,1,1);
            location = 10 + random.nextDouble();
        }

        @Override
        public void rapidFire() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= this.dmg;

        }
    }
    public static class EnemyCruiser extends EnemyShip implements Cruiser{

        public EnemyCruiser() {
            super("EnemyCruiser",15,2,2,1);
            location = 10 + random.nextDouble();

        }

        @Override
        public void torp_barrage() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= this.dmg;

        }
    }
    public static class EnemyBattleship extends EnemyShip implements Battleship{

        public EnemyBattleship() {
            super("EnemyBattleship",30,4,5,1);
            location = 10 + random.nextDouble();

        }

        @Override
        public void barrage() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= this.dmg;

        }
    }
    public static class EnemyCarrier extends EnemyShip  implements Carrier{

        public EnemyCarrier() {
            super("EnemyAircraftCarrier",30,6,7,1);
            location = 10 + random.nextDouble();

        }

        @Override
        public void airStrike() {

        }

        @Override
        public void attack(Ships s) {
            s.hp -= this.dmg;

            System.out.println(this.name+" HP: "+this.hp);
            System.out.println(this.name +" is attacking "+ s.name+" dealing "+ this.dmg+" damage. "+s.name+" HP: "+ s.hp);

        }
    }
    public static class SuicideShip extends EnemyShip{

        public SuicideShip() {
            super("SuicideShip", 10, 4, 0, 10);
            location = 10 + random.nextDouble();

        }

        @Override
        public void attack(Ships s) {
            s.hp -= this.dmg;

        }
    }
}

