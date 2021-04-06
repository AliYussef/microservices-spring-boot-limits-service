package ay.microservices.limitsservice.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by aliyussef on 06/04/2021
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Limits {
    private int minimum;
    private int maximum;
}
