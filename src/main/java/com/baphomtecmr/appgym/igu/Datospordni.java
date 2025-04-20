
package com.baphomtecmr.appgym.igu;

import com.baphomtecmr.appgym.logica.Alumno;
import com.baphomtecmr.appgym.logica.Controladora;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.Timer;


public class Datospordni extends javax.swing.JFrame {

    Controladora control = new Controladora();
    public Datospordni() {
        initComponents();
        agregarEventos();
    }
private void agregarEventos() {
        // Acción al presionar Enter en el JTextField
        txtdniuser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarAlumnoPorDNI();
            }
        });
    }

    private void buscarAlumnoPorDNI() {
    String dniIngresado = txtdniuser.getText().trim();

    if (dniIngresado.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un DNI.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    List<Alumno> listaAlumno = control.traerAlumnos();
    boolean encontrado = false;

    if (listaAlumno != null) {
        int dniIngresadoInt = Integer.parseInt(dniIngresado);
        for (Alumno alumno : listaAlumno) {
            // Verifica que el DNI no sea null antes de comparar
            if  (alumno != null && alumno.getDni() == dniIngresadoInt) {
                encontrado = true;
                    // esta operacion es cuando se busca al usuario y se trae los datos de la BD
                LocalDate fechaActual = LocalDate.now(); // Fecha actual
               
                 //Calcular la diferencia en días
             long diasDiferencia = ChronoUnit.DAYS.between(fechaActual, alumno.getFechaLimite());
             // habria que ir seteando diasDisponible por este calculo
                     
   
                // Crear un JLabel con HTML para formatear el mensaje
                             JLabel label = new JLabel("<html><div style='font-size:20px;'>"
                                + "Alumno: " + alumno.getNombre() + "<br>"
                                + "Días Disponibles: " + diasDiferencia +
                                "</div></html>");
                        label.setHorizontalAlignment(SwingConstants.CENTER);

                        // Establecer un tamaño de fuente más grande
                        label.setFont(new Font("Arial", Font.PLAIN, 30));

                        // Mostrar el mensaje en un JOptionPane
                        JOptionPane optionPane = new JOptionPane(label, JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION);
                JDialog dialog = optionPane.createDialog(this, "Datos del Alumno");
                        dialog.setModal(false); // El cuadro de mensaje no será modal
                        dialog.setVisible(true);

                        // Usar un Timer para cerrar el cuadro de mensaje después de 5 segundos
                        Timer timer = new Timer(5000, e1 -> dialog.dispose()); // Utiliza la variable 'dialog'
                        timer.setRepeats(false); // Solo ejecutar una vez
                        timer.start();

                        break; // Termina la búsqueda una vez encontrado
                    }
                
            }

            if (!encontrado) {
                JOptionPane.showMessageDialog(this, "No se encontró un alumno con el DNI ingresado.", "Resultado", JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtdniuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INGRESE SU DNI:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("INFORMACION DEL USUARIO");

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Administrator\\Documents\\appparagym\\appgym\\src\\main\\java\\com\\baphomtecmr\\appgym\\Captura de pantalla 2025-01-28 105925.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtdniuser, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel14)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdniuser, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtdniuser;
    // End of variables declaration//GEN-END:variables

   
   }
