/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selec;

/**
 *
 * @author PC01
 */
public class Losa1Resultado extends javax.swing.JFrame {

    /**
     * Creates new form Losa1Resultado
     */
    public Losa1Resultado() {
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

        Coeficiente = new javax.swing.JLabel();
        Alfa = new javax.swing.JLabel();
        Beta = new javax.swing.JLabel();
        Delta = new javax.swing.JLabel();
        Gamma = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Coeficiente.setText(String.valueOf(LosaLxLy.Losa1Arr.get(CalculoCoeficiente.indice).coeficiente));
        getContentPane().add(Coeficiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, 20));

        Alfa.setText(String.valueOf(LosaLxLy.Losa1Arr.get(CalculoCoeficiente.indice).alfa));
        getContentPane().add(Alfa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, 20));

        Beta.setText(String.valueOf(LosaLxLy.Losa1Arr.get(CalculoCoeficiente.indice).beta));
        getContentPane().add(Beta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 110, 20));

        Delta.setText(String.valueOf(LosaLxLy.Losa1Arr.get(CalculoCoeficiente.indice).delta));
        getContentPane().add(Delta, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 110, 20));

        Gamma.setText(String.valueOf(LosaLxLy.Losa1Arr.get(CalculoCoeficiente.indice).gamma));
        getContentPane().add(Gamma, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 110, 20));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOSA 1demo.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alfa;
    private javax.swing.JLabel Beta;
    private javax.swing.JLabel Coeficiente;
    private javax.swing.JLabel Delta;
    private javax.swing.JLabel FONDO;
    private javax.swing.JLabel Gamma;
    // End of variables declaration//GEN-END:variables
}
