module ICS372 {
	requires javafx.controls;
	requires javafx.base;
	requires java.desktop;

	opens start to javafx.graphics, javafx.fxml;

	exports display to javafx.graphics;
	exports start to javafx.graphics;
}
