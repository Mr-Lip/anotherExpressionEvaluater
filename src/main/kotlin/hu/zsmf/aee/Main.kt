package hu.zsmf.aee

import ArithmeticParser
import hu.zsmf.aee.parser.ContextListener
import hu.zsmf.aee.parser.parse
import org.antlr.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main() {
    val commonTokenStream = parse("x = 2").commonTokenStream
    val arithmeticParser = ArithmeticParser(commonTokenStream)
    val tree: ArithmeticParser.ExpressionContext? = arithmeticParser.expression()
    val listener = ContextListener()
    val walker = ParseTreeWalker()
    walker.walk(listener, tree);

}

class Main {

}