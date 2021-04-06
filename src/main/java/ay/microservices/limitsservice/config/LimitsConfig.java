package ay.microservices.limitsservice.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by aliyussef on 06/04/2021
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "limits-service")
public class LimitsConfig {
    private int minimum;
    private int maximum;
}
