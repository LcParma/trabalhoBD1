/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unespbcc.trabalhobd1;

import java.awt.Dimension;
import javax.swing.JPopupMenu;
import javax.swing.JTable;

/**
 *
 * @author d-den
 */
public class ResultadoBuscaFunc extends javax.swing.JInternalFrame {

    /**
     * Creates new form ResultadoBuscaFunc
     */
    BuscaFuncionario fonte;
    public ResultadoBuscaFunc(BuscaFuncionario f) {
        initComponents();
        fonte = f;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        menuEditaFunc = new javax.swing.JMenuItem();
        menuExcluiFunc = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResBuscaFunc = new javax.swing.JTable();

        jPopupMenu1.setInvoker(tbResBuscaFunc);
        jPopupMenu1.setLabel("");
        jPopupMenu1.setName(""); // NOI18N

        menuEditaFunc.setText("Editar");
        menuEditaFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditaFuncActionPerformed(evt);
            }
        });
        jPopupMenu1.add(menuEditaFunc);

        menuExcluiFunc.setText("Excluir");
        jPopupMenu1.add(menuExcluiFunc);

        setClosable(true);
        setResizable(true);
        setTitle("Resultado da Busca");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        tbResBuscaFunc.setModel(new javax.swing.table.DefaultTableModel(
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
        tbResBuscaFunc.getTableHeader().setReorderingAllowed(false);
        tbResBuscaFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbResBuscaFuncMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbResBuscaFunc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        setBounds(0, 0, 650, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // TODO add your handling code here:
        fonte.btnBuscaFunc.setEnabled(true);
    }//GEN-LAST:event_formInternalFrameClosed

    private void tbResBuscaFuncMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbResBuscaFuncMouseReleased
        // TODO add your handling code here:
        int r = tbResBuscaFunc.rowAtPoint(evt.getPoint());
        if (r >= 0 && r < tbResBuscaFunc.getRowCount()) {
            tbResBuscaFunc.setRowSelectionInterval(r, r);
        } else {
            tbResBuscaFunc.clearSelection();
        }
        int rowindex = tbResBuscaFunc.getSelectedRow();
        if (rowindex < 0)
            return;
        if (evt.isPopupTrigger() && evt.getComponent() instanceof JTable ) {
            JPopupMenu popup = jPopupMenu1;
            popup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tbResBuscaFuncMouseReleased

    private void menuEditaFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditaFuncActionPerformed
        // TODO add your handling code here:
        //selecionar dados da tupla selecionada
        EditFuncionario editFunc = new EditFuncionario(this);
        fonte.jp.jDesktopPane1.add(editFunc);
        Dimension d = fonte.jp.jDesktopPane1.getSize();
        editFunc.setLocation((d.width - editFunc.getSize().width) / 2, (d.height - editFunc.getSize().height) / 2);
        editFunc.setVisible(true);
    }//GEN-LAST:event_menuEditaFuncActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuEditaFunc;
    private javax.swing.JMenuItem menuExcluiFunc;
    private javax.swing.JTable tbResBuscaFunc;
    // End of variables declaration//GEN-END:variables
}
