package start;

import display.GUIDisplay;
import javafx.application.Application;
import timer.Clock;

public class Main {

	public static void main(String[] args) {
		Clock.getInstance();
		new Thread() {
			@Override
			public void run() {
				Application.launch(GUIDisplay.class, null);
			}
		}.start();
	}
}
