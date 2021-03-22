/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.unviersity.Employment;

import java.util.ArrayList;

/**
 *
 * @author rak
 */
public class EmploymentHistroy {
    
    ArrayList<Employment> employments;
    
    public EmploymentHistroy(){
        employments = new ArrayList();
    }
    
    
//    public Employment newEmployment(String job){
//        Employment ne = new Employment(job);
//        employments.add(ne);
//        return ne;
//    }

    public ArrayList<Employment> getEmployments() {
        return employments;
    }

    public void addEmployments(Employment e) {
        employments.add(e);
    }
    
}
