/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sniperModel;

/**
 *
 * @author ganes
 */
public class Person {
    
    private int pid;
    private String fName;
    private String lName;
    private String pmail;
    private String pmob;
    private String house;
    private String city;
    private String com;
    private String userName;
    private String password;
    private final String userrole = "Pateint";
    
    public String getPersonDetails(){
        return pid+","+fName+","+lName+","+pmail+","+pmob+","+house+","+city+","+com;
    }

    public String getUserrole() {
        return userrole;
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

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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

    public String getPmail() {
        return pmail;
    }

    public void setPmail(String pmail) {
        this.pmail = pmail;
    }

    public String getPmob() {
        return pmob;
    }

    public void setPmob(String pmob) {
        this.pmob = pmob;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
    
}
