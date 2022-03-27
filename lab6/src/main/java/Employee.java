/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Griffin
 */

public class Employee{
    private String employeeName;
    private int idNumber;
    private String employeeDept;
    private String employeePos;
    
    public Employee(String name, int id, String dept, String pos){
        employeeName = name;
        idNumber = id;
        employeeDept = dept;
        employeePos = pos;
    }
    public Employee(String name, int id){
        employeeName = name;
        idNumber = id;
        employeeDept = "";
        employeePos = "";
    }
    public Employee(){
        employeeName = "";
        idNumber = 0;
        employeeDept = "";
        employeePos = "";
    }
    public String getName(){
        return employeeName;
    }
    public int getID(){
        return idNumber;
    }
    public String getDept(){
        return employeeDept;
    }
    public String getPos(){
        return employeePos;
    }
    public void setName(String newName){
        employeeName = newName;
    }
    public void setID(int newID){
        idNumber = newID;
    }
    public void setDept(String newDept){
        employeeDept = newDept;
    }
    public void setPos(String newPos){
        employeePos = newPos;
    }
}
