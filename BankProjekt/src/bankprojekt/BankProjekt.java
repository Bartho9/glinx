/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankprojekt;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Bartek
 */
public class BankProjekt extends Application {
    
    Bank bank = new Bank();
    Pracownik pracownik = new Pracownik();
    Wlasciciel wlasciciel = new Wlasciciel();
            
     @Override
    public void start(Stage primaryStage) {
        
        VBox siatkaPionowaVBox = new VBox(5);
        siatkaPionowaVBox.setPadding(new Insets(5));
        
        HBox siatkaPoziomaDUKontaHBox = new HBox (5);
        siatkaPoziomaDUKontaHBox.setPadding(new Insets(5));
        Label DaneKontaLabel = new Label();
        DaneKontaLabel.setText("Dane konta:");
        siatkaPoziomaDUKontaHBox.getChildren().add(DaneKontaLabel);
        TextField peselTextField=new TextField();
        siatkaPoziomaDUKontaHBox.getChildren().add(peselTextField);
        TextField loginTextField=new TextField();
        siatkaPoziomaDUKontaHBox.getChildren().add(loginTextField);
        TextField hasloTextField=new TextField();
        siatkaPoziomaDUKontaHBox.getChildren().add(hasloTextField);
        siatkaPionowaVBox.getChildren().add(siatkaPoziomaDUKontaHBox);
        
        HBox siatkaPoziomaDUKonta2HBox = new HBox(5);
        Button stworzKontoButton = new Button("Stworz konto");
        stworzKontoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            bank.stworzKonto(peselTextField.getText(), loginTextField.getText(), hasloTextField.getText());
            }
        });
        siatkaPoziomaDUKonta2HBox.getChildren().add(stworzKontoButton);
        
        Button usunKontoButton = new Button("Usun Konto");
        usunKontoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            bank.usunKonto(peselTextField.getText());
            }
        });
        siatkaPoziomaDUKonta2HBox.getChildren().add(usunKontoButton);
        
        Button zalogujButton = new Button("Zaloguj");
        zalogujButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            //akcja logowania
            }
        });
        siatkaPoziomaDUKonta2HBox.getChildren().add(zalogujButton);
        
        Button wylogujButton = new Button("Wyloguj");
        wylogujButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
             //akcja wylogowania
            }
        });
        siatkaPoziomaDUKonta2HBox.getChildren().add(wylogujButton);
        siatkaPionowaVBox.getChildren().add(siatkaPoziomaDUKonta2HBox);
        
        HBox siatkaPoziomaOperacjeHBox = new HBox(5);
        
        Label kwotaLabel = new Label();
        kwotaLabel.setText("Kwota:");
        siatkaPoziomaOperacjeHBox.getChildren().add(kwotaLabel);
        
        TextField kwotaTextField=new TextField();
        siatkaPoziomaOperacjeHBox.getChildren().add(kwotaTextField);
   
        
        // Operacje - wplac wyplac
        
        Button wplacButton = new Button("Wplac");
        wplacButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            //.wplac(Integer.valueOf(kwotaTextField.getText()));
            }
        });
        Button wyplacButton = new Button("Wyplac");
        wplacButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            //.wyplac(Integer.valueOf(kwotaTextField.getText()));
            }
        });
        siatkaPionowaVBox.getChildren().add(siatkaPoziomaOperacjeHBox);
        
         HBox siatkaPoziomaStanKontaHBox = new HBox(5);
        
        Label stanKontaLabel = new Label();
        stanKontaLabel.setText("Stan konta:");
        siatkaPoziomaOperacjeHBox.getChildren().add(stanKontaLabel);
        Label stanKonta2Label = new Label();
       // stanKonta2Label.setText(); // metoda getStanKonta z klasy Konto
        siatkaPoziomaOperacjeHBox.getChildren().add(stanKonta2Label);
        
       
                
        // Teraz przycisk "Zakończ"
        Button zakonczButton = new Button("Zakończ");
        // Akcja dla przycisku "Zakończ"
        zakonczButton.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                // Tak się powinno zakańczać działanie aplikacji w JavaFX
                Platform.exit();
            }
        });
        siatkaPionowaVBox.getChildren().add(zakonczButton);
        
        // Tworzymy Scene
        Scene scene = new Scene(siatkaPionowaVBox, 410, 270);
        // Tutuł okna
        primaryStage.setTitle("Bank");
        // Ustawianie sceny
        primaryStage.setScene(scene);
        // Pokaż Stage
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
    /*
    static String error(int nr){
       //metoda zwraca info błędu
       String info;
       switch(nr)
       {    case -1:info="Książka niedostępna";
                break;
            case -2:info="Nie ma takiej pozycji";
                break;
            case -3:info="Książka zarezerwowana na inne nazwisko"; 
                break;
                case -4:info="Książka wypożyczona na inne nazwisko"; 
                break;
                case -5:info="Nie jesteś zalogowany";
                break;
                default:info="OK.";
        } return info;
    } */   
    
}
