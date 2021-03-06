/**
 * <p>Title: jumbo</p>
 * <p>Description: Janela do DAV - Grid</p>
 *
 * <p>The MIT License</p>
 *
 * <p>Copyright: Copyright (C) 2013 JUMBO.COM</p>
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 
 * @author Jo?o Paulo
 * @version 1.0
 */
package br.com.jumbo.balcao;

import java.awt.Dimension;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JFormattedTextField.AbstractFormatter;
import org.openswing.swing.client.GridControl;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.lookup.client.LookupController;
import org.openswing.swing.lookup.client.LookupServerDataLocator;
import org.openswing.swing.mdi.client.InternalFrame;

public class DavGrid extends InternalFrame {

    private LookupController produtoController = new LookupController();
    private LookupServerDataLocator produtoDataLocator = new ProdutoLookupDataLocator();

    /** Creates new form NewJInternalFrame */
    public DavGrid(DavController controller) {
        initComponents();

        form1.setVOClassName("br.com.t2ti.vo.EcfDavCabecalhoVO");
        textControl1.setAttributeName("nomeDestinatario");
        textControl2.setAttributeName("cpfCnpjDestinatario");
        form1.setFormController(controller);

        DavGridController davGridController = new DavGridController(this);

        gridControl1.setValueObjectClassName("br.com.jumbo.vo.EcfDavDetalheVO");
        gridControl1.setInsertButton(insertButton1);
        //gridControl1.setEditButton(editButton1);
        gridControl1.setDeleteButton(deleteButton1);
        gridControl1.setSaveButton(saveButton1);
        gridControl1.setReloadButton(reloadButton1);
        codLookupColumn1.setColumnName("produto.nome");
        integerColumn1.setColumnName("quantidade");
        decimalColumn1.setColumnName("produto.valorVenda");
        decimalColumn2.setColumnName("valorTotal");
        gridControl1.setController(davGridController);
        gridControl1.setGridDataLocator(davGridController);

        AbstractFormatter formatter = new AbstractFormatter() {

            @Override
            public Object stringToValue(String text) throws ParseException {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public String valueToString(Object value) throws ParseException {
                DecimalFormat formatoDecimal = new DecimalFormat("#,##0.00");
                return formatoDecimal.format(Double.valueOf(value.toString()));
            }
        };
        
        /*
         * Configurações do lookup do produto
         */
        produtoController.setLookupValueObjectClassName("br.com.jumbo.vo.ProdutoVO");
        produtoController.addLookup2ParentLink("id", "produto.id");
        produtoController.addLookup2ParentLink("nome", "produto.nome");
        produtoController.addLookup2ParentLink("valorVenda", "produto.valorVenda");
        produtoController.addLookup2ParentLink("gtin", "produto.gtin");
        produtoController.addLookup2ParentLink("totalizadorParcial", "produto.totalizadorParcial");
        produtoController.addLookup2ParentLink("unidadeProduto.nome", "produto.unidadeProduto.nome");
        produtoController.setHeaderColumnName("nome", "Nome");
        produtoController.setHeaderColumnName("valorVenda", "Valor Unitário");
        produtoController.setFrameTitle("Importa Produto");

        produtoController.setVisibleStatusPanel(true);
        produtoController.setVisibleColumn("nome", true);
        produtoController.setPreferredWidthColumn("nome", 200);
        produtoController.setVisibleColumn("valorVenda", true);
        produtoController.setFramePreferedSize(new Dimension(500, 400));
        produtoController.setFormattedTextColumn("valorVenda", formatter);

        produtoController.setLookupDataLocator(produtoDataLocator);
        codLookupColumn1.setLookupController(produtoController);
        produtoDataLocator.setLookupFrameParams(null);

        produtoController.setFilterableColumn("nome", true);
        produtoController.setSortableColumn("nome", true);
    }

    public GridControl getGrid1() {
        return gridControl1;
    }

    public Form getForm1() {
        return form1;
    }

    public void setValorTotal(String valorTotal) {
        jLabel2.setText(valorTotal);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        form1 = new org.openswing.swing.form.client.Form();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        textControl1 = new org.openswing.swing.client.TextControl();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        jLabel2 = new javax.swing.JLabel();
        textControl2 = new org.openswing.swing.client.TextControl();
        jLabel3 = new javax.swing.JLabel();
        gridControl1 = new org.openswing.swing.client.GridControl();
        codLookupColumn1 = new org.openswing.swing.table.columns.client.CodLookupColumn();
        integerColumn1 = new org.openswing.swing.table.columns.client.IntegerColumn();
        decimalColumn1 = new org.openswing.swing.table.columns.client.DecimalColumn();
        decimalColumn2 = new org.openswing.swing.table.columns.client.DecimalColumn();
        textColumn1 = new org.openswing.swing.table.columns.client.TextColumn();
        jPanel3 = new javax.swing.JPanel();
        insertButton1 = new org.openswing.swing.client.InsertButton();
        deleteButton1 = new org.openswing.swing.client.DeleteButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        saveButton1 = new org.openswing.swing.client.SaveButton();
        jPanel4 = new javax.swing.JPanel();
        saveButton2 = new org.openswing.swing.client.SaveButton();

        setTitle("Emissão de DAV - Orçamento");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaDocumento04.png"))); // NOI18N
        jPanel1.add(jLabel4);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Emissão de DAV - Orçamento");
        jPanel1.add(jLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel2.setLayout(new java.awt.GridBagLayout());

        form1.setVOClassName("");
        form1.setSaveButton(saveButton2);
        form1.setLayout(new java.awt.GridBagLayout());

        labelControl1.setText("Nome Destinatário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl1, gridBagConstraints);

        textControl1.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl1, gridBagConstraints);

        labelControl2.setText("CPF / CNPJ Destinatário");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl2, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("0,00");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(jLabel2, gridBagConstraints);

        textControl2.setMaxCharacters(14);
        textControl2.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Total Orçamento:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(form1, gridBagConstraints);

        gridControl1.setPreferredSize(new java.awt.Dimension(627, 400));
        gridControl1.getColumnContainer().setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        codLookupColumn1.setEditableOnEdit(true);
        codLookupColumn1.setEditableOnInsert(true);
        codLookupColumn1.setHeaderColumnName("Descrição");
        codLookupColumn1.setPreferredWidth(300);
        gridControl1.getColumnContainer().add(codLookupColumn1);

        integerColumn1.setEditableOnEdit(true);
        integerColumn1.setEditableOnInsert(true);
        integerColumn1.setHeaderColumnName("Quantidade");
        gridControl1.getColumnContainer().add(integerColumn1);

        decimalColumn1.setDecimals(2);
        decimalColumn1.setHeaderColumnName("Unitário");
        gridControl1.getColumnContainer().add(decimalColumn1);

        decimalColumn2.setColumnRequired(false);
        decimalColumn2.setDecimals(2);
        decimalColumn2.setHeaderColumnName("Total");
        gridControl1.getColumnContainer().add(decimalColumn2);

        textColumn1.setColumnName("cancelado");
        textColumn1.setColumnRequired(false);
        textColumn1.setHeaderColumnName("Cancelado");
        textColumn1.setPreferredWidth(70);
        gridControl1.getColumnContainer().add(textColumn1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        jPanel2.add(gridControl1, gridBagConstraints);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel3.add(insertButton1);
        jPanel3.add(deleteButton1);
        jPanel3.add(reloadButton1);
        jPanel3.add(saveButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jPanel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jPanel2, gridBagConstraints);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel4.add(saveButton2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.table.columns.client.CodLookupColumn codLookupColumn1;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn1;
    private org.openswing.swing.table.columns.client.DecimalColumn decimalColumn2;
    private org.openswing.swing.client.DeleteButton deleteButton1;
    private org.openswing.swing.form.client.Form form1;
    private org.openswing.swing.client.GridControl gridControl1;
    private org.openswing.swing.client.InsertButton insertButton1;
    private org.openswing.swing.table.columns.client.IntegerColumn integerColumn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton1;
    private org.openswing.swing.client.SaveButton saveButton2;
    private org.openswing.swing.table.columns.client.TextColumn textColumn1;
    private org.openswing.swing.client.TextControl textControl1;
    private org.openswing.swing.client.TextControl textControl2;
    // End of variables declaration//GEN-END:variables
}
