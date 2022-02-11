function generate(numRows) {
    let arr = [];
    let arr2 = [];
    for(let i = 1; i <= numRows; i++){
        let x = 1;
        for(let j = 1; j <= i; j++){
            arr2.push(x);
            x = (x * (i - j)) / j;
        }
        console.log(arr2);
        arr.push(arr2);
        arr2 = [];
    }
    return arr;
}

generate(5) //[[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

let i = 3;
let j = 2;
let x = 2;

console.log((x * (i - j)) / j);
