package flock;

public class BerlinClock {

	static char secondsLamp = 'O';
	static char[] topHourLamp = {'O','O','O','O'};
	static char[] bottomHourLamp = {'O','O','O','O'};
	static char[] topMinuteLamp = {'O','O','O','O','O','O','O','O','O','O','O'};
	static char[] bottomMinuteLamp = {'O','O','O','O'};
	public static String representInBerlinClock(String time){
		if (!time.matches("\\d\\d:\\d\\d:\\d\\d")) {
            throw new IllegalArgumentException("Time must be in the format HH:MM:SS");
        }
		String[] clock = time.split(":");
		int hour = Integer.parseInt(clock[0]);
		int minute = Integer.parseInt(clock[1]);
		int second = Integer.parseInt(clock[2]);
		StringBuilder sb = new StringBuilder();
		sb.append(calculateSecondsLamp(second)).append("\n");
		sb.append(calculateTopLampHours(hour, topHourLamp)).append("\n");
		sb.append(calculateBottomLampHours(hour, bottomHourLamp)).append("\n");
		sb.append(calculateTopLampMinutes(minute, topMinuteLamp)).append("\n");
		sb.append(calculateBottomLampHours(minute, bottomMinuteLamp)).append("\n");
		// calculate hours on the clock
		return sb.toString();
		
	}
	private static String calculateTopLampHours(int hours,char[] thl){
		if(hours<=23){
			int topLampCount = hours/5;
			int bottomLampCount = hours%5;
			for(int i=0;i<topLampCount;i++){
				thl[i] = 'R';
			}
		}else{
			return String.valueOf(thl);
		}
		System.out.println(thl.toString());
		return String.valueOf(thl);
	}
	private static String calculateBottomLampHours(int hours,char[] bhl){
		if(hours<=23){
			int bottomLampCount = hours%5;
			for(int i=0;i<bottomLampCount;i++){
				bhl[i] = 'R';
			}
		}else{
			return String.valueOf(bhl);
		}
		System.out.println(bhl.toString());
		return String.valueOf(bhl);
	}
	private static String calculateTopLampMinutes(int mins,char[] tml){
		if(mins<=59){
			int topLampCount = mins/5;
			for (int i = 0; i < topLampCount; i++) {
	            if ((i + 1) % 3 ==0) {
	            	tml[i] = 'R';
	            } else {
	                tml[i] = 'Y';
	            }
	        }
		}else{
			return String.valueOf(tml);
		}
		return String.valueOf(tml);
	}
	private static String calculateBottomLampMinutes(int mins,char[] bml){
		if(mins<=59){
			int bottomLampCount = mins%5;
			for (int i = 0; i < bottomLampCount; i++) {
				{
	            	bml[i] = 'R';
	            }
	        }
		}else{
			return String.valueOf(bml);
		}
		return String.valueOf(bml);
	}
	private static String calculateSecondsLamp(int sec){
		if(sec<=59){
			if (sec%2==0) {
	             return "Y";
	        }
		}
		return "O";
	}
	public static void main(String[] args) {
		BerlinClock bc = new BerlinClock();
		
	}
}
