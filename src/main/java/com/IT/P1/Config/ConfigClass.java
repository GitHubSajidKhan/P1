package com.IT.P1.Config;



//   hm modelMapper library ko use krangye to hme pahle config class bnani padegi  jis se hi hm ModelMapper ko Configure kr sake or modelMapper ko hm kawal Service layar me hi use kr
//   skte he Controller layer me nahi kr skte he ?

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass {

    @Bean
    public ModelMapper getMapper()
    {
        return new ModelMapper() ;
    }


}

