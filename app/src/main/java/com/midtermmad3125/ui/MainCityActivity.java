package com.midtermmad3125.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.midtermmad3125.R;
import com.midtermmad3125.utils.ReadJSONUtils;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainCityActivity extends AppCompatActivity
{
private TextView cityname,lati,longi,population;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityname=findViewById(R.id.cityname);
        lati=findViewById(R.id.latitiude);
        longi=findViewById(R.id.logitude);
        population=findViewById(R.id.population);
        ProcessData();

    }
    public void ProcessData (){
        String JsonData = ReadJSONUtils.loadJSONFromAsset(this,"moscow_weather.json");

        try {
            JSONObject cityData = new JSONObject(JsonData);
            JSONObject cityObject= cityData.getJSONObject("city");
            cityname.setText(cityObject.getString("name"));

            JSONObject cityCoordObject= cityObject.getJSONObject("coord");

            lati.setText("Latitude: "+cityCoordObject.getString("lat"));
            longi.setText("Longitude: "+cityCoordObject.getString("lon"));

          //  citycode.setText("Country: "+cityObject.getString("country"));
            population.setText("population: "+cityObject.getString("population"));
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
