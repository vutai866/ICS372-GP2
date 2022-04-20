package states;


import display.TrainDisplay;

public class TrainStateContext {
	private TrainDisplay trainDisplay;
	private TrainState currentState;
	private static TrainStateContext instance;
	
	public TrainStateContext() {
		instance = this;
		currentState = Stopped.getInstance();
	}
	
	public static TrainStateContext getInstance() {
		if (instance == null) {
			instance = new TrainStateContext();
		}
		return instance;
	}
	
	public void showTimeLeft(int time) {
		trainDisplay.showTimeLeft(time);
	}

	public void changeState(Object instance2) {
		// TODO Auto-generated method stub
		
	}
	
}
