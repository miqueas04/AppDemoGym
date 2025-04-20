package com.baphomtecmr.appgym.igu;


public class Principalcanva extends javax.swing.JFrame {

   
    public Principalcanva() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAltaUsuaion = new javax.swing.JButton();
        btnConsulEdiBaj = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("PANEL DE ADMINISTRACIÓN");

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\appparagym\\appgym\\src\\main\\java\\com\\baphomtecmr\\appgym\\Captura_de_pantalla_2025-01-27_143916-removebg-preview.png")); // NOI18N
        jLabel2.setText("jLabel2");

        btnAltaUsuaion.setText("REGISTRAR USUARIO");
        btnAltaUsuaion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaUsuaionActionPerformed(evt);
            }
        });

        btnConsulEdiBaj.setText("EDITAR USUARIO");
        btnConsulEdiBaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsulEdiBajActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\appparagym\\appgym\\src\\main\\java\\com\\baphomtecmr\\appgym\\Captura de pantalla 2025-01-28 105925.png")); // NOI18N

        btnDatos.setText("INFORMACION DEL ALUMNO");
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsulEdiBaj, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAltaUsuaion, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDatos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel14))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnAltaUsuaion, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConsulEdiBaj, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Desde el boton llamamos al menu altausuario lo creamos y damos visibilidad
    private void btnAltaUsuaionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaUsuaionActionPerformed
        AltaUsuarios altawg = new AltaUsuarios();
        altawg.setVisible(true);
        altawg.setLocationRelativeTo(null);
        
        
        
        
    }//GEN-LAST:event_btnAltaUsuaionActionPerformed

    
    // Desde el boton llamamos al menu ConsultaEbaj y lo configuramos
    private void btnConsulEdiBajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsulEdiBajActionPerformed
       ConsultaEbaj consulbaja = new ConsultaEbaj();
       consulbaja.setVisible(true);
       consulbaja.setLocationRelativeTo(null);



        
    }//GEN-LAST:event_btnConsulEdiBajActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        Datospordni datosdn = new Datospordni();
        datosdn.setVisible(true);
        datosdn.setLocationRelativeTo(null);
        
        
        
        
        
    }//GEN-LAST:event_btnDatosActionPerformed

    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAltaUsuaion;
    private javax.swing.JButton btnConsulEdiBaj;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
