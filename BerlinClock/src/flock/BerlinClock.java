package flock;

public class BerlinClock {

	public static String[] representInBerlinClock(String time){
		String[] clock = time.split(":");
		int hours = Integer.parseInt(clock[0]);
		int minutes = Integer.parseInt(clock[1]);
		int seconds = Integer.parseInt(clock[2]);
		StringBuilder sb = new StringBuilder();
		System.out.println(hours+" "+minutes);
		// calculate hours on the clock
		return clock;
		
	}
	private static String calculateHours(int hours){
		while(hours!=0){
			
		}
		return null;
	}
	public static void main(String[] args) {
		String[] res = BerlinClock.representInBerlinClock("13:07:01");
		for(String s : res){
			System.out.println(s);
		}
	}
}
