/*
 * @authors Amanda Tustin
 *
 */
package MidtermCIT230;

import static MidtermCIT230.Conversions.convertStuff;
import java.util.InputMismatchException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
  
public class ConversionsFX extends Application 
{
    public static void main(String[] args) 
    {
        launch(args);
    }

    
    //create Button    
    final Button check = new Button ("Convert");
    
    //create Labels
    final Label fromLabel = new Label("From: ");
    final Label toLabel = new Label("To: ");
    final Label inputLabel = new Label("Units: ");
    final Label outputLabel = new Label("Converted: ");
    
    //create TextFields
    final TextField tfInput = new TextField("");
    final TextField tfOutput = new TextField("");
    
    @Override public void start(Stage stage) throws InputMismatchException
    {
        
        
        //create comboBox for From
        final ComboBox<String> fromBox = new ComboBox<>();
        fromBox.getItems().addAll
        (
            "Teaspoon",
            "Tablespoon",
            "Ounce",
            "Cup",
            "Pint",
            "Gallon"
        );
        
        //create comboBox for To
        final ComboBox<String> toBox = new ComboBox<>();
        toBox.getItems().addAll
        (
            "Teaspoon",
            "Tablespoon",
            "Ounce",
            "Cup",
            "Pint",
            "Gallon" 
        );   
        
        //create and set up grid pane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(5);
        grid.setPadding(new Insets(5, 5, 5, 5));
        grid.addRow(0, fromLabel, toLabel);
        grid.addRow(1, fromBox, toBox);
        grid.addRow(3, inputLabel, tfInput);
        grid.addRow(4, outputLabel, tfOutput);
        grid.addRow(5, check);
        
        check.setOnAction((ActionEvent e) ->
        {
            double result;
            String input;
            int i;
            input = tfInput.getText();
            
            try
            {
                for(i = 0; i < input.length(); i++)
                {
                    if(Character.isDigit(input.charAt(i)))
                    {
                        result = convertStuff(fromBox.getValue(), toBox.getValue(), Double.parseDouble(input));
                        tfOutput.setText(Double.toString(result));
                    }
                    else
                    {
                        throw new InputMismatchException("Please enter a valid number.");
                    }
                }
            }
            catch(InputMismatchException iie)
            {
                JOptionPane.showMessageDialog(null, iie.getMessage());
                tfInput.setText("");
                tfOutput.setText("");
            } 
        });//check.setOnAction
        
        //set the stage - curtain call - break a leg!
        stage.setTitle("Conversion Tool");
        Scene scene = new Scene(grid, 280, 200);
        stage.setScene(scene);
        stage.show();
    }   
    
}
    

       