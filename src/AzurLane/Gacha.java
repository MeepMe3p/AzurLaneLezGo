package AzurLane;

import java.util.ArrayList;
import java.util.Random;

public class Gacha {
    private ArrayList<MainShip> mainPool;
    private ArrayList<VanguardShip> vangPool;


    public Gacha() {
        this.mainPool = new ArrayList<>();
        this.vangPool = new ArrayList<>();

        mainPool.add(new MainShip.Nagato());
        mainPool.add(new MainShip.Unicorn());
        mainPool.add(new MainShip.Shinano());
        mainPool.add(new MainShip.NewJersey());

        vangPool.add(new VanguardShip.Laffey());
        vangPool.add(new VanguardShip.Noshiro());
        vangPool.add(new VanguardShip.Javelin());
        vangPool.add(new VanguardShip.Agir());



    }

    public VanguardShip buildVanguardShip(Player p){
        int n = p.getCubeCount();
        if(n < 2){
            throw new IllegalArgumentException("You have not enough cubes");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(vangPool.size());
        VanguardShip randomShip = vangPool.get(randomIndex);
        p.vanguardShips.add(randomShip);
        p.setCubeCount(p.getCubeCount() -2);
        return randomShip;

    }

    public MainShip buildMainShip(Player p){
        int n = p.getCubeCount();
        if(n < 2){
            throw new IllegalArgumentException("You have not enough cubes");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(mainPool.size());
        MainShip randomMain = mainPool.get(randomIndex);
        p.mainShips.add(randomMain);
        p.setCubeCount(p.getCubeCount() -2);
        return randomMain;

    }
}
