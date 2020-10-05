package bo.edu.ucb.demo.Backend.api;


import bo.edu.ucb.demo.Backend.bl.AgendaBl;
import bo.edu.ucb.demo.Backend.bl.StudentBl;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v2/student")
public class StudentApi {
    private StudentBl studentBl;

    @Autowired
    public StudentApi(StudentBl studentBl) {
        this.studentBl = studentBl;
    }


    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student create(@RequestBody Student student) {
        return studentBl.createStudent(student);
    }


    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student select(@RequestParam Integer studentId) {
        return studentBl.findStudentByPk(studentId);
    }


    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student update(@RequestBody Student student) {
        return studentBl.updateStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void delete(@RequestParam Integer studentId) {
        studentBl.deleteStudent(studentId);
    }




}
