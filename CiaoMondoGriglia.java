package it.edu.iisgubbio.ciaomondo;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class CiaoMondoGriglia extends Application {
	Button bSaluta1=new Button();
	Button bSaluta2=new Button();
	Button bSaluta3=new Button();
	public void start(Stage finestra) {
		GridPane griglia=new GridPane();
		Button bSaluta1=new Button();
		Button bSaluta2=new Button();
		Button bSaluta3=new Button();
		
		bSaluta1.setOnAction(e-> saluta1());
		bSaluta2.setOnAction(e-> saluta2());
		bSaluta3.setOnAction(e-> saluta3());
		griglia.add(bSaluta1, 0,0);
		griglia.add(bSaluta2, 1,1);
		griglia.add(bSaluta3, 2,2);
		bSaluta1.setText("Saluta 1");
		bSaluta2.setText("Saluta 2");
		bSaluta3.setText("Saluta 3");
		
		Scene scena=new Scene(griglia);
		finestra.setTitle("ciao mondo griglia");
		finestra.setScene(scena);
		finestra.show();
		
		
	}
	public void saluta1() {
		bSaluta1.setText("ciao1");
	}
    public void saluta2() {
    	bSaluta2.setText("ciao2");
	}
    public void saluta3() {
    	bSaluta3.setText("ciao3");
	}
	public static void mai(String [] args) {
		launch(args);
		
	}

}
