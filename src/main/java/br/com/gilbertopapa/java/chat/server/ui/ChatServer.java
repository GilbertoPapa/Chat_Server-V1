package br.com.gilbertopapa.java.chat.server.ui;

import br.com.gilbertopapa.java.chat.common.utils.FXUtils;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Application do JavaFX
 */
public class ChatServer extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Carrega o layout da tela
		Pane root = FXUtils.loadLayout("/br/com/gilbertopapa/java/chat/server/ui/ServerWindow.fxml", primaryStage);
		
		// Define os par�metros da tela e exibe
		primaryStage.setTitle("Servidor de Chat");
		primaryStage.setResizable(false);
		Scene scene = new Scene(root, 300, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Inicia a aplica��o JavaFX
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
