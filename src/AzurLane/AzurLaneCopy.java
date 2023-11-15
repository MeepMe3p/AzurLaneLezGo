package AzurLane;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AzurLaneCopy extends JFrame{
    private JPanel mainPanel;
    private JPanel actButtons;
    private JButton homeButton;
    private JButton buildButton;
    private JButton fleetButton;
    private JButton mapButton;
    private JButton shipsButton;
    private JPanel parentPanel;
    private JPanel buildPanel;
    private JPanel shipsPanel;
    private JPanel fleetPanel;
    private JPanel mapPanel;
    private JPanel homePanel;
    private JTextField tfPlayer;
    private JTextField tfCubes;
    private JTextField tfLevel;
    private JTextArea HALOOOWELCOMETOAZURTextArea;
    private JButton bMainGacha;
    private JButton PULLFORVANGUARDButton;
    private JTextArea tfShipsPulled;
    private JTextField tfGachaCubes;
    private JTextArea shipTAmain;
    private JTextArea shipTAvang;
    private JButton bShowShips;
    private JComboBox cbFleetVan3;
    private JComboBox cbFleetVan2;
    private JComboBox cbFleetMain2;
    private JComboBox cbFleetMain3;
    private JComboBox cbFleetMain1;
    private JButton bFleetSave;
    private JComboBox cbFleetVan1;
    private JTextArea taBattleSimulation;
    private JRadioButton rbMap3;
    private JRadioButton rbMap1;
    private JRadioButton rbMap2;
    private JRadioButton rbMap4;
    private JButton bAttackMap;


    private ArrayList<Ships> attackFleet;
    private ArrayList<EnemyShip> bossEnemy;
    private ArrayList<EnemyShip> normalEnemy;
    private Battle battle;
    public AzurLaneCopy(){
        ArrayList<MainShips> mainShips = null;
        ArrayList<VanguardShips> vangShips = null;

        Player el = new Player("Elijah",1,30, mainShips,vangShips);

//        setTitle("Azur Lane");
//        setSize(500,500);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        homeButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(homePanel);
                parentPanel.repaint();
                parentPanel.revalidate();

                tfPlayer.setText("Name: "+ el.getName());
                tfCubes.setText("Cubes: "+ el.getCubeCount());
                tfLevel.setText("Level: "+ el.getLevel());

            }
        });
        tfPlayer.setText("Name: "+ el.getName());
        tfCubes.setText("Cubes: "+ el.getCubeCount());
        tfLevel.setText("Level: "+ el.getLevel());
        buildButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(buildPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        shipsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(shipsPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });
        fleetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(fleetPanel);
                parentPanel.repaint();
                parentPanel.revalidate();

                cbFleetMain1.removeAllItems();
                cbFleetMain2.removeAllItems();
                cbFleetMain3.removeAllItems();
                cbFleetVan1.removeAllItems();
                cbFleetVan2.removeAllItems();
                cbFleetVan3.removeAllItems();

                if(el.mainShips.isEmpty()){
                    System.out.println("eep");
                    return;
                }else {
                    for (MainShips m : el.mainShips) {
                        cbFleetMain1.addItem(m);
                        cbFleetMain2.addItem(m);
                        cbFleetMain3.addItem(m);
                    }
                }
                if(el.mainShips.isEmpty()){
                    System.out.println("eep");
                    return;
                }else {
                    for (VanguardShips v : el.vanguardShips) {
                        cbFleetVan1.addItem(v);
                        cbFleetVan2.addItem(v);
                        cbFleetVan3.addItem(v);
                    }
                }

                cbFleetMain1.setSelectedIndex(-1);
                cbFleetMain2.setSelectedIndex(-1);
                cbFleetMain3.setSelectedIndex(-1);
                cbFleetVan1.setSelectedIndex(-1);
                cbFleetVan2.setSelectedIndex(-1);
                cbFleetVan3.setSelectedIndex(-1);

            }
        });
        mapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parentPanel.removeAll();
                parentPanel.add(mapPanel);
                parentPanel.repaint();
                parentPanel.revalidate();
            }
        });

        tfGachaCubes.setText("Cubes: "+ el.getCubeCount());
        bMainGacha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Gacha g = new Gacha();
                    MainShips m = g.buildMainShip(el);
                    tfShipsPulled.append("You have pulled "+ m.name+"\n");
                    tfGachaCubes.setText("Cubes: "+ el.getCubeCount());
                }catch(IllegalArgumentException a){
                    JOptionPane.showMessageDialog(AzurLaneCopy.this,"You have no cubes :(");
                }
            }
        });
        PULLFORVANGUARDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    Gacha g = new Gacha();
                    VanguardShips v = g.buildVanguardShip(el);
                    tfShipsPulled.append("You have pulled "+ v.name+"\n");
                    tfGachaCubes.setText("Cubes: "+ el.getCubeCount());
                }catch(IllegalArgumentException a){
                    JOptionPane.showMessageDialog(AzurLaneCopy.this,"You have no cubes :(");
                }
            }
        });

        bShowShips.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                shipTAmain.setText("Nirun");

                if(el.mainShips.isEmpty()){
                    shipTAmain.setText("You have no main ships pien go get a life");
                }else{
                    shipTAmain.setText("These are your main ships \n");
                    for(MainShips m: el.mainShips){
                        shipTAmain.append(m.name+"\n");
                    }
                }
//                shipTAmain.append("Nirun gyapon");
                if(el.vanguardShips.isEmpty()){
                    shipTAvang.setText("You have no vanguard ships pien go get a life");
                }else{
                    shipTAvang.setText("These are your main ships \n");
                    for(VanguardShips vg: el.vanguardShips){
                        shipTAvang.append(vg.name+"\n");
                    }
                }

            }
        });

        cbFleetMain1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FleetSetter fs = new FleetSetter(el,cbFleetMain1,cbFleetMain2,cbFleetMain3);
                fs.setMainFleet1();
                System.out.println("Action performed on cbFleetMain1");
                System.out.println("Selected index 1: " + cbFleetMain1.getSelectedIndex());
                System.out.println("Selected index 2: " + cbFleetMain2.getSelectedIndex());
                System.out.println("Selected index 3: " + cbFleetMain3.getSelectedIndex());


            }
        });
        cbFleetMain2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FleetSetter fs = new FleetSetter(el,cbFleetMain1,cbFleetMain2,cbFleetMain3);
//                fs.setMainFleet1();
                fs.setMainFleet2();
//                fs.setMainFleet3();
                System.out.println("Action performed on cbFleetMain2");
                System.out.println("Selected index 1: " + cbFleetMain1.getSelectedIndex());
                System.out.println("Selected index 2: " + cbFleetMain2.getSelectedIndex());
                System.out.println("Selected index 3: " + cbFleetMain3.getSelectedIndex());

            }
        });
        cbFleetMain3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                FleetSetter fs = new FleetSetter(el,cbFleetMain1,cbFleetMain2,cbFleetMain3);
//                fs.setMainFleet1();
//                fs.setMainFleet2();
                fs.setMainFleet3();
                System.out.println("Action performed on cbFleetMain3");
                System.out.println("Selected index 1: " + cbFleetMain1.getSelectedIndex());
                System.out.println("Selected index 2: " + cbFleetMain2.getSelectedIndex());
                System.out.println("Selected index 3: " + cbFleetMain3.getSelectedIndex());

            }
        });
        cbFleetVan1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FleetSetter fs = new FleetSetter(cbFleetVan1,el,cbFleetVan2,cbFleetVan3);
                fs.setVanFleet1();
                System.out.println("Action performed on cbFleetVan3");
                System.out.println("Selected index 1: " + cbFleetVan1.getSelectedIndex());
                System.out.println("Selected index 2: " + cbFleetVan2.getSelectedIndex());
                System.out.println("Selected index 3: " + cbFleetVan3.getSelectedIndex());
            }
        });
        cbFleetVan2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FleetSetter fs = new FleetSetter(cbFleetVan1,el,cbFleetVan2,cbFleetVan3);
                fs.setVanFleet2();
                System.out.println("Action performed on cbFleetVan3");
                System.out.println("Selected index 1: " + cbFleetVan1.getSelectedIndex());
                System.out.println("Selected index 2: " + cbFleetVan2.getSelectedIndex());
                System.out.println("Selected index 3: " + cbFleetVan3.getSelectedIndex());
            }
        });
        cbFleetVan3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FleetSetter fs = new FleetSetter(cbFleetVan1,el,cbFleetVan2,cbFleetVan3);
                fs.setVanFleet3();
                System.out.println("Action performed on cbFleetVan3");
                System.out.println("Selected index 1: " + cbFleetVan1.getSelectedIndex());
                System.out.println("Selected index 2: " + cbFleetVan2.getSelectedIndex());
                System.out.println("Selected index 3: " + cbFleetVan3.getSelectedIndex());
            }
        });
        bFleetSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FleetSetter fs = new FleetSetter(el,cbFleetMain1,cbFleetMain2,cbFleetMain3,cbFleetVan1,cbFleetVan2,cbFleetVan3);

                try{
                    attackFleet = new ArrayList<>();
                    attackFleet = fs.setAttackFleet();
                }catch(NullPointerException a){
                    JOptionPane.showMessageDialog(AzurLaneCopy.this,a.getMessage());
                }
            }

        });

        rbMap1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                bossEnemy = new ArrayList<>();
                normalEnemy = new ArrayList<>();

                battle = new Battle();

                bossEnemy.add(battle.setBossEnemies());
                bossEnemy.add(new EnemyShip.BossDestroyer());
                for(int i=0;i<3;i++){
                    normalEnemy.add(battle.setNormalEnemies());
                }


            }
        });
        bAttackMap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(EnemyShip a: bossEnemy){
                    System.out.println(a.name);
                }
                for(EnemyShip b: normalEnemy){
                    System.out.println(b.name);
                }
                if(attackFleet.isEmpty()){
                    System.out.println("TSS EMpteee");
                }else{
                    for(Ships s: attackFleet){
                        System.out.println(s.name +" "+ s.hp);
                    }
                }

                System.out.println();
                for(Ships s: bossEnemy){
                     /*if kinsay mas duol sa enemy ship iya atakon think elijah thinkkkk saon na nimo pag implement hahah
                     try ayaw apg chat gpt*/
//                    for(Ships playerS: attackFleet){
//                        if(playerS.location <= s.location){
//                            s.attack(playerS);
//                        }
//                    }
//                    sayop pana my selffffff kalimtanon baya ka iimplement lang nas balay
                }


                RealBattle rb = new RealBattle(bossEnemy,attackFleet,normalEnemy,taBattleSimulation);
                rb.startBattle();
            }

        });
        rbMap2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bossEnemy = new ArrayList<>();
                normalEnemy = new ArrayList<>();
                battle = new Battle();

                bossEnemy.add(new EnemyShip.BossCruiser());
                bossEnemy.add(battle.setBossEnemies());

                for(int i=0;i<5;i++){
                    normalEnemy.add(battle.setNormalEnemies());
                }
                System.out.println();
            }
        });
        rbMap3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                battle = new Battle();
                bossEnemy = new ArrayList<>();
                normalEnemy = new ArrayList<>();

                bossEnemy.add(new EnemyShip.BossBattleship());
                bossEnemy.add(battle.setBossEnemies());

                for(int i=0;i<7;i++){
                    normalEnemy.add(battle.setNormalEnemies());
                }
            }
        });
        rbMap4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                battle = new Battle();
                bossEnemy = new ArrayList<>();
                normalEnemy = new ArrayList<>();

                bossEnemy.add(new EnemyShip.BossCarrier());
                for(int i=0;i<2;i++){
                    bossEnemy.add(battle.setBossEnemies());
                }
                for(int i=0;i<10;i++){
                    normalEnemy.add(battle.setNormalEnemies());
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Low Budget Azur Lane");
        frame.setContentPane(new AzurLaneCopy().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(900,500);
        frame.setVisible(true);


    }
}
