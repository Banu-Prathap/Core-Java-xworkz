class SpeakerTest{
	
	public static void main(String args[]){
		String nameOfTheCompany = Speaker.name;
		System.out.println(nameOfTheCompany);
		Speaker.onOrOff();
		boolean connected = Speaker.onOrOff();
		System.out.println(connected);
		//Speaker.onOrOff();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		boolean connected1 = Speaker.onOrOff();
		System.out.println(connected1);
		Speaker.increaseVolume();
		Speaker.decreaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();	
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
	}
}