package edu.web;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by R.Karimov on 11/15/17.
 */
public class Repeat extends SimpleTagSupport{
    private int repeat;

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    @Override
    public void doTag() throws JspException, IOException {
        for (int i = 0; i < repeat; i++) {
            getJspBody().invoke(null);
        }
    }
}
