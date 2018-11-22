/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.*;


/**
 *
 * @author Nicola Temporal
 */
public class HashMapDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DBInterface i = new DBInterface();
        ChainedList<EnergieData> data = new ChainedList<>();
        
        data = i.LoadData();
        
        EnergieKosten(data);
    }
    
    public static void EnergieKosten(ChainedList<EnergieData> data)
    {
       ChainedList<Integer> jahre = new ChainedList<>();
       for(EnergieData en : data)
       {
           if(!jahre.contains(en.getJahr()))
           {
               jahre.add(en.getJahr());
           }
       }
       
       HashMap<Integer,Integer> kostenProKopf = new HashMap<>(); 
       for(int jahr :  jahre)
       {
            double bev = -1;
           double sum = 0;
           
           for(EnergieData en : data)
           {
               if(en.getJahr() == jahr)
               {
                    if(bev == -1)
                    {
                        bev =  en.getBevCH()+en.getBevAus()+1;
                    }
                    
                    sum += en.getBetrag();
               }
           }
           double kostenprokopf = sum * 1000000 / bev;
           kostenProKopf.put(jahr, (int)Math.round(kostenprokopf));
       }
       
        System.out.println("| Jahr | Kosten pro Kopf |");
        kostenProKopf.forEach((t, u) -> {
            System.out.println("| "+t+" | "+u+"            |");
        });
    }
}
