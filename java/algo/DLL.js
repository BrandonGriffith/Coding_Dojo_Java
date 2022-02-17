class Node {
    constructor(valueInput){
        this.value = valueInput;
        this.next = null;
        this.prev = null;
    }
}


class DLL {
    constructor(){
        this.head = null;
        this.tail = null;
    }

    addToBack(valueInput){
        let newNode = new Node(valueInput);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
    }

    addToFront(valueInput){
        let newNode = new Node(valueInput);
        if(this.head == null){
            this.head = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head.prev = newNode;
            this.head = newNode;
        }
    }

    removeFromBack(){
        if(this.tail == this.head){
            this.head.value = null;
            return this.head = null, this.tail = null;
        }
        let temp = this.tail;
        this.tail = this.tail.prev;
        this.tail.next = null;
        temp.value = null;
        temp.prev = null;
    }

    removeFromFront(){
        if(this.tail == this.head){
            this.head.value = null;
            return this.head = null, this.tail = null;
        }
        let temp = this.head;
        this.head = this.head.next;
        this.head.prev = null;
        temp.value = null;
        temp.next = null;
    }

    display(){
        let result = "";
        //use runner to traverse the SLL
        let runner = this.head;
        while(runner != null){ //while runner is pointing at a node
            result += `${runner.value} --> `
            runner = runner.next //this is how you increment runner to go to the next node
        }
        console.log(result)
    }
}


let dll1 = new DLL();
dll1.addToBack(5);
dll1.display();
dll1.addToBack(8);
dll1.display();
dll1.addToBack(10);
dll1.display();
dll1.addToFront(6);
dll1.display();
dll1.addToFront(4);
dll1.display();
dll1.addToFront(2);
dll1.display();
dll1.removeFromBack();
dll1.display();
dll1.removeFromBack();
dll1.display();
dll1.removeFromFront();
dll1.display();
dll1.removeFromFront();
dll1.display();
dll1.addToBack(8);
dll1.display();
dll1.addToBack(10);
dll1.display();
dll1.addToFront(4);
dll1.display();
dll1.addToFront(2);
dll1.display();
