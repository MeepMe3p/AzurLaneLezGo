package AzurLane;

import java.util.ArrayList;

public class Player {
    private String name;
    private int level;
    private int cubeCount;
    private int exp_points;

    public ArrayList<MainShip> mainShips;
    public ArrayList<VanguardShip> vanguardShips;

    public Player(String name, int level, int cubeCount, ArrayList<MainShip> main, ArrayList<VanguardShip> van) {
        this.name = name;
        this.level = level;
        this.cubeCount = cubeCount;
//        this.mainShips = main;
//        this.vanguardShips = van;

        this.mainShips = (main != null) ? main : new ArrayList<>();
        this.vanguardShips = (van != null) ? van : new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCubeCount() {
        return cubeCount;
    }

    public void setCubeCount(int cubeCount) {
        this.cubeCount = cubeCount;
    }


}
