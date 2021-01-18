package hu.zsmf.aee.lang

enum class OperatorType {
    UNARY, BINARY
}

interface Operator {
    fun type(): OperatorType
    fun acceptable(value: Value): Boolean
}

interface UnaryOperator : Operator {
    override fun type() = OperatorType.UNARY
    fun execute(operand: Value): Value
}

interface BinaryOperator : Operator {
    override fun type() = OperatorType.BINARY
    fun execute(operandLeft: Value, operandRight: Value): Value
}
