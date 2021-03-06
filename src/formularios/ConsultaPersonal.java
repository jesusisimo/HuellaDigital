/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultaPersonal.java
 *
 * Created on 19-oct-2012, 11:37:37
 */

package formularios;

import BD.ConexionBD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author jesus
 */
public class ConsultaPersonal extends javax.swing.JFrame {

    /** Creates new form ConsultaPersonal */
    public ConsultaPersonal() {
        initComponents();
        consultaHorario.setModel(modelo);
            }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnVerHorario = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consultaHorario = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pane = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Personal Actualmente Registrado");

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        btnConsultar.setText("Buscar personal");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnVerHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Search.png"))); // NOI18N
        btnVerHorario.setText("Buscar horarios");
        btnVerHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerHorarioActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(consultaHorario);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Close.png"))); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        pane.setBackground(java.awt.SystemColor.info);
        pane.setColumns(20);
        pane.setRows(5);
        pane.setEnabled(false);
        jScrollPane3.setViewportView(pane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnVerHorario)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(180, 180, 180))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnVerHorario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
    Consulta();        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnVerHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerHorarioActionPerformed
        // TODO add your handling code here:
        ConsultaHorario();
    }//GEN-LAST:event_btnVerHorarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaPersonal().setVisible(true);
            }
        });
    }
DefaultListModel modeloLista = new DefaultListModel();
DefaultListModel modelo = new DefaultListModel();

    ConexionBD con=new ConexionBD();
     public void Consulta() {
    try {
    //Establece los valores para la sentencia SQL

    Connection c=con.conectar();
    //Obtiene la plantilla correspondiente a la persona indicada
    PreparedStatement verificarStmt = c.prepareStatement("SELECT *FROM personal");
    ResultSet rs = verificarStmt.executeQuery();
modeloLista.clear();
    //Si se encuentra el nombre en la base de datos
    if (rs.next()){
        int desplazador=10;
    //Lee la plantilla de la base de datos
    do{

    final String nombre= rs.getString("nombre");
    String apellido= rs.getString("appaterno");
    final String clave= rs.getString("clave"); 
JButton boton=new JButton();
boton.addActionListener(new ActionListener(){@Override public void actionPerformed(ActionEvent e) {
    RegistroHorario form = new RegistroHorario(clave,nombre);//enviamos la clave del trabajador
        form.setVisible(true);
}});
boton.setBounds(12, desplazador, 350, 20);
pane.add(boton);
boton.setText("Nombre: "+nombre+" "+apellido+"     Clave: "+clave);
desplazador=desplazador+30;

//boton.setBounds(80, 60, 80, 20);


        }while(rs.next());
    } else {

    }
    } catch (SQLException e) {
    //Si ocurre un error lo indica en la consola
    System.err.println("Error al verificar los datos de la huella.");
    }finally{
       con.desconectar();
    }
   }





      public void ConsultaHorario() {
          String elunes,emartes,emiercoles,ejueves,eviernes,slunes,smartes,smiercoles,sjueves,sviernes;

    try {
    //Establece los valores para la sentencia SQL
    String clavet = JOptionPane.showInputDialog("ingresa la clave del trabajador");
    Connection c=con.conectar();
    //Obtiene la plantilla correspondiente a la persona indicada
    PreparedStatement verificarStmt = c.prepareStatement("SELECT *FROM horario WHERE clave_trabajador=?");
    verificarStmt.setString(1,clavet);
    ResultSet rs = verificarStmt.executeQuery();
    modelo.clear();
    //Si se encuentra el nombre en la base de datos
    if (rs.next()){
    //Lee la plantilla de la base de datos
    elunes= rs.getString("elunes");
    emartes= rs.getString("emartes");
    emiercoles= rs.getString("emiercoles");
    ejueves= rs.getString("ejueves");
    eviernes= rs.getString("eviernes");
    slunes= rs.getString("slunes");
    smartes= rs.getString("smartes");
    smiercoles= rs.getString("smiercoles");
    sjueves= rs.getString("sjueves");
    sviernes= rs.getString("sviernes");
    String objPersonal =("                 Horario del trabajador con clave: "+clavet);
    modelo.addElement(objPersonal);
    objPersonal =("\n");
    modelo.addElement(objPersonal);

    objPersonal =("                Lunes    Martes    Miercoles    Jueves     Viernes");
    modelo.addElement(objPersonal);


    objPersonal =("Entrada  "+elunes+"      "+emartes+"        "+emiercoles+"          "+ejueves+"        "+eviernes);
    modelo.addElement(objPersonal);

    objPersonal =("Salida     "+slunes+"      "+smartes+"        "+smiercoles+"          "+sjueves+"        "+sviernes);
    modelo.addElement(objPersonal);
    } else {
modelo.addElement("No se encontraron datos");
    }
    } catch (SQLException e) {
    //Si ocurre un error lo indica en la consola
    System.err.println("Error al verificar los datos de la huella.");
    }finally{
       con.desconectar();
    }
   }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnVerHorario;
    private javax.swing.JList consultaHorario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea pane;
    // End of variables declaration//GEN-END:variables

}
