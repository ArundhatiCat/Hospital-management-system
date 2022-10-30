/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sniperModel;

/**
 *
 * @author ganes
 */
public class Patient {
    
    private int id;
    private Person per;
    private int age;
    private int height;
    private double weight;
    private String date; 
    private String hospital;
    
    public String getPatientDetials(){
        return id+","+per.getfName()+" "+per.getlName()+","+age+","+height+","+weight+","+date+","+hospital;
    }
    
    public String getPersonName(){
        return per.getfName()+" "+per.getlName();
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }  
    
}
