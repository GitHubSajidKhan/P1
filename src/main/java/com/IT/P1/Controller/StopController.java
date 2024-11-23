package com.IT.P1.Controller;


import com.IT.P1.Entity.Stop;
import com.IT.P1.Service.StopService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/stop")
public class StopController {

    private StopService stopService ;

    public StopController(StopService stopService)
    {
        this.stopService = stopService ;
    }

    @PostMapping
    public String createStop(@RequestBody Stop stop)
    {
        stopService.createStop(stop);
        return "Stop Is Successfully Created";
    }

}
