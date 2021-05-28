/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

import weather.counts.Dew;
import weather.counts.Humidity;
import weather.counts.Sea;
import weather.counts.Temprature;
import weather.counts.Visibillity;

/**
 *
 * @author Dell i7
 */
public class obj {
private final String time;
private final Temprature temp;
private final Dew dew;
private final Humidity hum;
private final Sea sea;
private final Visibillity vis;
private final String wind;
    
    public obj (String s, double ard[], String s1){
        time = s;
        temp = new Temprature (ard[0]);
        dew = new Dew (ard[1]);
        hum = new Humidity (ard[2]);
        sea = new Sea (ard[3]);
        vis = new Visibillity (ard[4]);
        wind = s1;
    }
    
    public String getTime (){
        return time;
    }
    
    public double getTemp (){
        return temp.getTemp();
    }
    
    public double getDew (){
        return dew.getDew();
    }
    
    public double getHum (){
        return hum.getHumidity();
    }
    
    public double getSea (){
        return sea.getSea();
    }
    
    public double getVis (){
        return vis.getVisibillity();
    }
}
