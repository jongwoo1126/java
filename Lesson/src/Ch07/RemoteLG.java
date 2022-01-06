package Ch07;

public class RemoteLG implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("LG power on...");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LG power off...");

		
	}

	@Override
	public void chUp() {
		System.out.println("LG chUp...");
		
		
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
		
		
	}

	@Override
	public void soundUp() {
		System.out.println("LG sound Up...");
		
		
	}

	@Override
	public void soundDown() {
		System.out.println("LG sound Down...");
		
		
	}
	
	

}
