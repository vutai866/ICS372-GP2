package states;

public class Stopped extends TrainState  {
	private static Stopped instance;
	
	private Stopped() {
		instance = this;
	}
	
	public static Stopped getInstance() {
		// TODO Auto-generated method stub
		return instance;
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
