
public class TipiHouseBuilder implements houseBuilder {
	
	private House house;
	 
    public TipiHouseBuilder(){
        this.house = new House();
    }

	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Wooden Poles");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("Wood and Ice");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRoof("Fire Wood");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Wood, caribou and seal skins");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return this.house;
	}
	
	
}
