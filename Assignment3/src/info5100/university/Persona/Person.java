/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.Persona;

/**
 *
 * @author rak
 */
public class Person {
    String id;
    String name;
    String gender;
    
    public Person (String id){ 
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getPersonId(){
        return id;
    }
    
    public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
    
}
