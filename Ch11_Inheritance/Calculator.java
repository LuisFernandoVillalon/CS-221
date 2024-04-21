import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;

public class Calculator extends Application
{   
   private double val1, val2;
   private boolean pressedOperator = false;
   private boolean pressedEquals = false;
   private String arithOperation = "";
   private Button[] digitBttns = new Button[10];
   private Button[] arithBttns = new Button[4];
   private Button equalsBttn = new Button("=");
   
   private DigitBttnHandler handleDigits = new DigitBttnHandler();      //EventHandler object
   private ArithBttnHandler handleOperators = new ArithBttnHandler();      //EventHandler object
   
   private GridPane grid = new GridPane();
   private GridPane arithGrid = new GridPane();
   private Label display = new Label();
   private BorderPane pane = new BorderPane();
   private Scene scene = new Scene(pane);

   //need to Override start(Stage) method
   @Override
   public void start( Stage s  )     //take as main method
   {   
      addBttnsToGrid();
      pane.setTop( display );
      pane.setCenter( grid );
      pane.setRight( arithGrid );
      pane.setBottom( equalsBttn );
      s.setScene(scene);                             
      s.show();
   }
   
   public void addBttnsToGrid()
   {
      digitBttns[0] = new Button("0");
      grid.add( digitBttns[0], 1, 3 );
      
      //implement a loop to create the other 9 buttons and add them
      //to the grid
      int row = 2; int col = 0;
      for( int i = 1; i <= 9; i++ )
      {
         String bttnLabel = ""+i;
         digitBttns[i] = new Button( bttnLabel );
         grid.add( digitBttns[i], col, row );
         col++;
         if( col % 3 == 0 )
         {
            col = 0;
            row--;
         }
      } 
      
      String[] operatorsStr = {"+", "-", "x", "/"};   
      
      for( int i = 0; i < arithBttns.length; i++ )
      {
         arithBttns[i] = new Button( operatorsStr[i] );
         arithGrid.add( arithBttns[i], 0, i );
      }
      
      for( Button x : digitBttns )
      {
         x.setOnAction(handleDigits);     //makes numeric buttons come alive
      }
      
      for( Button x : arithBttns )
      {
         x.setOnAction(handleOperators);     //makes operator buttons come alive
      }
      
      equalsBttn.setOnAction(handleOperators); //make equals button come alive
      
   }//end addBttnsToGrid
   
   
   //create inner DigitBttnHandler class that implements EventHandler interface
   class DigitBttnHandler implements EventHandler<ActionEvent>
   {
      //handle is an abstract method inherited from EventHandler (must be overridden)
      @Override
      public void handle( ActionEvent e )
      {
         Button clickedBttn = (Button)e.getSource();
         display.setText( display.getText() + clickedBttn.getText() );
      }
   }
   
   //create inner ArithBttnHandler class that implements EventHandler interface
   class ArithBttnHandler implements EventHandler<ActionEvent>
   {
      //handle is an abstract method inherited from EventHandler (must be overridden)
      @Override
      public void handle( ActionEvent e )
      {
         Button clickedBttn = (Button)e.getSource();
         String bttnText = clickedBttn.getText();
         String labelText = display.getText();
      
         if( !bttnText.equals("=") && pressedOperator == false && !labelText.equals("") )
         {
            arithOperation = bttnText;
            val1 = Double.parseDouble( labelText );
            display.setText("");
            pressedOperator = true;
            pressedEquals = false;
         }
         
         if( bttnText.equals("=") && pressedEquals == false && !labelText.equals("") )
         {
            val2 = Double.parseDouble( labelText );
            double ans;
            switch(arithOperation)
            {
               case "+": ans = val1 + val2; break;
               case "-": ans = val1 - val2; break;
               case "x": ans = val1 * val2; break;
               default: ans = val1 / val2; break;
            }
            display.setText(""+ans);
            pressedOperator = false;
            pressedEquals = true;
         }
      }
   }
   
}//end Calculator