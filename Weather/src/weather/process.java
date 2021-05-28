
package weather;

import java.util.ArrayList;


public class process {
private final ArrayList <obj> data;
private final String filename;
private final Arrays myar;
    
    public process (String s){
        data = new ArrayList <> ();
        myar = new Arrays();
        filename = s;
    }
    
    public void addObj (String s, double ard[], String s1){
        obj n = new obj(s,ard,s1);
        data.add(n);
    }
    
    public void createTempArray (){
        for (int i=0; i<data.size(); i++){
            myar.addTemp(data.get(i).getTemp());
        }
    }
    
    public void createDewArray (){
        for (int i=0; i<data.size(); i++){
            myar.addDew(data.get(i).getDew());
        }
    }
    
    public void createHumArray (){
        for (int i=0; i<data.size(); i++){
            myar.addHum(data.get(i).getHum());
        }
    }
    
    public void createSeaArray (){
        for (int i=0; i<data.size(); i++){
            myar.addSea(data.get(i).getSea());
        }
    }
    
    public void createVisArray (){
        for (int i=0; i<data.size(); i++){
            myar.addVis(data.get(i).getVis());
        }
    }
    
    public void createArray (){
        this.createTempArray();
        this.createDewArray();
        this.createHumArray();
        this.createSeaArray();
        this.createVisArray();
    }
    
    public Arrays getArray () {
        return myar;
    }
    
    public String getFileName () {
        return filename;
    }
}
