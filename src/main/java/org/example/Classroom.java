package org.example;

enum classroomType{
    MORNING, EVENING
}

public class Classroom {
    public String courseName;
    public int grade;
    public String address;
    public String email;

    public String phone;
    public classroomType type;

    public String setCourseName(String  newCourseName){
        this.courseName = newCourseName;
        return this.courseName;
    }

    public int setGrade(int newGrade){
        this.grade = newGrade;
        return this.grade;
    }

    public String setAddress(String newAddress){
        this.address = newAddress;
        return this.address;
    }

    public String setEmail(String newEmail){
        this.email = newEmail;
        return this.email;
    }
    public String setPhoneNumber(String newPhone){
        this.phone = newPhone;
        return this.phone;
    }

    public classroomType setClassoomType (classroomType newtype){
        this.type = newtype;
        return this.type;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public int getGrade(){
        return this.grade;
    }

    public String getAddress(){
        return this.address;
    }

    public String getEmail(){
        return this.email;
    }
    public String getPhoneNumber(){
        return this.phone;
    }

    public String getClassroomType(){
        return switch (this.type) {
            case MORNING -> "MORNING";
            case EVENING -> "EVENING";
        };
    }
}