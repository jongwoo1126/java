package Ch07;

public class RemoteSamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Samsung power on...");

		
	}

	@Override
	public void powerOff() {
		System.out.println("Samsung power off...");
		
	}

	@Override
	public void chUp() {
		System.out.println("Samsung power chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("Samsung power chDown...");
		
	}

	@Override
	public void soundUp() {
		System.out.println("Samsung soundup...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("Samsung soundDown...");
		
	}

}
