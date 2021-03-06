class Node {
    constructor(valueInput){
        this.value = valueInput;
        this.next = null;
    }
}

class SLL {
    constructor(){
        this.head = null;
    }

    addToBack(valueInput){
        //create a node object with a given value to add to the back of the list eventually 
        let newNode = new Node(valueInput);
        //if the singly linked list is empty (this mean that its head === null), then set the head of the singly linked list to be this new node
        if(this.head == null){
            this.head = newNode;
        }//otherwise (else) go to the end of the list and insert the node to the end
        else{ //else means that the list is not empty
            // console.log("this.head looks like this-->", this.head)
            let runner = this.head; //create runner variable to start at the beginning of the list (the head)
            //increment runner while runner.next != null (as long as the runner.next does not equal to null, that meanns runner is not at the last node)
            while(runner.next != null){ //in other words (while runner is not the last node)
                runner = runner.next; //this moves runner to the next node
            }//by the time while loop is done, we will have runner pointing to the last node
            runner.next = newNode;
        }
    }

    display(){
        let result = "";
        let runner = this.head; //use runner to traverse the SLL
        while(runner != null){ //while runner is pointing at a node
            result += `${runner.value} --> `;
            runner = runner.next; //this is how you increment runner to go to the next node
        }
        console.log(result);
    }

    addToFront(valueInput){
        let newNode = new Node(valueInput);
        if(this.head == null){
            this.head = newNode;
        }else{
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    removeFront(){
        let temp = this.head;
        this.head = this.head.next;
        temp.value = null;
        temp.next = null;
    }

    removeBack(){
        let runner = this.head;
        if(runner.next == null){
            runner.value = null;
            runner = null;
        }else{
            while(runner){
                if(runner.next.next === null){
                    runner.next.value = null;
                    runner.next = null;
                    return;
                }runner = runner.next;
            }
        }
    }

    reverse(temp=null) {
        if (this.head.next != null) {
            let runner = this.head;
            this.head = this.head.next;
            runner.next = temp;
            return this.reverse(runner);
        }
        this.head.next = temp;
        return;
    }

    addToList(index, valueInput){
        let newNode = new Node(valueInput);
        if(this.head == null){
            this.head = newNode;
            return;
        }
        let count = 1;
        let runner = this.head;
        while(count<index){
            runner = runner.next;
            count++;
        }
        if(index == 0){
            newNode.next = this.head;
            this.head = newNode;
        }else{
            newNode.next = runner.next;
            runner.next = newNode;
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
sll1.reverse();
sll1.display();
sll1.addToList(4, 69);
sll1.display();



// console.log(sll1)
// let firstNode = new Node(3);
// let secondNode = new Node(9);
// firstNode.next = secondNode
// let thirdNode = new Node(12);
// secondNode.next = thirdNode;