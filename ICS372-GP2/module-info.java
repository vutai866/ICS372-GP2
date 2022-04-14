module ICS372-GP2 {
	requires javafx.controls;
	requires java.desktop;
	
	opens start to javafx.graphics, javafx.fxml;
}
