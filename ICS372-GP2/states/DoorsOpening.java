package states;

import timer.Notifiable;
import timer.Timer;

/**
 * Represents the door opening state
 *
 */
public class DoorsOpening extends TrainState implements Notifiable{
	private static DoorsOpening instance;
	private Timer timer;
	/**
	 * Private constructor for the singleton pattern
	 */
	private DoorsOpening() {
		instance = this;
	}

	public static DoorsOpening getInstance() {
		if (instance == null) {
			instance = new DoorsOpening();
		}
		return instance;
	}
	@Override
	public void enter() {
		TrainStateContext.getInstance().showDoorOpening();

	}

	@Override
	public void exit() {
		TrainStateContext.getInstance().showDoorClosing();

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
	  TrainStateContext.getInstance().changeState(DoorsOpened.getInstance());
	}

}
