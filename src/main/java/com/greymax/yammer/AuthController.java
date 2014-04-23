package com.greymax.yammer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AuthController {

  private static final Logger LOG = LoggerFactory.getLogger(AuthController.class);

  @FXML public TextField emailField;
  @FXML public PasswordField passwordField;

  public void login(ActionEvent actionEvent) {
    LOG.info("========= Login =============");
  }
}
