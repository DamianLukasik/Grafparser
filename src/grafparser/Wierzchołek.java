/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafparser;

import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author DayanDey
 */
class Wierzchołek {
    
    private String id;
    private String dane;
    private String krawędzie;
    private ArrayList<String> nazwy_wierzchołków;
    private Point location;
            
    public Wierzchołek(String id_, String dane_, String krawędzie_)
    {
        id=id_;
        dane=dane_;
        if(krawędzie_.equals(""))
        {
            krawędzie="0";
        }
        else
        {
            krawędzie=krawędzie_;
        }
        nazwy_wierzchołków = new ArrayList<String>();
        location  = new Point();
   //     ArrayList<String> tab = new ArrayList<String>();
        
    //    ustal_krawędzie(new ArrayList<String>(krawędzie_));
    }  
    
    public void set_położenie(Point p)
    {
        location = p;
    }  
    
    public Point get_położenie()
    {
        return location;
    }  
    
    public String get_id()
    {
        return id;
    }   
    
    public String get_dane()
    {
        return dane;
    }
    
    public String get_krawędzie()
    {
        return krawędzie;
    }
    
    public ArrayList<String> get_nazwy_wierzchołków()
    {
        return nazwy_wierzchołków;
    }

    public void ustal_krawędzie(ArrayList<String> krawedzie) 
    {
  
        for(String k : krawedzie)
        {
            nazwy_wierzchołków.add(k);       
            System.out.print(k+" ");
        }    
        System.out.print("\n");    
//        nazwy_wierzchołków.add(id);
    }
    
    public void add_krawędź(String naz)
    {
        nazwy_wierzchołków.add(naz);
    }
}
