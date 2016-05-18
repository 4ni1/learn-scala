object Tuples{
	def main(args : Array[String]){

		var tups = (100, "Hello World", 12.3)
		printf("%d : %s : %.2f\n", tups._1, tups._2, tups._3)

		println(tups.toString)

	}
}