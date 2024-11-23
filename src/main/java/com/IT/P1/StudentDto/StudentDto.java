package com.IT.P1.StudentDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentDto {

//    private Long id ;
//    private String name ;
//    private String stu_class ;
//    private String mobile ;



//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//    Code With Validation Class ->
//==================================


    private Long id ;
    @NotBlank
    @Size(min = 3 , message = "At Least 3 Chars Required")
    private String name ;
    @Email
    private String email ;
    @Size(min = 10 , max = 10 , message = "should be 10 digits")
    private String mobile ;




}
