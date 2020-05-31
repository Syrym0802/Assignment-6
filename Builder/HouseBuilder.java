package Builder;

public class HouseBuilder implements Builder {

    private House house;

    public HouseBuilder() {
        this.reset();
    }
    @Override
    public void reset(){
        this.house = new House();
    }

    @Override
    public void buildWalls(String walls) {
        this.house.setWalls(walls);
    }

    @Override
    public void buildDoors(String doors) {
        this.house.setDoors(doors);
    }

    @Override
    public void buildWindows(String windows) {
        this.house.setWindows(windows);
    }

    @Override
    public void buildRoof(String roof) {
        this.house.setRoof(roof);
    }

    @Override
    public void buildGarage(String garage) {
        this.house.setGarage(garage);
    }
    @Override
    public House getProduct(){
        House product = this.house;
        this.reset();
        return product;
    }
}
