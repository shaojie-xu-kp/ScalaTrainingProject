package it.shaojiexu.www.traitExample

class Date(y: Int, m: Int, d: Int) extends Ord{
  
   def year = y
   def month = m
   def day = d
   
   override def toString() : String = String.format("[ %s-%s-%s]", d.toString(), m.toString(), y.toString())
   
   override def equals (that : Any) : Boolean = {
     
      if(!that.isInstanceOf[Date]) {
        false
      }
      
      val o = that.asInstanceOf[Date]
      o.day == day && o.month == month && o.year == year;
   }
   
   def < (that : Any) : Boolean = {
     
      if(!that.isInstanceOf[Date]) 
        sys.error("cannot compare " + that + " with a Date type")
        
      val o = that.asInstanceOf[Date]
      (year < o.year) || (year == o.year && (month < o.month || (month == o.month && day < o.day)))
      
    }
   
}