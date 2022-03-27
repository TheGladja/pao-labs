package com.company.classes;

public class Person {
    private String name, surname,type;
    private int age;
    private long identity_number;

    public Person(){}
    public Person(String name, String surname, String type, int age, long identity_number){
        this.name = name;
        this.surname = surname;
        this.type = type;
        this.age = age;
        this.identity_number = identity_number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public long getIdentity_number(){
        return identity_number;
    }

    public void setIdentity_number(long identity_number) {
        this.identity_number = identity_number;
    }

    public static void main(String[] args) {
        Person person1 = new Person("a", "a", "a", 1, 1);
        Person person2 = new Person("b", "b", "b", 2, 2);

        System.out.println(person1.getAge() + " " + person1.getName());
        System.out.println(person2.getAge() + " " + person2.getName());
    }
}
