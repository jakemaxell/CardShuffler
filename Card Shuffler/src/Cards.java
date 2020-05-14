import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;

public class Cards extends Application{

	public static void main(String[] args) {
		
		Application.launch(args);
		
	}
	
	public void start(Stage primaryStage) throws Exception{
		
		ArrayList<Integer> deck = new ArrayList<Integer>();
		
		for(int x = 1; x < 53; x++) {
			deck.add(x);
		}
		
		Collections.shuffle(deck);
		
		GridPane gp = new GridPane();
		
		gp.setHgap(15);
		gp.add(new ImageView(new Image(deck.get(0) + ".png")), 0, 0);
		gp.add(new ImageView(new Image(deck.get(1) + ".png")), 1, 0);
		gp.add(new ImageView(new Image(deck.get(2) + ".png")), 2, 0);
		gp.add(new ImageView(new Image(deck.get(3) + ".png")), 3, 0);
		gp.add(new ImageView(new Image(deck.get(4) + ".png")), 4, 0);
		
		Scene scene = new Scene(gp);
		
		primaryStage.setTitle("Card Shuffler");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	
}
