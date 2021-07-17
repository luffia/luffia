package com.zixue.abstract_;

public class Abstract01 {
    public static void main(String[] args) {

    }
}
 abstract  class Employee {
     public String name;
     private double salary;
     private int id;


     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public double getSalary() {
         return salary;
     }

     public void setSalary(double salary) {
         this.salary = salary;
     }

     public int getId() {
         return id;
     }

     public void setId(int id) {
         this.id = id;
     }
 }
