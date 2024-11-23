package com.IT.P1.Exception;

import com.IT.P1.StudentDto.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

// this class behave like Catch ->

@ControllerAdvice
public class HandleException {


//    Code With Exception Class  ->(ErrorDetails , HandleException)
//===================================================================


//    Normal Massage Print Code ->
//=====================================


//    @ExceptionHandler(ResourceNotFound.class)
//    public ResponseEntity<String> handleStudentNotFoundException(ResourceNotFound e)
//    {
//        return new ResponseEntity<>("Record Not Found" , HttpStatus.INTERNAL_SERVER_ERROR);
//    }



//====================================================================================================================================================================================================================

//    Code With Exception Class ->(ErrorDetails , HandleException)
//=================================================================

//    WebRequest request -> hm jab ye parameter langye tab hme iska ErrorDetails class me parameter declare krna hoga with (getter or Constructor) me bhi pass krna hoga
//    kyoki iska jo return type he wo String he is liye


//========================================================

//    @ExceptionHandler(ResourceNotFound.class)                                         // this handled only ResourceNotFound Exception other Exception will not handle it ?
//    public ResponseEntity<ErrorDetails> handleStudentNotFoundException(ResourceNotFound e , WebRequest request)
//    {
//        ErrorDetails errorDetails = new ErrorDetails(new Date() , e.getMessage() , request.getDescription(false));
//        return new ResponseEntity<>(errorDetails , HttpStatus.INTERNAL_SERVER_ERROR);
//    }


//=========================================================


//    @ExceptionHandler(Exception.class)                                                                                   // This handled All Type od Exception
//    public ResponseEntity<ErrorDetails> globalException(Exception e , WebRequest request)
//    {
//        ErrorDetails errorDetails = new ErrorDetails(new Date() , e.getMessage() , request.getDescription(false));
//        return new ResponseEntity<>(errorDetails , HttpStatus.INTERNAL_SERVER_ERROR);
//    }


//    @ExceptionHandler(Exception.class)                                                                                   // This handled All Type od Exception
//    public ResponseEntity<ErrorDetails> globalException(Exception e , WebRequest request)
//    {
//        ErrorDetails errorDetails = new ErrorDetails(new Date() , e.getMessage() , request.getDescription(false));
//        return new ResponseEntity<>(errorDetails , HttpStatus.INTERNAL_SERVER_ERROR);
//    }



}
