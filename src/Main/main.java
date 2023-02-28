/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import Conectar.EnterUser;
import Users.Usuario;
import views.*;

/**
 *
 * @author Aron
 */
public class main extends javax.swing.JFrame {

    public static final String USUARIO = "admin";
    public static final String CONTRASENA = "1001";
    /**
     * Creates new form main
     */
    public main() {
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

        jPanel2 = new javax.swing.JPanel();
        Bienbenido = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        siguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        jPanel2.setBackground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bienbenido.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        Bienbenido.setForeground(new java.awt.Color(255, 255, 255));
        Bienbenido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user (2).png"))); // NOI18N
        jPanel2.add(Bienbenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 170, 150));

        Email.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(0, 102, 0));
        Email.setText("User");
        jPanel2.add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 70, -1));

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setFont(new java.awt.Font("Sitka Banner", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(0, 102, 0));
        password.setText("Password");
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 81, -1));

        contraseña.setBackground(new java.awt.Color(204, 255, 204));
        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
        });
        jPanel2.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 320, 40));

        email.setBackground(new java.awt.Color(204, 255, 204));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel2.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 310, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 40, 50));

        siguiente.setBackground(new java.awt.Color(0, 153, 153));
        siguiente.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        siguiente.setForeground(new java.awt.Color(204, 255, 204));
        siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pequeño.png"))); // NOI18N
        siguiente.setToolTipText("");
        siguiente.setBorder(null);
        siguiente.setBorderPainted(false);
        siguiente.setContentAreaFilled(false);
        siguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        siguiente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pequeño.png"))); // NOI18N
        siguiente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mas_pequeño.png"))); // NOI18N
        siguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siguienteMouseClicked(evt);
            }
        });
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });
        jPanel2.add(siguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 80, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/email.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bus.png"))); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 70, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

    }//GEN-LAST:event_emailActionPerformed

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked

    }//GEN-LAST:event_contraseñaMouseClicked

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
        String usuario = email.getText();
        String password = new String(contraseña.getPassword());

        if (usuario.equals(USUARIO) && password.equals(CONTRASENA)) {
            Usuario.ACTIVO = true;
            // si el usuario es nuevo se va registrar en la basede datos
            EnterUser nuevo = new EnterUser();
            nuevo.insertar();
    
            // Abrir nueva ventana si el usuario y contraseña son correctos
            //JFrameVenta venta = new JFrameVenta(Login.this);
            //venta.setVisible(true);
            Principal principal = new Principal(main.this);
            principal.setVisible(true);
            
            main.this.setVisible(false); // oculta la ventana si el usuario es correcto
        } else {
            JOptionPane.showMessageDialog(main.this, "Usuario o contraseña inválidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_siguienteActionPerformed

    private void siguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siguienteMouseClicked

    }//GEN-LAST:event_siguienteMouseClicked
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienbenido;
    private javax.swing.JLabel Email;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel password;
    private javax.swing.JButton siguiente;
    // End of variables declaration//GEN-END:variables
}