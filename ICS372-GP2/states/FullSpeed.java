package states;

public class FullSpeed extends TrainState {
	private static FullSpeed instance;
	
	/**
	 * Private constructor for the singleton pattern
	 */
	private FullSpeed() {
		instance = this;
	}
	
	public static FullSpeed getInstance() {
		if (instance == null) {
			instance = new FullSpeed();
		}
		return instance;
	}
	
	@Override
	public void enter() {
		
	}
	
	@Override
	public void exit() {
		
	}
	

}
