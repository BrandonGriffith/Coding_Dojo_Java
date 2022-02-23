class Node{
    constructor(valueInput){
        this.value = valueInput;
        this.left = null;
        this.right = null;
    }
}


class BST{
    constructor(){
        this.root = null;
    }


    insert(valueInput){
        let newNode = new Node(valueInput);
        if(this.root==null){
            this.root=newNode;
            return this;
        }
        let runner = this.root;
        while(runner.right != newNode || runner.left != newNode){
            while(newNode.value >= runner.value){
                if(runner.right == null){
                    runner.right = newNode;
                    return this;
                }runner = runner.right;
            }
            while(newNode.value < runner.value){
                if(runner.left == null){
                    runner.left = newNode;
                    return this;
                }runner = runner.left;
            }
        }
    }

    traverse(runner=this.root){
        if(runner.left != null){
            this.traverse(runner.left);
        }console.log(runner.value);
        if(runner.right != null){
            this.traverse(runner.right);
        }
    }

    findMin(runner=this.root){
        if(runner.left != null){
            this.findMin(runner.left);
        }else{
            console.log(runner.value + " is min");
        }
    }

    findMax(runner=this.root){
        if(runner.right != null){
            this.findMax(runner.right);
        }else{
            console.log(runner.value + " is max");
        }
    }
}


let bst1 = new BST();
bst1.insert(5);
bst1.insert(6);
bst1.insert(9);
bst1.insert(8);
bst1.insert(7);
bst1.insert(3);
bst1.insert(4);
bst1.insert(2);
bst1.insert(5);
bst1.traverse();
console.log("---------------------");
bst1.findMin();
bst1.findMax();

