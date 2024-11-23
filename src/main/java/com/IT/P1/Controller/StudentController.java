package com.IT.P1.Controller;

import com.IT.P1.Entity.Student;
import com.IT.P1.Service.StudentService;
import com.IT.P1.StudentDto.StudentDto;
import jakarta.validation.Valid;
import lombok.Getter;
import org.springframework.boot.autoconfigure.mustache.MustacheResourceTemplateLoader;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.w3c.dom.ls.LSInput;

import java.awt.image.RescaleOp;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.SimpleTimeZone;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @PostMapping("/add")
//    public String addStudent(@RequestBody Student student) {
//        studentService.addStudent(student) ;
//        return "Student added successfully";
//    }
//
//    @DeleteMapping
//    public String deleteStudent(@RequestParam Long id )
//    {
//        studentService.deleteStudent(id);
//        return "Student deleted successfully" ;
//    }
//
//
//    @PutMapping
//    public String updateStudent(@RequestBody StudentDto dto , @RequestParam Long id)
//    {
//        studentService.updateStudent(id,dto);
//        return "Employee updated successfully";
//    }
//
//
//    @GetMapping
//    public Student getStudentById(@RequestParam Long id){
//        return studentService.getStudentById(id) ;
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Entity Class ?
//======================================


//    @PostMapping("/add")
//    public ResponseEntity<String> addStudent(@RequestBody Student student)
//    {
//        studentService.addStudent(student);
//        return ResponseEntity.status(HttpStatus.CREATED).body("Employee added successfully");
//    }


//    @DeleteMapping
//    public ResponseEntity<String> deleteStudent(@RequestParam Long id)
//    {
//        studentService.deleteStudent(id);
//        return ResponseEntity.status(HttpStatus.CREATED).body("Deleted Successfull");
//    }


//    @PutMapping
//    public ResponseEntity<String> updateStudent(@RequestBody StudentDto dto , @RequestParam Long id)
//    {
//        studentService.updateStudent(id, dto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(" Student Data Updated Successfull");
//    }


//    @GetMapping
//    public  ResponseEntity<Student> getStudent(@RequestParam Long id)
//    {
//        Student student = studentService.getStudent(id);
//        return ResponseEntity.ok(student);
//    }


//    @GetMapping
//    public ResponseEntity<List<Student>> getALlStudent()
//    {
//        List <Student> student = studentService.getAllStudent();
//        return ResponseEntity.ok(student);
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Entity Class ?
//======================================


//    @PostMapping("/add")
//    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
//        Student savedStudent = studentService.addStudent(student);
//        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
//    }


//    @DeleteMapping
//    public ResponseEntity<String> deleteStudent(@RequestParam Long id)
//    {
//        studentService.deleteStudent(id);
//        return  ResponseEntity.status(HttpStatus.CREATED).body("Deleted");
//    }


//    @PutMapping ResponseEntity<Student> updateStudent(@RequestBody Student st , @RequestParam Long id)
//    {
//        Student student =  studentService.updateStudent(st,id);
//        return new ResponseEntity<>(student , HttpStatus.OK);
//    }


//    @GetMapping
//    public  ResponseEntity<Student> getStudentById(@RequestParam Long id)
//    {
//        Student student = studentService.getStudentById(id);
//        return ResponseEntity.ok(student);
//    }


//    @GetMapping
//    public  ResponseEntity<List<Student>> getAllStudent()
//    {
//        List<Student> student = studentService.getAllStudent();
//        return ResponseEntity.ok(student);
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Dto Class ?
//======================================


//    @PostMapping
//    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto dto)
//    {
//        StudentDto studentDto = studentService.addStudent(dto);
//        return new ResponseEntity<>(studentDto , HttpStatus.CREATED);
//    }


//    @DeleteMapping
//    public  ResponseEntity<StudentDto> deleteStudent(@RequestParam Long id)
//    {
//        studentService.deleteStudent(id);
//        return new ResponseEntity<>(HttpStatus.CREATED);
//
//    }


//    @PutMapping
//    public ResponseEntity<StudentDto> UpdateStudent(@RequestBody StudentDto dto , @RequestParam Long id)
//    {
//        StudentDto studentDto = studentService.UpdateStudent(dto,id);
//        return  new ResponseEntity<>( studentDto , HttpStatus.CREATED);
//    }


//    @GetMapping
//    public  ResponseEntity<StudentDto> getStudentById(@RequestParam Long id)
//    {
//        StudentDto studentById = studentService.getStudentById(id);
//        return new ResponseEntity<>(studentById,HttpStatus.CREATED);
//    }


//    @GetMapping
//    public  ResponseEntity<List<StudentDto>> getAllStudent()
//    {
//        List<StudentDto> studentDto = studentService.getAllStudent();
//        return new ResponseEntity<>(studentDto , HttpStatus.CREATED);
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With modelMapper  Class ?     -> hm modelMapper library ko use krangye to hme pahle config class bnani padegi  jis se hi hm ModelMapper ko Configure kr sake  or
//======================================   // or modelMapper ko hm kawal Service layar me hi use kr skte he Controller layer me nahi kr skte he ?


    //    http://localhost:8080/api/v1/student/studentId/1

//            @GetMapping("/studentId/{stdId}")
//            public ResponseEntity<StudentDto> getStudentById(@PathVariable long stdId)   // hm yha pr hm khud ka ek unique url bna rahe he
//            {
//                StudentDto studentDto =  studentService.getStudentById(stdId);
//                return new ResponseEntity<>(studentDto , HttpStatus.OK);
//            }


//    @GetMapping
//    public ResponseEntity<List<StudentDto>> getAllStudent()
//    {
//         List<StudentDto> studentDto = studentService.getAllStudent();
//        return new ResponseEntity<>(studentDto , HttpStatus.CREATED);
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Give The Exception With-> (ResourceNotFoundException Class)      firstly create ResourceNotFound Class
//============================================================================


//    @PutMapping
//    public ResponseEntity<StudentDto> UpdateStudent(@RequestBody StudentDto dto , @RequestParam Long id)
//    {
//        StudentDto studentDto = studentService.UpdateStudent(dto,id);
//        return  new ResponseEntity<>( studentDto , HttpStatus.CREATED);
//    }


//    @GetMapping("/studentId/{stdId}")
//    public ResponseEntity<StudentDto> getStudent(@PathVariable long stdId)
//    {
//        StudentDto student = studentService.getStudent(stdId);
//        return new ResponseEntity<>(student , HttpStatus.OK);
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//    Code With Exception Class -> (ErrorDetails , HandleException) ->  With Feature of OrElse Feature
//===================================================================


//    @PostMapping("/add")
//    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto dto)
//    {
//        StudentDto studentDto = studentService.addStudent(dto);
//        return new ResponseEntity<>(studentDto , HttpStatus.CREATED);
//    }


//    @GetMapping("/studentId/{stdId}")
//    public ResponseEntity<StudentDto> getStudent(@PathVariable long stdId)
//    {
//        StudentDto student = studentService.getStudent(stdId);
//        return new ResponseEntity<>(student , HttpStatus.OK);
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================


//    Code With Validation Class ->         firstly I added Spring validation library/dependency , then I added the annotation , then I added valid annotation
//==================================//      then I added BindingResult annotation then I added if condition


//    @PostMapping("/add")
//    public ResponseEntity<?> addStudent(@Valid @RequestBody StudentDto dto, BindingResult result)
//    {
//
//        if(result.hasErrors())
//        {
//            return new ResponseEntity<>(result.getFieldError().getDefaultMessage() , HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//
//        StudentDto studentDto = studentService.addStudent(dto);
//        return new ResponseEntity<>(studentDto , HttpStatus.CREATED);
//    }


//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//  Code With Pagination Class
//==================================//


    //    http://localhost:8080/api/v1/student?pageNo=1
    //    http://localhost:8080/api/v1/student?pageNo=1&pageSize=5
    //    http://localhost:8080/api/v1/student?pageSize=5&pageNo=1&sortBy=name
    //    http://localhost:8080/api/v1/student?pageSize=5&pageNo=1&sortBy=name&sortDir=asc


    //    http://localhost:8080/api/v1/student?pageSize=5&pageNo=1&sortBy=name&sorDir=asc  //  <- if I will give this line give the code in ascending order
    //    http://localhost:8080/api/v1/student?pageSize=5&pageNo=1&sortBy=name&sorDir=dsc  //  <- and if I will give this line give the code in descending order


    //    http://localhost:8080/api/v1/student?pageNo=1&pageSize=5

//    @GetMapping
//    public  ResponseEntity<List<StudentDto>> getAllStudent(
//            @RequestParam(name="pageNo" , required = false , defaultValue = "0") int pageNo ,
//            @RequestParam(name = "pageSize" , required = false , defaultValue = "5")int pageSize,
//            @RequestParam(name = "sortBy" , required = false , defaultValue = "name")String sortBy,
//            @RequestParam(name = "sortDir" , required = false , defaultValue = "name")String sortDir
//    ){
//        List<StudentDto>studentDto = studentService.getAllStudent(pageNo , pageSize , sortBy , sortDir);
//        return new ResponseEntity<>(studentDto , HttpStatus.CREATED);
//    }

}

