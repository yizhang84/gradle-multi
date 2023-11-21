package com.yi.maxirail.service;

import com.yi.maxirail.model.TrainTime;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@Service
public class TrainTimeService {
    public List<TrainTime> getTrainTimes() {
        return Arrays.asList(
                new TrainTime("London", "Brighton", LocalTime.of(9, 35), LocalTime.of(10, 30)),
                new TrainTime("London", "Brighton", LocalTime.of(15, 5), LocalTime.of(16, 0)),
                new TrainTime("Brighton", "London", LocalTime.of(11, 0), LocalTime.of(12, 0)),
                new TrainTime("Brighton", "London", LocalTime.of(16, 30), LocalTime.of(17, 30))
        );
    }
}