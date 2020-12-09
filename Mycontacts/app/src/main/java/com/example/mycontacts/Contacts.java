package com.example.mycontacts;

public class Contacts {
    private int id;
    private String Name;
    private String LastName;

     public Contacts(int id,String Name,String LastName){
         this. id=id;
         this.Name=Name;
         this.LastName=LastName;

     }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
