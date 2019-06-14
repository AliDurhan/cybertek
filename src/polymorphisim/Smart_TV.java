package polymorphisim;

public class Smart_TV extends TV{
	
	private int channelCount =200;

	@Override
	public void play() {
		System.out.println("Smart_TV is playing!");
	}
	
	@Override
	public int getChannelCount() {
		return channelCount;
	}



	public static void main(String[] args) {
	
		
		TV tv1 = new Smart_TV ();
		tv1.play();
		System.out.println(tv1.channelCount);
		System.out.println(tv1.getChannelCount());
	
		
		
	}

	
	
	
	
}
