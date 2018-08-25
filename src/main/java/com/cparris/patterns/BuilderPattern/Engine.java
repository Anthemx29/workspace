package com.cparris.patterns.BuilderPattern;


/**
 * See Effective Java for more...
 */
public class Engine {
    private final String alternator;
    private final String timingBelt;
    private final String oilFilter;
    private final String airFilter;
    private final String oil;

    public String getAlternator() {
        return alternator;
    }

    public String getTimingBelt() {
        return timingBelt;
    }

    public String getOilFilter() {
        return oilFilter;
    }

    public String getAirFilter() {
        return airFilter;
    }

    public String getOil() {
        return oil;
    }

    public static class Builder{
        private String alternator = "OEM Alternator";
        private String timingBelt = "OEM Timing Belt";
        private String oilFilter = "OEM Oil Filter";
        private String airFilter;
        private String oil;

        public Builder(String airFilter, String oil){
            this.oil = oil;
            this.airFilter = airFilter;
        }

        public Builder alternator(String value){
            alternator = value;
            return this;
        }

        public Builder timingBelt(String value){
            timingBelt = value;
            return this;
        }

        public Builder oilFilter(String value){
            oilFilter = value;
            return this;
        }

        public Builder airFilter(String value){
            airFilter = value;
            return this;
        }

        public Builder oil(String value){
            oil = value;
            return this;
        }

        public Engine build(){
            return new Engine(this);
        }
    }

    private Engine( Builder builder ){
        alternator = builder.alternator;
        timingBelt = builder.timingBelt;
        oilFilter = builder.oilFilter;
        airFilter = builder.airFilter;
        oil = builder.oil;
    }
}
