/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Dell i7
 */
public class Weather {
private MultipleFiles data;

    public Weather (MultipleFiles myfiles) {
        data = new MultipleFiles ();
        data = myfiles;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //import the necessery objects,tools and files
        Scanner b = new Scanner(System.in);
        String s3 = null;
        MultipleFiles myfiles = new MultipleFiles ();
        int myf = 1;
        while (!"stop".equals(s3)){
            System.out.print("Insert file path (or write stop if you have finish inserting files): ");
            s3 = b.nextLine();
            if ("stop".equals(s3))
                break;
            Scanner sc = new Scanner(new File(s3));
            sc.useDelimiter(",");
            process mydata = new process("File" + Integer.toString(myf));
            //import the data from the CSV file
            String s2 =sc.nextLine();
            while (sc.hasNext()){
                String count = sc.next();
                double val[]= new double[5];
                String inst = sc.nextLine();
                int j;
                j = 100;
                for (int i=0; i<26; i++){
                    char ch1 = (char) (i+65);
                    char ch2 = (char) (i+97);
                    if (inst.indexOf(ch1)>0 && j>inst.indexOf(ch1)) {
                        j=inst.indexOf(ch1);
                    }
                    if (inst.indexOf(ch2)>0 && j>inst.indexOf(ch2)) {
                        j=inst.indexOf(ch2);
                    }
                }
                String inst1=inst.substring(j);
                inst = inst.substring(1,j-1);
                String [] ar1 = inst.split(",", 100);
                for (int i=0; i<5; i++) {
                    val[i] = Double.parseDouble(ar1[i]);
                }
                mydata.addObj(count, val, inst1); //add the current object to the set by passing the object's parameters and creating it
            }
            mydata.createArray();
            myfiles.addFile("File" + Integer.toString(myf), mydata);
            myf++;
        }
        
        
        Weather myobj= new Weather(myfiles);
        //send the control to an other function after importing all the necessery data
        myobj.interface1();
    }
    
    public void interface1 (){
        String key;
        Scanner b = new Scanner(System.in);
        for(String i: data.getFiles().keySet()) {
            System.out.print(i + ", ");
        }
        int s = -1;
        while (s != 0){
            System.out.print("\nChoose action(0 to exit, 1 to find max temprature in a certain file, 2 to find the max temprature in all files and 3 to find the average temprature): ");
            s = b.nextInt();
            if (s == 1) {
                System.out.print("Choose file: ");
                key = b.next();
                System.out.println("Max Temprature: "+ data.getFile(key).getArray().getMaxTemp());
            }
            if (s == 2) {
                System.out.print("File: "+ data.getMaxTempInAll().getFileName() + "has Max Temprature: " + data.getMaxTempInAll().getArray().getMaxTemp());
            }
            if (s == 3) {
                System.out.print("Average Temprature: " + data.getAvgInAll());
            }
        }
        
        
        
    }
    
}
