package com.midtermmad3125.Modal;

public class Citydetails {
    private int id;
    private String cityname;
    private double latitude;
    private double longitude;
    private String countrycode;
    private double population;

    public Citydetails(int id, String cityname, double latitude, double longitude, String countrycode, double population) {
        this.id = id;
        this.cityname = cityname;
        this.latitude = latitude;
        this.longitude = longitude;
        this.countrycode = countrycode;
        this.population = population;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Citydetails{" +
                "id=" + id +
                ", cityname='" + cityname + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", countrycode='" + countrycode + '\'' +
                ", population=" + population +
                '}';
    }
}
