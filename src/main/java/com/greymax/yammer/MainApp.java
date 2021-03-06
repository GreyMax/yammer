package com.greymax.yammer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainApp extends Application {

  private static final Logger log = LoggerFactory.getLogger(MainApp.class);

  public static void main(String[] args) throws Exception {
    launch(args);
  }

  public void start(Stage stage) throws Exception {

    String fxmlFile = "/fxml/auth.fxml";
    log.debug("Loading FXML for main view from: {}", fxmlFile);
    FXMLLoader loader = new FXMLLoader();
    Parent rootNode = (Parent) loader.load(getClass().getResourceAsStream(fxmlFile));

    log.debug("Showing JFX scene");
    Scene scene = new Scene(rootNode, 400, 500);
    scene.getStylesheets().add("/styles/styles.css");

    stage.setTitle("Yammer");
    stage.getIcons().add(new Image("/images/yammer.png"));
    stage.setScene(scene);
    stage.show();
  }
}
