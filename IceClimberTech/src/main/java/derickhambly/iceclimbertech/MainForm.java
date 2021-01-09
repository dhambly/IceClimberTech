/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package derickhambly.iceclimbertech;

import com.studiohartman.jamepad.ControllerButton;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derick
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        for (int i = 0; i < 11; i++) {
            timingTable.getColumnModel().getColumn(i).setCellRenderer(new StatusColumnCellRenderer());
        }
        

    }
    private static final DecimalFormat df2 = new DecimalFormat("#.##");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        timingTable = new javax.swing.JTable();
        topHalfBg = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        lowerHalfBg = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        grabEdit = new javax.swing.JButton();
        ccEdit = new javax.swing.JButton();
        pummelEdit = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        dashtograbpanel = new javax.swing.JPanel();
        dashtograbLabel = new javax.swing.JLabel();
        dashtograbFrames = new javax.swing.JLabel();
        dashtograbMS = new javax.swing.JLabel();
        grabtopummelpanel = new javax.swing.JPanel();
        grabtopummelLabel = new javax.swing.JLabel();
        grabtopummelFrames = new javax.swing.JLabel();
        grabtopummelMS = new javax.swing.JLabel();
        grabtoccpanel = new javax.swing.JPanel();
        grabtoccLabel = new javax.swing.JLabel();
        grabtoccFrames = new javax.swing.JLabel();
        grabtoccMS = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        stateLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tick = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(102, 102, 102));

        sidepanel.setBackground(new java.awt.Color(51, 0, 153));

        javax.swing.GroupLayout sidepanelLayout = new javax.swing.GroupLayout(sidepanel);
        sidepanel.setLayout(sidepanelLayout);
        sidepanelLayout.setHorizontalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );
        sidepanelLayout.setVerticalGroup(
            sidepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        timingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        timingTable.setEnabled(false);
        timingTable.setRowHeight(50);
        jScrollPane1.setViewportView(timingTable);

        topHalfBg.setBackground(new java.awt.Color(51, 51, 51));
        topHalfBg.setForeground(new java.awt.Color(51, 51, 51));

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(204, 204, 204));
        titleLabel.setText("Special Cheer Cancel");

        javax.swing.GroupLayout topHalfBgLayout = new javax.swing.GroupLayout(topHalfBg);
        topHalfBg.setLayout(topHalfBgLayout);
        topHalfBgLayout.setHorizontalGroup(
            topHalfBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topHalfBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        topHalfBgLayout.setVerticalGroup(
            topHalfBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topHalfBgLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titleLabel)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        lowerHalfBg.setBackground(new java.awt.Color(51, 51, 51));

        buttonPanel.setBackground(new java.awt.Color(102, 102, 102));
        buttonPanel.setForeground(new java.awt.Color(51, 51, 51));

        grabEdit.setBackground(new java.awt.Color(51, 51, 51));
        grabEdit.setForeground(new java.awt.Color(238, 238, 238));
        grabEdit.setText("Bind Grab");
        grabEdit.setDefaultCapable(false);
        grabEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grabEditActionPerformed(evt);
            }
        });

        ccEdit.setBackground(new java.awt.Color(51, 51, 51));
        ccEdit.setForeground(new java.awt.Color(238, 238, 238));
        ccEdit.setText("Bind CC");
        ccEdit.setDefaultCapable(false);
        ccEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccEditActionPerformed(evt);
            }
        });

        pummelEdit.setBackground(new java.awt.Color(51, 51, 51));
        pummelEdit.setForeground(new java.awt.Color(238, 238, 238));
        pummelEdit.setText("Bind Pummel");
        pummelEdit.setDefaultCapable(false);
        pummelEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pummelEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pummelEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ccEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grabEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grabEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ccEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pummelEdit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        dashtograbpanel.setPreferredSize(new java.awt.Dimension(100, 100));

        dashtograbLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashtograbLabel.setText("Dash To Grab");

        dashtograbFrames.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashtograbFrames.setText("0 frames ");

        dashtograbMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashtograbMS.setText("0 ms");

        javax.swing.GroupLayout dashtograbpanelLayout = new javax.swing.GroupLayout(dashtograbpanel);
        dashtograbpanel.setLayout(dashtograbpanelLayout);
        dashtograbpanelLayout.setHorizontalGroup(
            dashtograbpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashtograbpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dashtograbpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dashtograbLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(dashtograbFrames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dashtograbMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        dashtograbpanelLayout.setVerticalGroup(
            dashtograbpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashtograbpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashtograbLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashtograbFrames, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashtograbMS)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        grabtopummelpanel.setMinimumSize(new java.awt.Dimension(100, 100));
        grabtopummelpanel.setPreferredSize(new java.awt.Dimension(100, 100));

        grabtopummelLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grabtopummelLabel.setText("Grab To Pummel");
        grabtopummelLabel.setToolTipText("");

        grabtopummelFrames.setText("0 frames (+0)");

        grabtopummelMS.setText("0 ms (+0)");

        javax.swing.GroupLayout grabtopummelpanelLayout = new javax.swing.GroupLayout(grabtopummelpanel);
        grabtopummelpanel.setLayout(grabtopummelpanelLayout);
        grabtopummelpanelLayout.setHorizontalGroup(
            grabtopummelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grabtopummelpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grabtopummelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grabtopummelFrames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grabtopummelMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(grabtopummelLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
        );
        grabtopummelpanelLayout.setVerticalGroup(
            grabtopummelpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grabtopummelpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grabtopummelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grabtopummelFrames)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grabtopummelMS)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        grabtoccpanel.setMinimumSize(new java.awt.Dimension(100, 100));
        grabtoccpanel.setPreferredSize(new java.awt.Dimension(100, 100));

        grabtoccLabel.setText("Grab To CC");

        grabtoccFrames.setText("0 frames (+0)");

        grabtoccMS.setText("0 ms (+0)");

        javax.swing.GroupLayout grabtoccpanelLayout = new javax.swing.GroupLayout(grabtoccpanel);
        grabtoccpanel.setLayout(grabtoccpanelLayout);
        grabtoccpanelLayout.setHorizontalGroup(
            grabtoccpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grabtoccpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(grabtoccpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grabtoccLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(grabtoccFrames, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(grabtoccMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        grabtoccpanelLayout.setVerticalGroup(
            grabtoccpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(grabtoccpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(grabtoccLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grabtoccFrames)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grabtoccMS)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel9.setMinimumSize(new java.awt.Dimension(100, 100));
        jPanel9.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        stateLabel.setText("Set Binds");

        jLabel1.setText("state");

        tick.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashtograbpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(grabtoccpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(grabtopummelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(stateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tick, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(tick)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(stateLabel)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(grabtoccpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grabtopummelpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dashtograbpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lowerHalfBgLayout = new javax.swing.GroupLayout(lowerHalfBg);
        lowerHalfBg.setLayout(lowerHalfBgLayout);
        lowerHalfBgLayout.setHorizontalGroup(
            lowerHalfBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lowerHalfBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        lowerHalfBgLayout.setVerticalGroup(
            lowerHalfBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lowerHalfBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lowerHalfBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(sidepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topHalfBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lowerHalfBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidepanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(topHalfBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lowerHalfBg, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void editState(String s) {
        stateLabel.setText(s);
    }
    public void editTick(long l) {
        tick.setText(Long.toString(l));
    }
    public void editDashToGrab(double d) {
        dashtograbMS.setText(Double.toString(d));
        double f = d/16.667;
        dashtograbFrames.setText(df2.format(f));
        timingTable.setValueAt("Z", 0, 0);
        for (int i = 1; i < 11; i++) {
            timingTable.setValueAt("", 0, i);
        }
    }
    public void editGrabToCC(double d) {
        double deltams = 50-d;
        grabtoccMS.setText(Double.toString(d)+" ms ("+(deltams>0?"+":"")+(deltams)+")");
        double f = d/16.667;
        double delta = f-3.0;
        grabtoccFrames.setText(df2.format(f) + " frames ("+(delta>0?"+":"")+(delta)+")");
        int i = (int) Math.rint(f);
        if (i > 10) return;
        timingTable.setValueAt("X", 0, i);
    }
    public void editGrabToPummel(double d){
        double deltams = 0;
        if (d < 67.0){
            deltams = d - 67.0;
        } else if (d > 167){
            deltams = d-167;
        }
        grabtopummelMS.setText(Double.toString(d)+" ms ("+(deltams>0?"+":"")+(deltams)+")");
        double f = d/16.667;
        double delta = 0;
        if (f<4.0) {
            delta = f-4.0;
        } else if (f > 10.0) {
            delta = f-10.0;
        }
        grabtopummelFrames.setText(df2.format(f) + " frames ("+(delta>0?"+":"")+(delta)+")");
        int i = (int) Math.rint(f);
        if (i > 10) return;
        if (timingTable.getValueAt(0, (int)Math.rint(f)).equals("X"))
            timingTable.setValueAt("X + A", 0, i);
        else
            timingTable.setValueAt("A", 0, i);
    }
    
    private void grabEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grabEditActionPerformed
        grabEdit.setText("...");
        Main.setGrab(Main.getNextButton()); 
        grabEdit.setText("Bind Grab");
    }//GEN-LAST:event_grabEditActionPerformed

    private void ccEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccEditActionPerformed
        ccEdit.setText("...");
        try {
            Thread.sleep(10);
            Main.setCC(Main.getNextButton());
            //ccEdit.setText("Bind CC");
        } catch (InterruptedException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        ccEdit.setText("Bind CC");
    }//GEN-LAST:event_ccEditActionPerformed

    private void pummelEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pummelEditActionPerformed
        pummelEdit.setText("...");
        Main.setPummel(Main.getNextButton()); 
        pummelEdit.setText("Bind Pummel");
    }//GEN-LAST:event_pummelEditActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Main.reset();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton ccEdit;
    private javax.swing.JLabel dashtograbFrames;
    private javax.swing.JLabel dashtograbLabel;
    private javax.swing.JLabel dashtograbMS;
    private javax.swing.JPanel dashtograbpanel;
    private javax.swing.JButton grabEdit;
    private javax.swing.JLabel grabtoccFrames;
    private javax.swing.JLabel grabtoccLabel;
    private javax.swing.JLabel grabtoccMS;
    private javax.swing.JPanel grabtoccpanel;
    private javax.swing.JLabel grabtopummelFrames;
    private javax.swing.JLabel grabtopummelLabel;
    private javax.swing.JLabel grabtopummelMS;
    private javax.swing.JPanel grabtopummelpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel lowerHalfBg;
    private javax.swing.JButton pummelEdit;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel stateLabel;
    private javax.swing.JLabel tick;
    private javax.swing.JTable timingTable;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel topHalfBg;
    // End of variables declaration//GEN-END:variables
}
