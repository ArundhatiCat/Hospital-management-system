/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sniperModel;

import java.util.ArrayList;

/**
 *
 * @author ganes
 */
public class Encounter {
    
    private int encounterID;
    private int patientID;
    private ArrayList<VitalSigns> vitalSignList =  new ArrayList();
    
    public String displayEncoutner(){
        return encounterID+","+patientID+","+vitalSignList.size();
    }
    
    public void addVital(VitalSigns v){
        this.vitalSignList.add(v);
    }

    public int getEncounterID() {
        return encounterID;
    }

    public void setEncounterID(int encounterID) {
        this.encounterID = encounterID;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public ArrayList<VitalSigns> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSigns> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
}
