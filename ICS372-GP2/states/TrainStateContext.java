<<<<<<< HEAD
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
=======
package states;


import display.TrainDisplay;

/**
 * The context is an observer for the clock and stores the context info for states
 *
 */
public class TrainStateContext {
	private TrainDisplay trainDisplay;
	private TrainState currentState;
	private static TrainStateContext instance;
	
	/**
	 * Make is a singleton
	 */
	public TrainStateContext() {
		instance = this;
		currentState = Stopped.getInstance();
	}
	
	/**
	 * Returns the instance
	 * 
	 * @return the object
	 */
	public static TrainStateContext getInstance() {
		if (instance == null) {
			instance = new TrainStateContext();
		}
		return instance;
	}
	
	/**
	 * Gets the display reference in case it changes
	 * 
	 * @param trainDisplay The current display object
	 */
	public void setDisplay(TrainDisplay trainDisplay) {
		this.trainDisplay = trainDisplay
	}
	
	/**
	 * Lets stopped state be the starting state and adds the object as an observable 
	 * for clock
	 */
	public void initialize() {
		instance.changeState(Stopped.getInstance());
	}
	
	/**
	 * Called from the states to change the current state
	 * 
	 * @param nextState The next state
	 */
	public void changeState(TrainState nextState) {
		currentState.leave();
		currentState = nextState;
		currentState.enter();
	}
	
	/**
	 * Process acceleration request
	 */
	public void onAccelerate() {
		currentState.onAccelerate();
	}
	
	/**
	 * Process decceleration request
	 */
	public void onDeccelerate() {
		currentState.onDeccelerate();
	}
	
	/**
	 * Process door open request
	 */
	public void onDoorsOpened() {
		currentState.onDoorsOpened();
	}
	
	/**
	 * Process door closed request
	 */
	public void onDoorsClosed() {
		currentState.onDoorsClosed();
	}
	
	/**
	 * Process doors opening request
	 */
	public void onDoorsOpening() {
		currentState.onDoorsOpening();
	}
	
	/**
	 * Process doors closing request
	 */
	public void onDoorsClosing() {
		currentState.onDoorsClosing();
	}
	
	/**
	 * Process full speed request
	 */
	public void onFullSpeed() {
		currentState.onFullSpeed();
	}
	
	/**
	 * Process stopped request
	 */
	public void onStopped() {
		currentState.onStopped();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system uses the state changes
	 * 
	 * @param time Time left for cooking
	 */
	public void showTimeLeft(int time) {
		trainDisplay.showTimeLeft(time);
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showTrainAcceralting() {
		display.showTrainAccelerating();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showTrainDecceralting() {
		display.showTrainDeccelerating();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showTrainFullSpeed() {
		display.showTrainFullSpeed();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showTrainStopped() {
		display.showTrainStopped();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showDoorOpened() {
		display.showDoorOpened();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showDoorClosed() {
		display.showDoorClosed();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showDoorOpening() {
		display.showDoorOpening();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showDoorClosing() {
		display.showDoorClosing();
	}
	
	/**
	 * Invokes right method of display, helps protect the states from changes to the
	 * way the system utilizes the state changes
	 */
	public void showDoorObstruction() {
		display.showDoorObstruction();
	}

	
	
}
>>>>>>> 107ed7078eb35f2626886885453368a110c7b6d4
