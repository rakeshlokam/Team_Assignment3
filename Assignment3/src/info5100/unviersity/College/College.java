/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.unviersity.College;

import info5100.university.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author Rakesh
 */
public class College {
    
    String clgName;
    ArrayList<Department> depts = new ArrayList<Department>();
    
    public College(String clg) {
       this.clgName = clg;
    }

    public ArrayList<Department> getDepts() {
        return depts;
    }
    
    public void addDepartment(Department dept) {
        this.depts.add(dept);
    }

    public String getClgName() {
        return clgName;
    }
    
    public Department findDept(String id) {
        for( Department dpt: depts) {
            if (dpt.getDeptName().equalsIgnoreCase(id)) return dpt;
        }
        return null;
    }
}
