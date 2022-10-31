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
public class PersonDirectory {
    
    Map<Integer,Person> pDir = new HashMap();
    
    public boolean ifIdExists(int i){
        Set<Map.Entry<Integer,Person>> pList = pDir.entrySet();
        
        for(Map.Entry<Integer,Person> doc : pList){
          int id=doc.getKey();
          if(id==i)
              return true;
        }
        return false;
    }
    
    public void displayPersonDir(){
        
        Set<Map.Entry<Integer,Person>> pList = pDir.entrySet();
        
        for(Map.Entry<Integer,Person> doc : pList){
            System.out.println(doc.getKey());
            Person d = doc.getValue();
            System.out.println(d.getPersonDetails());
        }
    }
    
    public int getPersonId(String un){
        Set<Map.Entry<Integer,Person>> pList = pDir.entrySet();
        
        for(Map.Entry<Integer,Person> doc : pList){
            Person d = doc.getValue();
            if(d.getUserName().equals(un))
                return d.getPid();
        }
        return -1;
    }
    
    public Person getPersonByUserName(String un){
        Person pt = new Person();
        Set<Map.Entry<Integer,Person>> pList = pDir.entrySet();
        
        for(Map.Entry<Integer,Person> p : pList){
            Person d = p.getValue();
            if( d.getUserName().equals(un))
                pt = d;
        }
        return pt;
    }
    
    public boolean checkPassword(String un, String pass){
        Set<Map.Entry<Integer,Person>> pList = pDir.entrySet();
        
        for(Map.Entry<Integer,Person> doc : pList){            
            Person d = doc.getValue();
            String u = d.getUserName();
            String p = d.getPassword();
            if(un.equals(u) && pass.equals(p))
                return true;
        }
        return false;
    }
    
    public void addPerson(int id, Person p){
        this.pDir.put(id, p);
    }
    
    public Person getPerson(int id){
        return this.pDir.get(id);
    }
    
    public void mergeMap(Map<Integer,Person> p){
        this.pDir.putAll(p);
    }
    
    public boolean isEmpty(){
        return this.pDir.isEmpty();
    }

    public Map<Integer, Person> getpDir() {
        return pDir;
    }

    public void setpDir(Map<Integer, Person> pDir) {
        this.pDir = pDir;
    }   
    
}
