package com.example.SpringbootCrudApplication.Service;

import com.example.SpringbootCrudApplication.Entity.Student;
import com.example.SpringbootCrudApplication.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {

        this.studentRepository = studentRepository;
    }

    public Student addNewStudent(Student studentreq){

        Student newStudent = studentRepository.save(studentreq);
        return newStudent;

    }


    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        if(students.isEmpty()){
            return null;
        }
        return students;
    }

    public Student getStudentById(Long id) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()){
            return student.get();
        }
        return null;
    }

    public Student updateStudent(Long id, Student student) {
        Optional<Student> existingStudent = studentRepository.findById(id);

        if(existingStudent.isEmpty()){
            return null;
        }

        Student studentToSave = existingStudent.get();
        studentToSave.setName(student.getName());
        studentToSave.setAge(student.getAge());
        studentToSave.setRollNo(student.getRollNo());
        studentToSave.setSubject(student.getSubject());
        return studentRepository.save(studentToSave);
    }

    public boolean deleteStudentById(Long id) {
        boolean isStudentExist = studentRepository.existsById(id);

        if(!isStudentExist){
            return false;
        }

        studentRepository.deleteById(id);

        return true;

    }
}
