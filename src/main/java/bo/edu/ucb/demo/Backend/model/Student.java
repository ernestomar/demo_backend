package bo.edu.ucb.demo.Backend.model;

import javax.persistence.*;


@Entity
public class Student {
    @Id
    @Column(name = "student_id")
    @Basic(optional = false)
    private Integer studentId;
    @Column(name = "full_name")
    @Basic(optional = false)
    private String fullName;

    public Student(){

    }

    public Student(Integer studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    public Integer getStudentId() {return studentId;}

    public String getFullName() {return fullName;}

    public void setStudentId(Integer studentId) {this.studentId = studentId;}

    public void setFullName(String fullName) {this.fullName = fullName;}

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
