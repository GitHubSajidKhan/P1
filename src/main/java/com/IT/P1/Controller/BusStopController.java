package com.IT.P1.Controller;

import com.IT.P1.Entity.BusStop;
import com.IT.P1.Service.BusStopService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("bus_stop")
public class BusStopController {



    private BusStopService busStopService ;

    public BusStopController(BusStopService busStopService)
    {

        this.busStopService = busStopService ;
    }

    @PostMapping
    public String createBusStop(@RequestBody BusStop orderName , BusStop departure_time , @RequestParam long stop , @RequestParam Long bus )
    {
        busStopService.createBusStop(orderName , departure_time , stop , bus);
        return "BusStop Created Successfully";
    }


}
