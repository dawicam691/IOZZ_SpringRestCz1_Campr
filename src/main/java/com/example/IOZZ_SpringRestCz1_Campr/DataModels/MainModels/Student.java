package com.example.IOZZ_SpringRestCz1_Campr.DataModels.MainModels;

public class Student {
    public final long id;
    public final String name;
    public final String number;
    public final String groupe;

    public Student(long id, String name, String number, String groupe) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.groupe = groupe;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student){
            Student student = (Student)obj;
            if(student.id == this.id && student.name.equals(this.name) && student.number.equals(this.number) && student.groupe.equals(this.groupe))
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
        int idHashNumber = 21;
        int nameHashNumber = 6;
        int numberHashNumber = 8;
        int groupeHashNumber = 12;
        return hashNumber * ((int)id * idHashNumber +
                name.hashCode() * nameHashNumber +
                number.hashCode() * numberHashNumber +
                groupe.hashCode() * groupeHashNumber);
    }
}
