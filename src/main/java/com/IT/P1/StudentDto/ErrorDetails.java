package com.IT.P1.StudentDto;

import java.util.Date;


//    Code With Exception Class -> (ErrorDetails , HandleException)
//===========================================================================


public class ErrorDetails {

    private Date date ;
    private  String massage;
    private String request ;

    public ErrorDetails(Date date, String massage, String request) {
        this.date = date;
        this.massage = massage;
        this.request = request;
    }


    public Date getDate() {
        return date;
    }

    public String getMassage() {
        return massage;
    }

    public String getRequest() {
        return request;
    }
}
