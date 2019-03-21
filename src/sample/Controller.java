package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Button;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.Statement;

public class Controller {
    @FXML
    private TextField txtUsername;

    @FXML
    private TextField txtPassword;

    @FXML
    private Button btnLogin;

    @FXML
    private Label successLogin;

    public void test() {
        System.out.println("fdp");
    }


    public void fakeConnexion(ActionEvent event) {
        successLogin.setVisible(true);
    }

    public void LoginSystem(ActionEvent event) {
        try {
            String user = "TD_57";
            String pass = "TD_57";

            datacon.Connectiondb(user, pass);
            Statement s = datacon.getCon().createStatement();

            ResultSet r = s.executeQuery("SELECT * FROM PATIENT");
            if (r.next()) {
                System.out.println(r.getInt(1) + "  " + r.getString(2));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }


}
