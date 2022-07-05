public class ticketFactory {
	
	public ticketCounterInterface getTicket(String str) {
		if(str.equals("Polonaruwa"))
			return new Polonaruwa();
		else if(str.equals("Colombo"))
			return new Colombo();
		else
			return new Platform();

	}

}
