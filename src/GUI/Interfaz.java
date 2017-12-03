/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author aleja
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Titulo_Numero_de_paginas = new javax.swing.JLabel();
        Numero_de_Paginas_MP = new javax.swing.JTextField();
        Iniciar = new javax.swing.JButton();
        Parar = new javax.swing.JButton();
        Titulo_Procesador = new javax.swing.JLabel();
        Titulo_Proceso_Ejecutando = new javax.swing.JLabel();
        Proceso_Ejecutando = new javax.swing.JTextField();
        Titulo_Pagina_Ejecutando = new javax.swing.JLabel();
        Pagina_Ejecutando = new javax.swing.JTextField();
        Titulo_Memoria_Principal = new javax.swing.JLabel();
        Titulo_Almacenamineto_Secundario = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Memoria_Principal = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        Almacenamiento_Secundario = new javax.swing.JTextArea();
        Opciones_Procesos = new javax.swing.JComboBox<>();
        Titulo_Ejecutar_Proceso = new javax.swing.JLabel();
        Ejecutar = new javax.swing.JButton();
        Titulo_Crear_Proceso = new javax.swing.JLabel();
        Titulo_Paginas_Proceso_Crear = new javax.swing.JLabel();
        Paginas_Proceso_Crear = new javax.swing.JTextField();
        Titulo_Orden_Proceso_Crear = new javax.swing.JLabel();
        Orden_Proceso_Crear = new javax.swing.JTextField();
        Crear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        Titulo.setText("Simulación AM.");

        Titulo_Numero_de_paginas.setText("Número de Páginas Memoria Principal.");

        Numero_de_Paginas_MP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Numero_de_Paginas_MPActionPerformed(evt);
            }
        });

        Iniciar.setText("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        Parar.setText("Parar");
        Parar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararActionPerformed(evt);
            }
        });

        Titulo_Procesador.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Titulo_Procesador.setText("Procesador");

        Titulo_Proceso_Ejecutando.setText("Proceso:");

        Proceso_Ejecutando.setText(" ");
        Proceso_Ejecutando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Proceso_EjecutandoActionPerformed(evt);
            }
        });

        Titulo_Pagina_Ejecutando.setText("Página:");

        Pagina_Ejecutando.setText(" ");
        Pagina_Ejecutando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pagina_EjecutandoActionPerformed(evt);
            }
        });

        Titulo_Memoria_Principal.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Titulo_Memoria_Principal.setText("Memoria Principal");

        Titulo_Almacenamineto_Secundario.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Titulo_Almacenamineto_Secundario.setText("Alacenamiento Secundario");

        Memoria_Principal.setColumns(20);
        Memoria_Principal.setRows(5);
        jScrollPane2.setViewportView(Memoria_Principal);

        Almacenamiento_Secundario.setColumns(20);
        Almacenamiento_Secundario.setRows(5);
        jScrollPane1.setViewportView(Almacenamiento_Secundario);

        Opciones_Procesos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Opciones_Procesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opciones_ProcesosActionPerformed(evt);
            }
        });

        Titulo_Ejecutar_Proceso.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Titulo_Ejecutar_Proceso.setText("Ejecutar Proceso");

        Ejecutar.setText("Ejecutar");
        Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EjecutarActionPerformed(evt);
            }
        });

        Titulo_Crear_Proceso.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Titulo_Crear_Proceso.setText("Crear Proceso");

        Titulo_Paginas_Proceso_Crear.setText("Páginas:");

        Paginas_Proceso_Crear.setText(" ");
        Paginas_Proceso_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Paginas_Proceso_CrearActionPerformed(evt);
            }
        });

        Titulo_Orden_Proceso_Crear.setText("Orden:");

        Orden_Proceso_Crear.setText(" ");
        Orden_Proceso_Crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Orden_Proceso_CrearActionPerformed(evt);
            }
        });

        Crear.setText("Crear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Titulo_Numero_de_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Titulo_Pagina_Ejecutando)
                                        .addGap(18, 18, 18)
                                        .addComponent(Pagina_Ejecutando, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Titulo_Proceso_Ejecutando)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Proceso_Ejecutando, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Opciones_Procesos, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(Ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(Titulo_Crear_Proceso)
                                            .addComponent(Titulo_Ejecutar_Proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Titulo_Paginas_Proceso_Crear)
                                            .addComponent(Titulo_Orden_Proceso_Crear))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Paginas_Proceso_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Orden_Proceso_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(Crear)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(Titulo_Procesador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Titulo_Memoria_Principal)
                                .addGap(66, 66, 66)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Numero_de_Paginas_MP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Iniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Parar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Titulo_Almacenamineto_Secundario)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Titulo_Numero_de_paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Iniciar)
                            .addComponent(Numero_de_Paginas_MP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Parar))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Ejecutar)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Titulo_Procesador)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Titulo_Proceso_Ejecutando)
                                    .addComponent(Proceso_Ejecutando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Titulo_Pagina_Ejecutando)
                                    .addComponent(Pagina_Ejecutando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addComponent(Titulo_Ejecutar_Proceso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Opciones_Procesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addComponent(Titulo_Crear_Proceso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Paginas_Proceso_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Titulo_Paginas_Proceso_Crear))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Titulo_Orden_Proceso_Crear)
                            .addComponent(Orden_Proceso_Crear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Crear)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Titulo_Almacenamineto_Secundario)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Titulo_Memoria_Principal)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 52, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Numero_de_Paginas_MPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Numero_de_Paginas_MPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Numero_de_Paginas_MPActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
        String Npag= Numero_de_Paginas_MP.getText();
        int nroPag=Integer.parseInt(Npag);
        String Divisiones="---------------------";
        int i=0;
        while(i<nroPag){
            i++;
            Memoria_Principal.setText("/n");
            Memoria_Principal.setText(Divisiones);
        }
    }//GEN-LAST:event_IniciarActionPerformed

    private void PararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PararActionPerformed

    private void Proceso_EjecutandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Proceso_EjecutandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Proceso_EjecutandoActionPerformed

    private void Pagina_EjecutandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pagina_EjecutandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pagina_EjecutandoActionPerformed

    private void Opciones_ProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opciones_ProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Opciones_ProcesosActionPerformed

    private void EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EjecutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EjecutarActionPerformed

    private void Paginas_Proceso_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Paginas_Proceso_CrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Paginas_Proceso_CrearActionPerformed

    private void Orden_Proceso_CrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Orden_Proceso_CrearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Orden_Proceso_CrearActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Almacenamiento_Secundario;
    private javax.swing.JButton Crear;
    private javax.swing.JButton Ejecutar;
    private javax.swing.JButton Iniciar;
    private javax.swing.JTextArea Memoria_Principal;
    private javax.swing.JTextField Numero_de_Paginas_MP;
    private javax.swing.JComboBox<String> Opciones_Procesos;
    private javax.swing.JTextField Orden_Proceso_Crear;
    private javax.swing.JTextField Pagina_Ejecutando;
    private javax.swing.JTextField Paginas_Proceso_Crear;
    private javax.swing.JButton Parar;
    private javax.swing.JTextField Proceso_Ejecutando;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel Titulo_Almacenamineto_Secundario;
    private javax.swing.JLabel Titulo_Crear_Proceso;
    private javax.swing.JLabel Titulo_Ejecutar_Proceso;
    private javax.swing.JLabel Titulo_Memoria_Principal;
    private javax.swing.JLabel Titulo_Numero_de_paginas;
    private javax.swing.JLabel Titulo_Orden_Proceso_Crear;
    private javax.swing.JLabel Titulo_Pagina_Ejecutando;
    private javax.swing.JLabel Titulo_Paginas_Proceso_Crear;
    private javax.swing.JLabel Titulo_Procesador;
    private javax.swing.JLabel Titulo_Proceso_Ejecutando;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}