/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;

/**
 *
 * @author THis PC
 */
@Named(value = "registrationForm")
@RequestScoped
public class RegistrationForm implements Serializable {
 public static DatabaseOperations dbobj;
private String firstName,lastName,gender,address,contactno,emailid,userid,password,confirmPassword;
 public  RegistrationForm(String contactno) {
          this.contactno=contactno;
        }
    public RegistrationForm(String firstName, String lastName, String gender, String address, String contactno, String emailid, String userid, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.contactno = contactno;
        this.emailid = emailid;
        this.userid = userid;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    public void validateFirstName(FacesContext fc,UIComponent c,Object values) throws ValidatorException{
        if(((String)values).contains("!") || ((String)values).contains("@") ||((String)values).contains("#") ||((String)values).contains("$") ||((String)values).contains("%") ||((String)values).contains("^") ||((String)values).contains("&") ||((String)values).contains("(") ||((String)values).contains(")")) throw new ValidatorException(new FacesMessage("Name can not contain special character"));
    }

    /**
     * Creates a new instance of RegistrationForm
     */
    public RegistrationForm() {
    }
      
public void addDetails(){
    dbobj=new DatabaseOperations();
    dbobj.addData(this);
}    
}
