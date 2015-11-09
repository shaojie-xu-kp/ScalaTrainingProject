package it.shaojiexu.www.caseclass.badExample



object ExprCompanion {
  
  def eval(e: Expr) : Int = {
    if (e.isNumber) e.numValue
    else if (e.isSum) eval(e.leftOp) + eval(e.rightOp)
    else sys.error("unrecognized expression kind")
  }
  
  def main(args:Array[String]) {
    println(eval(new Sum(new Number(1), new Number(2))))
  }
  
}