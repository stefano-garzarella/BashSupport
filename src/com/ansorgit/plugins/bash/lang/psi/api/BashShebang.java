/*
 * Copyright 2009 Joachim Ansorg, mail@ansorg-it.com
 * File: BashShebang.java, Class: BashShebang
 * Last modified: 2010-02-19
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ansorgit.plugins.bash.lang.psi.api;

import com.intellij.openapi.util.TextRange;
import org.jetbrains.annotations.NotNull;

/**
 * Date: 16.04.2009
 * Time: 14:50:39
 *
 * @author Joachim Ansorg
 */
public interface BashShebang extends BashPsiElement {
    /**
     * @return The shell command given in the shebang line, e.g. /bin/sh
     */
    public String shellCommand();

    public void updateCommand(String command);

    @NotNull
    public TextRange commandRange();
}