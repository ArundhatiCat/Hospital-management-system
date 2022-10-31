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
 * @author Sniper
 */
public class DoctorDirectory {
    
    Map<Integer,Doctor> dDir = new HashMap();
    
    public boolean ifIdExists(int i){
        Set<Map.Entry<Integer,Doctor>> pList = dDir.entrySet();
        
        for(Map.Entry<Integer,Doctor> doc : pList){
          int id=doc.getKey();
          if(id==i)
              return true;
        }
        return false;
    }
    
    
    public void displayDoctorDir(){
        
        Set<Map.Entry<Integer,Doctor>> dList = dDir.entrySet();
        
        for(Map.Entry<Integer,Doctor> doc : dList){
            System.out.println(doc.getKey());
            Doctor d = doc.getValue();
            System.out.println(d.getDoctorDetials());
        }
    }
    
    public String getHospitalName(String un){
        String hn = null;
        Set<Map.Entry<Integer,Doctor>> dList = dDir.entrySet();
        
        for(Map.Entry<Integer,Doctor> doc : dList){
            Doctor d = doc.getValue();
            if(d.getUserName().equals(un))
                return d.getHospital();
        }
        return hn;
    }
    
    public boolean checkPassword(String un, String pass){
        Set<Map.Entry<Integer,Doctor>> dList = dDir.entrySet();
        for(Map.Entry<Integer,Doctor> doc : dList){
            Doctor d = doc.getValue();
            String n = d.getUserName();
            String p = d.getPassword();
            if( un.equals(n) && pass.equals(p))
                return true;
        }
        return false;
    }
    
    public void mergeMap(Map<Integer, Doctor> m){
        this.dDir.putAll(m);
    }
    
    public boolean isEmpty(){
        return dDir.isEmpty();
    }
    
    
    public void addDoctor(Integer i, Doctor d){
        this.dDir.put(i, d);
    }

    public Map<Integer, Doctor> getDdir() {
        return dDir;
    }

    public void setDdir(Map<Integer, Doctor> ddir) {
        this.dDir = ddir;
    }
    
}
