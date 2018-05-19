/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensafe.udred.ui;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sensafe.udred.acquaintance.IBusiness;
import sensafe.udred.acquaintance.IUI;

/**
 *
 * @author Nick
 */
public class UIRun extends Application implements IUI {
    IBusiness business;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GUI.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void injectBusiness(IBusiness businessLayer) {
        this.business = businessLayer;
    }

    @Override
    public void startApplication(String[] args) {
        launch(args);
    }
}
