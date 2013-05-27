package org.primefaces.cookbook.controller.chapter3;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * User: mertcaliskan Date: 6/30/12
 */
@ManagedBean
@ViewScoped
public class EditorController implements Serializable {

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}