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
package org.nbphpcouncil.modules.php.yii.ui.actions;

import org.nbphpcouncil.modules.php.yii.preferences.YiiPreferences;
import org.nbphpcouncil.modules.php.yii.util.YiiUtils;
import org.netbeans.modules.csl.api.UiUtils;
import org.netbeans.modules.php.api.editor.EditorSupport;
import org.netbeans.modules.php.api.editor.PhpBaseElement;
import org.netbeans.modules.php.api.editor.PhpClass;
import org.netbeans.modules.php.api.phpmodule.PhpModule;
import org.netbeans.modules.php.spi.framework.actions.GoToViewAction;
import org.openide.filesystems.FileObject;
import org.openide.util.Lookup;

/**
 *
 * @author junichi11
 */
public class YiiGoToViewAction extends GoToViewAction {

    private static final long serialVersionUID = 1722745601120023354L;
    private final FileObject controller;
    private final int offset;

    public YiiGoToViewAction(FileObject controller, int offset) {
        this.controller = controller;
        this.offset = offset;
    }

    @Override
    public boolean goToView() {
        EditorSupport editorSupport = Lookup.getDefault().lookup(EditorSupport.class);
        PhpBaseElement element = editorSupport.getElement(controller, offset);
        if (element instanceof PhpClass.Method) {

            // get view file
            PhpClass.Method method = (PhpClass.Method) element;
            String actionId = YiiUtils.getViewName(method);
            YiiGoToViewSupport support = YiiGoToViewSupport.create(controller, actionId);
            FileObject view = support.getView();

            if (view != null) {
                UiUtils.open(view, DEFAULT_OFFSET);
                return true;
            }

            // create view file automatically
            PhpModule phpModule = PhpModule.Factory.forFileObject(controller);
            if (YiiPreferences.useAutoCreateView(phpModule) && !YiiPreferences.isFallbackToDefaultViews(phpModule)) {
                view = support.createView();
            }

            if (view != null) {
                UiUtils.open(view, DEFAULT_OFFSET);
                return true;
            }
        }
        return false;
    }
}
