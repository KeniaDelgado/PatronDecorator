
package Main;

import Componentes.Crepa;
import Componentes.CrepaDulce;
import Componentes.CrepaMixta;
import Componentes.CrepaSalada;
import Decoradores.Chocolate;
import Decoradores.Jamon;
import Decoradores.Lechera;
import Decoradores.Pepperoni;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    String arrS[]={"Jamón","Pepperoni"};
    String arrD[]={"Chocolate","Lechera"};
    public Ventana() {
        initComponents();
        this.setTitle("Patron decorador");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("../Imgs/1.png")));
        this.setSize(370, 375);
        this.setLocationRelativeTo(null);
        //
        comboCrepa.removeAllItems();
        comboSabor.removeAllItems();
        //
        comboCrepa.addItem("Salada");
        comboCrepa.addItem("Dulce");
        txtTipo.setEnabled(false);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTipo = new javax.swing.JTextField();
        chekChoco = new javax.swing.JCheckBox();
        chekLechera = new javax.swing.JCheckBox();
        chenJamon = new javax.swing.JCheckBox();
        checPepper = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPedido = new javax.swing.JTextArea();
        btnOk = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        comboCrepa = new javax.swing.JComboBox<>();
        comboSabor = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(txtTipo);
        txtTipo.setBounds(20, 150, 143, 20);

        chekChoco.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        chekChoco.setText("Chocolate");
        chekChoco.setContentAreaFilled(false);
        chekChoco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chekChoco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chekChocoMouseClicked(evt);
            }
        });
        chekChoco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chekChocoActionPerformed(evt);
            }
        });
        getContentPane().add(chekChoco);
        chekChoco.setBounds(10, 80, 81, 23);

        chekLechera.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        chekLechera.setText("Lechera");
        chekLechera.setContentAreaFilled(false);
        chekLechera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chekLechera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chekLecheraMouseClicked(evt);
            }
        });
        getContentPane().add(chekLechera);
        chekLechera.setBounds(10, 110, 80, 23);

        chenJamon.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        chenJamon.setText("Jamón");
        chenJamon.setContentAreaFilled(false);
        chenJamon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chenJamon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chenJamonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chenJamonMouseEntered(evt);
            }
        });
        getContentPane().add(chenJamon);
        chenJamon.setBounds(100, 110, 90, 23);

        checPepper.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        checPepper.setText("Pepperoni");
        checPepper.setContentAreaFilled(false);
        checPepper.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checPepperMouseClicked(evt);
            }
        });
        getContentPane().add(checPepper);
        checPepper.setBounds(100, 80, 90, 23);

        txtPedido.setColumns(20);
        txtPedido.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtPedido.setRows(5);
        jScrollPane1.setViewportView(txtPedido);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 180, 200, 149);

        btnOk.setText("Ok");
        btnOk.setBorderPainted(false);
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });
        getContentPane().add(btnOk);
        btnOk.setBounds(220, 90, 100, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Total");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(251, 175, 40, 22);

        lblTotal.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTotal.setText("$ 0");
        getContentPane().add(lblTotal);
        lblTotal.setBounds(237, 215, 86, 42);

        comboCrepa.setBackground(new java.awt.Color(240, 240, 240));
        comboCrepa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboCrepa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboCrepa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboCrepaMouseClicked(evt);
            }
        });
        comboCrepa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCrepaActionPerformed(evt);
            }
        });
        getContentPane().add(comboCrepa);
        comboCrepa.setBounds(10, 50, 150, 22);

        comboSabor.setBackground(new java.awt.Color(240, 240, 240));
        comboSabor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSaborActionPerformed(evt);
            }
        });
        getContentPane().add(comboSabor);
        comboSabor.setBounds(200, 50, 143, 22);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(220, 120, 100, 23);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/qj5xsfzrvob.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -4, 370, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        switch(txtTipo.getText()){
             case "Dulce":
                 Crepa crepaDulce = new CrepaDulce(String.valueOf(comboSabor.getSelectedItem()));
                 ok(crepaDulce);
                 break;
             case "Salada":
                 Crepa crepaSalada = new CrepaSalada(String.valueOf(comboSabor.getSelectedItem()));
                 ok(crepaSalada);
                 break;
             case "Mixta":
                 Crepa crepaMixta = new CrepaMixta(String.valueOf(comboSabor.getSelectedItem()));
                 ok(crepaMixta);
                 break;
             default:
                 JOptionPane.showMessageDialog(rootPane, "No hay nada seleccionado!");
                 break;
         }
        checPepper.setSelected(false);
        chekChoco.setSelected(false);
        chekLechera.setSelected(false);
        chenJamon.setSelected(false);
        tipoCrepaDes();
    }//GEN-LAST:event_btnOkActionPerformed

    private void chekChocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chekChocoMouseClicked

    if(chekChoco.isSelected()){
           String tipo="Dulce";
           tipoCrepa(tipo);
        }else{
            tipoCrepaDes();
        }
        
    }//GEN-LAST:event_chekChocoMouseClicked

    private void chekChocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chekChocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chekChocoActionPerformed

    private void chekLecheraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chekLecheraMouseClicked
        if(chekLechera.isSelected()){
           String tipo="Dulce";
           tipoCrepa(tipo);
        }else{
            tipoCrepaDes();
        }
    }//GEN-LAST:event_chekLecheraMouseClicked

    private void chenJamonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chenJamonMouseEntered
        
    }//GEN-LAST:event_chenJamonMouseEntered

    private void checPepperMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checPepperMouseClicked
        if(checPepper.isSelected()){
           String tipo="Salada";
           tipoCrepa(tipo);
        }else{
            tipoCrepaDes();
        }
    }//GEN-LAST:event_checPepperMouseClicked

    private void chenJamonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chenJamonMouseClicked
        if(chenJamon.isSelected()){
           String tipo="Salada";
           tipoCrepa(tipo);
        }else{
            tipoCrepaDes();
        }
    }//GEN-LAST:event_chenJamonMouseClicked

    private void comboCrepaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCrepaActionPerformed
        comboSabor.removeAllItems();
        
        if(String.valueOf(comboCrepa.getSelectedItem()).equals("Salada")){
            if((checPepper.isSelected())||(chekChoco.isSelected())||(chekLechera.isSelected())||(chenJamon.isSelected())){
                tipoCrepa("Salada");
            }else{
                txtTipo.setText("Salada");
            }
            for (int i = 0; i < arrS.length; i++) {
            comboSabor.addItem(arrS[i]);
            }
        }
        else{
            if((checPepper.isSelected())||(chekChoco.isSelected())||(chekLechera.isSelected())||(chenJamon.isSelected())){
                tipoCrepa("Dulce");
            }else{
                txtTipo.setText("Dulce");
            }
            for (int i = 0; i < arrD.length; i++) {
            comboSabor.addItem(arrD[i]);
            }
        }
    }//GEN-LAST:event_comboCrepaActionPerformed

    private void comboCrepaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboCrepaMouseClicked
        
    }//GEN-LAST:event_comboCrepaMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        checPepper.setSelected(false);
        chekChoco.setSelected(false);
        chekLechera.setSelected(false);
        chenJamon.setSelected(false);
        txtPedido.setText("");
        txtTipo.setText(String.valueOf(comboCrepa.getSelectedItem()));
        lblTotal.setText("$ 0");
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void comboSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSaborActionPerformed
        switch(String.valueOf(comboSabor.getSelectedItem())){
            case "Chocolate":
            chekChoco.setEnabled(false);
            chekLechera.setEnabled(true);
            chenJamon.setEnabled(true);
            checPepper.setEnabled(true);
                break;
            case "Lechera":
            chekLechera.setEnabled(false);
            chekChoco.setEnabled(true);
            chenJamon.setEnabled(true);
            checPepper.setEnabled(true);
                break;
            case "Jamón":
            chenJamon.setEnabled(false);
            chekChoco.setEnabled(true);
            chekLechera.setEnabled(true);
            checPepper.setEnabled(true);
                break;
            case "Pepperoni":
            checPepper.setEnabled(false);
            chekChoco.setEnabled(true);
            chekLechera.setEnabled(true);
            chenJamon.setEnabled(true);
                break;
             
        }
    }//GEN-LAST:event_comboSaborActionPerformed

    private void ok(Crepa crepa)
	{
			if (chekChoco.isSelected())
			{
				crepa = new Chocolate(crepa);
			}
			if (chekLechera.isSelected())
			{
				crepa = new Lechera(crepa);
			}
			if (checPepper.isSelected())
			{
				crepa = new Pepperoni(crepa);
			}
			if (chenJamon.isSelected())
			{
				crepa = new Jamon(crepa);
			}
		txtPedido.setText("SU PEDIDO \n" + crepa.getDescripcion());
                lblTotal.setText("$ " + String.valueOf(crepa.precio()));
	}
    
    public void tipoCrepa(String tipo){
        switch(txtTipo.getText()){
                case "":
                    if(tipo=="Dulce")
                        txtTipo.setText("Dulce");
                    else
                        txtTipo.setText("Salada");
                
                    break;
                case "Salada":
                    if((tipo=="Dulce"))
                        txtTipo.setText("Mixta");
                    break;
                    
                case "Dulce":
                    if((tipo=="Salada"))
                        txtTipo.setText("Mixta");
                    break;
                default:
                    txtTipo.setText(String.valueOf(comboCrepa.getSelectedItem()));
                    break;
            }
    }
    
    public void tipoCrepaDes(){
        int bandera=0;
        String sabor = String.valueOf(comboCrepa.getSelectedItem());
        
            if(sabor.equals("Dulce")){
                txtTipo.setText("Dulce");
            }else{
              txtTipo.setText("Salada");
            }
            if(chekChoco.isSelected()){
                bandera++;
            }
            if(chekLechera.isSelected()){
                bandera++;
            }
            if((checPepper.isSelected())||(chenJamon.isSelected())){
                if(bandera<1){
                    txtTipo.setText("Salada");
                }else
                    txtTipo.setText("Mixta");
            }else{
                if(bandera>0){
                    txtTipo.setText("Dulce");
                }else
                    txtTipo.setText(String.valueOf(comboCrepa.getSelectedItem()));
            }
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox checPepper;
    private javax.swing.JCheckBox chekChoco;
    private javax.swing.JCheckBox chekLechera;
    private javax.swing.JCheckBox chenJamon;
    private javax.swing.JComboBox<String> comboCrepa;
    private javax.swing.JComboBox<String> comboSabor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTextArea txtPedido;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
