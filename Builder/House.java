package Builder;

public class House {
    protected String walls;
    protected String doors;
    protected String windows;
    protected String roof;
    protected String garage;

    public String getWalls() {
        return walls;
    }

    public void setWalls(String walls) {
        this.walls = walls;
    }

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getRoof() {
        return roof;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", doors='" + doors + '\'' +
                ", windows='" + windows + '\'' +
                ", roof='" + roof + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}
