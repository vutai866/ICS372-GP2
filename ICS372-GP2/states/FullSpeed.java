package states;

import timer.Notifiable;
import timer.Timer;

public class FullSpeed extends TrainState implements Notifiable {
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
		TrainStateContext.getInstance().showTrainFullSpeed();
	}
	
	@Override
	public void exit() {
		TrainStateContext.getInstance().showTrainDecceralting();
	}
	
	/**
	   * Process clock tick event
	   */
	  @Override
	public void onTimerTick(int timerValue) {
	    TrainStateContext.getInstance().showTimeLeft(timerValue);
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
