/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dell i7
 */
public class Arrays {
private final ArrayList <Double> temp;
private final ArrayList <Double> dew;
private final ArrayList <Double> hum;
private final ArrayList <Double> sea;
private final ArrayList <Double> vis;

    public Arrays (){
        temp = new ArrayList <> ();
        dew = new ArrayList <> ();
        hum = new ArrayList <> ();
        sea = new ArrayList <> ();
        vis = new ArrayList <> ();
    }
    
    public void addTemp (double a){
        temp.add(a);
    }
    
    public void addDew (double a){
        dew.add(a);
    }
    
    public void addHum (double a){
        hum.add(a);
    }
    
    public void addSea (double a){
        sea.add(a);
    }
    
    public void addVis (double a){
        vis.add(a);
    }
    
    public ArrayList <Double> getTemp (){
        return temp;
    }
    
    public ArrayList <Double> getDew (){
        return dew;
    }
    
    public ArrayList <Double> getHum (){
        return hum;
    }
    
    public ArrayList <Double> getSea (){
        return sea;
    }
    
    public ArrayList <Double> getVis (){
        return vis;
    }
    
    public double getMaxTemp (){
        return Collections.max(temp);
    }
    
    public double getMaxDew (){
        return Collections.max(dew);
    }
    
    public double getMaxHum (){
        return Collections.max(hum);
    }
    
    public double getMaxSea (){
        return Collections.max(sea);
    }
    
    public double getMaxVis (){
        return Collections.max(vis);
    }
    
    public double getLowestTemp (){
        return Collections.min(temp);
    }
    
    public double sumOfTemp (){
        double res=0;
        for (int i=0; i<temp.size(); i++) {
            res+=temp.get(i);
        }
        return res;
    }
}
