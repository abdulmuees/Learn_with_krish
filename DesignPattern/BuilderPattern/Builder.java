
public class Builder {
	
	public static void main(String[] args)
    {
        houseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);
 
        engineer.constructHouse();
 
        House house = engineer.getHouse();
 
        System.out.println("Builder constructed: "+ house);
    }
}
