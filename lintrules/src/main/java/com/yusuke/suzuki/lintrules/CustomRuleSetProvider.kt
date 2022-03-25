package com.yusuke.suzuki.lintrules

import com.pinterest.ktlint.core.RuleSet
import com.pinterest.ktlint.core.RuleSetProvider
import com.yusuke.suzuki.lintrules.rules.NoVarRule

class CustomRuleSetProvider : RuleSetProvider {
    override fun get(): RuleSet = RuleSet("custom", NoVarRule())
}
