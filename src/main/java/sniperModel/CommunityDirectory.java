/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sniperModel;

import java.util.ArrayList;

/**
 *
 * @author Sniper
 */
public class CommunityDirectory {
    
    ArrayList<Community> comList = new ArrayList();
    
    public void displayCommunityDirectory(){
        for(Community c:comList ){
            System.out.println(c.getCommunityDetails());
        }
    }
    
    public ArrayList<String> getCityList(){
        ArrayList<String> c = new ArrayList();
        for(Community com : this.comList){
            if(!c.contains(com.getCity()))
                c.add(com.getCity());
        }
        return c;
    }
    
    public ArrayList<String> getComList(String city){
        ArrayList<String> c = new ArrayList();
        for(Community com : this.comList){
            if(!c.contains(com.getCom())){    
                if(com.getCity().equalsIgnoreCase(city))
                    c.add(com.getCom());
            }
        }
        return c;
    }
    
    public boolean isEmpty(){
        return this.comList.isEmpty();
    }

    public ArrayList<Community> getComList() {
        return comList;
    }

    public void setComList(ArrayList<Community> comList) {
        this.comList = comList;
    }
    
}
