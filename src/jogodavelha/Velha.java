package jogodavelha;

import javax.swing.JOptionPane;

public class Velha extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;
    int cont = 0, cont1 = 0, cont2 = 0;

    public Velha() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        vj1 = new javax.swing.JLabel();
        vj2 = new javax.swing.JLabel();
        empate = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jEditorPane1);

        jLabel4.setText("jLabel4");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(720, 300));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Jogador 1    X    Jogador 1");

        jButton1.setText("Novo Jogo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        vj1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vj1.setText("Vitórias Jogador 1:  0");

        vj2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        vj2.setText("Vitórias Jogador 2:  0");

        empate.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        empate.setText("Empates:                 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(vj2)
                    .addComponent(vj1)
                    .addComponent(empate)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vj1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vj2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(empate)
                        .addGap(41, 41, 41)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LimparCampos();
        vj1.setText("Vitórias Jogador 1:  0");
        vj2.setText("Vitórias Jogador 2:  0");
        empate.setText("Empates:                 0");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed
    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
    if (Jogador1Ativo == true) {
            if (b1.getText().equals("")) {
                b1.setText("X");
                JogadorAtivo();
            }
        } else if (b1.getText().equals("")) {
            b1.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
 if (Jogador1Ativo == true) {
            if (b2.getText().equals("")) {
                b2.setText("X");
                JogadorAtivo();
            }
        } else if (b2.getText().equals("")) {
            b2.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
  if (Jogador1Ativo == true) {
            if (b3.getText().equals("")) {
                b3.setText("X");
                JogadorAtivo();
            }
        } else if (b3.getText().equals("")) {
            b3.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
      if (Jogador1Ativo == true) {
            if (b4.getText().equals("")) {
                b4.setText("X");
                JogadorAtivo();
            }
        } else if (b4.getText().equals("")) {
            b4.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
      if (Jogador1Ativo == true) {
            if (b5.getText().equals("")) {
                b5.setText("X");
                JogadorAtivo();
            }
        } else if (b5.getText().equals("")) {
            b5.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        if (Jogador1Ativo == true) {
            if (b6.getText().equals("")) {
                b6.setText("X");
                JogadorAtivo();
            }
        } else if (b6.getText().equals("")) {
            b6.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        if (Jogador1Ativo == true) {
            if (b7.getText().equals("")) {
                b7.setText("X");
                JogadorAtivo();
            }
        } else if (b7.getText().equals("")) {
            b7.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        if (Jogador1Ativo == true) {
            if (b8.getText().equals("")) {
                b8.setText("X");
                JogadorAtivo();
            }
        } else if (b8.getText().equals("")) {
            b8.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        if (Jogador1Ativo == true) {
            if (b9.getText().equals("")) {
                b9.setText("X");
                JogadorAtivo();
            }
        } else if (b9.getText().equals("")) {
            b9.setText("O");
            JogadorAtivo();
        }
    }//GEN-LAST:event_b9ActionPerformed
    public void LimparCampos() {

        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        Jogador1Ativo = true;
        Jogador2Ativo = false;
    }

    public void JogadorAtivo() {
        if (Jogador1Ativo == true) {
            Jogador1Ativo = false;
            Jogador2Ativo = true;
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
        }

        JogadorVencedor("X");
        JogadorVencedor("O");
    }

    public void Vencedor(String JogadorVencedor) {
        if (JogadorVencedor.equals("Jogador 1")) {
            JOptionPane.showMessageDialog(this, "Parabéns, Jogador 1");
            cont++;
            vj1.setText("Vitórias Jogador 1:  " + cont);
            LimparCampos();
        } else if (JogadorVencedor.equals("Jogador 2")) {
            JOptionPane.showMessageDialog(this, "Parabéns, Jogador 2");
            cont1++;
            vj2.setText("Vitórias Jogador 2:  " + cont1);
            LimparCampos();
        } else if (JogadorVencedor.equals("Empate")) {
            JOptionPane.showMessageDialog(this, "Jogo Empatado");
            cont2++;
            empate.setText("Empates:                 " + cont2);
            LimparCampos();
        }
    }

    public void JogadorVencedor(String Jogador) {
        /*========================== Verificando Linhas ========================== */
        if ((b1.getText().equals(Jogador)) && (b2.getText().equals(Jogador)) && (b3.getText().equals(Jogador))) {
            if (b1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if ((b4.getText().equals(Jogador)) && (b5.getText().equals(Jogador)) && (b6.getText().equals(Jogador))) {
            if (b4.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if ((b7.getText().equals(Jogador)) && (b8.getText().equals(Jogador)) && (b9.getText().equals(Jogador))) {
            if (b7.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        /*========================== Verificando Colunas ==========================*/
        if ((b1.getText().equals(Jogador)) && (b4.getText().equals(Jogador)) && (b7.getText().equals(Jogador))) {
            if (b1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }
        if ((b2.getText().equals(Jogador)) && (b5.getText().equals(Jogador)) && (b8.getText().equals(Jogador))){
            if (b2.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }
        if ((b3.getText().equals(Jogador)) && (b6.getText().equals(Jogador)) && (b9.getText().equals(Jogador))){
            if (b3.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        /*========================== Verificando Diagonais ==========================*/
        if ((b1.getText().equals(Jogador)) && (b5.getText().equals(Jogador)) && (b9.getText().equals(Jogador))){
            if (b1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }

        if ((b3.getText().equals(Jogador)) && (b5.getText().equals(Jogador)) && (b7.getText().equals(Jogador))){
            if (b3.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }
        }
        /*========================== Verificando Empate ==========================*/
        if (!b1.getText().equals("")
                && !b2.getText().equals("")
                && !b3.getText().equals("")
                && !b4.getText().equals("")
                && !b5.getText().equals("")
                && !b6.getText().equals("")
                && !b7.getText().equals("")
                && !b8.getText().equals("")
                && !b9.getText().equals("")) {

            Vencedor("Empate");
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Velha().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel empate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel vj1;
    private javax.swing.JLabel vj2;
    // End of variables declaration//GEN-END:variables
}
