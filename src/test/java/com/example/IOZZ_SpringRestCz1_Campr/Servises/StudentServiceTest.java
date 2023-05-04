package com.example.IOZZ_SpringRestCz1_Campr.Servises;

import com.example.IOZZ_SpringRestCz1_Campr.DataModels.MainModels.Student;
import com.example.IOZZ_SpringRestCz1_Campr.DataModels.OperationsModels.NewStudent;
import io.vavr.collection.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.util.AssertionErrors.assertNotNull;

class StudentServiceTest {
    @Test
    public void getEmptyList(){
        final StudentService service = new StudentService();
        List<Student> students = service.getAllStudenst();
        assertTrue(students.isEmpty());
    }
    @Test
    public void addUser(){
        final StudentService service = new StudentService();
        final Student created = service.addStudent(new NewStudent("Name1", "Number1", "Groupe1"));
        assertNotNull("",created);
    }
    @Test
    public void addStudentReturned(){
        final NewStudent newStudent = new NewStudent("NameTest1", "NumberTest1", "GroupeTest1");
        final StudentService service = new StudentService();
        final Student studentAdded = service.addStudent(newStudent);
        final Student studentSelect = service.getStudent(studentAdded.id);
        boolean everythingAllRigh = true;
        if(studentSelect.id != studentAdded.id ||
                !studentSelect.name.equals(studentAdded.name)  ||
                !studentSelect.number.equals(studentAdded.number) ||
                !studentSelect.groupe.equals(studentAdded.groupe))
            everythingAllRigh = false;
        assertTrue(everythingAllRigh);
    }
    @Test
    public void addStudentHasNewId(){
        final NewStudent newStudent1 = new NewStudent("Name1", "Number1", "Groupe1");
        final StudentService service = new StudentService();
        assertTrue(service.addStudent(newStudent1).id != service.addStudent(newStudent1).id);
    }
}