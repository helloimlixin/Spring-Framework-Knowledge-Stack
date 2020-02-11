package com.example.restful;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TricklingInfoController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/tricklingInfo")
    public TricklingInfo tricklingInfo(
            @RequestParam(value = "materialNumber", defaultValue = "328996") String materialNumber,
            @RequestParam(value = "datetimeBefore", defaultValue = "2020/1/9 16:21") String datetimeBefore,
            @RequestParam(value = "weightBefore", defaultValue = "266.45") float weightBefore,
            @RequestParam(value = "datetimeAfter", defaultValue = "2020/1/9 18:00") String datetimeAfter,
            @RequestParam(value = "weightAfter", defaultValue = "276.33") float weightAfter,
            @RequestParam(value = "judgementResult", defaultValue = "OK") String judgementResult,
            @RequestParam(value = "robotMode", defaultValue = "Normal") String robotMode,
            @RequestParam(value = "preheatingTemperature", defaultValue = "143.6") float preheatingTemperature,
            @RequestParam(value = "solidificationTemperature", defaultValue = "152.1") float solidificationTemperature,
            @RequestParam(value = "temperatureTricklingArea", defaultValue = "24") int temperatureTricklingArea,
            @RequestParam(value = "fixtureNumber", defaultValue = "135") int fixtureNumber,
            @RequestParam(value = "tricklingMachineCode", defaultValue = "1") int tricklingMachineCode,
            @RequestParam(value = "judgementState", defaultValue = "ON") String judgementState) {
        return new TricklingInfo(counter.incrementAndGet(),
                materialNumber,
                datetimeBefore,
                weightBefore,
                datetimeAfter,
                weightAfter,
                judgementResult,
                robotMode,
                preheatingTemperature,
                solidificationTemperature,
                temperatureTricklingArea,
                fixtureNumber,
                tricklingMachineCode,
                judgementState
                );
    }
}
