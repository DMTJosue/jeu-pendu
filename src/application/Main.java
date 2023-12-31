package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Screen;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("PenduleView.fxml"));
			
			
	        // Obtenez la taille de l'écran
	        double screenWidth = Screen.getPrimary().getVisualBounds().getWidth();
	        double screenHeight = Screen.getPrimary().getVisualBounds().getHeight();

	        // Utilisez des proportions pour définir la taille de la scène
	        double sceneWidth = screenWidth * 0.70; // 70% de la largeur de l'écran
	        double sceneHeight = screenHeight * 0.70; // 70% de la hauteur de l'écran

	        // Créez la scène avec les dimensions calculées
	        Scene scene = new Scene(root, sceneWidth, sceneHeight);
	        
	        //Définissez l'icône de la barre de titre
            Image icon = new Image(getClass().getResourceAsStream("/images/logojeupendu.png"));
            primaryStage.getIcons().add(icon);

			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Jeu Pendu");
			primaryStage.setResizable(false);

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
