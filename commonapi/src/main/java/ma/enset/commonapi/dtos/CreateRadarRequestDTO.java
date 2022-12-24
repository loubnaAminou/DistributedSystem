package ma.enset.commonapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor @AllArgsConstructor
public class CreateRadarRequestDTO {
    public double maxVitesse;
    public double latitude;
    public double longitude;
}
