package com.yusuke.suzuki.lintrules.rules

import com.pinterest.ktlint.core.Rule
import com.pinterest.ktlint.core.ast.ElementType
import org.jetbrains.kotlin.com.intellij.lang.ASTNode

class NoVarRule : Rule("no-var") {
    override fun visit(
        node: ASTNode,
        autoCorrect: Boolean,
        emit: (offset: Int, errorMessage: String, canBeAutoCorrected: Boolean) -> Unit
    ) {
        // Java.io.Serializableを継承したクラスのプロパティは、
        // Serializableを継承しているか, プリミティブ型
        if (node.elementType == ElementType.VAR_KEYWORD) {
            emit(node.startOffset, "😱 Unexpected var, use val instead 🏄‍", false)
        }
    }
}
