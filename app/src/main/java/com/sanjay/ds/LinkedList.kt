package com.sanjay.ds
fun main(){
     val linkedList = LinkedList()
     linkedList.add(5)
    linkedList.add(8)
    linkedList.add(10)
    linkedList.add(15)
    linkedList.add(18)
    linkedList.print()
    linkedList.reverse()
    System.out.println("Reversed---------")
    linkedList.print()
}


class LinkedList {
   var head : Node? = null

    fun add(data : Int){
        val node = Node(data)
        if(head == null){
            head = node
        }else{
            var temp = head
            while (temp?.next != null){
                temp = temp.next
            }
            temp?.next = node
        }
    }

    fun reverse(){
        var temp = head
        var prev : Node? = null
        var current = temp
        var next : Node? = null

        while (current != null){
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        head = prev
    }

    fun print(){
        var temp = head
        while (temp != null){
            System.out.println("data: "+temp.data)
            temp = temp.next
        }
    }
}

class Node(var data: Int) {
    var next: Node? = null
}