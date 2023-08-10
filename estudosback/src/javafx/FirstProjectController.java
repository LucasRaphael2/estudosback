package javafx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;





public class FirstProjectController implements Initializable {

	    @FXML
	    private Button button;

	    @FXML
	    private Label label;
	    
	    void AcaoDoBotao(ActionEvent event) {
	    	System.out.println("Você Clicou");
	    }
	 
		@Override
		public void initialize(URL url, ResourceBundle rb) {
			
			
		}



}
