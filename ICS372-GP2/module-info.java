module ICS372 {
	requires javafx.controls;
	requires java.desktop;

	opens start to javafx.graphics, javafx.fxml;
}
