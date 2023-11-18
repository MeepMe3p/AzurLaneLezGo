package AzurLane;



import javax.swing.*;
import java.util.ArrayList;


public class FleetSetter {
    Player p;
    JComboBox<MainShip> main1;
    JComboBox<MainShip> main2;
    JComboBox<MainShip> main3;

    JComboBox<VanguardShip> van1;
    JComboBox<VanguardShip> van2;
    JComboBox<VanguardShip> van3;

    ArrayList<Ships> fleet;


    public FleetSetter(Player p, JComboBox<MainShip> main1, JComboBox<MainShip> main2, JComboBox<MainShip> main3) {
        this.p = p;
        this.main1 = main1;
        this.main2 = main2;
        this.main3 = main3;

    }

    public FleetSetter(JComboBox<VanguardShip> van1, Player p, JComboBox<VanguardShip> van2, JComboBox<VanguardShip> van3) {
        this.p = p;
        this.van1 = van1;
        this.van2 = van2;
        this.van3 = van3;
    }

    public FleetSetter(Player p, JComboBox<MainShip> main1, JComboBox<MainShip> main2, JComboBox<MainShip> main3, JComboBox<VanguardShip> van1, JComboBox<VanguardShip> van2, JComboBox<VanguardShip> van3) {
        this.p = p;
        this.main1 = main1;
        this.main2 = main2;
        this.main3 = main3;
        this.van1 = van1;
        this.van2 = van2;
        this.van3 = van3;
    }

    public void setMainFleet1(){

        if(main2.getSelectedIndex() == main1.getSelectedIndex()){
//            System.out.println("this append cuz equal ang 1 ug 2\n");
//            System.out.println("Main1 index: "+ main1.getSelectedIndex());
//            System.out.println("Main2 index: "+ main2.getSelectedIndex());

            main1.setSelectedIndex(main2.getSelectedIndex());
            main2.setSelectedIndex(main1.getSelectedIndex());
        }
        if(main3.getSelectedIndex() == main1.getSelectedIndex()){
//            System.out.println("this append cuz equal ang 1 ug 3\n");
//            System.out.println("Main1 index: "+ main1.getSelectedIndex());
//            System.out.println("Main3 index: "+ main3.getSelectedIndex());
            main1.setSelectedIndex(main3.getSelectedIndex());
            main3.setSelectedIndex(main1.getSelectedIndex());
        }


    }
    public void setMainFleet2() {


        if (main2.getSelectedIndex() == main1.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 1 ug 2\n");
//            System.out.println("Main1 index: "+ main1.getSelectedIndex());
//            System.out.println("Main2 index: "+ main2.getSelectedIndex());
            main2.setSelectedIndex(main1.getSelectedIndex());
            main1.setSelectedIndex(main2.getSelectedIndex());
        }
        if (main2.getSelectedIndex() == main3.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 2 ug 3\n");
//            System.out.println("Main2 index: "+ main2.getSelectedIndex());
//            System.out.println("Main3 index: "+ main3.getSelectedIndex());
            main2.setSelectedIndex(main3.getSelectedIndex());
            main3.setSelectedIndex(main2.getSelectedIndex());
        }
    }
    public void setMainFleet3() {
        if (main3.getSelectedIndex() == main1.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 1 ug 3\n");
//            System.out.println("Main1 index: "+ main1.getSelectedIndex());
//            System.out.println("Main3 index: "+ main3.getSelectedIndex());
            main3.setSelectedIndex(main1.getSelectedIndex());
            main1.setSelectedIndex(main3.getSelectedIndex());
        }
        if (main3.getSelectedIndex() == main2.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 3 ug 2\n");
//            System.out.println("Main2 index: "+ main2.getSelectedIndex());
//            System.out.println("Main3 index: "+ main3.getSelectedIndex());
            main3.setSelectedIndex(main2.getSelectedIndex());
            main2.setSelectedIndex(main3.getSelectedIndex());
        }

    }
//  THIS WILL SET LE VANGUARD FLEET
    public void setVanFleet1(){

        if(van2.getSelectedIndex() == van1.getSelectedIndex()){
//            System.out.println("this append cuz equal ang 1 ug 2\n");
//            System.out.println("van1 index: "+ van1.getSelectedIndex());
//            System.out.println("van2 index: "+ van2.getSelectedIndex());

            van1.setSelectedIndex(van2.getSelectedIndex());
            van2.setSelectedIndex(van1.getSelectedIndex());
        }
        if(van3.getSelectedIndex() == van1.getSelectedIndex()){
//            System.out.println("this append cuz equal ang 1 ug 3\n");
//            System.out.println("van1 index: "+ van1.getSelectedIndex());
//            System.out.println("van3 index: "+ van3.getSelectedIndex());
            van1.setSelectedIndex(van3.getSelectedIndex());
            van3.setSelectedIndex(van1.getSelectedIndex());
        }


    }
    public void setVanFleet2() {


        if (van2.getSelectedIndex() == van1.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 1 ug 2\n");
//            System.out.println("Van1 index: "+ van1.getSelectedIndex());
//            System.out.println("van2 index: "+ van2.getSelectedIndex());
            van2.setSelectedIndex(van1.getSelectedIndex());
            van1.setSelectedIndex(van2.getSelectedIndex());
        }
        if (van2.getSelectedIndex() == van3.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 2 ug 3\n");
//            System.out.println("van2 index: "+ van2.getSelectedIndex());
//            System.out.println("van3 index: "+ van3.getSelectedIndex());
            van2.setSelectedIndex(van3.getSelectedIndex());
            van3.setSelectedIndex(van2.getSelectedIndex());
        }
    }
    public void setVanFleet3() {
        if (van3.getSelectedIndex() == van1.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 1 ug 3\n");
//            System.out.println("Van1 index: "+ van1.getSelectedIndex());
//            System.out.println("Van3 index: "+ van3.getSelectedIndex());
            van3.setSelectedIndex(van1.getSelectedIndex());
            van1.setSelectedIndex(van3.getSelectedIndex());
        }
        if (van3.getSelectedIndex() == van2.getSelectedIndex()) {
//            System.out.println("this append cuz equal ang 3 ug 2\n");
//            System.out.println("Van2 index: "+ van2.getSelectedIndex());
//            System.out.println("Van3 index: "+ van3.getSelectedIndex());
            van3.setSelectedIndex(van2.getSelectedIndex());
            van2.setSelectedIndex(van3.getSelectedIndex());
        }

    }
    public ArrayList<Ships> setAttackFleet(){
        fleet = new ArrayList<>();
        fleet.add((Ships) van1.getSelectedItem());
        fleet.add((Ships) van2.getSelectedItem());
        fleet.add((Ships) van3.getSelectedItem());
        fleet.add((Ships) main1.getSelectedItem());
        fleet.add((Ships) main2.getSelectedItem());
        fleet.add((Ships) main3.getSelectedItem());

        if(van1.getSelectedIndex() == -1 || van2.getSelectedIndex() == -1 || van3.getSelectedIndex()==-1){
            throw new NullPointerException("You need to have a Full Fleet in the Vanguard Fleet");
        }if(main1.getSelectedIndex() == -1 || main2.getSelectedIndex() == -1 || main3.getSelectedIndex()==-1){
            throw new NullPointerException("You need to have a Full Fleet in the Main Fleet");
        }
        return fleet;
    }

}
