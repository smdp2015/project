package dk.itu.smdp2015.church.generator.jqm

import java.util.*

class GroupNameStack {
	val _queue = new Stack<String>()
	
	def pushLevel(String name){
		_queue.push(name);
	}
	def popLevel(){
		_queue.pop()
	}
	def getFullPath(){
		_queue.drop(1).fold(_queue.firstElement)[full, it| full + "." + it + "()"]
	}
}