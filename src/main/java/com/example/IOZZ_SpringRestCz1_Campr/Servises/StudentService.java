package com.example.IOZZ_SpringRestCz1_Campr.Servises;

import com.example.IOZZ_SpringRestCz1_Campr.DataModels.MainModels.Student;
import com.example.IOZZ_SpringRestCz1_Campr.DataModels.OperationsModels.NewStudent;
import io.vavr.collection.List;

public class StudentService {
    public static List<Student> students = List.empty();
    public Student getStudent(long id){
        for (Student student:students) {
            if(student.id == id)
                return student;
        }
        //return (Student)students.filter(x->x.id == id).get();
        return null;
    }
    public List<Student> getAllStudenst(){
        return students;
        //throw new UnsupportedOperationException();
    }
    public Student addStudent(NewStudent studentNew){
        long max;
        if(students.size() > 0)
        {
            max = students.get(0).id;
            for (Student studentSelected:students) {
                if(studentSelected.id > max)
                    max = studentSelected.id;
            }
        }
        else
            max = 0;
        Student student = new Student(max+1, studentNew.name, studentNew.number, studentNew.groupe);
        students = students.prepend(student);
        return student;
    }
    public Student deleteStudent(long id){
        Student student = getStudent(id);
        students.remove(student);
        return student;
    }
    public Student updateStudent(Student student){
        deleteStudent(student.id);
        students.prepend(student);
        return student;
    }
}
