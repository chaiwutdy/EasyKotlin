class TestSum{
	fun sum(a :IntArray): Int{
		var s = 0;
		for(i in a){
//			s = s + i;
			s += i;
			println("stest${i}")
			println("test${i}")
		}
		return s;
	}
}

fun main(args: Array<String>) {
	var numbers: IntArray = intArrayOf(10,20)
//	numbers = intArrayOf(10,20,30)
	var testSum = TestSum()
	println(testSum.sum(numbers))
}