object Strings{
	def main(argfs : Array[String]){
		var randString = "I saw a fly "
		println("3 index : " + randString(3))
		println("I saw a.".equals(randString))
		println(randString.concat("by and explode"))

		var randStringArray = randString.toArray

		for(s <- randStringArray)
			println(s)
	}
}