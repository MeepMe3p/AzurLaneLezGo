package AzurLane;

import java.util.ArrayList;
import java.util.Random;

public class Battle {

    private ArrayList<EnemyShip> boss;
    private ArrayList<EnemyShip> normal;
    private ArrayList<Ships> playerFleet;

    public Battle() {
        this.boss = new ArrayList<>();
        this.normal = new ArrayList<>();

        boss.add(new EnemyShip.BossCarrier());
        boss.add(new EnemyShip.BossBattleship());
        boss.add(new EnemyShip.BossCruiser());
        boss.add(new EnemyShip.BossDestroyer());

        normal.add(new EnemyShip.EnemyCarrier());
        normal.add(new EnemyShip.EnemyCruiser());
        normal.add(new EnemyShip.EnemyDes());
        normal.add(new EnemyShip.EnemyBattleship());
        normal.add(new EnemyShip.SuicideShip());
    }
    public EnemyShip setBossEnemies(){
        Random random = new Random();
        int rnd = random.nextInt(boss.size());
        EnemyShip eBoss = boss.get(rnd);
        return eBoss;
    }
    public EnemyShip setNormalEnemies(){
        Random random = new Random();
        int rnd = random.nextInt(normal.size());
        EnemyShip nEnemy = normal.get(rnd);
        return nEnemy;
    }
}
