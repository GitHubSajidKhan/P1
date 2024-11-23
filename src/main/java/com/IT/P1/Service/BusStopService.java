package com.IT.P1.Service;


import com.IT.P1.Entity.Bus;
import com.IT.P1.Entity.BusStop;
import com.IT.P1.Entity.Stop;
import com.IT.P1.Repository.BusRepository;
import com.IT.P1.Repository.BusStopRepository;
import com.IT.P1.Repository.StopRepository;
import org.springframework.stereotype.Service;

@Service
public class BusStopService {


    private BusRepository busRepository ;
    private StopRepository stopRepository ;
    private BusStopRepository busStopRepository ;


    public BusStopService(BusRepository busRepository , StopRepository stopRepository , BusStopRepository busStopRepository)
    {
            this.busRepository = busRepository ;
            this.stopRepository = stopRepository ;
            this.busStopRepository = busStopRepository ;
    }



    public void  createBusStop(BusStop orderName , BusStop departure_time , long stop , Long bus )
    {
        Bus bus1 = busRepository.findById(bus).get();
        Stop stop1 = stopRepository.findById(stop).get();
        BusStop busStop=new BusStop();
        busStop.setBus(bus1);
        busStop.setStop(stop1);
        busStop.setOrderNumber(Integer.valueOf(stop1.getName()));
        busStopRepository.save(busStop);



    }

}
