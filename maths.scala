class Math{
	def Add(A:Int, B:Int):Int={
	
	A+B	
	}
	def sub(A:Int, B:Int):Int={
	A-B	
	}
	def div(A:Double, B:Double):Double={
	A/B	
	}
	def multi(A:Double, B:Double):Double={
	A*B	
	}
}
var m = new Math()
println("Addition of A + B" + " = "+ m.Add(9,30))
println(m.sub(9,30))
println(m.div(7,4))
println(m.multi(30,15))

