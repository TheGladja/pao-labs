package com.company.classes;

public class Subject {
    private Room room;
    private int noOfStudents;
    private Person teacher;

    public Subject(){}
    public Subject(Room room, int noOfStudents, Person teacher){
        this.room = room;
        this.noOfStudents = noOfStudents;
        this.teacher = teacher;
    }

    public Room getRoom(){
        return room;
    }

    public void setRoom(Room room){
        this.room = room;
    }

    public int getNoOfStudents(){
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents){
        this.noOfStudents = noOfStudents;
    }

    public Person getTeacher(){
        return teacher;
    }

    public void setTeacher(Person teacher){
        this.teacher = teacher;
    }

    public static void main(String[] args) {
        Room room = new Room(199, "asa", 898);
        Person teacher = new Person("a", "a", "a", 13, 1234141);
        Subject subject = new Subject(room, 5, teacher);

        System.out.println(subject.getRoom().getNumber());
    }
}
