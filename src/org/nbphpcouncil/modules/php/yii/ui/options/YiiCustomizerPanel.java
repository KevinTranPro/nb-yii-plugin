/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2013 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2013 Sun Microsystems, Inc.
 */
package org.nbphpcouncil.modules.php.yii.ui.options;

import java.awt.Component;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.openide.util.ChangeSupport;

/**
 *
 * @author junichi11
 */
public class YiiCustomizerPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = -8903833956936546001L;
    private final ChangeSupport changeSupport = new ChangeSupport(this);

    /**
     * Creates new form YiiCustomizerPanel
     */
    public YiiCustomizerPanel() {
        initComponents();
        // add document listener
        DocumentListener documentListener = new DefaultDocumentListener();
        addDocumentListener(documentListener);
    }

    private void addDocumentListener(DocumentListener documentListener) {
        systemPathTextField.getDocument().addDocumentListener(documentListener);
        applicationPathTextField.getDocument().addDocumentListener(documentListener);
        ziiPathTextField.getDocument().addDocumentListener(documentListener);
        extPathTextField.getDocument().addDocumentListener(documentListener);
        controllersPathTextField.getDocument().addDocumentListener(documentListener);
        viewsPathTextField.getDocument().addDocumentListener(documentListener);
        themesPathTextField.getDocument().addDocumentListener(documentListener);
        messagesPathTextField.getDocument().addDocumentListener(documentListener);
    }

    public boolean isEnabledPlugin() {
        return enabledCheckBox.isSelected();
    }

    public void setEnabledPlugin(boolean isEnabled) {
        enabledCheckBox.setSelected(isEnabled);
    }

    public boolean useAutoCreateView() {
        return useAutoCreateViewCheckBox.isSelected();
    }

    public void setAutoCreateView(boolean use) {
        useAutoCreateViewCheckBox.setSelected(use);
    }

    public boolean isFallbackToDefaultViews() {
        return fallbackToDefaultViewsCheckBox.isSelected();
    }

    public void setFallbackToDefaultViews(boolean fallback) {
        fallbackToDefaultViewsCheckBox.setSelected(fallback);
    }

    public String getApplicationPath() {
        return applicationPathTextField.getText();
    }

    public void setApplicationPath(String path) {
        applicationPathTextField.setText(path);
    }

    public String getControllersPath() {
        return controllersPathTextField.getText();
    }

    public void setControllersPath(String path) {
        controllersPathTextField.setText(path);
    }

    public String getExtPath() {
        return extPathTextField.getText();
    }

    public void setExtPath(String path) {
        extPathTextField.setText(path);
    }

    public String getMessagesPath() {
        return messagesPathTextField.getText();
    }

    public void setMessagesPath(String path) {
        messagesPathTextField.setText(path);
    }

    public String getSystemPath() {
        return systemPathTextField.getText();
    }

    public void setSystemPath(String path) {
        systemPathTextField.setText(path);
    }

    public String getThemesPath() {
        return themesPathTextField.getText();
    }

    public void setThemesPath(String path) {
        themesPathTextField.setText(path);
    }

    public String getViewsPath() {
        return viewsPathTextField.getText();
    }

    public void setViewsPath(String path) {
        viewsPathTextField.setText(path);
    }

    public String getZiiPath() {
        return ziiPathTextField.getText();
    }

    public void setZiiPath(String path) {
        ziiPathTextField.setText(path);
    }

    public void addChangeListener(ChangeListener changeListener) {
        changeSupport.addChangeListener(changeListener);
    }

    public void removeChangeListener(ChangeListener changeListener) {
        changeSupport.removeChangeListener(changeListener);
    }

    /**
     * Set enabled for all components except enabledCheckBox.
     *
     * @param isEnabled
     */
    public void setAllComponentsEnabled(boolean isEnabled) {
        for (Component component : this.getComponents()) {
            if (component == enabledCheckBox) {
                continue;
            }
            component.setEnabled(isEnabled);
        }
    }

    void fireChange() {
        changeSupport.fireChange();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useAutoCreateViewCheckBox = new javax.swing.JCheckBox();
        fallbackToDefaultViewsCheckBox = new javax.swing.JCheckBox();
        enabledCheckBox = new javax.swing.JCheckBox();
        pathsLabel = new javax.swing.JLabel();
        systemPathLabel = new javax.swing.JLabel();
        pathsSeparator = new javax.swing.JSeparator();
        applicationPathLabel = new javax.swing.JLabel();
        ziiPathLabel = new javax.swing.JLabel();
        extPathLabel = new javax.swing.JLabel();
        controllersPathLabel = new javax.swing.JLabel();
        viewsPathLabel = new javax.swing.JLabel();
        controllersPathTextField = new javax.swing.JTextField();
        extPathTextField = new javax.swing.JTextField();
        ziiPathTextField = new javax.swing.JTextField();
        applicationPathTextField = new javax.swing.JTextField();
        systemPathTextField = new javax.swing.JTextField();
        viewsPathTextField = new javax.swing.JTextField();
        themesPathLabel = new javax.swing.JLabel();
        themesPathTextField = new javax.swing.JTextField();
        messagesPathLabel = new javax.swing.JLabel();
        messagesPathTextField = new javax.swing.JTextField();
        generalLabel = new javax.swing.JLabel();
        generalSeparator = new javax.swing.JSeparator();

        org.openide.awt.Mnemonics.setLocalizedText(useAutoCreateViewCheckBox, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.useAutoCreateViewCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(fallbackToDefaultViewsCheckBox, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.fallbackToDefaultViewsCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(enabledCheckBox, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.enabledCheckBox.text")); // NOI18N
        enabledCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enabledCheckBoxActionPerformed(evt);
            }
        });

        org.openide.awt.Mnemonics.setLocalizedText(pathsLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.pathsLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(systemPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.systemPathLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(applicationPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.applicationPathLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(ziiPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.ziiPathLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(extPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.extPathLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(controllersPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.controllersPathLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(viewsPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.viewsPathLabel.text")); // NOI18N

        controllersPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.controllersPathTextField.text")); // NOI18N

        extPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.extPathTextField.text")); // NOI18N

        ziiPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.ziiPathTextField.text")); // NOI18N

        applicationPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.applicationPathTextField.text")); // NOI18N

        systemPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.systemPathTextField.text")); // NOI18N

        viewsPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.viewsPathTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(themesPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.themesPathLabel.text")); // NOI18N

        themesPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.themesPathTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(messagesPathLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.messagesPathLabel.text")); // NOI18N

        messagesPathTextField.setText(org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.messagesPathTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(generalLabel, org.openide.util.NbBundle.getMessage(YiiCustomizerPanel.class, "YiiCustomizerPanel.generalLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ziiPathLabel)
                            .addComponent(extPathLabel)
                            .addComponent(systemPathLabel)
                            .addComponent(applicationPathLabel)
                            .addComponent(controllersPathLabel)
                            .addComponent(viewsPathLabel)
                            .addComponent(themesPathLabel)
                            .addComponent(messagesPathLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(themesPathTextField)
                            .addComponent(viewsPathTextField)
                            .addComponent(controllersPathTextField)
                            .addComponent(extPathTextField)
                            .addComponent(ziiPathTextField)
                            .addComponent(applicationPathTextField)
                            .addComponent(systemPathTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(messagesPathTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pathsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pathsSeparator))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fallbackToDefaultViewsCheckBox)
                                    .addComponent(useAutoCreateViewCheckBox)))
                            .addComponent(enabledCheckBox))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(generalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(generalSeparator)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enabledCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(generalLabel)
                    .addComponent(generalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(useAutoCreateViewCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fallbackToDefaultViewsCheckBox)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pathsLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pathsSeparator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(systemPathLabel)
                    .addComponent(systemPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(applicationPathLabel)
                    .addComponent(applicationPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ziiPathLabel)
                    .addComponent(ziiPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extPathLabel)
                    .addComponent(extPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(controllersPathLabel)
                    .addComponent(controllersPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewsPathLabel)
                    .addComponent(viewsPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themesPathLabel)
                    .addComponent(themesPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messagesPathLabel)
                    .addComponent(messagesPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void enabledCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enabledCheckBoxActionPerformed
        setAllComponentsEnabled(enabledCheckBox.isSelected());
        fireChange();
    }//GEN-LAST:event_enabledCheckBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applicationPathLabel;
    private javax.swing.JTextField applicationPathTextField;
    private javax.swing.JLabel controllersPathLabel;
    private javax.swing.JTextField controllersPathTextField;
    private javax.swing.JCheckBox enabledCheckBox;
    private javax.swing.JLabel extPathLabel;
    private javax.swing.JTextField extPathTextField;
    private javax.swing.JCheckBox fallbackToDefaultViewsCheckBox;
    private javax.swing.JLabel generalLabel;
    private javax.swing.JSeparator generalSeparator;
    private javax.swing.JLabel messagesPathLabel;
    private javax.swing.JTextField messagesPathTextField;
    private javax.swing.JLabel pathsLabel;
    private javax.swing.JSeparator pathsSeparator;
    private javax.swing.JLabel systemPathLabel;
    private javax.swing.JTextField systemPathTextField;
    private javax.swing.JLabel themesPathLabel;
    private javax.swing.JTextField themesPathTextField;
    private javax.swing.JCheckBox useAutoCreateViewCheckBox;
    private javax.swing.JLabel viewsPathLabel;
    private javax.swing.JTextField viewsPathTextField;
    private javax.swing.JLabel ziiPathLabel;
    private javax.swing.JTextField ziiPathTextField;
    // End of variables declaration//GEN-END:variables

    private class DefaultDocumentListener implements DocumentListener {

        public DefaultDocumentListener() {
        }

        @Override
        public void insertUpdate(DocumentEvent e) {
            processUpdate();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            processUpdate();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            processUpdate();
        }

        private void processUpdate() {
            fireChange();
        }
    }
}
