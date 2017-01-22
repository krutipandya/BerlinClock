package flock;

public class BerlinClock {

	char secondsLamp = 'O';
	char[] topHourLamp = {'O','O','O','O'};
	char[] bottomHourLamp = {'O','O','O','O'};
	char[] topMinuteLamp = {'O','O','O','O','O','O','O','O','O','O','O'};
	char[] bottomMinuteLamp = {'O','O','O','O'};
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
	private static String calculateLampHours(int hours,char[] thl){
		if(hours<=23){
			int topLampCount = hours/5;
			int bottomLampCount = hours%5;
			for(int i=0;i<topLampCount;i++){
				thl[i] = 'R';
			}
		}else{
			return thl.toString();
		}
		System.out.println(thl.toString());
		return thl.toString();
	}
	private static String calculateBottomLampHours(int hours,char[] bhl){
		if(hours<=23){
			int bottomLampCount = hours%5;
			for(int i=0;i<bottomLampCount;i++){
				bhl[i] = 'R';
			}
		}else{
			return bhl.toString();
		}
		System.out.println(bhl.toString());
		return bhl.toString();
	}
	
	public static void main(String[] args) {
		
	}
}
