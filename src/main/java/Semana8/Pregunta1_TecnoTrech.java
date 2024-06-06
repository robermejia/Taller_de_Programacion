package Semana8;

public class Pregunta1_TecnoTrech extends javax.swing.JFrame {
    public Pregunta1_TecnoTrech() {
        initComponents();
        //CENTRADO DE VENTANA
        this.setLocationRelativeTo(null);
    }

    // CLASE IMPRESORA
    class Impresora {
        private String modelo;
        private double precio;

        public Impresora(String modelo, double precio) {
            this.modelo = modelo;
            this.precio = precio;
        }

        public String getModelo() {
            return modelo;
        }

        public double getPrecio() {
            return precio;
        }
    }

    // Clase CalculadoraDescuento
    class CalculadoraDescuento {
    public static double calcularImporteCompra(Impresora impresora, int cantidad) {
        return impresora.getPrecio() * cantidad;
    }

    public static double calcularDescuento(double importeCompra, int cantidad) {
        double porcentajeDescuento = 0;
        if (cantidad <= 4) {
            porcentajeDescuento = 0.05;
        } else if (cantidad > 4 && cantidad <= 6) {
            porcentajeDescuento = 0.15;
        } else if (cantidad > 6 && cantidad <= 8) {
            porcentajeDescuento = 0.20;
        } else {
            porcentajeDescuento = 0.30;
        }
        return importeCompra * porcentajeDescuento;
    }

    public static int calcularCantidadMousePad(double importeAPagar) {
        if (importeAPagar < 1500) {
            return 2;
        } else {
            return 3;
        }
    }
}      /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        // </editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cbxImpresoras = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("TECNOTRECH");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel1.setText("SELECCIONE IMPRESORA:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, -1));

        cbxImpresoras.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxImpresoras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Impresora Laser Hq1", "Impresora Multifuncional Canon", "Impresora a color Epson Lx", "Impresora Epson Laser WB", " " }));
        cbxImpresoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxImpresorasActionPerformed(evt);
            }
        });
        jPanel2.add(cbxImpresoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 340, -1));

        jLabel3.setText("CANTIDAD DE IMPRESORAS:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtCantidad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        jPanel2.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 170, 30));

        btnProcesar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        jPanel2.add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 130, -1));

        txtRes.setColumns(20);
        txtRes.setRows(5);
        jScrollPane1.setViewportView(txtRes);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 490, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxImpresorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxImpresorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxImpresorasActionPerformed

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // Obtener el modelo de impresora seleccionado
        String modelo = cbxImpresoras.getSelectedItem().toString();

        // Obtener la cantidad de impresoras ingresada
        int cantidad = Integer.parseInt(txtCantidad.getText());

        // Crear objeto Impresora según el modelo seleccionado
        Impresora impresoraSeleccionada = null;
        switch (modelo) {
            case "Impresora Laser Hq1":
                impresoraSeleccionada = new Impresora(modelo, 649);
                break;
            case "Impresora Multifuncional Canon":
                impresoraSeleccionada = new Impresora(modelo, 589);
                break;
            case "Impresora a color Epson Lx":
                impresoraSeleccionada = new Impresora(modelo, 850);
                break;
            case "Impresora Epson Laser WB":
                impresoraSeleccionada = new Impresora(modelo, 789);
                break;
        }

        // Calcular el importe de la compra
        double importeCompra = CalculadoraDescuento.calcularImporteCompra(impresoraSeleccionada, cantidad);

        // Calcular el importe del descuento
        double importeDescuento = CalculadoraDescuento.calcularDescuento(importeCompra, cantidad);

        // Calcular el importe a pagar
        double importeAPagar = importeCompra - importeDescuento;

        // Calcular la cantidad de Mouse Pad de obsequio
        int cantidadMousePad = CalculadoraDescuento.calcularCantidadMousePad(importeAPagar);

        // Mostrar los resultados en el textArea
        txtRes.setText("Importe de la compra: S/." + importeCompra
                        + "\nImporte del descuento: S/." + importeDescuento
                        + "\nImporte a pagar: S/." + importeAPagar
                        + "\nCantidad de Mouse Pad de obsequio: " + cantidadMousePad);
    }//GEN-LAST:event_btnProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(Pregunta1_TecnoTrech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pregunta1_TecnoTrech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pregunta1_TecnoTrech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pregunta1_TecnoTrech.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pregunta1_TecnoTrech().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox<String> cbxImpresoras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
    }

