package AzurLane;

import javax.swing.*;
import java.util.ArrayList;

public class RealBattle {
    private ArrayList<EnemyShip> bossEnemy;
    private ArrayList <Ships> playerFleet;
    private ArrayList <EnemyShip> normalEnemy;

    private JTextArea battle;

    public RealBattle(ArrayList<EnemyShip> bossEnemy, ArrayList<Ships> playerFleet, ArrayList<EnemyShip> normalEnemy, JTextArea battle) {
        this.bossEnemy = bossEnemy;
        this.playerFleet = playerFleet;
        this.normalEnemy = normalEnemy;
        this.battle = battle;
    }

    public void startBattle(){
        ArrayList<Ships> dead = new ArrayList<>();
        while(!playerFleet.isEmpty() && !bossEnemy.isEmpty()){
//            playerFleet.clear();
            for(Ships ps: playerFleet){
                for(EnemyShip e: bossEnemy){

                    ps.attack(e);
                    battle.append(ps.name+" attacked "+e.name+" dealing "+ ps.dmg+ " "+ e.name+"'s HP is now "+ e.hp+"\n");
                    e.attack(ps);
                    battle.append(e.name+" attacked "+ps.name+" dealing "+ e.dmg+ " "+ ps.name+"'s HP is now "+ ps.hp+"\n");


                    if(e.hp <=0){
                        battle.append(e.name+" ran out of hp she ded pien");
                        dead.add(e);
                    }
                    if(ps.hp <= 0){
                        battle.append(ps.name+" ran out of hp she ded pien");
                        dead.add(ps);
                    }
                }

            }
            playerFleet.removeAll(dead);
            bossEnemy.removeAll(dead);
            dead.clear();
            if(playerFleet.isEmpty()){
                battle.setText("Your fleet has been finished.You lose");
                break;
            }
            if(bossEnemy.isEmpty()){
                battle.setText("The enemy fleet has been destroyed, You win");
                break;
            }


        }
//            battle.setText("this worked");
    }
}
