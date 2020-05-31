package Builder;

public interface Builder {
    public void buildWalls(String w);
    public void buildDoors(String d);
    public void buildWindows(String w);
    public void buildRoof(String r);
    public void buildGarage(String g);
    public House getProduct();
    public void reset();
}
