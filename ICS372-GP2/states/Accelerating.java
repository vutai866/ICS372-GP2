package states;

import timer.Timer;

public class Accelerating  extends TrainState {
	private static Accelerating instance;
	private Timer timer;
	public static Accelerating getInstance() {
		if (instance == null) {
			instance = new Accelerating();
		}
		return instance;
	}
	
	private Accelerating() {
		instance = this;
	}
	
	@Override
	public void enter() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void exit() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	   * Process clock tick event
	   */
	  @Override
	public void onTimerTick(int timerValue) {
	    //TrainStateContext.getInstance().showTimeLeft(timerValue);
	}

	/**
	 * Process the timer runs out event
	 */
	 @Override
	public void onTimerRunsOut() {
	  TrainStateContext.getInstance().showTimeLeft(0);
	  TrainStateContext.getInstance().changeState(FullSpeed.getInstance());
	}
}
