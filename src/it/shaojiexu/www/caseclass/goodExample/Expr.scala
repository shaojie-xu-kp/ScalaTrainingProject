package it.shaojiexu.www.caseclass.goodExample

abstract class Expr {
  def eval: Int
}

class Number(n: Int) extends Expr {
  def eval: Int = n
}

class Sum(e1: Expr, e2: Expr) extends Expr {
  def eval: Int = e1.eval + e2.eval
}

class Subtract(e1: Expr, e2: Expr) extends Expr {
  def eval: Int = e1.eval - e2.eval
}

class Product (e1: Expr, e2: Expr) extends Expr {
  def eval: Int = e1.eval * e2.eval
}

abstract class NewExpr extends Expr {
  def print : Unit
}

class NewNumber(n: Int ) extends NewExpr {
  def eval: Int = n
  def print : Unit = {println(n.toString())}
}

