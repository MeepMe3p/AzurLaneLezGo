package AzurLane;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Timer;

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
        Timer timer = new Timer();
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

        try {
            int i = 1;
            while(!playerFleet.isEmpty() || !bossEnemy.isEmpty()){

                for(Ships e: everyone){
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
                        }
                        if(playerFleet.get(0).hp >0){
                            e.attack(playerFleet);
                            battle.append(e.name+" attacked "+ playerFleet.get(0).name+" dealing "+ e.dmg+ " "+playerFleet.get(0).name +"'s HP: "+playerFleet.get(0).hp+"\n");
                        }

                    }else{
                        if(playerFleet.get(0).hp >0){
                            e.attack(playerFleet);
                            battle.append(e.name+" attacked "+ playerFleet.get(0).name+" dealing "+ e.dmg+ " "+playerFleet.get(0).name +"'s HP: "+playerFleet.get(0).hp+"\n");
                        }
                    }
                }
                ArrayList<Ships> dead = new ArrayList<>();
                for(Ships s: everyone){
                    if(s.hp <= 0){
                        dead.add(s);
                        if(s instanceof Boss){
                            battle.append(s.name + " is now dedz yay congo rats!\n");
                            bossEnemy.removeAll(dead);
                        }
                        if(s instanceof VanguardShip || s instanceof MainShip){
                            battle.append(s.name + " is now ded there there!\n");

                            playerFleet.removeAll(dead);
                        }
                        else{
                            battle.append(s.name + " is now dedz yay congo rats!\n");

                            normalEnemy.removeAll(dead);
                        }
                    }

                }
                if(bossEnemy.isEmpty()){
                    battle.append("You win yay\n");
                    break;
                }
                if(playerFleet.isEmpty()){
                    battle.append("You lose pien\n");
                    break;
                }

            }
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        battle.append("this worked mahuman sha yay");
        JOptionPane.showMessageDialog(null,"You won 3 cubes yay\nDo you like to attack again?");
        /*ASSIGNMENT ELIJAH MAKE SURE NGA MAKAKITA KAG WAY NGA ONCE MAHUMAN NA ANG BATTLE KAY MASABE IYA HISTORY AND DAPAT NAAY REWARD AND PWEDE SHA MAKAATTACK BALIK*/
    }
}
