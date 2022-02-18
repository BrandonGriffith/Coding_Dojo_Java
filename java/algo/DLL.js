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

    reverse1(temp=null) {
        if (this.head.next != null) {
            let runner = this.head;
            this.head = this.head.next;
            runner.next = temp;
            if(temp == null){
                this.tail = runner;
            }
            runner.prev = this.head;
            return this.reverse(runner);
        }
        this.head.next = temp;
        this.head.prev = null;
        return;
    }

    reverse2(){
        //check if the head and the tail are the same, if so, we can return b/c you cnat reverse if there is only one or no things
        if(this.head==this.tail){
            return this;
        }

        //create a temp variable to point to the node next to the head
        let temp = this.head.next;

        //create a runner variable and set it to be the head
        let runner = this.head;
        
        //while runner is pointing to a node
        while(runner!=null){
            //set the current node (runner)'s next property to be its previous property
            runner.next = runner.prev;

            //set the runners prev property to be the temp variable
            runner.prev = temp;

            //if the temp is null, then set runner = temp and temp = the next node from runner
            if(temp!=null){
            runner = temp;
            temp = runner.next;
            }
            //otherwise if temp is null, set runner = temp
            else{
                runner=temp;
            }
        }
        //outside the while loop, set temp to be the head
        temp = this.head;

        //set the head to be the tail
        this.head=this.tail;

        //set the tail to be temp
        this.tail = temp;
    }

    reverse() {
        for (let c = this.head; c != null; c = c.prev) {
            let temp = c.next;
            c.next = c.prev;
            c.prev = temp;
        }
        let temp = this.head;
        this.head = this.tail;
        this.tail = temp;
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
dll1.reverse();
dll1.display();
