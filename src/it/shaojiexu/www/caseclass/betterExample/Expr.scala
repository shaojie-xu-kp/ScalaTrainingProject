package it.shaojiexu.www.caseclass.betterExample

abstract class Expr {
  def eval: Int
}

case class Number(n: Int) extends Expr {
  def eval: Int = n
}

case class Sum(e1: Expr, e2: Expr) extends Expr {
  def eval: Int = e1.eval + e2.eval
}
