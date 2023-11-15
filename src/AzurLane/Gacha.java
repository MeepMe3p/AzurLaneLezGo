package AzurLane;

import java.util.ArrayList;
import java.util.Random;

public class Gacha {
    private ArrayList<MainShips> mainPool;
    private ArrayList<VanguardShips> vangPool;


    public Gacha() {
        this.mainPool = new ArrayList<>();
        this.vangPool = new ArrayList<>();

        mainPool.add(new MainShips.Nagato());
        mainPool.add(new MainShips.Unicorn());
        mainPool.add(new MainShips.Shinano());
        mainPool.add(new MainShips.NewJersey());

        vangPool.add(new VanguardShips.Laffey());
        vangPool.add(new VanguardShips.Noshiro());
        vangPool.add(new VanguardShips.Javelin());
        vangPool.add(new VanguardShips.Agir());



    }

    public VanguardShips buildVanguardShip(Player p){
        int n = p.getCubeCount();
        if(n < 2){
            throw new IllegalArgumentException("You have not enough cubes");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(vangPool.size());
        VanguardShips randomShip = vangPool.get(randomIndex);
        p.vanguardShips.add(randomShip);
        p.setCubeCount(p.getCubeCount() -2);
        return randomShip;

    }

    public MainShips buildMainShip(Player p){
        int n = p.getCubeCount();
        if(n < 2){
            throw new IllegalArgumentException("You have not enough cubes");
        }
        Random random = new Random();
        int randomIndex = random.nextInt(mainPool.size());
        MainShips randomMain = mainPool.get(randomIndex);
        p.mainShips.add(randomMain);
        p.setCubeCount(p.getCubeCount() -2);
        return randomMain;

    }
}
