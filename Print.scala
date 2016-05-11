object Print{
	def main(args : Array[String]){
		var name = "Anil"
		var age = 26
		println(s"Hello $name")
		println(f"I am ${age + 1}")
		printf("'%5d'\n", 5)
		printf("'%-5d'\n", 5)
		printf("'%05d'\n", 5)
		printf("'%-50d'\n", 5)
	}
}