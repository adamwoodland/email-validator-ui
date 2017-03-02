package com.example.email_validator_ui.email_validator_ui;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.event.MouseEvents.ClickEvent;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        final VerticalLayout layout = new VerticalLayout();
        
        //textfield for typing in email address
        final TextField email = new TextField();
        email.setCaption("Type your email address here:");
        Validator check = new Validator();

        //click submit when done entering email
        Button button = new Button("Submit");
        //within the addClickListener method is an if/else which calls the validate method in Validator.java
        button.addClickListener(e -> {
        	if (check.validate(email.getValue()))
        		layout.addComponent(new Label("This is a valid email address."));
        	else
        		layout.addComponent(new Label("Sorry! This is not a valid email address."));
        });
        
        //add textfield and button
        layout.addComponents(email, button);
        layout.setMargin(true);
        layout.setSpacing(true);
        
        setContent(layout);
    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    	
    }
}