
public class CivilEngineer {
	
	private houseBuilder housebuilder;
	 
    public CivilEngineer(houseBuilder housebuilder)
    {
        this.housebuilder = housebuilder;
    }
 
    public House getHouse()
    {
        return this.housebuilder.getHouse();
    }
 
    public void constructHouse()
    {
        this.housebuilder.buildBasement();
        this.housebuilder.buildStructure();
        this.housebuilder.buildRoof();
        this.housebuilder.buildInterior();
    }
    
}
