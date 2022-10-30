/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sniperModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ganes
 */
public class HospitalDirectory {
    
    Map<String,Hospital> hDir = new HashMap();
    
    public void displayHospitalDir(){
        
        Set<Map.Entry<String,Hospital>> hList = hDir.entrySet();
        
        for(Map.Entry<String,Hospital> doc : hList){
            System.out.println(doc.getKey());
            Hospital d = doc.getValue();
            System.out.println(d.getHospitalDetails());
        }
    }    
    
    public ArrayList<String> getHospitalList(){
        ArrayList<String> hosName = new ArrayList();
        
        Set<Map.Entry<String,Hospital>> hList = hDir.entrySet();
        
        for(Map.Entry<String,Hospital> h : hList){
            hosName.add(h.getValue().getName());
        }
        return hosName;
    }
    
    public ArrayList<String> getHospitalNamesByCity( String c){
        ArrayList<String> hosName = new ArrayList();
        
        Set<Map.Entry<String,Hospital>> hList = hDir.entrySet();
        
        for(Map.Entry<String,Hospital> h : hList){
            if(h.getValue().getCity().equalsIgnoreCase(c)){
                hosName.add(h.getValue().getName());
            }
        }
        return hosName;
    }
    
    public ArrayList<String> getHospitalNamesByCommunity( String c){
        ArrayList<String> hosName = new ArrayList();
        
        Set<Map.Entry<String,Hospital>> hList = hDir.entrySet();
        
        for(Map.Entry<String,Hospital> h : hList){
            if(h.getValue().getCom().equalsIgnoreCase(c)){
                hosName.add(h.getValue().getName());
            }
        }
        return hosName;
    }
    
    public int size(){
        return this.hDir.size();
    }
    
    public boolean isEmpty(){
        return this.hDir.isEmpty();
    }
    
    public void mergeMap(Map<String,Hospital> h){
        this.hDir.putAll(h);
    }

    public Map<String, Hospital> getHdir() {
        return hDir;
    }

    public void setHdir(Map<String, Hospital> hdir) {
        this.hDir = hdir;
    }
    public void saveDeleted(Map<String,Hospital> h){
        this.hDir= h;
    }
    
}
