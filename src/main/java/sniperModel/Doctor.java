/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sniperModel;

/**
 *
 * @author Sniper
 */
public class Doctor {
    
    private int docId;
    private String fName;
    private String lName;
    private String dmail;
    private String dmob;
    private String hospital;
    private String userName;
    private String password;
    private final String userRole = "Doctor";

    public String getUserRole() {
        return userRole;
    }
    
    public String getDoctorDetials(){
        return docId+","+fName+","+lName+","+dmail+","+dmob+","+hospital;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getDocID() {
        return docId;
    }

    public void setDocID(int docID) {
        this.docId = docID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDmail() {
        return dmail;
    }

    public void setDmail(String dmail) {
        this.dmail = dmail;
    }

    public String getDmobile() {
        return dmob;
    }

    public void setDmobile(String dmobile) {
        this.dmob = dmobile;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
}
