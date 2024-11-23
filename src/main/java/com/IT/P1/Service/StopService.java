package com.IT.P1.Service;


import com.IT.P1.Entity.Stop;
import com.IT.P1.Repository.StopRepository;
import org.springframework.stereotype.Service;

@Service
public class StopService {

    private StopRepository stopRepository ;

    public StopService(StopRepository stopRepository)
    {
        this.stopRepository = stopRepository ;
    }


    public void createStop(Stop stop)
    {
        stopRepository.save(stop);
    }

}
