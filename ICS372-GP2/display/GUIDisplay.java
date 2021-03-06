package display;

import buttons.DoorObstructingButton;
import buttons.GUIButton;
import buttons.StationReachedButton;
import buttons.StationReachingButton;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class GUIDisplay extends Application implements TrainDisplay {
	private GUIButton doorObstructing;
	private GUIButton stationReached;
	private GUIButton stationReaching;
	private Text trainStatus = new Text("train stopped");
	private Text doorStatus = new Text("Door Closed");

	@Override
	public void start(Stage primaryStage) throws Exception {
		doorObstructing = new DoorObstructingButton("door obstructing");
		stationReached = new StationReachedButton("station reached");
		stationReaching = new StationReachingButton("station reaching");
		GridPane pane = new GridPane();
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.add(trainStatus, 0, 0);
		pane.add(doorStatus, 1, 0);
		pane.add(stationReaching, 2, 0);
		pane.add(stationReached, 3, 0);
		pane.add(doorObstructing, 4, 0);

		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Train simulator");
		// TrainContext.getInstance().setDisplay(this);
		// not yet done
		primaryStage.show();
		primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, new EventHandler<WindowEvent>() {
			@Override
			public void handle(WindowEvent window) {
				System.exit(0);
			}
		});
	}
//test

	@Override
	public void showTrainStopped() {
		// not yet done

	}

	@Override
	public void showTrainAccelerating() {
		trainStatus.setText("train accelerating");

	}

	@Override
	public void showTrainDecelerating() {
		trainStatus.setText("train decelerating");

	}

	@Override
	public void showTrainFullSpeed() {
		trainStatus.setText("train going full speed");

	}

	@Override
	public void showDoorOpened() {
		doorStatus.setText("door opened");

	}

	@Override
	public void showDoorOpening() {
		doorStatus.setText("door opening");

	}

	@Override
	public void showDoorClosed() {
		doorStatus.setText("door closed");

	}

	@Override
	public void showDoorCLosing() {
		doorStatus.setText("door closing");

	}

	@Override
	public void showDoorObstruction() {
		doorStatus.setText("door obstructed");

	}

	@Override
	public void showTimeLeft(int time) {
		// TODO Auto-generated method stub
		
	}
}
