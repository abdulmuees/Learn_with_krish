
public class IglooHouseBuilder implements houseBuilder{

	 private House house;
	 
	 public IglooHouseBuilder(){
		 
		 this.house = new House();
	 }
	 
	
	@Override
	public void buildBasement() {
		// TODO Auto-generated method stub
		house.setBasement("Ice Bars");
	}

	@Override
	public void buildStructure() {
		// TODO Auto-generated method stub
		house.setStructure("Ice Blocks");
	}

	@Override
	public void buildRoof() {
		// TODO Auto-generated method stub
		house.setRoof("Ice Dome");
	}

	@Override
	public void buildInterior() {
		// TODO Auto-generated method stub
		house.setInterior("Ice Carvings");
	}

	@Override
	public House getHouse() {
		// TODO Auto-generated method stub
		return this.house;
	}

	
}
