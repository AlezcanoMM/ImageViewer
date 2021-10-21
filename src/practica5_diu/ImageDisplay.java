package practica5_diu;

import java.awt.event.ItemEvent;

public class ImageDisplay extends javax.swing.JFrame {
    private boolean c_red;
    private boolean c_green;
    private boolean c_blue;
    public ImageDisplay() {
        initComponents();
        initCheckBoxs();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        drawPanel = new practica5_diu.canvast();
        titlePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        configPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        redCB = new javax.swing.JCheckBox();
        greenCB = new javax.swing.JCheckBox();
        blueCB = new javax.swing.JCheckBox();
        allCB = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        radioTR = new javax.swing.JRadioButton();
        radioTL = new javax.swing.JRadioButton();
        radioBR = new javax.swing.JRadioButton();
        radioBL = new javax.swing.JRadioButton();
        namePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drawPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout drawPanelLayout = new javax.swing.GroupLayout(drawPanel);
        drawPanel.setLayout(drawPanelLayout);
        drawPanelLayout.setHorizontalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 563, Short.MAX_VALUE)
        );
        drawPanelLayout.setVerticalGroup(
            drawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );

        titlePanel.setBackground(new java.awt.Color(248, 213, 213));
        titlePanel.setLayout(new java.awt.GridBagLayout());

        title.setBackground(new java.awt.Color(247, 190, 190));
        title.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        title.setText("Image Viewer");
        titlePanel.add(title, new java.awt.GridBagConstraints());

        configPanel.setBackground(new java.awt.Color(248, 223, 223));
        configPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Configuration"));
        configPanel.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Image color channels:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(jLabel3, gridBagConstraints);

        redCB.setBackground(new java.awt.Color(249, 201, 201));
        redCB.setSelected(true);
        redCB.setText("Red");
        redCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                redCBItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(redCB, gridBagConstraints);

        greenCB.setBackground(new java.awt.Color(249, 201, 201));
        greenCB.setSelected(true);
        greenCB.setText("Green");
        greenCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                greenCBItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(greenCB, gridBagConstraints);

        blueCB.setBackground(new java.awt.Color(249, 201, 201));
        blueCB.setSelected(true);
        blueCB.setText("Blue");
        blueCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                blueCBItemStateChanged(evt);
            }
        });
        blueCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueCBActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(blueCB, gridBagConstraints);

        allCB.setBackground(new java.awt.Color(249, 201, 201));
        allCB.setSelected(true);
        allCB.setText("All");
        allCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                allCBItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(allCB, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Logo position");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(jLabel4, gridBagConstraints);

        radioTR.setBackground(new java.awt.Color(249, 201, 201));
        buttonGroup1.add(radioTR);
        radioTR.setText("Top-Right");
        radioTR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTRActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(radioTR, gridBagConstraints);

        radioTL.setBackground(new java.awt.Color(249, 201, 201));
        buttonGroup1.add(radioTL);
        radioTL.setText("Top-Left");
        radioTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTLActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(radioTL, gridBagConstraints);

        radioBR.setBackground(new java.awt.Color(249, 201, 201));
        buttonGroup1.add(radioBR);
        radioBR.setText("Bottom-Right");
        radioBR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBRActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(radioBR, gridBagConstraints);

        radioBL.setBackground(new java.awt.Color(249, 201, 201));
        buttonGroup1.add(radioBL);
        radioBL.setText("Bottom-Left");
        radioBL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBLActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        configPanel.add(radioBL, gridBagConstraints);

        namePanel.setBackground(new java.awt.Color(251, 226, 226));
        namePanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Abiam Remache González");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        namePanel.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Alejandro Lezcano de Mújica Montesdeoca");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        namePanel.add(jLabel2, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(drawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(titlePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(configPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                    .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(drawPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(configPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(namePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void redCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_redCBItemStateChanged
        // TODO add your handling code here:
        if(c_green || c_blue){
            c_red = (evt.getStateChange()==ItemEvent.SELECTED)?Boolean.TRUE:Boolean.FALSE;
            if(!c_red) allCB.setSelected(c_red);
        }else{
            redCB.setSelected(Boolean.TRUE);
        }
        changeImageDisplay();
    }//GEN-LAST:event_redCBItemStateChanged

    private void greenCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_greenCBItemStateChanged
        // TODO add your handling code here:
        if(c_red || c_blue){
            c_green = (evt.getStateChange()==ItemEvent.SELECTED)?Boolean.TRUE:Boolean.FALSE;
            if(!c_green) allCB.setSelected(c_green);
        }else{
            greenCB.setSelected(Boolean.TRUE);
        }
        changeImageDisplay();
    }//GEN-LAST:event_greenCBItemStateChanged

    private void blueCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_blueCBItemStateChanged
        // TODO add your handling code here:
        if(c_green || c_red) {
            c_blue = (evt.getStateChange()==ItemEvent.SELECTED)?Boolean.TRUE:Boolean.FALSE;
            if(!c_blue) allCB.setSelected(c_blue);
        }else{
            blueCB.setSelected(Boolean.TRUE);
        }
        changeImageDisplay();
    }//GEN-LAST:event_blueCBItemStateChanged

    private void allCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_allCBItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange()==ItemEvent.SELECTED){
            initCheckBoxs();
            greenCB.setSelected(Boolean.TRUE);
            redCB.setSelected(Boolean.TRUE);
            blueCB.setSelected(Boolean.TRUE);
        }
        changeImageDisplay();
    }//GEN-LAST:event_allCBItemStateChanged

    private void blueCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blueCBActionPerformed

    private void radioTRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTRActionPerformed
        // TODO add your handling code here:
        drawPanel.setLogoPosition(canvast.x_righ, canvast.y_top);
    }//GEN-LAST:event_radioTRActionPerformed

    private void radioTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTLActionPerformed
        // TODO add your handling code here:
        drawPanel.setLogoPosition(canvast.x_left, canvast.y_top);
    }//GEN-LAST:event_radioTLActionPerformed

    private void radioBRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBRActionPerformed
        // TODO add your handling code here:
        drawPanel.setLogoPosition(canvast.x_righ, canvast.y_bottom);
    }//GEN-LAST:event_radioBRActionPerformed

    private void radioBLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBLActionPerformed
        // TODO add your handling code here:
        drawPanel.setLogoPosition(canvast.x_left, canvast.y_bottom);
    }//GEN-LAST:event_radioBLActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox allCB;
    private javax.swing.JCheckBox blueCB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel configPanel;
    private practica5_diu.canvast drawPanel;
    private javax.swing.JCheckBox greenCB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel namePanel;
    private javax.swing.JRadioButton radioBL;
    private javax.swing.JRadioButton radioBR;
    private javax.swing.JRadioButton radioTL;
    private javax.swing.JRadioButton radioTR;
    private javax.swing.JCheckBox redCB;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

    private void changeImageDisplay() {
        drawPanel.changeImageChannels(c_red,c_green,c_blue);
    }

    private void initCheckBoxs() {
        c_green = Boolean.TRUE;
        c_red = Boolean.TRUE;
        c_blue = Boolean.TRUE;
    }
}
