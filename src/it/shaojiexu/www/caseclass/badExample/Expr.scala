package it.shaojiexu.www.caseclass.badExample

abstract class Expr {

  def isNumber: Boolean
  def isSum: Boolean
  def numValue: Int
  def leftOp: Expr
  def rightOp: Expr
  
}

class Number(n: Int) extends Expr {

  def isNumber: Boolean = true
  def isSum: Boolean = false
  def numValue: Int = n
  def leftOp: Expr = sys.error("Number.leftOp")
  def rightOp: Expr = sys.error("Number.rightOp")
  

}


class Sum(e1: Expr, e2:Expr) extends Expr {

  def isNumber: Boolean = false
  def isSum: Boolean = true
  def numValue: Int = sys.error("Sum.numValue")
  def leftOp: Expr = e1
  def rightOp: Expr = e2

}