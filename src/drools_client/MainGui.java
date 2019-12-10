/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drools_client;

import drools_client.jdbc.Database;
import drools_client.model.BloodSample;
import drools_client.model.Client;
import drools_client.model.Employee;
import drools_client.model.Results;
import java.awt.GridLayout;
import java.util.Arrays;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author matri
 */
public class MainGui extends javax.swing.JFrame {

    private BloodSample sample;
    private boolean isCheckSample = false;
    private Client client;
    private Employee employee;
    private Results result;
    
    
    public MainGui() {
        initComponents();
        generateSampleButton.setVisible(false);
        searchClientButton.setVisible(false);
        checkSample_button.setVisible(false);
        saveResultsButton.setVisible(false);
        deleteResultsButton.setVisible(false);
        
        nameLabel.setVisible(false);
        lastNameLabel.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generateSampleButton = new javax.swing.JButton();
        jPanel_table = new javax.swing.JPanel();
        tab_pane = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        pesel_field = new javax.swing.JTextField();
        checkSample_button = new javax.swing.JButton();
        searchClientButton = new javax.swing.JButton();
        loginEmployeeButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        employeeIdField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        saveResultsButton = new javax.swing.JButton();
        deleteResultsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generateSampleButton.setText("Generate sample");
        generateSampleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateSampleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_tableLayout = new javax.swing.GroupLayout(jPanel_table);
        jPanel_table.setLayout(jPanel_tableLayout);
        jPanel_tableLayout.setHorizontalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_tableLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(tab_pane, javax.swing.GroupLayout.PREFERRED_SIZE, 983, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel_tableLayout.setVerticalGroup(
            jPanel_tableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tab_pane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
        );

        jLabel1.setText("Client pesel:");

        checkSample_button.setText("Check sample");
        checkSample_button.setEnabled(false);
        checkSample_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSample_buttonActionPerformed(evt);
            }
        });

        searchClientButton.setText("Search for Client");
        searchClientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchClientButtonActionPerformed(evt);
            }
        });

        loginEmployeeButton.setText("Login employee");
        loginEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginEmployeeButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Employee id:");

        nameLabel.setText("jLabel3");

        lastNameLabel.setText("jLabel4");

        saveResultsButton.setText("Save results");
        saveResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveResultsButtonActionPerformed(evt);
            }
        });

        deleteResultsButton.setText("Delete Results");
        deleteResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteResultsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(52, 52, 52)
                        .addComponent(lastNameLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pesel_field, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(employeeIdField))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginEmployeeButton)
                            .addComponent(searchClientButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(saveResultsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(generateSampleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(checkSample_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteResultsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginEmployeeButton)
                    .addComponent(jLabel2)
                    .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pesel_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchClientButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(lastNameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel_table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateSampleButton)
                    .addComponent(checkSample_button))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveResultsButton)
                    .addComponent(deleteResultsButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateSampleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateSampleButtonActionPerformed
        sample = Utils.generateBloodSample();

        System.out.println(sample.toString());
        createTable(sample);
        checkSample_button.setEnabled(true);
        checkSample_button.setVisible(true);
        
    }//GEN-LAST:event_generateSampleButtonActionPerformed

    private void checkSample_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSample_buttonActionPerformed
        if(!isCheckSample){
            result = Utils.postBloodSample(sample);
            showResults(result);
            isCheckSample = true;
            saveResultsButton.setVisible(true);
            deleteResultsButton.setVisible(true);
        }
    }//GEN-LAST:event_checkSample_buttonActionPerformed

    private void setEmployee(){
        employee = Database.getEmployee(Integer.parseInt(employeeIdField.getText()));
        
        if(employee != null && employee.getData_urodzenia()==null){
            employee = registerEmployee();
            Database.registerEmplyee(employee);
            employee = Database.getEmployee(Integer.parseInt(employeeIdField.getText()));
        }
                
        searchClientButton.setVisible(true);
    }
    
    private void searchClientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchClientButtonActionPerformed
        client = Database.getClient(pesel_field.getText());
        if(client.getData_urodzenia() == null){
            client = registerClient();
            Database.registerClient(client);
            client = Database.getClient(pesel_field.getText());
        }
        nameLabel.setText(client.getImie());
        nameLabel.setVisible(true);
        
        lastNameLabel.setText(client.getNazwisko());
        lastNameLabel.setVisible(true);
        
        generateSampleButton.setVisible(true);
    }//GEN-LAST:event_searchClientButtonActionPerformed

    private void loginEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginEmployeeButtonActionPerformed
        if(!"".equals(employeeIdField.getText())){
            setEmployee();
        }
    }//GEN-LAST:event_loginEmployeeButtonActionPerformed

    private void saveResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveResultsButtonActionPerformed
        Database.registerResults(result, client, employee);
    }//GEN-LAST:event_saveResultsButtonActionPerformed

    private void deleteResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteResultsButtonActionPerformed
        tab_pane.removeAll();
        result = null;
        sample = null;
        
        deleteResultsButton.setVisible(false);
        saveResultsButton.setVisible(false);
        isCheckSample = false;
    }//GEN-LAST:event_deleteResultsButtonActionPerformed

    
    private Employee registerEmployee(){
      JTextField name = new JTextField(5);
      JTextField lastName = new JTextField();
      JTextField birthday = new JTextField();


      JPanel myPanel = new JPanel(new GridLayout(0, 1, 5, 5));
      myPanel.add(new JLabel("Name:"));
      myPanel.add(name);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Last name:"));
      myPanel.add(lastName);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("birthday(rrrr-mm-dd):"));
      myPanel.add(birthday);

      int result = JOptionPane.showConfirmDialog(null, new JScrollPane(myPanel), 
               "Please enter informations", JOptionPane.OK_OPTION);
      if (result == JOptionPane.OK_OPTION) {
          if("".equals(name.getText())){
              JOptionPane.showMessageDialog(null, "Empty name field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }
          if("".equals(lastName.getText())){
              JOptionPane.showMessageDialog(null, "Empty last name field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }
          if("".equals(birthday.getText())){
              JOptionPane.showMessageDialog(null, "Empty birthday field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }



            Employee emplyee = new Employee(name.getText(), lastName.getText(), birthday.getText(),"recepcjonista");
            return emplyee;
      }
     return null;
    }
    
    
    private Client registerClient(){
      JTextField name = new JTextField(5);
      JTextField lastName = new JTextField();
      JTextField phone = new JTextField();
      JTextField birthday = new JTextField();
      JTextField pesel = new JTextField();

      JPanel myPanel = new JPanel(new GridLayout(0, 1, 5, 5));
      myPanel.add(new JLabel("Name:"));
      myPanel.add(name);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("Last name:"));
      myPanel.add(lastName);
      myPanel.add(new JLabel("Phone Number:"));
      myPanel.add(phone);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("birthday(rrrr-mm-dd):"));
      myPanel.add(birthday);
      myPanel.add(Box.createHorizontalStrut(15)); // a spacer
      myPanel.add(new JLabel("PESEL:"));
      myPanel.add(pesel);
      int result = JOptionPane.showConfirmDialog(null, new JScrollPane(myPanel), 
               "Please enter informations", JOptionPane.OK_OPTION);
      if (result == JOptionPane.OK_OPTION) {
          if("".equals(name.getText())){
              JOptionPane.showMessageDialog(null, "Empty name field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }
          if("".equals(lastName.getText())){
              JOptionPane.showMessageDialog(null, "Empty last name field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }
          if("".equals(phone.getText())){
              JOptionPane.showMessageDialog(null, "Empty phone number field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }
          if("".equals(birthday.getText())){
              JOptionPane.showMessageDialog(null, "Empty birthday field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }
          if("".equals(pesel.getText())){
              JOptionPane.showMessageDialog(null, "Empty pesel field", "alert", JOptionPane.ERROR_MESSAGE);
              return null;
          }


            Client client = new Client(name.getText(), lastName.getText(), birthday.getText(), phone.getText(), pesel.getText());
            return client;
      }
     return null;
    }
    
    
    private void showResults(Results cResults){
        String[] column = {"Pozytywne Badania"};
        
        String[] tmp = cResults.getArray();
        
        String[][] data = new String[tmp.length][1];
        
        for(int i=0; i<tmp.length; i++){
            data[i][0] = tmp[i]; 
        }
        
        System.out.println();
        
        JTable table = new JTable(data, column);
        
        tab_pane.add("Results", new JScrollPane(table));
    }
    
    private void createTable(BloodSample cSample){
        if(tab_pane.getTabCount()>0){
            tab_pane.removeAll();
        }
        
        JTable table = new JTable(Utils.getData(cSample), Utils.COLUMNS ); 
        
        table.getModel().addTableModelListener((TableModelEvent e) -> {
            System.out.println(e.getFirstRow());
        });
        
        tab_pane.addTab("Blood Sample", new JScrollPane(table));
        isCheckSample = false;
    }
    
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
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkSample_button;
    private javax.swing.JButton deleteResultsButton;
    private javax.swing.JTextField employeeIdField;
    private javax.swing.JButton generateSampleButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel_table;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JButton loginEmployeeButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField pesel_field;
    private javax.swing.JButton saveResultsButton;
    private javax.swing.JButton searchClientButton;
    private javax.swing.JTabbedPane tab_pane;
    // End of variables declaration//GEN-END:variables
}
