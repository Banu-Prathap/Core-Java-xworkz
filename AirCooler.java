class AirCooler{
	
	static boolean isConnected;
	static double price=10000;
	static int minTemperature = 16;
	static int maxTemperature = 30;
	static int currentTemperature = minTemperature;
	
	
	// method to check if ac is turned on or off
	
	public static boolean onOrOff(){
		
		if(isConnected == false){
			isConnected = true ;
			System.out.println("AirCooler is turned on");
		}
		else if(isConnected == true){
			isConnected = false ; 
			System.out.println("AirCooler is turned off");
		}
		return isConnected;
	}
	
	//method to increase temperature 
	
	public static void increasingTemperatur(){
		if(isConnected == true){
			if(currentTemperature < maxTemperature){
				currentTemperature = currentTemperature + 1;
				System.out.println("Current Temperature is " + currentTemperature);
			}else{
				System.out.println("maxTemperature Reached");
			}
		}
			else{
				System.out.println("Turn on AirCooler");
			}
		
	}
	
	//method to decrease temperature
	
	public static void decreasingTemperature(){
		if(isConnected == true){
			if(currentTemperature > minTemperature){
				currentTemperature = currentTemperature - 1;
				System.out.println("Current Temperature is " + currentTemperature);
			}else{
				System.out.println("Minimum Temperature Reached");
			}
		}
		else{
			System.out.println("turn on AirCooler");
		}
	}
}