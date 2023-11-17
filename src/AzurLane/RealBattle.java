package AzurLane;

import javax.swing.*;
import java.util.ArrayList;

public class RealBattle {
    private  ArrayList<EnemyShip> bossEnemy;
    private  ArrayList <Ships> playerFleet;
    private  ArrayList <EnemyShip> normalEnemy;

    private ArrayList<Ships> everyone;
    private ArrayList<Ships> enemies;



    private final JTextArea battle;

    public RealBattle(ArrayList<EnemyShip> bossEnemy, ArrayList<Ships> playerFleet, ArrayList<EnemyShip> normalEnemy, JTextArea battle) {
        this.bossEnemy = bossEnemy;
        this.playerFleet = playerFleet;
        this.normalEnemy = normalEnemy;
        this.battle = battle;
    }

    public void startBattle(){
        enemies = new ArrayList<>();
        everyone = new ArrayList<>();
        ArrayList<Ships> sunkenShips = new ArrayList<>();
        if(playerFleet == null){
            throw new IllegalArgumentException("You need to set your attack fleet");
        }
        enemies.addAll(bossEnemy);
        enemies.addAll(normalEnemy);


        everyone.addAll(bossEnemy);
        everyone.addAll(playerFleet);
        everyone.addAll(normalEnemy);
        int i = 1;
        while(!playerFleet.isEmpty() && !bossEnemy.isEmpty()){
            for(Ships e: everyone){
                if(e instanceof VanguardShips){
                    e.attack(enemies);
                }
                if(e instanceof MainShips){
                    e.attack(enemies);
                }
                if(e instanceof EnemyShip){
                    if(e instanceof Boss){
                        ((Boss) e).skill();
                    }
                    e.attack(playerFleet);
                }
            }
            ArrayList<Ships> dead = new ArrayList<>();
            for(Ships s: everyone){
                if(s.hp <= 0){
                    dead.add(s);
                    if(s instanceof Boss){
                        bossEnemy.remove(s);
                    }
                    if(s instanceof VanguardShips || s instanceof MainShips){
                        playerFleet.remove(s);
                    }
                    else{
                        normalEnemy.remove(s);
                    }
                }

            }
        }
        battle.setText("this worked mahuman sha yay");
    }
}
