import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class calculator extends Application {
	double num1 = 0;
    int opp = 0;
    double num2 = 0;
    double answer = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}
	@Override
	public void start(Stage stage) throws Exception {
		TextField tf = new TextField();
		tf.setEditable(false);
		Button but1 = new Button("1");
		Button but2 = new Button("2");
		Button but3 = new Button("3");
		Button but4 = new Button("4");
		Button but5 = new Button("5");
		Button but6 = new Button("6");
		Button but7 = new Button("7");
		Button but8 = new Button("8");
		Button but9 = new Button("9");
		Button but10 = new Button("0");
		Button but11 = new Button("+");
		Button but12 = new Button("-");
		Button but13 = new Button("*");
		Button but14 = new Button("/");
		Button but15 = new Button("=");
		Button but16 = new Button("C");
		GridPane gp = new GridPane();   
	    gp.setMinSize(500, 500); 
	    gp.setPadding(new Insets(10, 10, 10, 10));   
	    gp.setVgap(5); 
	    gp.setHgap(5);
	    gp.setAlignment(Pos.CENTER); 
	    gp.add(tf, 0, 0);
	    gp.add(but1, 1, 2);
	    gp.add(but2, 2, 2);
	    gp.add(but3, 3, 2);
	    gp.add(but4, 1, 3);
	    gp.add(but5, 2, 3);
	    gp.add(but6, 3, 3);
	    gp.add(but7, 1, 4);
	    gp.add(but8, 2, 4);
	    gp.add(but9, 3, 4);
	    gp.add(but10, 1, 5);
	    gp.add(but11, 4, 2);
	    gp.add(but12, 4, 3);
	    gp.add(but13, 4, 4);
	    gp.add(but14, 4, 5);
	    gp.add(but15, 3, 5);
	    gp.add(but16, 2, 5);
	    but1.setOnAction(e -> {
	    	tf.setText(tf.getText() + "1");
	    });
	    but2.setOnAction(e -> {
	    	tf.setText(tf.getText() + "2");
	    });
	    but3.setOnAction(e -> {
	    	tf.setText(tf.getText() + "3");
	    });
	    but4.setOnAction(e -> {
	    	tf.setText(tf.getText() + "4");
	    });
	    but5.setOnAction(e -> {
	    	tf.setText(tf.getText() + "5");
	    });
	    but6.setOnAction(e -> {
	    	tf.setText(tf.getText() + "6");
	    });
	    but7.setOnAction(e -> {
	    	tf.setText(tf.getText() + "7");
	    });
	    but8.setOnAction(e -> {
	    	tf.setText(tf.getText() + "8");
	    });
	    but9.setOnAction(e -> {
	    	tf.setText(tf.getText() + "9");
	    });
	    but10.setOnAction(e -> {
	    	tf.setText(tf.getText() + "0");
	    });
	    but11.setOnAction(e -> {
	    	num1 = Integer.parseInt(tf.getText());
	    	opp = 1;
	    	tf.setText("");
	    });
	    but12.setOnAction(e -> {
	    	num1 = Integer.parseInt(tf.getText());
	    	opp = 2;
	    	tf.setText("");
	    });	
	    but13.setOnAction(e -> {
	    	num1 = Integer.parseInt(tf.getText());
	    	opp = 3;
	    	tf.setText("");
	    });
	    but14.setOnAction(e -> {
	    	num1 = Integer.parseInt(tf.getText());
	    	opp = 4;
	    	tf.setText("");
	    });
	    but15.setOnAction(e -> {
	    	num2 = Integer.parseInt(tf.getText());
	    	if(opp == 1) {
	    		answer = num1 + num2;
	    	} else if(opp == 2) {
	    		answer = num1 - num2;
	    	} else if(opp == 3){
	    		answer = num1*num2;
	    	} else if(opp == 4) {
	    		if(num2 == 0) { // dividing by zero makes result undefined, this returns a zero instead to keep the program running
	    			answer = 0;
	    		} else {
	    			answer = num1/num2;
	    		}
	    	}
	    	tf.setText(Double.toString(answer));
	    });
	    but16.setOnAction(e -> {
	    	num1 = 0;
	    	num2 = 0;
	    	tf.setText("");
	    });
	      gp.setStyle("-fx-background-color: BLUE;"); 

	    Scene scene = new Scene(gp); 
	    stage.setTitle("Calculator"); 
	   	stage.setScene(scene);
	    stage.show(); 
		
		
	}
	

}
