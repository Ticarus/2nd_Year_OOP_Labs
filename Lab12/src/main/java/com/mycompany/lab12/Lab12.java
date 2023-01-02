package com.mycompany.lab12;

import java.util.ArrayList;

public class Lab12 {

    public static void main(String[] args) {
       ex2();
    }
    
    public static void ex1(){
        Person person = new Person("Ali", 25);
        Student student = new Student("Ayşe", 23, "CS");
        Employee employee = new Employee("Ahmet", 30);
        Faculty faculty = new Faculty("Fatma", 28);
        Staff staff = new Staff("Mehmet", 26);
        GrandStudent gStudent = new GrandStudent("Berke", 24, "CE");
        
        System.out.println(person);
        System.out.println(student);
        System.out.println(employee);
        System.out.println(faculty);
        System.out.println(staff);
        System.out.println(gStudent);
        System.out.println("\n");
        
        boolean eq;
        
        //Create another Person object which has same properties with 'person'
        Person person2 = new Person("Ali", 25);
        //Print properties of person and person2 and see they have same properties 
        System.out.println("person : " + person);
        System.out.println("person : " + person2);
        
        eq = person == person2;
        //See that they seem NOT equal, but their properties are same (their names 'Ali' and ages '25')?
        System.out.println("person == person2 ? ==> " + eq);
        
        eq = person.equals(person2);
        System.out.println("person == person2 ? ==> " + eq);
        System.out.println("\n");
        
        Student student2 = new Student("Emre", 25, "CE");
        Faculty faculty2 = new Faculty("Emre", 25);
        faculty2.setDepartment("CE");
        //Now, print properties of 'student2' and 'faculty2' and see that they have same properties 
        System.out.println("student2 : " + student2);
        System.out.println("faculty2 : " + faculty2);
        
        eq = student.equals(faculty2); //They are different typed objects, the result will be always false!
        System.out.println("student2 equals faculty2 ? ==> " + eq);
    }
    
    public static void ex2(){
        String[] f_players = {"Nesta", "Zambrotta", "Gattuso"};
        FootballTeam f = new FootballTeam("Milan", 50, f_players, "Serie A");
        
        String[] f_players1 = {"Buffon", "Luca Toni", "Krasic"};
        FootballTeam ff = new FootballTeam("Milan", 60, f_players1, "Serie A");
        
        System.out.println("Are Scores same?: " + f.equals(ff));
        System.out.println("Compare scores: " + ff.compareScore(f));
        
        String[] b_players = {"Dogus", "Ogulcan", "Samet"};
        BasketballTeam b = new BasketballTeam("Efes", 50, b_players, 2.10);
        
        String[] b_players1 = {"Ahmet", "Barıs", "Melih"};
        BasketballTeam bb = new BasketballTeam("Efes", 50, b_players1, 2.12);
        
        System.out.println("Do they have the same name?: " + b.equals(bb));
        
        ArrayList<SportTeam> s1 = new ArrayList<SportTeam>();
        
        for(int i = 0 ; i < 5 ; i++){
            int r = (int) (Math.random() * 2);
            if(r == 0){
                FootballTeam x = new FootballTeam(null, r, f_players, null);
                s1.add(x);
            }
            else{
                BasketballTeam y = new BasketballTeam(null, r, b_players, r);
                s1.add(y);
            }
        }
        
        System.out.println(s1.get(2).toString() );
    }
}
