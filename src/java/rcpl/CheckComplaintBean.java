/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author lenovo
 */
public class CheckComplaintBean extends org.apache.struts.action.ActionForm {
    
    private String coid;

    /**
     * @return the coid
     */
    public String getCoid() {
        return coid;
    }

    /**
     * @param coid the coid to set
     */
    public void setCoid(String coid) {
        this.coid = coid;
    }
    
    
}
