package hu.zsmf.aee.lang

import java.math.BigDecimal

interface Value {
    fun type(): ValueType
}

class AtomValue(val rawValue: String, val context: Context) : Value {
    val value: BigDecimal
    override fun type() = ValueType.ATOM

    init {
        value = context.parse(rawValue)
    }
}

class VectorValue(val rawValue: List<String>, val context: Context) : Value {
    val value: List<BigDecimal>

    override fun type() = ValueType.VECTOR

    init {
        value = rawValue.map { context.parse(it) }
    }
}

class ConstValue(val name: String, val context: Context) : Value {
    val value: BigDecimal
    override fun type() = ValueType.CONST

    init {
        value = context.find(name)
    }
}

class VariableValue(val name: String, val context: Context): Value {
    override fun type() = ValueType.CONST
    var value: BigDecimal? = null
}

enum class ValueType {
    ATOM, VECTOR, VARIABLE, CONST
}

