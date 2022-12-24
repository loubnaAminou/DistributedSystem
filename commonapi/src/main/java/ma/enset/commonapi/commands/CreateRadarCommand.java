package ma.enset.commonapi.commands;

import lombok.Getter;

public class CreateRadarCommand extends BaseCommand<String> {
    @Getter public double maxVitesse;
    @Getter public double latitude;
    @Getter public double longitude;

    public CreateRadarCommand(String id, double maxVitesse, double latitude, double longitude) {
        super(id);
        this.maxVitesse = maxVitesse;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
