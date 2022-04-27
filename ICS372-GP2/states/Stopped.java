package states;

import timer.Notifiable;
import timer.Timer;

public class Stopped extends TrainState implements Notifiable {
	private static Stopped instance;
	
	/**
	 * Private constructor for the singleton pattern
	 */
	private Stopped() {
		instance = this;
	}
	
	public static Stopped getInstance() {
		if (instance == null) {
			instance = new Stopped();
		}
		return instance;
	}
	
	@Override
	public void enter() {
		TrainStateContext.getInstance().showTrainStopped();
	}
	@Override
	public void exit() {
		TrainStateContext.getInstance().showTrainAcceralting();
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
	  TrainStateContext.getInstance().changeState(Stopped.getInstance());
	}

}
