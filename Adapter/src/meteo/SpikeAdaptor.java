package meteo;

import java.time.LocalDateTime;

public class SpikeAdaptor implements MeteoSensor{
    SensorTemperature st;

    public SpikeAdaptor(SensorTemperature st) {
        this.st = st;
    }

    @Override
    public int getId() {
        return st.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float)st.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {

        LocalDateTime localDateTime = LocalDateTime.of(st.year(),1, 1,0, 0);
        localDateTime.plusDays((long) st.day());
        localDateTime.plusSeconds((long) st.second());
        return localDateTime;
    }
}
