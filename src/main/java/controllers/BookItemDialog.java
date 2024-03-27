package controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import model.*;

public class BookItemDialog extends Dialog<Loan>{
    private Loan loan;
    VBox vbox;
    Label lblDueDate;
    Label lblNumRenewals;
    Button renewButton;
    
    public BookItemDialog(Loan loan){
        super();
        this.setTitle("View Book");
        this.loan = loan;
        buildUI();
    }

    private void buildUI() {
        vbox = new VBox();
        Label bookTitle = new Label(loan.getBook().getTitle());
        lblDueDate = new Label();
        lblNumRenewals = new Label();
        setDueDateRenewals();
        vbox.getChildren().add(bookTitle);
        vbox.getChildren().add(lblDueDate);
        vbox.getChildren().add(lblNumRenewals);
        addRenewButton();
        


        getDialogPane().setContent(vbox);
        Image image = new Image(getClass().getResourceAsStream("/images/" + loan.getBook().getImageName()));
        ImageView image_book = new ImageView(image);
        getDialogPane().setGraphic(image_book);
        //getDialogPane().setHeader(image_book);

        getDialogPane().getButtonTypes().addAll(ButtonType.OK, ButtonType.CANCEL);
    }

    private void setDueDateRenewals() {
        lblDueDate.setText("Due: " + loan.getDueDate().toString());
        lblNumRenewals.setText("Number of Renewals Left: " + loan.getRenewCount());
    }
    private void addRenewButton() {
        if(loan.getRenewCount() > 0){
            renewButton = new Button("Renew Book");
            vbox.getChildren().add(renewButton);
            renewButton.setOnMouseClicked(new EventHandler<Event>() {

                @Override
                public void handle(Event event) {
                    loan.renew();
                    setDueDateRenewals();
                    renewButton.setDisable(loan.getRenewCount()<1);
                }
                
            });
        }
    }
    
}
