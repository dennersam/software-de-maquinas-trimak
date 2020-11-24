module module.java {
	requires javafx.graphics;
	requires javafx.controls;
	requires javafx.fxml;
	requires java.sql;
	
	opens basico;
	opens view;
	opens controller;
}