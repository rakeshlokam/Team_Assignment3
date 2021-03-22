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
public class Employment {
    
    private String name;
    private String address;
    private double startSalary;
    private double currentSalary;

    public Employment(String name, String address, double startSalary, double currentSalary) {
        this.name = name;
        this.address = address;
        this.startSalary = startSalary;
        this.currentSalary = currentSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(Double startSalary) {
        this.startSalary = startSalary;
    }

    public Double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Double currentSalary) {
        this.currentSalary = currentSalary;
    }
    
    
}
