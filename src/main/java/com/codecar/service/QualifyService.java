package com.codecar.service;

import com.codecar.entity.Car;
import com.codecar.util.CarBuilder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class QualifyService {
    public Map<Integer, Car> qualify() {
        List<Car> entryList = CarBuilder.buildRaceCars();
        Collections.sort(entryList);

        return getQualifyResultsMap(entryList);
    }

    private Map<Integer, Car> getQualifyResultsMap(List<Car> entryList) {
        Map<Integer,Car> m = new HashMap<>();
        for (Car car : entryList) {
            int position = entryList.indexOf(car) + 1;
            m.put(position,car);
        }

        return m;
    }
}
