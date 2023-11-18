package AzurLane;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

public class RealBattle {
    private  ArrayList<EnemyShip> bossEnemy;
    private  ArrayList <Ships> playerFleet;
    private  ArrayList <EnemyShip> normalEnemy;

    private ArrayList<Ships> everyone;
    private ArrayList<Ships> enemies;
    private ArrayList<Ships> allies;



    private final JTextArea battle;

    public RealBattle(ArrayList<EnemyShip> bossEnemy, ArrayList<Ships> playerFleet, ArrayList<EnemyShip> normalEnemy, JTextArea battle) {
        this.bossEnemy = bossEnemy;
        this.playerFleet = playerFleet;
        this.normalEnemy = normalEnemy;
        this.battle = battle;
    }

    public void startBattle(){
        allies = new ArrayList<>();
        enemies = new ArrayList<>();
        everyone = new ArrayList<>();
        if(playerFleet == null){
            throw new IllegalArgumentException("You need to set your attack fleet");
        }
        ArrayList<VanguardShip> tempVan = new ArrayList<>();
        ArrayList<MainShip> tempMain = new ArrayList<>();
        for(Ships v: playerFleet){
            if(v instanceof VanguardShip){
                tempVan.add((VanguardShip) v);
            }
            if(v instanceof MainShip){
                tempMain.add((MainShip) v);
            }
        }
        allies.addAll(playerFleet);
        enemies.addAll(bossEnemy);
        enemies.addAll(normalEnemy);
        everyone.addAll(bossEnemy);
        everyone.addAll(allies);
        everyone.addAll(normalEnemy);
        int i = 1;
        while(!tempVan.isEmpty() || !enemies.isEmpty()){
            for(Ships e: everyone){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException a) {
                    throw new RuntimeException(a);
                }

                if(e instanceof VanguardShip){
                    if(enemies.get(0).hp >0){
                        e.attack(enemies);
                        battle.append(e.name+" attacked "+ enemies.get(0).name+" dealing "+ e.dmg+ " Enemy HP: "+enemies.get(0).hp+"\n");
                    }
                }
                if(e instanceof MainShip){
                    if(enemies.get(0).hp >0){
                        e.attack(enemies);
                        battle.append(e.name+" attacked "+ enemies.get(0).name+" dealing "+ e.dmg+ " Enemy HP: "+enemies.get(0).hp+"\n");
                    }

                }
                if(e instanceof EnemyShip){
                    if(e instanceof Boss){
                        ((Boss) e).skill();
                        if(allies.get(0).hp >0){
                            e.attack(allies);
                            battle.append(e.name+" attacked "+ playerFleet.get(0).name+" dealing "+ e.dmg+ " "+playerFleet.get(0).name +"'s HP: "+playerFleet.get(0).hp+"\n");
                        }
                    }
                    else{
                        if(allies.get(0).hp >0){
                            e.attack(allies);
                            battle.append(e.name+" attacked "+ playerFleet.get(0).name+" dealing "+ e.dmg+ " "+playerFleet.get(0).name +"'s HP: "+playerFleet.get(0).hp+"\n");
                        }

                }
                }
            }
            ArrayList<Ships> dead = new ArrayList<>();
            for(Ships s: everyone){
                if(s.hp <= 0){
                    dead.add(s);
                    if(s instanceof Boss){
                        battle.append(s.name + " is now dedz yay congo rats!\n");
                        enemies.removeAll(dead);
                    }
                    if(s instanceof VanguardShip || s instanceof MainShip){
                        battle.append(s.name + " is now ded there there!\n");
                        if(s instanceof VanguardShip){
                            tempVan.removeAll(dead);
                        }
                        if(s instanceof MainShip){
                            tempMain.removeAll(dead);
                        }

                    }
                    else{
                        battle.append(s.name + " is now dedz yay congo rats!\n");

                        enemies.removeAll(dead);
                    }
                }

            }
            if(enemies.isEmpty()){
                battle.append("You win yay\n");
                break;
            }
            if(allies.isEmpty()){
                battle.append("You lose pien\n");
                break;
            }

        }



        battle.append("this worked mahuman sha yay");
        JOptionPane.showMessageDialog(null,"You won 3 cubes yay\nDo you like to attack again?");
        /*ASSIGNMENT ELIJAH MAKE SURE NGA MAKAKITA KAG WAY NGA ONCE MAHUMAN NA ANG BATTLE KAY MASABE IYA HISTORY AND DAPAT NAAY REWARD AND PWEDE SHA MAKAATTACK BALIK*/
    }
}
