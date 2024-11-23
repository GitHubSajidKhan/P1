package com.IT.P1.Service;


import com.IT.P1.Entity.Bus;
import com.IT.P1.Repository.BusRepository;
import org.springframework.stereotype.Service;

@Service
public class BusService {

    private BusRepository busRepository ;

    public BusService(BusRepository busRepository)
    {
        this.busRepository = busRepository ;
    }


    public void createBus(Bus bus)
    {
        busRepository.save(bus);
    }


}
