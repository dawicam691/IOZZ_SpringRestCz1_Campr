package com.example.IOZZ_SpringRestCz1_Campr.DataModels.OperationsModels;

public class NewStudent {
    public final String name;
    public final String number;
    public final String groupe;

    public NewStudent(String name, String number, String groupe) {
        this.name = name;
        this.number = number;
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return name + ", " + number + ", " + groupe;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof NewStudent){
            NewStudent newStudent = (NewStudent)obj;
            if(newStudent.name.equals(this.name) && newStudent.groupe.equals(this.groupe) && newStudent.number.equals(this.number))
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public int hashCode() {
        int hashNumber = 17;
        int nameHashNumber = 6;
        int numberHashNumber = 8;
        int groupeHashNumber = 12;
        return hashNumber * (name.hashCode() * nameHashNumber +
                number.hashCode() * numberHashNumber +
                groupe.hashCode() * groupeHashNumber);
    }
}
