import javafx.application.Application; 
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
//CardGame is a subclass of the superclass Application
//Application is a class we did not write
//Application is an abstract class
//abstract methods must be overriden by subclassses
//you cannot create an instance of an abstract class
public class CardGame extends Application 
{
   //must overred start method
   @Override
   public void start( Stage s )
   {
      //pane is a container
      BorderPane pane = new BorderPane();
      pane.setTop( new Button("OK") );
      Scene scene = new Scene(pane, 300, 300, Color.rgb(250, 100, 75));
      s.setScene( scene );
      s.show();
   }
}