package it.shaojiexu.www.Tree

object TreeCompanion {
  
  type Environment = String => Int
  
  def main(args:Array[String]) {
    val exp : Tree = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    val env : Environment = {case "x" => 5
                             case "y" => 6}
    println("Expression : " + exp);
    println("Evaluation : " + eval(exp, env))
  }
  
  def eval(t : Tree, env:Environment) : Int = t match {
    case Sum(l, r) => eval(l,env) + eval(r,env)
    case Var(n) => env(n)
    case Const(v) => v
  }
  
}