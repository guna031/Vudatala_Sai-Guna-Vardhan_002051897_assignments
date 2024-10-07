/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import UI.PersonDetailsManager.PersonProfileManagerPanel;
import java.awt.CardLayout;
import model.Address;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author gunav
 */
public class MainJFrame extends javax.swing.JFrame {
    
    private PersonDirectory perDir;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.perDir = new PersonDirectory();
        generateSampleData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        topPanel = new javax.swing.JPanel();
        buttonOpenPerson = new javax.swing.JButton();
        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        topPanel.setBackground(new java.awt.Color(243, 229, 245));

        buttonOpenPerson.setText("Open the Person Application");
        buttonOpenPerson.setBorder(new javax.swing.border.MatteBorder(null));
        buttonOpenPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOpenPersonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(buttonOpenPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(buttonOpenPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        splitPane.setTopComponent(topPanel);

        userProcessContainer.setBackground(new java.awt.Color(243, 229, 245));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(userProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(splitPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOpenPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOpenPersonActionPerformed
        // TODO add your handling code here:
        PersonProfileManagerPanel perMng = new PersonProfileManagerPanel(userProcessContainer, perDir);
        userProcessContainer.add("PersonProfileManagerPanel", perMng);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_buttonOpenPersonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonOpenPerson;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JPanel topPanel;
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables

    public void generateSampleData(){
        
 
        //Person 1 sample data
        Address workAddress = new Address();
        workAddress.setCity("Boston");
        workAddress.setPhnNum(9999999999L);
        workAddress.setState("MA");
        workAddress.setStreetAdd("360 Huntigton AVE");
        workAddress.setUnitNum('1');
        workAddress.setZipcode(02115);
        
        Address homeAddress = new Address();
        homeAddress.setCity("Boston");
        homeAddress.setPhnNum(9999999922L);
        homeAddress.setState("MA");
        homeAddress.setStreetAdd("20 Jamaicaway");
        homeAddress.setUnitNum('1');
        homeAddress.setZipcode(02130);
        
        Person p = perDir.addPerson();
        
        p.setFirstName("Sai");
        p.setLastName("V");
        p.setAge(20);
        p.setSocialSecurityNumber("9291921");
        p.setWorkAdd(workAddress);
        p.setHomeAdd(homeAddress);
        
        Address workAddress2 = new Address();
        workAddress2.setCity("San Francisco");
        workAddress2.setPhnNum(8888888888L);
        workAddress2.setState("CA");
        workAddress2.setStreetAdd("500 Market Street");
        workAddress2.setUnitNum('7');
        workAddress2.setZipcode(94105);

        Address homeAddress2 = new Address();
        homeAddress2.setCity("Oakland");
        homeAddress2.setPhnNum(7777777777L);
        homeAddress2.setState("CA");
        homeAddress2.setStreetAdd("15 Telegraph Avenue");
        homeAddress2.setUnitNum('3');
        homeAddress2.setZipcode(94612);

        Person p2 = perDir.addPerson();
        p2.setFirstName("Alice");
        p2.setLastName("Wong");
        p2.setAge(30);
        p2.setSocialSecurityNumber("8392746");
        p2.setWorkAdd(workAddress2);
        p2.setHomeAdd(homeAddress2);
        
        Address workAddress3 = new Address();
        workAddress3.setCity("Austin");
        workAddress3.setPhnNum(6666666666L);
        workAddress3.setState("TX");
        workAddress3.setStreetAdd("100 Congress Avenue");
        workAddress3.setUnitNum('5');
        workAddress3.setZipcode(78701);

        Address homeAddress3 = new Address();
        homeAddress3.setCity("Round Rock");
        homeAddress3.setPhnNum(5555555555L);
        homeAddress3.setState("TX");
        homeAddress3.setStreetAdd("400 Brushy Creek Road");
        homeAddress3.setUnitNum('9');
        homeAddress3.setZipcode(78664);

        Person p3 = perDir.addPerson();
        p3.setFirstName("David");
        p3.setLastName("Lee");
        p3.setAge(45);
        p3.setSocialSecurityNumber("1273849");
        p3.setWorkAdd(workAddress3);
        p3.setHomeAdd(homeAddress3);
        
        Address workAddress4 = new Address();
        workAddress4.setCity("Seattle");
        workAddress4.setPhnNum(4444444444L);
        workAddress4.setState("WA");
        workAddress4.setStreetAdd("900 Pine Street");
        workAddress4.setUnitNum('B');
        workAddress4.setZipcode(98101);

        Address homeAddress4 = new Address();
        homeAddress4.setCity("Bellevue");
        homeAddress4.setPhnNum(3333333333L);
        homeAddress4.setState("WA");
        homeAddress4.setStreetAdd("700 Bellevue Way NE");
        homeAddress4.setUnitNum('A');
        homeAddress4.setZipcode(98004);

        Person p4 = perDir.addPerson();
        p4.setFirstName("Sophia");
        p4.setLastName("Martinez");
        p4.setAge(27);
        p4.setSocialSecurityNumber("9128745");
        p4.setWorkAdd(workAddress4);
        p4.setHomeAdd(homeAddress4);

        Address workAddress5 = new Address();
        workAddress5.setCity("Miami");
        workAddress5.setPhnNum(2222222222L);
        workAddress5.setState("FL");
        workAddress5.setStreetAdd("123 Ocean Drive");
        workAddress5.setUnitNum('2');
        workAddress5.setZipcode(33139);

        Address homeAddress5 = new Address();
        homeAddress5.setCity("Coral Gables");
        homeAddress5.setPhnNum(1111111111L);
        homeAddress5.setState("FL");
        homeAddress5.setStreetAdd("50 Granada Boulevard");
        homeAddress5.setUnitNum('C');
        homeAddress5.setZipcode(33134);

        Person p5 = perDir.addPerson();
        p5.setFirstName("Carlos");
        p5.setLastName("Garcia");
        p5.setAge(34);
        p5.setSocialSecurityNumber("8391027");
        p5.setWorkAdd(workAddress5);
        p5.setHomeAdd(homeAddress5);



        
    }

}
