package Weather_App;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class weatherData {
    //Link attributes with the JSON properties.
    @JsonProperty("name")
    private String cityName;
    @JsonProperty("id")
    private double cityId;
    @JsonProperty("main")
    private temperatureData temperatureData;

    //Setters and Getters.
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getCityId() {
        return cityId;
    }

    public void setCityId(double cityId) {
        this.cityId = cityId;
    }

    public temperatureData getTemperatureData() {
        return temperatureData;
    }

    public void setTemperatureData(temperatureData temperatureData) {
        this.temperatureData = temperatureData;
    }


    @Override
    public String toString(){
        return "City:"+ cityName+" and City id:" +cityId+ "...Weather details:"+ temperatureData +"...";
    }
}
