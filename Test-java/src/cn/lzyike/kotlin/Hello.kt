package cn.lzyike.kotlin

fun test(){
	println("hello,Test!");
}

fun main(args:Array<String>){
	for(i in 1..9){
		for(j in 1..i){
			print("$i*$j="+i*j+"\t");
		}
		println();
	}
}