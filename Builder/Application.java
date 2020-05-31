package Builder;

public class Application {
    private Builder builder;
    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void constructMansion(){
        this.builder.reset();
        this.builder.buildDoors("Big doors");
        this.builder.buildWalls("A lot of walls");
        this.builder.buildWindows("Some big windows");
        this.builder.buildRoof("I don't know what is roof");
        this.builder.buildGarage("Garage is alcohol");
    }
    public void constructSimpleHouse(){
        this.builder.reset();
        this.builder.buildDoors("One door");
        this.builder.buildWalls("4 walls");
        this.builder.buildWindows("2 windows");
        this.builder.buildRoof("I don't know what is roof");
        this.builder.buildGarage("You don't have garage loser");
    }

    public House getHouse(){
        House result =  this.builder.getProduct();
        this.builder.reset();
        return result;
    }

}
