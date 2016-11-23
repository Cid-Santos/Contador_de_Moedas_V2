/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador_de_moedas;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Cid
 */
public class Principal extends javax.swing.JFrame {

    private File buffImageA;
    private File buffImageB;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.jSlider.setMajorTickSpacing(10);
        this.jSlider.setMinorTickSpacing(1);
        this.jSlider.setPaintTicks(true);
        this.jSlider.setPaintLabels(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jpInImgA = new javax.swing.JPanel();
        jLImgA = new javax.swing.JLabel();
        jDImagemA = new javax.swing.JLabel();
        jpInImgB = new javax.swing.JPanel();
        jLImgB = new javax.swing.JLabel();
        jDImagemB = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSlider = new javax.swing.JSlider();
        jButton3 = new javax.swing.JButton();
        jLTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLCentros = new javax.swing.JList();
        jTLimDecBordas = new javax.swing.JTextField();
        jTLimDetCentro = new javax.swing.JTextField();
        jTRaioMini = new javax.swing.JTextField();
        jTRaioMaxi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLAtivo = new javax.swing.JLabel();
        jCBase = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        lbSoma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Abrir Img");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jpInImgA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLImgA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLImgA.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpInImgALayout = new javax.swing.GroupLayout(jpInImgA);
        jpInImgA.setLayout(jpInImgALayout);
        jpInImgALayout.setHorizontalGroup(
            jpInImgALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInImgALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImgA, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpInImgALayout.setVerticalGroup(
            jpInImgALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInImgALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImgA, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDImagemA.setText("Dimensão : ");

        jpInImgB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLImgB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jpInImgBLayout = new javax.swing.GroupLayout(jpInImgB);
        jpInImgB.setLayout(jpInImgBLayout);
        jpInImgBLayout.setHorizontalGroup(
            jpInImgBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInImgBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImgB, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpInImgBLayout.setVerticalGroup(
            jpInImgBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpInImgBLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImgB, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                .addContainerGap())
        );

        jDImagemB.setText("Dimensão : ");

        jButton2.setText("CalCanny");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("CalCirculo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLTotal.setText("Total : ");

        jScrollPane1.setViewportView(jLCentros);

        jTLimDecBordas.setText("400");

        jTLimDetCentro.setText("25");

        jTRaioMini.setText("20");
        jTRaioMini.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTRaioMiniActionPerformed(evt);
            }
        });

        jTRaioMaxi.setText("40");

        jLabel2.setText("Det.  bordas");

        jLabel3.setText("Det. centro");

        jLabel4.setText("Raio minimo");

        jLabel5.setText("Raio maximo");

        jLabel6.setText("Limites : ");

        jLabel1.setText("Threshold : ");

        jButton4.setText("Atualizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLAtivo.setForeground(new java.awt.Color(0, 255, 0));
        jLAtivo.setText("Stop");

        jCBase.setText("Cria base de Conhecimento");

        jLabel7.setText("Somatorio :");

        lbSoma.setText("00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDImagemA)
                            .addComponent(jpInImgA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jDImagemB)
                                .addGap(86, 86, 86)
                                .addComponent(jLTotal))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jpInImgB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbSoma)))))
                        .addContainerGap(49, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(48, 48, 48)
                                .addComponent(jButton2)
                                .addGap(49, 49, 49)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jCBase)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTLimDecBordas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTLimDetCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTRaioMini, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTRaioMaxi, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLAtivo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(156, 156, 156))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDImagemB)
                    .addComponent(jDImagemA)
                    .addComponent(jLTotal))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jpInImgB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpInImgA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jCBase)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lbSoma))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTLimDecBordas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTLimDetCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTRaioMini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTRaioMaxi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4)
                            .addComponent(jLAtivo))))
                .addGap(58, 58, 58))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private File openImagem(String Dir, boolean lista) {
        JFileChooser fileChooser = new JFileChooser();
        BufferedImage buff = null;
        String caminho = null;
        try {
            caminho = new File(".").getCanonicalPath() + Dir;
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        fileChooser.setCurrentDirectory(new File(caminho));
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        fileChooser.setAcceptAllFileFilterUsed(true);
        fileChooser.setMultiSelectionEnabled(true);
        int result = fileChooser.showOpenDialog(getComponent(0));
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile;
        }
        return null;
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            buffImageA = openImagem("/inputimag", false);
            if (buffImageA == null) {
                return;
            }
            BufferedImage buff = ImageIO.read(buffImageA);
            jLImgA.setIcon(new ImageIcon(buff));
            if (buff != null) {
                jDImagemA.setText("Dimensão : " + buff.getWidth() + " X " + buff.getHeight());
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CalcSegmentacao(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CalcCicle();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void CalcSegmentacao(boolean repita) {
        try {
            Segmentacao _segmentacao = new Segmentacao(buffImageA, this.jSlider);
            String buffOutput = _segmentacao._canny();
            buffImageB = new File(buffOutput);
            if (repita) {
                BufferedImage bufImage = ImageIO.read(buffImageB);
                jLImgB.setIcon(new ImageIcon(bufImage));
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void CalcCicle() {
        try {
            Circulo _circle = new Circulo(buffImageB, buffImageA);
            _circle.setParam1(Double.parseDouble(jTLimDecBordas.getText()));
            _circle.setParam2(Double.parseDouble(jTLimDetCentro.getText()));
            _circle.setMinRadius(Integer.parseInt(jTRaioMini.getText()));
            _circle.setMaxRadius(Integer.parseInt(jTRaioMaxi.getText()));
            _circle.setCriaBase(jCBase.isSelected());
            String buffOutput = _circle._CirciloHough();
            jLTotal.setText("Total de Linha : " + _circle.rowsCols[0] + "  Colunas : " + _circle.rowsCols[1]);
            DefaultListModel model = new DefaultListModel();
            _circle.resultados.stream().forEach((s) -> {
                jLCentros.setModel(model);
                model.addElement(s);
            });
            buffImageB = new File(buffOutput);
            BufferedImage bufImage = null;
            bufImage = ImageIO.read(buffImageB);
            jLImgB.setIcon(new ImageIcon(bufImage));
            jDImagemB.setText("Dimensão : " + bufImage.getWidth() + " X " + bufImage.getHeight());
            float s = _circle.getSomatorio();
            float d = (float) (s/100.0);
            
            lbSoma.setText("" + d + "R$");
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    boolean ativado = false;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new Thread(t1).start();
        ativado = !ativado;
        if (ativado) {
            jLAtivo.setText("Run");
        } else {
            jLAtivo.setText("Stop");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTRaioMiniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTRaioMiniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTRaioMiniActionPerformed

    private final Runnable t1 = new Runnable() {
        @Override
        public void run() {
            while (ativado) {
                CalcSegmentacao(false);
                CalcCicle();
            }
        }
    };

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCBase;
    private javax.swing.JLabel jDImagemA;
    private javax.swing.JLabel jDImagemB;
    private javax.swing.JLabel jLAtivo;
    private javax.swing.JList jLCentros;
    private javax.swing.JLabel jLImgA;
    private javax.swing.JLabel jLImgB;
    private javax.swing.JLabel jLTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider;
    private javax.swing.JTextField jTLimDecBordas;
    private javax.swing.JTextField jTLimDetCentro;
    private javax.swing.JTextField jTRaioMaxi;
    private javax.swing.JTextField jTRaioMini;
    private javax.swing.JPanel jpInImgA;
    private javax.swing.JPanel jpInImgB;
    private javax.swing.JLabel lbSoma;
    // End of variables declaration//GEN-END:variables
}