package wlan.utility;

import java.awt.Color;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Neeraj
 */
public class landing_page extends javax.swing.JFrame 
{
    /**
     * Creates new form landing_page
     */
    public landing_page() 
    {
        initComponents();
    }
    
    String ssid_name;
    String ssid_pass;
    String stop_cmd = "netsh wlan stop hostednetwork";
    String restart_cmd  = "netsh wlan stop hostednetwork && netsh wlan start hostednetwork";
    String start_cmd;
    
    
    
    public void stop_func()
   {
        try 
        {
            Process process = Runtime.getRuntime().exec(stop_cmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
                while((line = reader.readLine()) != null)
                {
                    status_field.append(line);
                    System.out.println(line);
                }
         } 
        catch (IOException e) 
        {}
   }
		
    public void restart_func()
   {
    try 
        {
           Process process = Runtime.getRuntime().exec(restart_cmd);
           BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
           String line;
           while ((line = reader.readLine()) != null)
            {
                status_field.setText(line);
                System.out.println(line);
            }
         } 
        catch (IOException e) 
        {}
   }
    
    public void reset_func()
   {
    try 
        {
            Process process = Runtime.getRuntime().exec(stop_cmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null)
            {
                status_field.append(line);
                System.out.println(line);
            }
        } 
        catch (IOException e) 
        {}
   }
    
     public void start_func()
   {
       String predefined_cmd = "netsh wlan set hostednetwork mode=allow ssid=";
       StringBuilder final_cmd = new StringBuilder();
       final_cmd.append(predefined_cmd).append(ssid_name).append(" key=").append(ssid_pass);
       start_cmd = final_cmd.toString();
        try 
        {
            Process process = Runtime.getRuntime().exec(stop_cmd);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
                while((line = reader.readLine()) != null)
                {
                    status_field.append(line);
                    System.out.println(line);
                }
                status_field.setText(start_cmd);
                System.out.println(start_cmd);
         } 
        catch (IOException e) 
        {}
   }
	
	
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pass_field = new javax.swing.JPasswordField();
        ssid_field = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        start_btn = new javax.swing.JButton();
        pass_checkbox = new javax.swing.JCheckBox();
        stop_btn = new javax.swing.JButton();
        restart_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        status_field = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        ssid_clr_btn = new javax.swing.JButton();
        pass_clr_btn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WLAN Utility");
        setBounds(new java.awt.Rectangle(450, 190, 12, 0));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("WLAN Utility");

        pass_field.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pass_field.setToolTipText("Enter password here, must be greater than 8 characters");
        pass_field.setEnabled(false);
        pass_field.setPreferredSize(new java.awt.Dimension(56, 20));
        pass_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_fieldActionPerformed(evt);
            }
        });

        ssid_field.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ssid_field.setToolTipText("Enter the name to display as a network name");
        ssid_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssid_fieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("SSID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Password");

        start_btn.setText("START");
        start_btn.setToolTipText("Wireless Hotspot will started with entered credentials");
        start_btn.setBorder(null);
        start_btn.setBorderPainted(false);
        start_btn.setPreferredSize(new java.awt.Dimension(77, 23));
        start_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_btnActionPerformed(evt);
            }
        });

        pass_checkbox.setText("Use Password");
        pass_checkbox.setPreferredSize(new java.awt.Dimension(93, 21));
        pass_checkbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_checkboxActionPerformed(evt);
            }
        });

        stop_btn.setText("STOP");
        stop_btn.setToolTipText("Hotspot will be terminated");
        stop_btn.setBorderPainted(false);
        stop_btn.setPreferredSize(new java.awt.Dimension(77, 23));
        stop_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stop_btnActionPerformed(evt);
            }
        });

        restart_btn.setText("RESTART");
        restart_btn.setToolTipText("Hotspot will be stopped and then restarted");
        restart_btn.setBorderPainted(false);
        restart_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restart_btnActionPerformed(evt);
            }
        });

        reset_btn.setText("RESET");
        reset_btn.setToolTipText("Hotspot will terminated and gets deleted (needs new credentials)");
        reset_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reset_btn.setBorderPainted(false);
        reset_btn.setPreferredSize(new java.awt.Dimension(77, 23));
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        status_field.setEditable(false);
        status_field.setColumns(10);
        status_field.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        status_field.setRows(100);
        status_field.setToolTipText("Drag Useful info from here using Copy & Paste");
        status_field.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        status_field.setDragEnabled(true);
        jScrollPane1.setViewportView(status_field);

        ssid_clr_btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        ssid_clr_btn.setText("Clear");
        ssid_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssid_clr_btnActionPerformed(evt);
            }
        });

        pass_clr_btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pass_clr_btn.setText("Clear");
        pass_clr_btn.setEnabled(false);
        pass_clr_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_clr_btnActionPerformed(evt);
            }
        });

        jMenu1.setText("Commands");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem2.setText("How to ?");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenu5.setText("Pre-Checks");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem9.setText("Check for Drivers");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenu1.add(jMenu5);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Reset Everthing");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Exit");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("More");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem6.setText("Usage");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItem7.setText("Terms of Service");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setText("About");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem5.setText("Developer");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ssid_clr_btn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(pass_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(pass_clr_btn))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ssid_field, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(start_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stop_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restart_btn)
                            .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ssid_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(7, 7, 7)
                        .addComponent(ssid_clr_btn)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(pass_field, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addComponent(pass_clr_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(start_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(stop_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(restart_btn)
                        .addGap(11, 11, 11)
                        .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass_checkbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pass_checkboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_checkboxActionPerformed
        if (pass_checkbox.isSelected())
        {
            pass_field.setEnabled(true);
            pass_clr_btn.setEnabled(true);
        }
        else
        {
            ssid_pass = null;
            pass_field.setEnabled(false);
            pass_clr_btn.setEnabled(false);
        }
    }//GEN-LAST:event_pass_checkboxActionPerformed

    private void pass_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_fieldActionPerformed

    private void start_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_btnActionPerformed
    ssid_pass = new String(pass_field.getPassword());
    status_field.setForeground(Color.black);
    //status_field.setText("here am i"); // fault happening at last phase of starting the wlan
       // status_field.setText("Information filled sucessfully..");
       
        if(ssid_field.getText().isEmpty())
        {
            status_field.setText("Enter SSID name...");
            ssid_name  = ssid_field.getText();
                
               if(pass_checkbox.isSelected())
               {
                 if(ssid_pass.isEmpty() && ssid_name.isEmpty())
                    {
                     status_field.setForeground(Color.red);
                     status_field.setText("Please Enter SSID name and Password..");
                     ssid_name  = ssid_field.getText();
                     ssid_pass = new String(pass_field.getPassword());
                     start_func();
                    }
               }
        }
        
        else if(!pass_checkbox.isSelected())
        {
            ssid_pass = "default (since not selected)";
        }
        
        else if(pass_checkbox.isSelected())
            {
                if(ssid_pass.isEmpty())
                    {
                     status_field.append("\nPassword can't be left empty !!!");
                     status_field.setForeground(Color.red);
                     ssid_pass = new String(pass_field.getPassword());
                    }
                start_func();
            }
        else
        {
            status_field.setForeground(Color.black);
            status_field.setText("everything seems done..");
            start_func();
        }   
    }//GEN-LAST:event_start_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
       //resetting/clearing all fields 
       status_field.setText("");
       ssid_field.setText("");
       pass_field.setText("");
       reset_func();  
    }//GEN-LAST:event_reset_btnActionPerformed

    private void stop_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stop_btnActionPerformed
       /*driver_code stop = new driver_code();
       stop.stop_func();
       // as the above class was there in version 1.0
       
        try 
        {
            Process process = Runtime.getRuntime().exec(stop_cmd);
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) 
            {
                String line;
                while ((line = reader.readLine()) != null)
                {
                    status_field.setText(line);
                    System.out.println(line);
                }
            }
        } 
       
        catch (IOException e) 
        {
            
        }     */
       stop_func();
    }//GEN-LAST:event_stop_btnActionPerformed

    private void ssid_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssid_clr_btnActionPerformed
        ssid_field.setText("");   //will clear the ssid field   
    }//GEN-LAST:event_ssid_clr_btnActionPerformed

    private void ssid_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssid_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssid_fieldActionPerformed

    private void pass_clr_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_clr_btnActionPerformed
       pass_field.setText("");    //will clear the password field
    }//GEN-LAST:event_pass_clr_btnActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String url = "https://github.com/CodyNeeraj/wlan-hotspot-for-windows";

        if(Desktop.isDesktopSupported())
        {
            Desktop desktop = Desktop.getDesktop();
            try 
            {
                desktop.browse(new URI(url));
            } catch (IOException | URISyntaxException e)
            {
                // TODO Auto-generated catch block

            }
        }
        //for cross platform dependancy (if used other than in windows)
        /*else
        {
            Runtime runtime = Runtime.getRuntime();
            try 
            {
                runtime.exec("xdg-open " + url);
            } 
            catch (IOException e) 
            {
                // TODO Auto-generated catch block

            }
        
        //else block is for cross platform dependancy only
        
        */
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
      try
      {
          
          
        Runtime.getRuntime().exec(new String[] {"cmd","/c","start","netsh", "wlan" ,"show" ,"drivers"});
            
            
              
          // can be used in this way JVM garbage collector is best in random objects
          // String cmd = "cmd.exe /c start netsh wlan show drivers"; 
        } 
      catch (IOException ex)
         {
            Logger.getLogger(landing_page.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void restart_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restart_btnActionPerformed
       
       restart_func();
    }//GEN-LAST:event_restart_btnActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landing_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new landing_page().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JCheckBox pass_checkbox;
    private javax.swing.JButton pass_clr_btn;
    private javax.swing.JPasswordField pass_field;
    private javax.swing.JButton reset_btn;
    private javax.swing.JButton restart_btn;
    private javax.swing.JButton ssid_clr_btn;
    private javax.swing.JTextField ssid_field;
    private javax.swing.JButton start_btn;
    private javax.swing.JTextArea status_field;
    private javax.swing.JButton stop_btn;
    // End of variables declaration//GEN-END:variables
}
