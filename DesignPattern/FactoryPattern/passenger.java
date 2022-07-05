class  {
	public static void main(String a[]){
		
		boolean TravelToPolonaruwa = true;
		boolean TravelToColombo = false;
		boolean VisitToPlatform = false;

		if(TravelToPolonaruwa == true){
			ticketFactory TF = new ticketFactory();
			ticketCounterInterface ticket = TF.getTicket("Polonaruwa");
			ticket.order();
			
		}

		if(TravelToColombo == true){
			ticketFactory TF = new ticketFactory();
			ticketCounterInterface ticket = TF.getTicket("Colombo");
			ticket.order();
			
		}		

		if(VisitToPlatform == true){
			ticketFactory TF = new ticketFactory();
			ticketCounterInterface ticket = TF.getTicket("Platform");
			ticket.order();
			
		}
		
		
	}
}