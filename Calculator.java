
// U10111003 朱永捷

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;


public class Calculator extends Application {
	// Define data fields which are buttons
	private Button jbt0 = new Button("" + 0);
	private Button jbt1 = new Button("" + 1);
	private Button jbt2 = new Button("" + 2);
	private Button jbt3 = new Button("" + 3);
	private Button jbt4 = new Button("" + 4);
	private Button jbt5 = new Button("" + 5);
	private Button jbt6 = new Button("" + 6);
	private Button jbt7 = new Button("" + 7);
	private Button jbt8 = new Button("" + 8);
	private Button jbt9 = new Button("" + 9);
	private Button jbtMC = new Button("MC");
	private Button jbtMR = new Button("MR");
	private Button jbtMS = new Button("MS");
	private Button jbtMplus = new Button("M+");
	private Button jbtMminus = new Button("M-");
	private Button jbtReturn = new Button("←");
	private Button jbtCE = new Button("CE");
	private Button jbtC = new Button("C");
	private Button jbtPM = new Button("±");
	private Button jbtSqrt = new Button("√");
	private Button jbtDiv = new Button("/");
	private Button jbtMod = new Button("%");
	private Button jbtMul = new Button("*");
	private Button jbtFrac = new Button("1/x");
	private Button jbtDot = new Button(".");
	private Button jbtMinus = new Button("-");
	private Button jbtPlus = new Button("+");
	private Button jbtEqual = new Button("=");
	private String value;

	// new class to compute
	Compute compute = new Compute();
	

	public void start(Stage primaryStage) {

		//Creates our main menu to hold our Sub-Menus.
		MenuBar mainMenu = new MenuBar();
		//Declare sub-menus and add to main menu.
		Menu file = new Menu("File");
		Menu edit = new Menu("Edit");
		Menu help = new Menu("Help");
		mainMenu.getMenus().addAll(file, edit, help);
		
		// Create a place and set its properties
		GridPane place = new GridPane();
		place.setAlignment(Pos.CENTER);
		place.setPadding(new Insets(12.5, 12.5, 12.5, 12.5));
		place.setHgap(5);
		place.setVgap(5);

		// Set buttons size
		jbt0.setPrefSize(85,30);
		jbt1.setPrefSize(40,30);
		jbt2.setPrefSize(40,30);
		jbt3.setPrefSize(40,30);
		jbt4.setPrefSize(40,30);
		jbt5.setPrefSize(40,30);
		jbt6.setPrefSize(40,30);
		jbt7.setPrefSize(40,30);
		jbt8.setPrefSize(40,30);
		jbt9.setPrefSize(40,30);
		jbtMC.setPrefSize(40,30);
		jbtMR.setPrefSize(40,30);
		jbtMS.setPrefSize(40,30);
		jbtMplus.setPrefSize(40,30);
		jbtMminus.setPrefSize(40,30);
		jbtReturn.setPrefSize(40,30);
		jbtCE.setPrefSize(40,30);
		jbtC.setPrefSize(40,30);
		jbtPM.setPrefSize(40,30);
		jbtSqrt.setPrefSize(40,30);
		jbtDiv.setPrefSize(40,30);
		jbtMod.setPrefSize(40,30);
		jbtMul.setPrefSize(40,30);
		jbtFrac.setPrefSize(40,30);
		jbtDot.setPrefSize(40,30);
		jbtMinus.setPrefSize(40,30);
		jbtPlus.setPrefSize(40,30);
		jbtEqual.setPrefSize(40,65);

		// Add buttons
		place.add(jbtMC, 0, 0);
		place.add(jbtMR, 1, 0);
		place.add(jbtMS, 2, 0);
		place.add(jbtMplus, 3, 0);
		place.add(jbtMminus, 4, 0);
		place.add(jbtReturn, 0, 1);
		place.add(jbtCE, 1, 1);
		place.add(jbtC, 2, 1);
		place.add(jbtPM, 3, 1);
		place.add(jbtSqrt, 4, 1);
		place.add(jbt7, 0, 2);
		place.add(jbt8, 1, 2);
		place.add(jbt9, 2, 2);
		place.add(jbtDiv, 3, 2);
		place.add(jbtMod, 4, 2);
		place.add(jbt4, 0, 3);
		place.add(jbt5, 1, 3);
		place.add(jbt6, 2, 3);
		place.add(jbtMul, 3, 3);
		place.add(jbtFrac, 4, 3);
		place.add(jbt1, 0, 4);
		place.add(jbt2, 1, 4);
		place.add(jbt3, 2, 4);
		place.add(jbtMinus, 3, 4);
		place.add(jbt0, 0, 5, 2, 1);
		place.add(jbtDot, 2, 5);
		place.add(jbtPlus, 3, 5);
		place.add(jbtEqual, 4, 4, 1, 2);
		
		// Create TextField
		TextField resultText = new TextField("" + 0);
		resultText.setPrefHeight(40);
		resultText.setEditable(false);

		// Create a place2
		BorderPane place2 = new BorderPane();
		place2.setTop(mainMenu);
		place2.setCenter(resultText);
		place2.setBottom(place);


		// process events
		jbt0.setOnAction(e -> {
			checkValue("0");
			resultText.setText(value);
		});
		jbt1.setOnAction(e -> {
			checkValue("1");
			resultText.setText(value);
		});
		jbt2.setOnAction(e -> {
			checkValue("2");
			resultText.setText(value);
		});
		jbt3.setOnAction(e -> {
			checkValue("3");
			resultText.setText(value);
		});
		jbt4.setOnAction(e -> {
			checkValue("4");
			resultText.setText(value);
		});
		jbt5.setOnAction(e -> {
			checkValue("5");
			resultText.setText(value);
		});
		jbt6.setOnAction(e -> {
			checkValue("6");
			resultText.setText(value);
		});
		jbt7.setOnAction(e -> {
			checkValue("7");
			resultText.setText(value);
		});
		jbt8.setOnAction(e -> {
			checkValue("8");
			resultText.setText(value);
		});
		jbt9.setOnAction(e -> {
			checkValue("9");
			resultText.setText(value);
		});
		jbtDot.setOnAction(e -> {
			checkValue(".");
			resultText.setText(value);
		});
		jbtPM.setOnAction(e -> {
			checkValue("-");
			resultText.setText(value);
		});

		// add,minus,multiply,divide and equal
		jbtPlus.setOnAction(e -> {
			value = null;
			compute.setCom(0);
			compute.setX(resultText.getText());
			resultText.setText("0");
		});
		jbtMinus.setOnAction(e -> {
			value = null;
			compute.setCom(1);
			compute.setX(resultText.getText());
			resultText.setText("0");
		});
		jbtMul.setOnAction(e -> {
			value = null;
			compute.setCom(2);
			compute.setX(resultText.getText());
			resultText.setText("0");
		});
		jbtDiv.setOnAction(e -> {
			value = null;
			compute.setCom(3);
			compute.setX(resultText.getText());
			resultText.setText("0");
		});
		jbtC.setOnAction(e -> {
			value = null;
			compute.setX("0");
			resultText.setText("0");
		});
		jbtCE.setOnAction(e -> {
			value = null;
			compute.setX("0");
			resultText.setText("0");
		});
		jbtReturn.setOnAction(e -> {
			delete();
			resultText.setText(value);
		});
		jbtEqual.setOnAction(e -> {
			value = null;
			double y = Double.parseDouble(resultText.getText());
			double result = compute.compare(y);
			resultText.setText(String.valueOf(result));
		});




		// Create a scene and place it in the stage
		Scene scene = new Scene(place2);
		primaryStage.setTitle("Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// Define a method to check text is null or not
	public void checkValue(String newValue){
		if (value == null) {
			if (newValue == "."){
				value = "0.";
			} else {
				value = newValue;
			}
		}
		else {
			if (newValue == "." ) {
				if (value.contains(".")){
				} else {
					value += newValue;
				}
			} else if (newValue == "-") {
			} else {
				value += newValue;
			}
		}
	}

	// Delete number method
	public void delete(){
		String x = value;
		value = null;
		for (int i = 0 ; i <= x.length()-2 ; i++) {
			value += x.charAt(i);
		}
	}
}
