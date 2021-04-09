package agenda;

import java.util.Arrays;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 *
 * @author Cande Godoy
 */
public class Inicio extends javax.swing.JFrame {
    int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] nombres = {"", "", "", "", "", "", "", "", "", ""};
    String[] apellidos = {"", "", "", "", "", "", "", "", "", ""};
    String[] direcciones = {"", "", "", "", "", "", "", "", "", ""};
    String[] telefonos = {"", "", "", "", "", "", "", "", "", ""};
    int[] edad = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    
    public Inicio() {
        initComponents();
    }
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        numeroL = new javax.swing.JLabel();
        nombreL = new javax.swing.JLabel();
        apellidoL = new javax.swing.JLabel();
        nombreText = new javax.swing.JTextField();
        apellidoText = new javax.swing.JTextField();
        telefonoText = new javax.swing.JTextField();
        edadText = new javax.swing.JTextField();
        direccionL = new javax.swing.JLabel();
        telefonoL = new javax.swing.JLabel();
        edadL = new javax.swing.JLabel();
        direccionText = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();
        adelante = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        indiceL = new javax.swing.JLabel();
        indiceText = new javax.swing.JTextField();
        modificar = new javax.swing.JButton();
        numeroText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        titulo.setText("AGENDA ELECTRÓNICA");

        numeroL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        numeroL.setText("Número:");

        nombreL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        nombreL.setText("Nombre:");

        apellidoL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        apellidoL.setText("Apellido:");

        nombreText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        nombreText.setNextFocusableComponent(apellidoText);

        apellidoText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        apellidoText.setNextFocusableComponent(direccionText);

        telefonoText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        telefonoText.setNextFocusableComponent(edadText);

        edadText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        edadText.setNextFocusableComponent(atras);

        direccionL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        direccionL.setText("Dirección:");

        telefonoL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        telefonoL.setText("Teléfono:");

        edadL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        edadL.setText("Edad:");

        direccionText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        direccionText.setNextFocusableComponent(telefonoText);

        aceptar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        aceptar.setText("Aceptar");
        aceptar.setNextFocusableComponent(adelante);
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        adelante.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        adelante.setText(">>");
        adelante.setToolTipText("");
        adelante.setNextFocusableComponent(modificar);
        adelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adelanteActionPerformed(evt);
            }
        });

        atras.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        atras.setText("<<");
        atras.setToolTipText("");
        atras.setNextFocusableComponent(aceptar);
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        indiceL.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        indiceL.setText("Indice");

        indiceText.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        indiceText.setText("0");
        indiceText.setToolTipText("");
        indiceText.setEnabled(false);
        indiceText.setRequestFocusEnabled(false);

        modificar.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        numeroText.setNextFocusableComponent(nombreText);
        numeroText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroTextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(titulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(indiceText, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adelante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(modificar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(apellidoL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(apellidoText, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreL)
                                    .addComponent(numeroL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreText, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .addComponent(numeroText))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(direccionL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direccionText))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telefonoL)
                                    .addComponent(edadL))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(edadText)
                                    .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(aceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(indiceL)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroL)
                            .addComponent(numeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreL)
                            .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidoL)
                            .addComponent(apellidoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(direccionL)
                            .addComponent(direccionText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoL)
                            .addComponent(telefonoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edadL)
                            .addComponent(edadText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(aceptar)
                .addGap(18, 18, 18)
                .addComponent(indiceL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atras)
                    .addComponent(indiceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adelante)
                    .addComponent(modificar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        int i = Integer.parseInt(numeroText.getText());
        
        if (i < 0 || i > 9) {
            showMessageDialog(null, "El índice ingresado es incorrecto. Pruebe con ingresar un valor"
                    + " entre 0 y 9.");
            limpiar();
        } else {
            nombres[i] = nombreText.getText();
            apellidos[i] = apellidoText.getText();
            direcciones[i] = direccionText.getText();
            telefonos[i] = telefonoText.getText();
            edad[i] = Integer.parseInt(edadText.getText());

            limpiar();
        }
        
        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(apellidos));
        System.out.println(Arrays.toString(direcciones));
        System.out.println(Arrays.toString(telefonos));
        System.out.println(Arrays.toString(edad));
//        
           
    }//GEN-LAST:event_aceptarActionPerformed

    private void adelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adelanteActionPerformed
        // Convierto el texto del box en int
        int valor = Integer.parseInt(indiceText.getText());
        
        // Incremento el valor + 1
        valor++;
        
        // Envio el valor nuevo al box
        indiceText.setText(String.valueOf(valor));
    }//GEN-LAST:event_adelanteActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        // Convierto el texto del box en int
        int valor = Integer.parseInt(indiceText.getText());
        
        // Decremento el valor - 1
        valor--;
        
        // Envio el valor nuevo al box
        indiceText.setText(String.valueOf(valor));

    }//GEN-LAST:event_atrasActionPerformed

    private void numeroTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroTextActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        int i = Integer.parseInt(indiceText.getText());
        
        if (i < 0 && i > 9){
            showMessageDialog(null, "El índice ingresado es incorrecto. Pruebe con valores entre 0 y 9.");
            limpiar();
        } else {
            numeroText.setText(String.valueOf(i));
            nombreText.setText(nombres[i]);
            apellidoText.setText(apellidos[i]);
            direccionText.setText(direcciones[i]);
            telefonoText.setText(telefonos[i]);
            edadText.setText(String.valueOf(edad[i]));
        } 
    }//GEN-LAST:event_modificarActionPerformed

    public void limpiar(){
        numeroText.setText("");
        nombreText.setText("");
        apellidoText.setText("");
        direccionText.setText("");
        telefonoText.setText("");
        edadText.setText("");
    }

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton adelante;
    private javax.swing.JLabel apellidoL;
    private javax.swing.JTextField apellidoText;
    private javax.swing.JButton atras;
    private javax.swing.JLabel direccionL;
    private javax.swing.JTextField direccionText;
    private javax.swing.JLabel edadL;
    private javax.swing.JTextField edadText;
    private javax.swing.JLabel indiceL;
    private javax.swing.JTextField indiceText;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel nombreL;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel numeroL;
    private javax.swing.JTextField numeroText;
    private javax.swing.JLabel telefonoL;
    private javax.swing.JTextField telefonoText;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
