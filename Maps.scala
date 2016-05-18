object Maps {
	
	def printMaps(customers : collection.mutable.Map[Int, String]){
		for ((k, v) <- customers){
			printf("%d : %s\n", k, v)
		}		
	}

	def main(args : Array[String]){
		var employees = Map("Manager" -> "Anil Muppalla", 
			"Supervisor" -> "Ashwin Muppalla" )

		println(employees("Manager"))

		var customers = collection.mutable.Map(100 -> "Rob Kadel", 
			101 -> "Amanda Madden", 
			102 -> "Julie Dhyuhetter")

		printMaps(customers)
		customers(100) = "Matt Blanc"
		customers(103) = "Rich Demillo"

		printMaps(customers)
	}
}