/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author xerxes54
 */
public final class inventory extends javax.swing.JFrame {

    /**
     * Creates new form inventory
     */
    public inventory() {
        initComponents();
       // MySqlConnection();
        fillTable();
    }

    public Connection MySqlConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/POS", "root", "xerxes54");
            JOptionPane.showMessageDialog(null, "Connection successful");
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection failed");
            return null;
        }
    }
    
     
    public ArrayList<purchbin> retrieveData(){
    ArrayList<purchbin> al=null;
        al = new ArrayList<>();
    
    try{
    Connection conn = MySqlConnection();
    String qry="select * from purchase";
    Statement xer = conn.createStatement();
    ResultSet xe = xer.executeQuery(qry);
    purchbin purchas = null;
    while (xe.next())
         purchas= new purchbin(xe.getInt(1),xe.getString(2),xe.getInt(3),xe.getFloat(4),xe.getString(5),xe.getString(6));
    al.add(purchas);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Data Retrieval failure..."+e);
    }
    return al;
}

public void fillTable(){
 
    ArrayList<purchbin>al;
        al = retrieveData();
    DefaultTableModel model = (DefaultTableModel)t.getModel();
  
    Object[] ro=new Object[6];
    for(int i=0;i<al.size();i++){
        ro[0]=al.get(i).getPurch_Id();
        ro[1]=al.get(i).getName();
        ro[2]=al.get(i).getQuantity();
        ro[3]=al.get(i).getPrice();
        ro[4]=al.get(i).getDop();
        ro[5]=al.get(i).getP_unit();
        
        model.addRow(ro);}
            
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mug1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        mug2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mug3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mug4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        kg = new javax.swing.JRadioButton();
        g = new javax.swing.JRadioButton();
        Tin = new javax.swing.JRadioButton();
        loaf = new javax.swing.JRadioButton();
        carton = new javax.swing.JRadioButton();
        tray = new javax.swing.JRadioButton();
        date = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        clr = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("PRODUCT ID");

        jLabel2.setText("PRODUCT NAME");

        jLabel3.setText("QUANTITY");

        mug3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mug3ActionPerformed(evt);
            }
        });

        jLabel4.setText("PRICE");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("         XERXES POS SYSTEM");

        kg.setText("Kgs");
        kg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kgActionPerformed(evt);
            }
        });

        g.setText("grams");
        g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gActionPerformed(evt);
            }
        });

        Tin.setText("Tins");
        Tin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinActionPerformed(evt);
            }
        });

        loaf.setText("loaves");
        loaf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loafActionPerformed(evt);
            }
        });

        carton.setText("Carton");
        carton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartonActionPerformed(evt);
            }
        });

        tray.setText("Tray");
        tray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Tin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(g, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                    .addComponent(kg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(loaf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(carton, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(tray, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kg)
                    .addComponent(loaf))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(g)
                    .addComponent(carton))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tin)
                    .addComponent(tray))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        date.setDateFormatString("dd-MM-yyyy");

        jLabel6.setText("DATE");

        clr.setText("Clear");
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });

        t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Quantity", "Price", "Date", "Unit"
            }
        ));
        jScrollPane1.setViewportView(t);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mug2)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(mug3)
                            .addComponent(mug1))
                        .addGap(171, 171, 171))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(542, 542, 542)
                        .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(mug4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(289, 289, 289))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mug4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mug1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mug2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mug3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clr, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mug3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mug3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mug3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          Connection conn;
     PreparedStatement xer;   
     PreparedStatement xer1; 
     PreparedStatement xer3;
     PreparedStatement  xer4;
     PreparedStatement  xer5;
     PreparedStatement  xer6;
     float e=0;
     int a;
     int brad=0;
      int h;
      int j;
     int xerxes;
     String v=null;
        if (mug1.getText()!=null) {
                try{
               conn = MySqlConnection();

                String sqlquery = "SELECT * FROM inventory WHERE inv_Id=?";
             

                xer = conn.prepareStatement(sqlquery);

                xer.setInt(1, Integer.parseInt(mug1.getText()));

                ResultSet res = xer.executeQuery();
              
                while(res.next()){
                  String b = res.getString(4);
                  float c = Float.parseFloat(b);
              
                  a=Integer.parseInt(mug3.getText());
                  float z=c*a;
                  String f = Float.toString(z);
                  mug4.setText(f);
                  e = Float.parseFloat(f);
              }
        
               String q=mug3.getText();
               j=Integer.parseInt(q);
                
                String sqlquery3 = "SELECT * FROM inventory WHERE inv_Id=?";
                xer5 = conn.prepareStatement(sqlquery3);
                xer5.setInt(1, Integer.parseInt(mug1.getText()));

                ResultSet xew = xer5.executeQuery();
              
                
                while(xew.next()){
                  String w = xew.getString(3);
                  
                  h= Integer.parseInt(w);
                  
                  if(h>0 && j<=h){
                  
           String query = "INSERT INTO purchase(purch_Id,name,quantity,price,date,pur_unit)"+"VALUES(?,?,?,?,?,?)";
           xer1 =conn.prepareStatement(query);
           xer1.setInt(1,Integer.parseInt(mug1.getText()));         
          
        
        
         String sqlquery4 = "SELECT * FROM inventory WHERE inv_Id=?";
                xer6 = conn.prepareStatement(sqlquery4);
                xer6.setInt(1, Integer.parseInt(mug1.getText()));

                ResultSet p = xer6.executeQuery();
              
                while(p.next()){
                 v = p.getString(2);
                }
                
        
        String ju=mug2.getText();
        if(!ju.equals(v)){
            JOptionPane.showMessageDialog(null, "Item not in stock"); 
            break;
        }else{
        xer1.setString(2,mug2.getText());
        
        
                
          xer1.setInt(3,Integer.parseInt(mug3.getText()));
                
         
           xer1.setFloat(4,e);
        
              SimpleDateFormat n= new SimpleDateFormat("dd-MM-yyyy");
              String dop=n.format(date.getDate());
              xer1.setString(5, dop);
              
            if(kg.isSelected()){
                    xer1.setString(6,"Kilogram");
                }else if(g.isSelected()){
                    xer1.setString(6,"Grams");
                }else if(Tin.isSelected()){
                    xer1.setString(6,"Tins");
                }else if(loaf.isSelected()){
                    xer1.setString(6,"Loaves");
                }else if(carton.isSelected()){
                    xer1.setString(6,"Cartons");
                }else if(tray.isSelected()){
                    xer1.setString(6,"Tray");
                }
              
        xer1.executeUpdate();
         fillTable(); 
        }
                  }else
                     JOptionPane.showMessageDialog(null, "Out of stock/excess quantity"); 
         
                    
                  
            String sqlquery2 = "SELECT * FROM inventory WHERE inv_Id=?";
                xer3 = conn.prepareStatement(sqlquery2);
                xer3.setInt(1, Integer.parseInt(mug1.getText()));
                ResultSet xe = xer3.executeQuery();
                  while(xe.next()){
                  String o = xe.getString(3);
                  
                  h= Integer.parseInt(o);
         
                  if(h<=0 || j>h)
                  {
                     
                      //JOptionPane.showMessageDialog(null, "OUT OF STOCK");
                      break;
                      //System.exit(1);
                   }else
                  
          brad=Integer.parseInt(mug3.getText());
         xerxes=h-brad;
         
          String sqlquery1 = "update inventory set item_quantity=?  WHERE inv_Id=?";
          xer4=conn.prepareStatement(sqlquery1);
          
          
         xer4.setInt(2,Integer.parseInt(mug1.getText()));
               
         xer4.setInt(1, xerxes);
         
               //int mulo=
                       xer4.executeUpdate();
                  
                       
                                   // if(mulo>0){
                  // JOptionPane.showMessageDialog(null, "Successfully updated "); 
               //}else
                  // JOptionPane.showMessageDialog(null, "Error updating"); 
               
                  }}}catch (SQLException | NumberFormatException | HeadlessException r) {
                JOptionPane.showMessageDialog(null, r); 
            }
        } else {
            JOptionPane.showMessageDialog(null, "Record not found..");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void kgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kgActionPerformed
      if(kg.isSelected())
            g.setSelected(false);
      Tin.setSelected(false);
      loaf.setSelected(false);
      carton.setSelected(false);
      tray.setSelected(false);
    }//GEN-LAST:event_kgActionPerformed

    private void gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gActionPerformed
        if(g.isSelected())
            kg.setSelected(false);
      Tin.setSelected(false);
      loaf.setSelected(false);
      carton.setSelected(false);
      tray.setSelected(false);
    }//GEN-LAST:event_gActionPerformed

    private void TinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinActionPerformed
        if(Tin.isSelected())
            g.setSelected(false);
      kg.setSelected(false);
      loaf.setSelected(false);
      carton.setSelected(false);
      tray.setSelected(false);
    }//GEN-LAST:event_TinActionPerformed

    private void loafActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loafActionPerformed
       if(loaf.isSelected())
            g.setSelected(false);
      Tin.setSelected(false);
      kg.setSelected(false);
      carton.setSelected(false);
      tray.setSelected(false);
    }//GEN-LAST:event_loafActionPerformed

    private void cartonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartonActionPerformed
        if(carton.isSelected())
            g.setSelected(false);
      Tin.setSelected(false);
      loaf.setSelected(false);
      kg.setSelected(false);
      tray.setSelected(false);
    }//GEN-LAST:event_cartonActionPerformed

    private void trayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trayActionPerformed
       if(tray.isSelected())
            g.setSelected(false);
      Tin.setSelected(false);
      loaf.setSelected(false);
      carton.setSelected(false);
      kg.setSelected(false);
    }//GEN-LAST:event_trayActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        
        if(mug1!=null||mug2!=null||mug3!=null||mug4!=null)
          {
          mug1.setText("");
          mug2.setText("");
          mug3.setText("");
          mug4.setText("");
          kg.setSelected(false);
          g.setSelected(false);
          Tin.setSelected(false);
          loaf.setSelected(false);
          tray.setSelected(false);
          carton.setSelected(false);
          
                  }else
          JOptionPane.showMessageDialog(null,"Failed to clear record..");
    
        
        

    }//GEN-LAST:event_clrActionPerformed

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
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Tin;
    private javax.swing.JRadioButton carton;
    private javax.swing.JButton clr;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JRadioButton g;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton kg;
    private javax.swing.JRadioButton loaf;
    private javax.swing.JTextField mug1;
    private javax.swing.JTextField mug2;
    private javax.swing.JTextField mug3;
    private javax.swing.JTextField mug4;
    private javax.swing.JTable t;
    private javax.swing.JRadioButton tray;
    // End of variables declaration//GEN-END:variables
}
