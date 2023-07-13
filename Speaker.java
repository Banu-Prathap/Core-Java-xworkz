class Speaker{
	static String name="JBL";
	static int minVolume;
	static int currentVolume;
	static int maxValue=5;
	static boolean isConnected = false;
	
	public static boolean onOrOff(){
		System.out.println("Invoking Method onOrOff");
		if(isConnected == false){
			isConnected = true;
			System.out.println("Speaker is turned on");
		}else if(isConnected == true){
			isConnected = false;
			System.out.println("Speaker is turned off");
		}
		return isConnected;
	}
	public static void increaseVolume(){
		System.out.println("Invkoing Method of increaseVolume starts");
		if(isConnected == true){
			if(currentVolume < maxValue){
				currentVolume = currentVolume + 1;
				System.out.println("Current volume "+ currentVolume);
			}else{
				System.out.println("Maximum Volume Reached");
			}
			}
			else{
				System.out.println("Turn on the device");
		}
	}
	public static void decreaseVolume(){
		System.out.println("Invoking Method of decreaseVolume started");
		if(isConnected == true){
			if(currentVolume > minVolume){
				currentVolume = currentVolume -1;
				System.out.println("Current Volume" + currentVolume);
			}else{
				System.out.println("Minimum Volume reached");
			}
		}else{
			System.out.println("Turn on the device");
		}
	}
}