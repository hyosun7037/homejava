package mask;

import javax.swing.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class JFXTest extends JFrame {
//	public JFXTest() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setSize(500,500);
//		JFXPanel fxPanel = new JFXPanel();
//		add(fxPanel);
//		
//		Platform.runLater(new Runnable() {
//
//			public void run() {
//
//				initAndLoadWebView(fxPanel);
//
//			}
//
//		});
//		
//		setVisible(true);
//	}
//	
	public static void initAndLoadWebView(final JFXPanel fxPanel) {
		Group group = new Group();
		Scene scene = new Scene(group);
		fxPanel.setScene(scene);

		WebView webView = new WebView();

		group.getChildren().add(webView);
		webView.setMinSize(291, 251);
		webView.setMaxSize(291, 251);

		WebEngine webEngine = webView.getEngine();

		webEngine.load("http://59.20.79.42/server1/test.html");

	}
	
//	public static void main(String[] args) {
//		new JFXTest();
//	}
}