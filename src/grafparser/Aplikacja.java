/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafparser;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author DayanDey
 */
public class Aplikacja extends javax.swing.JFrame {

    /**
     * Creates new form Aplikacja
     */
    public Aplikacja() {
        initComponents();
        rand = new Random();
    }
    
    DefaultTableModel model;
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pnl_Plansza = new javax.swing.JPanel();
        btn_Wczytaj = new javax.swing.JButton();
        btn_Wyczyść = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tab_dane = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxP_nazwa = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxP_krawędzie = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tab_krawędzie = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout Pnl_PlanszaLayout = new javax.swing.GroupLayout(Pnl_Plansza);
        Pnl_Plansza.setLayout(Pnl_PlanszaLayout);
        Pnl_PlanszaLayout.setHorizontalGroup(
            Pnl_PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 573, Short.MAX_VALUE)
        );
        Pnl_PlanszaLayout.setVerticalGroup(
            Pnl_PlanszaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btn_Wczytaj.setText("Wczytaj graf");
        btn_Wczytaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_WczytajActionPerformed(evt);
            }
        });

        btn_Wyczyść.setText("Wyczyść");
        btn_Wyczyść.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_WyczyśćActionPerformed(evt);
            }
        });

        Tab_dane.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nr", "Id", "Dane"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tab_dane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tab_daneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tab_dane);

        TxP_nazwa.setEditable(false);
        TxP_nazwa.setAutoscrolls(false);
        jScrollPane2.setViewportView(TxP_nazwa);

        jLabel1.setText("Nazwa");

        jLabel2.setText("Krawędzie");

        TxP_krawędzie.setEditable(false);
        TxP_krawędzie.setAutoscrolls(false);
        jScrollPane3.setViewportView(TxP_krawędzie);

        Tab_krawędzie.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Krawędź"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(Tab_krawędzie);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Wyczyść, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Wczytaj, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pnl_Plansza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addComponent(jScrollPane3))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(btn_Wczytaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Wyczyść))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pnl_Plansza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Graf wczytanygraf = null;
    
    private void btn_WczytajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_WczytajActionPerformed
        
        FileDialog fd =new FileDialog(this,"Wczytaj",FileDialog.LOAD);
        fd.setVisible(true);
       
        FileReader file = null;
        wczytanygraf = new Graf();
        
        try
        {
            file = new FileReader(fd.getDirectory()+""+fd.getFile());
            BufferedReader bfr = new BufferedReader(file);                
            
            String linia;
            while((linia = bfr.readLine()) != null){   
                
                int a = linia.indexOf("|");
                int b = linia.indexOf("|",a+1);
                
                String id = linia.substring(0,a);
                String dane = linia.substring(a+1,b);
                String krawedz = linia.substring(b+1);
              
                Wierzchołek nowy = new Wierzchołek(id,dane,krawedz);
                wczytanygraf.put(id,nowy);
            }        
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
        
        int idk = 0;
        
        HashMap mp = wczytanygraf.get_wierzchołki();        
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();  
            Wierzchołek a = (Wierzchołek) pair.getValue();          
            System.out.println("Wczytane dane : "+a.get_id()+"   "+a.get_dane()+"   "+a.get_krawędzie());        
       
            DefaultTableModel model = (DefaultTableModel) this.Tab_dane.getModel();
            model.addRow(new Object[]{idk++, a.get_id(), a.get_dane()});   
        
        }    
        ustal_krawędzie();
        ustaw_położenie();
        rysuj_graf();
    }//GEN-LAST:event_btn_WczytajActionPerformed

    private void btn_WyczyśćActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_WyczyśćActionPerformed
        Graphics g = this.Pnl_Plansza.getGraphics();
        g.clearRect(0, 0, this.Pnl_Plansza.getWidth(), this.Pnl_Plansza.getHeight());
       
        DefaultTableModel model = (DefaultTableModel)this.Tab_dane.getModel();
        int len = this.Tab_dane.getRowCount();
        for(int i=len-1;i>=0;i--)
        {
            model.removeRow(i);
        }
        
        this.TxP_nazwa.setText("");
        this.TxP_krawędzie.setText("");
        
        DefaultTableModel tabela = (DefaultTableModel)this.Tab_krawędzie.getModel();
        len = this.Tab_krawędzie.getRowCount();
        for(int i=len-1;i>=0;i--)
        {
            tabela.removeRow(i);
        }
    }//GEN-LAST:event_btn_WyczyśćActionPerformed

    private void Tab_daneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tab_daneMouseClicked
        int index = this.Tab_dane.getSelectedRow();
        TableModel model = this.Tab_dane.getModel();
        
        if(index!=-1)
        {
            HashMap<String, Wierzchołek> graf = wczytanygraf.get_wierzchołki();
            Wierzchołek a = graf.get(model.getValueAt(index,1).toString());
                       
            
            
            this.TxP_nazwa.setText(a.get_id());
            this.TxP_krawędzie.setText(a.get_krawędzie());
            
            
            DefaultTableModel tabela = (DefaultTableModel) this.Tab_krawędzie.getModel();
              
          //  for(int i=0;i<tabela.getRowCount();i++)
          //  {
         //       tabela.removeRow(i);
         //   }
            
          //  DefaultTableModel model = (DefaultTableModel)this.Tab_dane.getModel();
            int len = tabela.getRowCount();
            for(int i=len-1;i>=0;i--)
            {
                tabela.removeRow(i);
            }
            
            
            for(String s : a.get_nazwy_wierzchołków())
            {
                tabela.addRow(new Object[]{s});  
            
            }         
            
        }
    }//GEN-LAST:event_Tab_daneMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplikacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikacja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikacja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pnl_Plansza;
    private javax.swing.JTable Tab_dane;
    private javax.swing.JTable Tab_krawędzie;
    private javax.swing.JTextPane TxP_krawędzie;
    private javax.swing.JTextPane TxP_nazwa;
    private javax.swing.JButton btn_Wczytaj;
    private javax.swing.JButton btn_Wyczyść;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void ustal_krawędzie() {
 
        wczytanygraf.ustaw_macierz();
    
    
    }
    
    private Color[] kolory = {
        Color.decode("#6699ff"),Color.decode("#33cc33"),Color.decode("#ffcc33"),Color.decode("#cc6600"),
        Color.decode("#32cd99"),Color.decode("#6b8e23"),Color.decode("#ff7f00"),Color.decode("#ff2400"),
        Color.decode("#9999ff"),Color.decode("#cc3399"),Color.decode("#007fff"),Color.decode("#38b0de")
    };

    private void rysuj_graf() {
 
        Graphics g = this.Pnl_Plansza.getGraphics();
        g.setFont(new Font("Arial", (Font.BOLD) , 14));
         
        HashMap mp = wczytanygraf.get_wierzchołki();        
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();  
            Wierzchołek a = (Wierzchołek) pair.getValue();          
            
            Point p = a.get_położenie();
            
            g.setColor(kolory[rand.nextInt(kolory.length)]);
            
            g.drawString(a.get_id() , p.x, p.y);
            
            ArrayList<String> tab = a.get_nazwy_wierzchołków();
            
            Point o;
            
            for(String str : tab)
            {
                Point b = wczytanygraf.get(str).get_położenie();
                
                o = new Point(b.x,b.y);
                g.setColor(Color.BLACK);
                g.drawLine(p.x, p.y,o.x,o.y);
                
                
            }
            
        }
        
    }
    
    private Random rand;

    private void ustaw_położenie() {
        
        HashMap mp = wczytanygraf.get_wierzchołki();        
        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();  
            Wierzchołek w = (Wierzchołek) pair.getValue();          
            
            int a = rand.nextInt(this.Pnl_Plansza.getHeight()-20) + 10;
            int b = rand.nextInt(this.Pnl_Plansza.getWidth()-20) + 10;
            
            Point p = new Point(b,a);
            
            w.set_położenie(p);
        }
    
    }
}
