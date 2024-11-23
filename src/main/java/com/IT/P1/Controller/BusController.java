package com.IT.P1.Controller;

import com.IT.P1.Entity.Bus;
import com.IT.P1.Service.BusService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    private BusService busService ;

    public BusController(BusService busService)
    {
        this.busService = busService ;
    }

    @PostMapping
    public String createBus(@RequestBody Bus bus)
    {
        busService.createBus(bus);
        return "Bus Created Successfully " ;
    }


}
