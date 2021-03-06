package com.github.flysheep1980.velocity

object NodeType extends Enumeration {
  val LeftHtmlTag, RightHtmlTag, SingleHtmlTag, DoctypeHtmlTag, HtmlComment, VelocitySingleComment, VelocityMultiComment, IfDirective, ElseIfDirective, ElseDirective, EndDirective, SetDirective, ParseDirective, ForeachDirective, LineSeparator, Other = Value
}

case class Node(s: String, t: NodeType.Value) {
  lazy val trimmed = s.trim
}
