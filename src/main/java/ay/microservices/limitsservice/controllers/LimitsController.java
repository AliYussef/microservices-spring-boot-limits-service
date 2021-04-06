package ay.microservices.limitsservice.controllers;

import ay.microservices.limitsservice.config.LimitsConfig;
import ay.microservices.limitsservice.models.Limits;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aliyussef on 06/04/2021
 */
@RestController
@RequestMapping("api/v1/limits")
public class LimitsController {

    private final LimitsConfig limitsConfig;

    public LimitsController(LimitsConfig limitsConfig) {
        this.limitsConfig = limitsConfig;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Limits getLimits() {
        return Limits.builder()
                .minimum(limitsConfig.getMinimum())
                .maximum(limitsConfig.getMaximum())
                .build();
    }
}
