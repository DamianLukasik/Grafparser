/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafparser;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author DayanDey
 */
public class Graf {
    
    private HashMap<String, Wierzchołek> wierzchołki = null;
    private ArrayList<String> numery = null;
 //   private ArrayList<int[]> macierz = null;
    
    public Graf()
    {
        numery = new ArrayList<String>();
        wierzchołki = new HashMap<String, Wierzchołek>();
    }   
    
    public void put(String id, Wierzchołek wierzch)
    {
        wierzchołki.put(id, wierzch);
        numery.add(id);
    }
    
    public Wierzchołek get(String naz)
    {
        return wierzchołki.get(naz);
    }
    
    public HashMap get_wierzchołki()
    {
        return wierzchołki;
    }
    
    public int size()
    {
        return wierzchołki.size();
    }

    void ustaw_macierz() {
              
        Iterator it = wierzchołki.entrySet().iterator();
        while (it.hasNext()) 
        {
            Map.Entry pair = (Map.Entry)it.next();  
            Wierzchołek a = (Wierzchołek) pair.getValue();    
            Wierzchołek w;
            
            String str = Integer.toBinaryString(Integer.parseInt(a.get_krawędzie()));
            String []s = str.split("");
            ArrayList<String> tab = new ArrayList<String>();
               
            int idk = 0;
            String nazwa;
            for(String i : s)
            {
                if(i.equals("1"))
                {        
                    nazwa = numery.get(idk);
                    tab.add(nazwa);  
                    wierzchołki.get(nazwa).add_krawędź(a.get_id());
                }
                idk++;
            }
            if(tab.size()!=0)
                a.ustal_krawędzie(tab);
        }

    }

}
