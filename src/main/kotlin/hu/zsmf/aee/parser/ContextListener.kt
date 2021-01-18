package hu.zsmf.aee.parser

import ArithmeticBaseListener
import ArithmeticParser.FileContext

class ContextListener : ArithmeticBaseListener() {
    override fun enterFile(ctx: FileContext?) {
        println(ctx)
    }

    override fun enterEquation(ctx: ArithmeticParser.EquationContext?) {
        println(ctx)
    }
}