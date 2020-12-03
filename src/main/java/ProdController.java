import javafx.fxml.FXML;

import javafx.scene.control.Label;



public class ProdController {



  @FXML

  private Label lblOutput;



  public void sayHello() {

    lblOutput.setText("Hello FXML!");



  }



}