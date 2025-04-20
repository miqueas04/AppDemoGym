
package com.baphomtecmr.appgym.igu;

import com.baphomtecmr.appgym.logica.Alumno;
import com.baphomtecmr.appgym.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultaEbaj extends javax.swing.JFrame {

    public ConsultaEbaj() {
        initComponents();
    }
    Controladora control = new Controladora();
    // </editor-fold>
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("CONSULTA, EDICION O BAJA");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 977, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel(){
            //configura las filas y columnas para no ser  editadas
            @Override// sobreescribe el metodo de la tabla
            public boolean isCellEditable(int row, int column){
            
                return false;
            
            }
            };
            
            //ponemos  titulosa las columnas
            String titulos[]={"id", "nombre", "Ingreso", "Limite", "Dias Asignados", "Edad", "Peso", "Altura", "Dni", "Cel", "Direccion", "Observaciones"};
            modeloTabla.setColumnIdentifiers(titulos);
            
            List <Alumno> listaAlumno = control.traerAlumnos();
            
            //seter datos de la tabla
            
            if (listaAlumno !=null)
            {    
            for  (Alumno alumnos : listaAlumno)
                
            {
                Object[] objecto = {alumnos.getId(), alumnos.getNombre(), alumnos.getFechaIngreso(), alumnos.getFechaLimite(), alumnos.getDiasDispo(), alumnos.getEdad(), alumnos.getPeso(), alumnos.getAltura(), alumnos.getDni(), alumnos.getCel(), alumnos.getDirec(), alumnos.getObservaciones() };
                modeloTabla.addRow(objecto);
                
            }
            }     
           
            
            tablaDatos.setModel(modeloTabla);
            
            
            
         
            

}
 
    //Cuando el jframe se abre rellena la tabla de forma automatica
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    
    }//GEN-LAST:event_formWindowOpened

    
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        //Control  de que la tabla no esté vacía
        if (tablaDatos.getRowCount() > 0){
         //valido que se haya seleccionado un registro
         
         if(tablaDatos.getSelectedRow() != -1){
         
         //OBTENER LA ID DEL AUTO QUE QUIERO BORRAR
         
         int idAlumno = Integer.parseInt(String.valueOf(tablaDatos.getValueAt(tablaDatos.getSelectedRow(), 0)));
         
         control.borraAlumno(idAlumno);
         mostrarMensaje("Alumno borrado correctamente","Info","Borrado con exito");
         cargarTabla();
         }
         else{
             mostrarMensaje("No seleccionó un registro para eliminar ","Error","Fallo al borrar");
             
         } 
        } 
        else{
        
        mostrarMensaje("No se pudo borrar ","Error","Fallo al borrar");
        
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    public void mostrarMensaje (String mensaje, String tipo, String titulo){
    
    JOptionPane optionPane = new JOptionPane(mensaje);
    if (tipo.equals("Info")){
    
    optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
    }
    else if (tipo.equals("Error")){
        
        optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);   
    }
    
    JDialog dialog = optionPane.createDialog(titulo);    
    dialog.setAlwaysOnTop(true);
    dialog.setVisible(true);
    } 
            
       
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        //Control  de que la tabla no esté vacía
        if (tablaDatos.getRowCount() > 0){
         //valido que se haya seleccionado un registro
         
         if(tablaDatos.getSelectedRow() != -1){
        // se toma la ID a modificar
            int idAlumno = Integer.parseInt(String.valueOf(tablaDatos.getValueAt(tablaDatos.getSelectedRow(), 0))); 
             // Le pasamos a la interface modifAlum la id del usuario por constructor
             ModifAlum modifA = new ModifAlum(idAlumno);
             modifA.setVisible(true);
             modifA.setLocationRelativeTo(null);
             this.dispose();
        }
         else{
             mostrarMensaje("No seleccionó un registro para modificar ","Error","Fallo al modificar");
             
         } 
        } 
        else{
        
        mostrarMensaje("No se pudo modificar ","Error","Fallo al modificar");
        
        }
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    
    
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_btnActualizarActionPerformed
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables

    
}


