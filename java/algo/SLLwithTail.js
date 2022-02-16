class Node {
    constructor(valueInput){
        this.value = valueInput;
        this.next = null;
    }
}

class SLL {
    constructor(){
        this.head = null;
        this.tail = null;
        this.b_tail = null;
        this.count = 0;
    }

    addToBack(valueInput){
        let newNode = new Node(valueInput);
        this.count++;
        if(this.head == null){
            this.head = newNode;
            this.b_tail = newNode;
            this.tail = newNode;
        }else{
            this.b_tail = this.tail;
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }

    display(){
        let result = "";
        let runner = this.head;
        while(runner != null){
            result += `${runner.value} --> `;
            runner = runner.next;
        }
        console.log(result);
        console.log("The list size is " + this.count);
    }

    addToFront(valueInput){
        let newNode = new Node(valueInput);
        this.count++;
        if(this.head == null){
            this.head = newNode;
            this.b_tail = newNode;
            this.tail = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    removeFront(){
        this.count--;
        let temp = this.head;
        this.head = this.head.next;
        temp.value = null;
        temp.next = null;
    }

    removeBack(){
        this.count--;
        if(this.b_tail != null){
            this.tail.value = null;
            this.tail = this.b_tail;
            this.tail.next = null;
            this.b_tail = null;
            return;
        }
        let runner = this.head;
        if(runner.next == null){
            runner.value = null;
            runner = null;
        }else{
            while(runner){
                if(runner.next.next === null){
                    this.tail = runner;
                    runner.next.value = null;
                    runner.next = null;
                    return;
                }this.b_tail = runner;
                runner = runner.next;
            }
        }
    }
}


let sll1 = new SLL();
sll1.addToBack(3);
sll1.addToBack(12);
sll1.addToBack(15);
sll1.addToBack(9);
sll1.addToFront(11);
sll1.addToFront(20);
sll1.display();
sll1.removeFront();
sll1.display();
sll1.removeBack();
sll1.display();


// console.log(sll1)
// let firstNode = new Node(3);
// let secondNode = new Node(9);
// firstNode.next = secondNode
// let thirdNode = new Node(12);
// secondNode.next = thirdNode;