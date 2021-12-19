/**
 * <p>Title: Jumbo</p>
 * <p>Description: Janela do Produto - Detalhe</p>
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

 * @author Jo�o Paulo
 * @version 1.0
 */
package br.com.jumbo.balcao;

import java.awt.Dimension;
import javax.swing.ButtonGroup;
import org.openswing.swing.form.client.Form;
import org.openswing.swing.lookup.client.LookupController;
import org.openswing.swing.lookup.client.LookupServerDataLocator;
import org.openswing.swing.mdi.client.InternalFrame;

public class ProdutoDetalhe extends InternalFrame {

    private LookupController unidadeProdutoController = new LookupController();
    private LookupServerDataLocator unidadeProdutoDataLocator = new UnidadeProdutoLookupDataLocator();

    /** Creates new form NewJInternalFrame */
    public ProdutoDetalhe(ProdutoDetalheController controller) {
        initComponents();

        form1.setFormController(controller);

        ButtonGroup grupoST = new ButtonGroup();
        radioButtonControl1.setButtonGroup(grupoST);
        radioButtonControl2.setButtonGroup(grupoST);
        radioButtonControl3.setButtonGroup(grupoST);
        radioButtonControl4.setButtonGroup(grupoST);
        radioButtonControl5.setButtonGroup(grupoST);

        radioButtonControl1.setSelectedValue("T");
        radioButtonControl2.setSelectedValue("S");
        radioButtonControl3.setSelectedValue("I");
        radioButtonControl4.setSelectedValue("F");
        radioButtonControl5.setSelectedValue("N");

        ButtonGroup grupoIat = new ButtonGroup();
        radioButtonControl6.setButtonGroup(grupoIat);
        radioButtonControl7.setButtonGroup(grupoIat);

        radioButtonControl6.setSelectedValue("A");
        radioButtonControl7.setSelectedValue("T");

        ButtonGroup grupoIppt = new ButtonGroup();
        radioButtonControl8.setButtonGroup(grupoIppt);
        radioButtonControl9.setButtonGroup(grupoIppt);

        radioButtonControl8.setSelectedValue("P");
        radioButtonControl9.setSelectedValue("T");

        unidadeProdutoController.setLookupValueObjectClassName("br.com.jumbo.vo.UnidadeProdutoVO");
        unidadeProdutoController.addLookup2ParentLink("id", "unidadeProduto.id");
        unidadeProdutoController.addLookup2ParentLink("nome", "unidadeProduto.nome");
        unidadeProdutoController.setHeaderColumnName("id", "ID");
        unidadeProdutoController.setHeaderColumnName("nome", "Nome");
        unidadeProdutoController.setFrameTitle("Importa Unidade Produto");

        unidadeProdutoController.setVisibleStatusPanel(true);
        unidadeProdutoController.setVisibleColumn("id", true);
        unidadeProdutoController.setVisibleColumn("nome", true);
        unidadeProdutoController.setPreferredWidthColumn("nome", 100);
        unidadeProdutoController.setFramePreferedSize(new Dimension(500, 400));

        unidadeProdutoController.setLookupDataLocator(unidadeProdutoDataLocator);
        codLookupControl1.setLookupController(unidadeProdutoController);
        unidadeProdutoDataLocator.setLookupFrameParams(null);
    }

    public Form getForm1(){
        return form1;
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        form1 = new org.openswing.swing.form.client.Form();
        labelControl1 = new org.openswing.swing.client.LabelControl();
        textControl1 = new org.openswing.swing.client.TextControl();
        labelControl2 = new org.openswing.swing.client.LabelControl();
        textControl2 = new org.openswing.swing.client.TextControl();
        textControl4 = new org.openswing.swing.client.TextControl();
        labelControl4 = new org.openswing.swing.client.LabelControl();
        labelControl3 = new org.openswing.swing.client.LabelControl();
        textControl3 = new org.openswing.swing.client.TextControl();
        codLookupControl1 = new org.openswing.swing.client.CodLookupControl();
        labelControl5 = new org.openswing.swing.client.LabelControl();
        labelControl6 = new org.openswing.swing.client.LabelControl();
        textControl5 = new org.openswing.swing.client.TextControl();
        labelControl7 = new org.openswing.swing.client.LabelControl();
        numericControl1 = new org.openswing.swing.client.NumericControl();
        labelControl8 = new org.openswing.swing.client.LabelControl();
        numericControl2 = new org.openswing.swing.client.NumericControl();
        labelControl9 = new org.openswing.swing.client.LabelControl();
        numericControl3 = new org.openswing.swing.client.NumericControl();
        labelControl10 = new org.openswing.swing.client.LabelControl();
        numericControl4 = new org.openswing.swing.client.NumericControl();
        labelControl11 = new org.openswing.swing.client.LabelControl();
        textControl6 = new org.openswing.swing.client.TextControl();
        labelControl12 = new org.openswing.swing.client.LabelControl();
        textControl7 = new org.openswing.swing.client.TextControl();
        labelControl13 = new org.openswing.swing.client.LabelControl();
        numericControl5 = new org.openswing.swing.client.NumericControl();
        labelControl14 = new org.openswing.swing.client.LabelControl();
        numericControl6 = new org.openswing.swing.client.NumericControl();
        labelControl15 = new org.openswing.swing.client.LabelControl();
        numericControl7 = new org.openswing.swing.client.NumericControl();
        labelControl16 = new org.openswing.swing.client.LabelControl();
        numericControl8 = new org.openswing.swing.client.NumericControl();
        labelControl17 = new org.openswing.swing.client.LabelControl();
        numericControl9 = new org.openswing.swing.client.NumericControl();
        labelControl18 = new org.openswing.swing.client.LabelControl();
        textControl8 = new org.openswing.swing.client.TextControl();
        labelControl19 = new org.openswing.swing.client.LabelControl();
        textControl9 = new org.openswing.swing.client.TextControl();
        labelControl20 = new org.openswing.swing.client.LabelControl();
        textControl10 = new org.openswing.swing.client.TextControl();
        labelControl21 = new org.openswing.swing.client.LabelControl();
        numericControl10 = new org.openswing.swing.client.NumericControl();
        labelControl22 = new org.openswing.swing.client.LabelControl();
        textControl11 = new org.openswing.swing.client.TextControl();
        jPanel2 = new javax.swing.JPanel();
        radioButtonControl1 = new org.openswing.swing.client.RadioButtonControl();
        radioButtonControl3 = new org.openswing.swing.client.RadioButtonControl();
        radioButtonControl5 = new org.openswing.swing.client.RadioButtonControl();
        radioButtonControl4 = new org.openswing.swing.client.RadioButtonControl();
        radioButtonControl2 = new org.openswing.swing.client.RadioButtonControl();
        jPanel3 = new javax.swing.JPanel();
        radioButtonControl6 = new org.openswing.swing.client.RadioButtonControl();
        radioButtonControl7 = new org.openswing.swing.client.RadioButtonControl();
        jPanel5 = new javax.swing.JPanel();
        radioButtonControl8 = new org.openswing.swing.client.RadioButtonControl();
        radioButtonControl9 = new org.openswing.swing.client.RadioButtonControl();
        jPanel4 = new javax.swing.JPanel();
        editButton1 = new org.openswing.swing.client.EditButton();
        reloadButton1 = new org.openswing.swing.client.ReloadButton();
        saveButton2 = new org.openswing.swing.client.SaveButton();

        setTitle("Cadastro de Produto");
        setPreferredSize(new java.awt.Dimension(600, 550));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/telaCarrinho02.png"))); // NOI18N
        jPanel1.add(jLabel2);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro de Produto");
        jPanel1.add(jLabel1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        form1.setVOClassName("br.com.t2ti.vo.ProdutoVO");
        form1.setEditButton(editButton1);
        form1.setReloadButton(reloadButton1);
        form1.setSaveButton(saveButton2);
        form1.setLayout(new java.awt.GridBagLayout());

        labelControl1.setText("Nome");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl1, gridBagConstraints);

        textControl1.setAttributeName("nome");
        textControl1.setMaxCharacters(100);
        textControl1.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl1, gridBagConstraints);

        labelControl2.setText("Código Interno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl2, gridBagConstraints);

        textControl2.setAttributeName("codigoInterno");
        textControl2.setMaxCharacters(20);
        textControl2.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl2, gridBagConstraints);

        textControl4.setAttributeName("gtin");
        textControl4.setMaxCharacters(14);
        textControl4.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl4, gridBagConstraints);

        labelControl4.setText("GTIN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl4, gridBagConstraints);

        labelControl3.setText("Descrição");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl3, gridBagConstraints);

        textControl3.setAttributeName("descricao");
        textControl3.setMaxCharacters(Integer.MAX_VALUE);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl3, gridBagConstraints);

        codLookupControl1.setAttributeName("unidadeProduto.nome");
        codLookupControl1.setMaxCharacters(10);
        codLookupControl1.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(codLookupControl1, gridBagConstraints);

        labelControl5.setText("Unidade");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl5, gridBagConstraints);

        labelControl6.setText("Descrição PDV");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl6, gridBagConstraints);

        textControl5.setAttributeName("descricaoPdv");
        textControl5.setMaxCharacters(30);
        textControl5.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl5, gridBagConstraints);

        labelControl7.setText("Valor Venda");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl7, gridBagConstraints);

        numericControl1.setAttributeName("valorVenda");
        numericControl1.setDecimals(2);
        numericControl1.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl1, gridBagConstraints);

        labelControl8.setText("Qtde Estoque");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl8, gridBagConstraints);

        numericControl2.setAttributeName("qtdEstoque");
        numericControl2.setDecimals(3);
        numericControl2.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl2, gridBagConstraints);

        labelControl9.setText("Estoque Mínimo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl9, gridBagConstraints);

        numericControl3.setAttributeName("estoqueMin");
        numericControl3.setDecimals(3);
        numericControl3.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl3, gridBagConstraints);

        labelControl10.setText("Estoque Máximo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl10, gridBagConstraints);

        numericControl4.setAttributeName("estoqueMax");
        numericControl4.setDecimals(3);
        numericControl4.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl4, gridBagConstraints);

        labelControl11.setText("NCM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl11, gridBagConstraints);

        textControl6.setAttributeName("ncm");
        textControl6.setMaxCharacters(8);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl6, gridBagConstraints);

        labelControl12.setText("Sped");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl12, gridBagConstraints);

        textControl7.setAttributeName("tipoItemSped");
        textControl7.setMaxCharacters(2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl7, gridBagConstraints);

        labelControl13.setText("% ICMS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl13, gridBagConstraints);

        numericControl5.setAttributeName("taxaIcms");
        numericControl5.setDecimals(2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl5, gridBagConstraints);

        labelControl14.setText("% IPI");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl14, gridBagConstraints);

        numericControl6.setAttributeName("taxaIpi");
        numericControl6.setDecimals(2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl6, gridBagConstraints);

        labelControl15.setText("% ISSQN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl15, gridBagConstraints);

        numericControl7.setAttributeName("taxaIssqn");
        numericControl7.setDecimals(2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl7, gridBagConstraints);

        labelControl16.setText("% PIS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl16, gridBagConstraints);

        numericControl8.setAttributeName("taxaPis");
        numericControl8.setDecimals(2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl8, gridBagConstraints);

        labelControl17.setText("% COFINS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl17, gridBagConstraints);

        numericControl9.setAttributeName("taxaCofins");
        numericControl9.setDecimals(2);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl9, gridBagConstraints);

        labelControl18.setText("CST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl18, gridBagConstraints);

        textControl8.setAttributeName("cst");
        textControl8.setMaxCharacters(3);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl8, gridBagConstraints);

        labelControl19.setText("CSOSN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl19, gridBagConstraints);

        textControl9.setAttributeName("csosn");
        textControl9.setMaxCharacters(4);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl9, gridBagConstraints);

        labelControl20.setText("ICMS ST");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl20, gridBagConstraints);

        textControl10.setAttributeName("ecfIcmsSt");
        textControl10.setMaxCharacters(4);
        textControl10.setRequired(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl10, gridBagConstraints);

        labelControl21.setText("Código Balança");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl21, gridBagConstraints);

        numericControl10.setAttributeName("codigoBalanca");
        numericControl10.setMaxCharacters(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(numericControl10, gridBagConstraints);

        labelControl22.setText("Totalizador Parcial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(labelControl22, gridBagConstraints);

        textControl11.setAttributeName("totalizadorParcial");
        textControl11.setMaxCharacters(10);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        form1.add(textControl11, gridBagConstraints);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sitação Tributária"));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        radioButtonControl1.setText("T");
        radioButtonControl1.setAttributeName("pafPSt");
        jPanel2.add(radioButtonControl1);

        radioButtonControl3.setText("S");
        radioButtonControl3.setAttributeName("pafPSt");
        jPanel2.add(radioButtonControl3);

        radioButtonControl5.setText("I");
        radioButtonControl5.setAttributeName("pafPSt");
        jPanel2.add(radioButtonControl5);

        radioButtonControl4.setText("F");
        radioButtonControl4.setAttributeName("pafPSt");
        jPanel2.add(radioButtonControl4);

        radioButtonControl2.setText("N");
        radioButtonControl2.setAttributeName("pafPSt");
        jPanel2.add(radioButtonControl2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        form1.add(jPanel2, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("IAT"));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        radioButtonControl6.setText("Arredondamento");
        radioButtonControl6.setAttributeName("iat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(radioButtonControl6, gridBagConstraints);

        radioButtonControl7.setText("Truncamento");
        radioButtonControl7.setAttributeName("iat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(radioButtonControl7, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        form1.add(jPanel3, gridBagConstraints);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("IPPT"));
        jPanel5.setLayout(new java.awt.GridBagLayout());

        radioButtonControl8.setText("Próprio");
        radioButtonControl8.setAttributeName("ippt");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel5.add(radioButtonControl8, gridBagConstraints);

        radioButtonControl9.setText("Terceiro");
        radioButtonControl9.setAttributeName("ippt");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel5.add(radioButtonControl9, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        form1.add(jPanel5, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(form1, gridBagConstraints);

        jPanel4.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));
        jPanel4.add(editButton1);
        jPanel4.add(reloadButton1);
        jPanel4.add(saveButton2);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jPanel4, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.openswing.swing.client.CodLookupControl codLookupControl1;
    private org.openswing.swing.client.EditButton editButton1;
    private org.openswing.swing.form.client.Form form1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private org.openswing.swing.client.LabelControl labelControl1;
    private org.openswing.swing.client.LabelControl labelControl10;
    private org.openswing.swing.client.LabelControl labelControl11;
    private org.openswing.swing.client.LabelControl labelControl12;
    private org.openswing.swing.client.LabelControl labelControl13;
    private org.openswing.swing.client.LabelControl labelControl14;
    private org.openswing.swing.client.LabelControl labelControl15;
    private org.openswing.swing.client.LabelControl labelControl16;
    private org.openswing.swing.client.LabelControl labelControl17;
    private org.openswing.swing.client.LabelControl labelControl18;
    private org.openswing.swing.client.LabelControl labelControl19;
    private org.openswing.swing.client.LabelControl labelControl2;
    private org.openswing.swing.client.LabelControl labelControl20;
    private org.openswing.swing.client.LabelControl labelControl21;
    private org.openswing.swing.client.LabelControl labelControl22;
    private org.openswing.swing.client.LabelControl labelControl3;
    private org.openswing.swing.client.LabelControl labelControl4;
    private org.openswing.swing.client.LabelControl labelControl5;
    private org.openswing.swing.client.LabelControl labelControl6;
    private org.openswing.swing.client.LabelControl labelControl7;
    private org.openswing.swing.client.LabelControl labelControl8;
    private org.openswing.swing.client.LabelControl labelControl9;
    private org.openswing.swing.client.NumericControl numericControl1;
    private org.openswing.swing.client.NumericControl numericControl10;
    private org.openswing.swing.client.NumericControl numericControl2;
    private org.openswing.swing.client.NumericControl numericControl3;
    private org.openswing.swing.client.NumericControl numericControl4;
    private org.openswing.swing.client.NumericControl numericControl5;
    private org.openswing.swing.client.NumericControl numericControl6;
    private org.openswing.swing.client.NumericControl numericControl7;
    private org.openswing.swing.client.NumericControl numericControl8;
    private org.openswing.swing.client.NumericControl numericControl9;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl1;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl2;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl3;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl4;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl5;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl6;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl7;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl8;
    private org.openswing.swing.client.RadioButtonControl radioButtonControl9;
    private org.openswing.swing.client.ReloadButton reloadButton1;
    private org.openswing.swing.client.SaveButton saveButton2;
    private org.openswing.swing.client.TextControl textControl1;
    private org.openswing.swing.client.TextControl textControl10;
    private org.openswing.swing.client.TextControl textControl11;
    private org.openswing.swing.client.TextControl textControl2;
    private org.openswing.swing.client.TextControl textControl3;
    private org.openswing.swing.client.TextControl textControl4;
    private org.openswing.swing.client.TextControl textControl5;
    private org.openswing.swing.client.TextControl textControl6;
    private org.openswing.swing.client.TextControl textControl7;
    private org.openswing.swing.client.TextControl textControl8;
    private org.openswing.swing.client.TextControl textControl9;
    // End of variables declaration//GEN-END:variables

}
