import java.util.ArrayList;

public class CanAttend {

	//precondition: meetings is not null and each MeetingInterval has a valid start and end time.
	//postcondition: the method checks all meeting times if there is an overlap
	//then it will return false but if not returns true
	public static boolean canAttend(ArrayList<MeetingInterval> meetings) {
		for(int i=0;i<meetings.size();i++){
			for(int j= i+1;j<meetings.size();j++){
				if(meetings.get(i).getStart()<meetings.get(j).getEnd() && meetings.get(j).getStart()<meetings.get(i).getEnd()){
					return false;
				}
			}
		}
	
		System.out.println(meetings);
		return true; //replace me with actual logic please!
	}
	public static void main(String[] args) {
		ArrayList<MeetingInterval> meet = new ArrayList<MeetingInterval>();
		for(int i =0; i<10; i++) {
			int start = (int)(Math.random()*2399);
			int end = start + ((int)(Math.random()*(2399-start)));
			meet.add(new MeetingInterval(start, end));
		}
		System.out.println(canAttend(meet) ? "There is no conflict with attending "+meet+" meetings":"Can't attend "+meet+" meetings due to conflict");
	
	}
}
