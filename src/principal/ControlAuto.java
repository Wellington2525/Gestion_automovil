
package principal;
import logica.Automovil;
import control.Controll_Auto;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.HashMap;
import control.ReportView;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JREmptyDataSource;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.util.JRLoader;

public class ControlAuto extends javax.swing.JFrame {

  Controll_Auto CtAut = new Controll_Auto();
  Automovil entAut = new Automovil();
   DefaultTableModel model = new DefaultTableModel();
    int id;
    public ControlAuto() {
        initComponents();
        Listar();
        txtID.setVisible(false);
        
        btnactualizar.setEnabled(false);
        btneliminar.setEnabled(false);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCanPuerta = new javax.swing.JTextField();
        btnReporte = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblAUTO = new javax.swing.JTable();
        btneliminar = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        btncerrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("CONTROL DE AUTOMOVILES");

        jLabel2.setText("Modelo");

        jLabel3.setText("Marca:");

        jLabel5.setText("Color:");

        jLabel6.setText("Motor:");

        jLabel7.setText("Patente");

        btnactualizar.setBackground(new java.awt.Color(0, 102, 255));
        btnactualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnactualizar.setText("Actualizar Auto");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jLabel8.setText("CanPuerta");

        txtCanPuerta.setText("0");
        txtCanPuerta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCanPuertaKeyTyped(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(0, 153, 153));
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Reporte General");
        btnReporte.setToolTipText("");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        TblAUTO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Modelo", "Marca", "Color", "Motor", "Patente-Placa", "CanPuertas"
            }
        ));
        TblAUTO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TblAUTOMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TblAUTO);

        btneliminar.setBackground(new java.awt.Color(255, 255, 102));
        btneliminar.setText("Eliminar Registro");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setText("0");

        btncerrar1.setBackground(new java.awt.Color(204, 0, 0));
        btncerrar1.setForeground(new java.awt.Color(255, 255, 255));
        btncerrar1.setText("Cerrar");
        btncerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCanPuerta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btncerrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCanPuerta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel8)))
                .addGap(36, 36, 36)
                .addComponent(btnactualizar)
                .addGap(18, 18, 18)
                .addComponent(btneliminar)
                .addGap(18, 18, 18)
                .addComponent(btncerrar1)
                .addGap(18, 18, 18)
                .addComponent(btnReporte)
                .addGap(30, 30, 30))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     void Listar(){
     List<Automovil>Lista = CtAut.listar();
     model = (DefaultTableModel) TblAUTO.getModel();
     Object[] ob = new Object[7];
     for (int i = 0; i<Lista.size();i++){
         ob[0]=Lista.get(i).getId();
         ob[1]=Lista.get(i).getModelo();
         ob[2]=Lista.get(i).getMarca();
         ob[3]=Lista.get(i).getColor();
         ob[4]=Lista.get(i).getMotor();
         ob[5]=Lista.get(i).getPatente();
         ob[6]=Lista.get(i).getCantPuertas();
         model.addRow(ob);
         
     
     }
     TblAUTO.setModel(model);
    
     
     
     }
    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
       actulizar();
        limpiarTable();
       Listar();
       
    }//GEN-LAST:event_btnactualizarActionPerformed
     void actulizar(){
           if(txtID.getText().equals("")){
             JOptionPane.showMessageDialog(this, "Debe Buscar el ID para poder actualizar ");
             txtModelo.requestFocus();
        }else{
            String idd = txtID.getText();
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            String motor = txtMotor.getText();
            String color = txtColor.getText();
            String patente = txtPatente.getText();
            String cantPuertas = txtCanPuerta.getText();
            Object[] ob=new Object[7];
            ob[0]=modelo;
            ob[1]=marca;
            ob[2]=motor;
            ob[3]=color;
            ob[4]=patente;
            ob[5]=cantPuertas;
            ob[6]=idd;
            CtAut.actualizar(ob);
            JOptionPane.showMessageDialog(this,"Registro Actualizado existosamente");
            LimpiatTXT();
          System.out.println(color);
          
           
        }
        
     
     
     }
     
     void ResetModelTable(JTable table){
         DefaultTableModel model = (DefaultTableModel) table.getModel();
         model.fireTableDataChanged();
      
     
     }
     
void LimpiatTXT(){
        txtModelo.setText(null);
            txtMarca.setText(null);
            txtMotor.setText(null);
             txtColor.setText(null);
             txtPatente.setText(null);
             txtCanPuerta.setText(null);

}
         
 void limpiarTable(){
    for(int i =0; i <model.getRowCount();i++){
        model.removeRow(i);
        i=i-1;
    
    }


}
    private void txtCanPuertaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCanPuertaKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48 && key <=60;
        if(!numeros){
            evt.consume();

        }
        if(txtCanPuerta.getText().trim().length()==50){
            evt.consume();

        }
    }//GEN-LAST:event_txtCanPuertaKeyTyped

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
       HashMap R = new HashMap();
           String rutaArchivo = "src/AutReport/AUTReport.jasper";
           File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            System.out.println("El archivo existe en la ruta especificada.");
            // Aquí puedes continuar con la carga del archivo JasperReports
            //HashMap R = new HashMap();
          ReportView rep = new ReportView("src/AutReport/AUTReport.jasper");
          rep.setVisible(true);
        } else {
            System.out.println("El archivo no existe en la ruta especificada.");
            // Aquí puedes manejar la situación de que el archivo no existe
        }
        
        //src/main/java/AutReport/AUTReport.jasper
       /* try {
       
          JasperReport report = (JasperReport) JRLoader.loadObjectFromFile("src/AutReport/AUTReport.jasper");
          JasperPrint print = JasperFillManager.fillReport(report, null, new JREmptyDataSource());  
          JasperViewer viewer = new JasperViewer(print, false);
          viewer.setVisible(true);
          
         String rutaArchivo = "src/AutReport/AUTReport.jasper";

        File archivo = new File(rutaArchivo);
        if (archivo.exists()) {
            System.out.println("El archivo existe en la ruta especificada.");
            // Aquí puedes continuar con la carga del archivo JasperReports
           
        } else {
            System.out.println("El archivo no existe en la ruta especificada.");
            // Aquí puedes manejar la situación de que el archivo no existe
        }
     }catch (JRException e) {
            e.printStackTrace();
            // Manejar la excepción aquí según tus necesidades
        }*/

   

        
      
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
      
       int option = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar el mensaje?", "Advertencia", JOptionPane.YES_NO_OPTION);
       if (option ==JOptionPane.YES_OPTION){
            eliminar();
            limpiarTable();
            Listar();
            LimpiatTXT();
            
       }else{
       JOptionPane.showMessageDialog(this,"Opcion cancelada");
       }
    
      
    }//GEN-LAST:event_btneliminarActionPerformed
void eliminar(){
    
    int idd =Integer.parseInt(txtID.getText());
            int fila = TblAUTO.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");

        }else{
            //JOptionPane.showMessageDialog(this,"Estas seguro de eliminar este Registro!!!");
            
                
             CtAut.eliminar(idd);
              JOptionPane.showMessageDialog(this,"Registro eliminado");
              LimpiatTXT();
              //no deberia de ser eliminado seria actualizar el estado en cero y la consulta solo leer 1 asi que no se veria el registro pero no queda fuera de la base de datos
               
            

        }

}
    private void TblAUTOMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TblAUTOMouseClicked
        int fila = TblAUTO.getSelectedRow();
        if(fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");

        }else{
            //System.out.println(id);
            String idd= TblAUTO.getValueAt(fila,0).toString();
            //id=Integer.parseInt(datos_vendedor.getValueAt(fila,0).toString());
            String modelo=TblAUTO.getValueAt(fila,1).toString();
            String marca=TblAUTO.getValueAt(fila,2).toString();
            String color = TblAUTO.getValueAt(fila,3).toString();
            String motor = TblAUTO.getValueAt(fila,4).toString();
            String patente = TblAUTO.getValueAt(fila,5).toString();
            String cantPuerta = TblAUTO.getValueAt(fila,6).toString();

            txtID.setText(idd);
            txtModelo.setText(modelo);
            txtMarca.setText(marca);
            txtColor.setText(color);
            txtMotor.setText(motor);
            txtPatente.setText(patente);
            txtCanPuerta.setText(cantPuerta);

            String texto = txtID.getText();
            if(!texto.isEmpty()){
                btnactualizar.setEnabled(true);
                btneliminar.setEnabled(true);
            

            }else{

               btnactualizar.setEnabled(false);
                btneliminar.setEnabled(false);

            }

        }
    }//GEN-LAST:event_TblAUTOMouseClicked

    private void btncerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrar1ActionPerformed
       dispose();
    }//GEN-LAST:event_btncerrar1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TblAUTO;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncerrar1;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCanPuerta;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
