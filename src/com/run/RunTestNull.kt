package com.run

class RunTestNull {
}
fun main(args: Array<String>) {
	
//	nullTest1()
	nullTest2()
}

fun nullTest1(){
	var nulls = arrayOfNulls<String>(0)
	
	println("null:${nulls} ${nulls.size}");
	for(i in nulls){
		println("nullList:${i}");
	}
	
	var testNull :String?
	testNull = "tt"
	println("testNull:${testNull}");
	testNull = null
	println("testNull:${testNull}");
}

fun nullTest2(){
	var testListNull : ArrayList<String>?
	testListNull = ArrayList<String>()
	
	for(i in testListNull){
		println("nullList:${i}");
	}
	
	testListNull = null
	println("nullList:${testListNull}");
	
}