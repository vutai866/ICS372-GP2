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
}
