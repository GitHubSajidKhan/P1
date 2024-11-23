package com.IT.P1.Service;

import com.IT.P1.Entity.Student;
import com.IT.P1.Exception.ResourceNotFound;
import com.IT.P1.Repository.StudentRepository;
import com.IT.P1.StudentDto.StudentDto;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.PublicKey;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

//    private  StudentRepository studentRepository;
//
//    public StudentService(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    public void addStudent(Student student) {
//        studentRepository.save(student);
//    }
//
//    public void deleteStudent(Long id) {
//        studentRepository.deleteById(id);
//    }
//
//    public void updateStudent(Long id, StudentDto dto) {
//
//        Optional<Student>opStu = studentRepository.findById(id);
//        Student student = opStu.get();
//
//        student.setName(dto.getName());
//        student.setStu_class(dto.getStu_class());
//        student.setMobile(dto.getMobile());
//        studentRepository.save(student);
//
//    }
//
//
//    public Student getStudentById(Long id) {
//
//    Optional<Student>opStu = studentRepository.findById(id);
//    Student student = opStu.get();
//    return  student ;
//
//    }


//=========================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Entity Class ?
//======================================

//    private StudentRepository studentRepository ;
//
//    public StudentService(StudentRepository studentRepository)
//    {
//        this.studentRepository = studentRepository ;
//    }


//    public void addStudent(Student student)
//    {
//        studentRepository.save(student);
//    }


//    public void deleteStudent(Long id)
//    {
//        studentRepository.deleteById(id);
//    }


//    public void updateStudent(Long id , StudentDto dto)
//    {
//        Optional<Student> opStu = studentRepository.findById(id);
//        Student student = opStu.get();
//
//        student.setName(dto.getName());
//        student.setStu_class(dto.getStu_class());
//        student.setMobile(dto.getMobile());
//
//        studentRepository.save(student);
//    }


//    public  Student getStudent(Long id)
//    {
//        return studentRepository.findById(id).orElse(null);
//    }


//    public List<Student> getAllStudent()
//    {
//        return studentRepository.findAll();
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Entity Class ?
//======================================


//    private StudentRepository studentRepository ;
//
//    public StudentService(StudentRepository studentRepository)
//    {
//        this.studentRepository = studentRepository ;
//    }


//    public Student addStudent(Student student)
//    {
//        return studentRepository.save(student);
//    }


//    public void deleteStudent(Long id)
//    {
//        studentRepository.deleteById(id);
//    }


//    public Student updateStudent(Student st , Long id)
//    {
//         Optional<Student>opStu = studentRepository.findById(id);
//         Student student = opStu.get();
//
//         student.setName(st.getName());
//         student.setStu_class(st.getStu_class());
//         student.setMobile(st.getMobile());
//
//         return studentRepository.save(student);
//    }


//    public Student getStudentById(Long id)
//    {
//      return  studentRepository.findById(id).orElse(null);
//
//    }


//    public List<Student> getAllStudent()
//    {
//        return studentRepository.findAll();
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Dto Class ?
//======================================


//    private StudentRepository studentRepository ;
//
//    public StudentService(StudentRepository studentRepository)
//    {
//        this.studentRepository = studentRepository ;
//    }
//
//
//        StudentDto mapToDto(Student student)
//        {
//                StudentDto dto = new StudentDto();
//                dto.setName(student.getName());
//                dto.setStu_class(student.getStu_class());
//                dto.setMobile(student.getMobile());
//                return dto;
//        }
//
//
//         Student mapToEntity(StudentDto dto )
//        {
//                Student stu = new Student();
//                stu.setName(dto.getName());
//                stu.setStu_class(dto.getStu_class());
//                stu.setMobile(dto.getMobile());
//                return stu;
//
//        }
//
//
//    public StudentDto addStudent(StudentDto dto) {
//        Student student = mapToEntity(dto);
//        Student save = studentRepository.save(student);
//        StudentDto studentDto = mapToDto(save);
//        return studentDto;
//    }


//    public void deleteStudent(Long id) {
//        studentRepository.deleteById(id);
//    }


//    public StudentDto UpdateStudent(StudentDto dto , Long id)
//    {
//        Optional<Student> opStd = studentRepository.findById(id);
//        Student student = opStd.get();
//        student.setName(dto.getName());
//        student.setStu_class(dto.getStu_class());
//        student.setMobile(dto.getMobile());
//        Student save = studentRepository.save(student);
//        return mapToDto(save);
//    }


//    public  StudentDto getStudentById(Long id)
//    {
//        Optional<Student> std = studentRepository.findById(id);
//        Student student = std.get();
//
//        return mapToDto(student);
//
//    }


//    public  List<StudentDto> getAllStudent()
//    {
//        List<Student> students = studentRepository.findAll();
//        List<StudentDto> dto = students.stream().map(e->mapToDto(e)).collect(Collectors.toList());    // students.stream().map(this::mapToDto).collect(Collectors.toList()); hm isko asie bhi likh skte he
//        return dto ;
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With modelMapper  Class ?       -> hm modelMapper library ko use krangye to hme pahle config class bnani padegi  jis se hi hm ModelMapper ko Configure kr sake  or
//======================================   // or modelMapper ko hm kawal Service layar me hi use kr skte he Controller layer me nahi kr skte he ?


//    private StudentRepository studentRepository;
//    private ModelMapper modelMapper;
//
//    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
//        this.studentRepository = studentRepository;
//        this.modelMapper = modelMapper;
//    }
//
//
//    StudentDto mapToDto(Student student)
//    {
//        StudentDto dto = modelMapper.map(student, StudentDto.class);
//        return dto ;
//    }
//
//    Student mapToEntity(StudentDto dto)
//    {
//        Student student = modelMapper.map(dto , Student.class);
//        return student ;
//    }


//    public StudentDto getStudentById(long stdId) {
//        Optional<Student> opStd = studentRepository.findById(stdId);
//        Student student = opStd.get();
//        return  mapToDto(student);
//    }



//    public List <StudentDto> getAllStudent()
//    {
//        List<Student> all = studentRepository.findAll();
//        List<StudentDto> studentDto = all.stream().map(e->mapToDto(e)).collect(Collectors.toList());
//        return studentDto ;
//    }




//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Give The Exception With-> (ResourceNotFoundException Class)
//============================================================================


//    private StudentRepository studentRepository;
//    private ModelMapper modelMapper;
//
//    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
//        this.studentRepository = studentRepository;
//        this.modelMapper = modelMapper;
//    }
//
//
//    StudentDto mapToDto(Student student)
//    {
//        StudentDto dto = modelMapper.map(student, StudentDto.class);
//        return dto ;
//    }
//
//    Student mapToEntity(StudentDto dto)
//    {
//        Student student = modelMapper.map(dto , Student.class);
//        return student ;
//    }



//    public StudentDto UpdateStudent(StudentDto dto , long id)
//    {
//        Student student = studentRepository.findById(id).orElseThrow(
//                () -> new ResourceNotFound("The data you want to update is not present in this Id : " + id)
//        );
//
//        student.setName(dto.getName());
//        student.setStu_class(dto.getStu_class());
//        student.setMobile(dto.getMobile());
//
//        Employee save = studentRepository.save(student);
//        return mapToDto(save);
//    }




//    public  StudentDto getStudent(long stdId)
//    {
//        Student student = studentRepository.findById(stdId).orElseThrow(()-> new ResourceNotFound("Record Not Found with id : " + stdId) );
//        StudentDto dto = mapToDto(student);
//        return dto ;
//    }




//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Exception Class  ->(ErrorDetails , HandleException)
//=====================================================================


//    private StudentRepository studentRepository;
//    private ModelMapper modelMapper;
//
//    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
//        this.studentRepository = studentRepository;
//        this.modelMapper = modelMapper;
//    }
//
//
//    StudentDto mapToDto(Student student)
//    {
//        StudentDto dto = modelMapper.map(student, StudentDto.class);
//        return dto ;
//    }
//
//    Student mapToEntity(StudentDto dto)
//    {
//        Student student = modelMapper.map(dto , Student.class);
//        return student ;
//    }
//
//    public StudentDto addStudent(StudentDto dto) {
//        Student student = mapToEntity(dto);
//        Student save = studentRepository.save(student);
//        StudentDto studentDto = mapToDto(save);
//        return studentDto;
//    }
//
//
//
//
//    public  StudentDto getStudent(long stdId)
//    {
//        Student student = studentRepository.findById(stdId).orElseThrow(()-> new ResourceNotFound("Record Not Found with id : " + stdId) );
//        StudentDto dto = mapToDto(student);
//        return dto ;
//    }




//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//   Code With Pagination Class ->
//==================================



//    private StudentRepository studentRepository;
//    private ModelMapper modelMapper;
//
//    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
//        this.studentRepository = studentRepository;
//        this.modelMapper = modelMapper;
//    }
//
//
//    StudentDto mapToDto(Student student)
//    {
//        StudentDto dto = modelMapper.map(student , StudentDto.class);
//        return dto ;
//    }
//
//    Student mapToEntity(StudentDto dto)
//    {
//        Student student = modelMapper.map(dto, Student.class);
//        return student ;
//    }

    //    http://localhost:8080/api/v1/employee?pageNo=1
    //    http://localhost:8080/api/v1/employee?pageNo=1&pageSize=5
    //    http://localhost:8080/api/v1/employee?pageSize=5&pageNo=1&sortBy=name



    //    http://localhost:8080/api/v1/student?pageSize=5&pageNo=1&sortBy=name&sorDir=asc  //  <- if I will give this line give the code in ascending order
    //    http://localhost:8080/api/v1/student?pageSize=5&pageNo=1&sortBy=name&sorDir=dsc  //  <- and if I will give this line give the code in descending order


//        public List<StudentDto>getAllStudent(int pageNo , int pageSize , String sortBy , String sortDir)
//        {

//            Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();// Ascending and Descending
//            PageRequest page = PageRequest.of(pageNo, pageSize, sort);  // This line will give me Ascending and Descending Both order


//          Pageable page = PageRequest.of(pageNo, pageSize);
//            PageRequest page = PageRequest.of(pageNo, pageSize , Sort.by(sortBy));// This line will give me only Ascending order


//            Page<Student> all = studentRepository.findAll(page);
//            List<Student> student = all.getContent();
//            List<StudentDto> dto = student.stream().map(this::mapToDto).collect(Collectors.toList());
//            return dto ;
//        }





































}