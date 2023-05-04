package com.example.IOZZ_SpringRestCz1_Campr.Contrallers;

import com.example.IOZZ_SpringRestCz1_Campr.DataModels.MainModels.Student;
import com.example.IOZZ_SpringRestCz1_Campr.DataModels.OperationsModels.NewStudent;
import com.example.IOZZ_SpringRestCz1_Campr.Servises.StudentService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    StudentService service = new StudentService();
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Student> getStudent(){
        return service.getAllStudenst().asJava();
    }
    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public void addStudent(@RequestBody NewStudent newStudent){
        service.addStudent(newStudent);
    }
    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public void deleteStudent(@RequestBody long id){
        service.deleteStudent(id);
    }
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

    public void updateStudent(@RequestBody Student student){
        service.updateStudent(student);
    }
}
