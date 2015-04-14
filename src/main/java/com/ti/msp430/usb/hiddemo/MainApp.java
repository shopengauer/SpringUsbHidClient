/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.msp430.usb.hiddemo;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.ti.msp430.usb.hiddemo.management.HidCommunicationManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author Vasiliy
 */
public class MainApp extends Application{

    
    public static void main(String[] args) {
        launch(args);
    }
    
    
    @Override
    public void start(Stage primaryStage) throws Exception {
//       
       //  System.out.println(System.getProperty("java.library.path"));
        
//System.out.println(System.getProperty("user.dir"));
 //System.setProperty("java.library.path", System.getProperty("user.dir"));
      
 
 //HidCommunicationManager hid = new HidCommunicationManager();
 //hid.getInterfacesForVidPid(0x2047, 0x0301);
    //    System.out.println("Helle=o");
        ApplicationContext context
            = new AnnotationConfigApplicationContext(UsbHidClientSpringConfiguration.class);
 
     FXMLController fxmlController = (FXMLController)context.getBean(FXMLController.class);
    Scene scene = new Scene((Parent)fxmlController.getView(), 1000, 700);
   // fxmlController.getStartButton().setText("Hello wasya");
    scene.getStylesheets().add("/styles/fxmlschema.css");
    primaryStage.setScene(scene);
    primaryStage.setTitle("USB HID Client");
    primaryStage.show();
    }
    
}
