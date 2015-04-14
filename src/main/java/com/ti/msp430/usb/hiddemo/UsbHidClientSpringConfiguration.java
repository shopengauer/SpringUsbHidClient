/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.msp430.usb.hiddemo;

import java.io.IOException;
import java.io.InputStream;
import javafx.fxml.FXMLLoader;
import com.ti.msp430.usb.hiddemo.management.HidCommunicationManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Vasiliy
 */
@Configuration
@ComponentScan
public class UsbHidClientSpringConfiguration {
    
    
//    @Bean
//    public HidCommunicationManager getHidCommunicationManager(){
//        return new HidCommunicationManager();
//    }
            
     @Bean
    public FXMLController sampleController() throws IOException
    {
        return (FXMLController) loadController("/fxml/FXMLSchema.fxml");
    }
 
    protected Object loadController(String url) throws IOException
    {
        try
        (InputStream fxmlStream = getClass().getResourceAsStream(url)) {
            FXMLLoader loader = new FXMLLoader();
            loader.load(fxmlStream);
            return loader.getController();
        }
    }
    
    
    
}
