package de.sofiworx.jsfbeanvalidation.user.controller;

import de.sofiworx.jsfbeanvalidation.user.entity.User;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * @author Ulrich Cech
 */
@ViewScoped
@Named
public class UserController implements Serializable {

    private transient User user;


    @PostConstruct
    private void init() {
        user = new User();
    }


    public User getUser() {
        return user;
    }

    public String save() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Saved successful", "Saved successful"));
        return null;
    }
}
