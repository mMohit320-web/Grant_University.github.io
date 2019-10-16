/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author THis PC
 */
@Named(value = "courseDetailsBean")
@RequestScoped
public class CourseDetailsBean {
private String CourseName;
private HtmlOutputText CourseId,CourseDuration,CourseEligibility,CourseFee;
public void courseDetailsAction(ValueChangeEvent vce){
    String id=vce.getNewValue().toString();
    String cId="",cDuration="",cEligibility="",cFee="";
    if(id.compareTo("Science")==0){
        cId="A-101";
        cDuration="4 Years";
        cEligibility="70% in High School";
        cFee="$ 5000 p.a";
    }
    else if(id.compareTo("Medical")==0){
                cId="A-105";
        cDuration="5 Years";
        cEligibility="60% in High School";
        cFee="$ 7000 p.a";
    }
    else if(id.compareTo("Law")==0){
                cId="A-115";
        cDuration="2 Years";
        cEligibility="50% in High School";
        cFee="$ 5000 p.a";
    }
    else if(id.compareTo("Management")==0){
                cId="A-110";
        cDuration="6 Years";
        cEligibility="65% in High School";
        cFee="$ 7500 p.a";
    }
    getCourseId().setValue(cId);
    getCourseDuration().setValue(cDuration);
    getCourseEligibility().setValue(cEligibility);
    getCourseFee().setValue(cFee);
}
    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public HtmlOutputText getCourseId() {
        return CourseId;
    }

    public void setCourseId(HtmlOutputText CourseId) {
        this.CourseId = CourseId;
    }

    public HtmlOutputText getCourseDuration() {
        return CourseDuration;
    }

    public void setCourseDuration(HtmlOutputText CourseDuration) {
        this.CourseDuration = CourseDuration;
    }

    public HtmlOutputText getCourseEligibility() {
        return CourseEligibility;
    }

    public void setCourseEligibility(HtmlOutputText CourseEligibility) {
        this.CourseEligibility = CourseEligibility;
    }

    public HtmlOutputText getCourseFee() {
        return CourseFee;
    }

    public void setCourseFee(HtmlOutputText CourseFee) {
        this.CourseFee = CourseFee;
    }
    /**
     * Creates a new instance of CourseDetailsBean
     */
    public CourseDetailsBean() {
    }
    
}
