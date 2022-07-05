
class User {
	private static volatile User MeetingLink; // = new User();
	
	private User(){
	   if (MeetingLink != null){
		   throw new RuntimeException("Please use getMeetingLink method");
	   }  
	}
	
	public static User getmeetoingLink(){
		
		if(MeetingLink == null) {
			synchronized(User.class) {
				if(Meetinglink == null) {
					MeetingLink = new User();
				}
			}
		}
		
		
		return MeetingLink;
	}
	
}


public class ZoomLazyInstantiation {
	public static void main(String [] args) {
		
		User Link1 = User.getmeetoingLink();
		User Link2 = User.getmeetoingLink();
		
		System.out.println(Link1);
		System.out.println(Link2);
	}
	
}
		