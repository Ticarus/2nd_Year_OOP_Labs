package com.mycompany.lab1;

public class Lab2 {

    public static void main(String[] args) {
        ex3();
    }
    
//-------------------------------------------------------------------------------------------------- 
    
    public static void ex1(){
        int[] list1 = {-2, 5, 9};
        int[] list2 = {-5, 9, 14, -1};
        int[] list3 = combineArrays(list1, list2);
        System.out.println("The elements of the new array : ");
        for(int i = 0 ; i < list3.length ; i++){
            System.out.println(list3[i] + " ");
        }
    }
    
    public static int[] combineArrays(int[] A1, int[] A2){
        int[] res = new int[A1.length + A2.length];
        int j = 0;
        for(int i = 0 ; i < A1.length ; i++){
            res[j] = A1[i];
            j++;
        }
        for(int i = 0 ; i < A2.length ; i++){
            res[j] = A2[i];
            j++;
        }
        return res;
    } 

//-------------------------------------------------------------------------------------------------- 
    
    public static void ex2(){
        Student student = new Student();
        student.setName("Ayla");
        student.setAge(15);
        student.setIsJunior(true);
        student.setGender('f');
        student.info();
    }
    
//-------------------------------------------------------------------------------------------------- 

    public static void ex3(){
        BankAccount account = new BankAccount();
        account.owner = "Ali Veli";
        account.balance = 1000;
        account.aType = 1;
        account.info();
        account.addMoney(500);
        account.info();
        account.addMoney(-1500);
        account.info();
    }
}
