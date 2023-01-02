package com.mycompany.lab12;

public class GrandStudent extends Student{
    private Faculty advisor;
    
    public GrandStudent(String name, int age, String department){
        super(name, age, department);
        advisor = null;
    }
    
    public Faculty getAdvisor(){
        return advisor;
    }
    
    public void setAdvisor(Faculty advisor){
        this.advisor = advisor;
    }
    
    public String toString(){
        String str = super.toString();
        if(advisor != null){
            str += "\nAdvisor : " + advisor.toString();
        }
        return str;
    }
    
    public boolean equals(Object obj){
        if((obj instanceof GrandStudent) == false){
            return false;
        }
        
        GrandStudent other = (GrandStudent) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.department.equals(other.getDepartment()) && this.advisor.equals(other.getAdvisor());
    }
}
