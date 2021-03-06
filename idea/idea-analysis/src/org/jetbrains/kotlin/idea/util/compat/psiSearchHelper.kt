/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.util.compat

import com.intellij.openapi.project.Project
import com.intellij.psi.search.PsiSearchHelper

// BUNCH: 181
@Suppress("IncompatibleAPI", "MissingRecentApi")
fun psiSearchHelperInstance(project: Project): PsiSearchHelper {
    return PsiSearchHelper.getInstance(project)
}