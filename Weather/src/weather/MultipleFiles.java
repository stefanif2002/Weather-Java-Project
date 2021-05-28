/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

import java.util.Hashtable;

/**
 *
 * @author Dell i7
 */
public class MultipleFiles {
private final Hashtable <String, process> files;

    public MultipleFiles () {
       files = new Hashtable <> ();
    } 
    
    public void addFile (String s, process p) {
        files.put(s, p);
    }
    
    public process getFile (String key){
        return files.get(key);
    }
    
    public Hashtable <String, process> getFiles (){
        return files;
    }
    
    public process getMaxTempInAll (){
        process res=files.get("File1");
        for (process s : files.values()){
            if(s.getArray().getMaxTemp()>res.getArray().getMaxTemp())
                res=s;
        }
        return res;
    }
    
    public double getAvgInAll (){
        double sum=0;
        int a=0;
        for (process s : files.values()){
            sum+=s.getArray().sumOfTemp();
            a+=s.getArray().getTemp().size();
        }
        return sum/a;
    }
}
