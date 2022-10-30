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
public class EncounterDirectory {
    
    ArrayList<Encounter> patientHistory = new ArrayList();
    
    public Encounter getEncounter(int patid){
        Encounter en = new Encounter();
        for(Encounter e : this.patientHistory){
            if(e.getPatientID() == patid)
                en = e;
        }
        return en;
    }
    
    public void addEncounter(Encounter e){
        this.patientHistory.add(e);
    }
    
    public boolean removeEncounter(Encounter e){
        return this.patientHistory.remove(e);
    }
    
    public boolean isEmpty(){
        return this.patientHistory.isEmpty();
    }
    
    public int size(){
        return this.patientHistory.size();
    }
    
    public ArrayList<Encounter> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Encounter> patientHistory) {
        this.patientHistory = patientHistory;
    }
    
}
