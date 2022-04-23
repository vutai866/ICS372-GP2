package states;

import timer.Notifiable;
import timer.Timer;

public class Deccelerating  extends TrainState implements Notifiable {
	private static Deccelerating instance;
	private Timer timer;
	public static Deccelerating getInstance() {
		if (instance == null) {
			instance = new Deccelerating();
		}
		return instance;
	}
	
	private Deccelerating() {
		instance = this;
	}
	
	@Override
	public void enter() {
		timer = new Timer(this, 10);
		
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
