package hu.zsmf.aee.lang

import java.math.BigDecimal

class Context {
    fun parse(rawValue: String): BigDecimal {
        return BigDecimal.ONE
    }

    fun find(name: String): BigDecimal {
        return BigDecimal.ONE
    }
}