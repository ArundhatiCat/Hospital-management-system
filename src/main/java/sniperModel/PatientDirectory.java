/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sniperModel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ganes
 */
public class PatientDirectory {
    
    Map<Integer,Patient> patDir =  new HashMap();
    
    public void displayPatientDir(){
        
        Set<Map.Entry<Integer,Patient>> patList = patDir.entrySet();
        
        for(Map.Entry<Integer,Patient> p : patList){
            System.out.println(p.getKey());
            Patient d = p.getValue();
            System.out.println(d.getPatientDetials());
        }
    }
    
    public void removeById(int id){
        Set<Map.Entry<Integer,Patient>> patList = patDir.entrySet();
        
        for(Map.Entry<Integer,Patient> p : patList){
            if(p.getKey() == id)
                this.patDir.remove(id);
        }
    }
          
    public boolean isEmpty(){
        return this.patDir.isEmpty();
    }
    
    public void addPatient(int id, Patient p){ 
        this.patDir.put(id, p);
    }

    public Map<Integer, Patient> getPatDir() {
        return this.patDir;
    }

    public void setPatDir(Map<Integer, Patient> patDir) {
        this.patDir = patDir;
    }
    
}
