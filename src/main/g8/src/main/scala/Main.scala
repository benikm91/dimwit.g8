import dimwit.*

@main def hello(): Unit =
  println("Hello world!")
  println(msg)
  println(dimwitMsg)

def msg = "I was compiled by Scala 3. :)"
def dimwitMsg = 
  trait A derives Label
  trait B derives Label
  val t = Tensor(Shape(Axis[A] -> 2, Axis[B] -> 3)).fill(0f)
  f"I am using dimwit: " + t.shape.toString
