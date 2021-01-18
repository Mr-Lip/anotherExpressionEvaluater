package hu.zsmf.aee.parser

import ArithmeticLexer
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream


fun parse(source: String): Parser {
    val arithmeticContent = CharStreams.fromString(source)
    val arithmeticLexer = ArithmeticLexer(arithmeticContent)
    val commonTokenStream = CommonTokenStream(arithmeticLexer)
    return Parser(commonTokenStream)
}

class Parser(val commonTokenStream: CommonTokenStream) {
}