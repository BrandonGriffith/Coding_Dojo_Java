// let x = [2,4,5,7,8,12,22,24,27,45,55,56,58,66,67,68,90,100];

// function binarySearch(arr, value, index=0, runner=null){
//     if (runner == null){
//         runner = Math.floor(arr.length/2);
//     }else if (runner == 0){
//         return false;
//     }else if (runner > 0){
//         runner = Math.floor(runner/2);
//     }
//     if (arr[index+runner] == value){
//         return true;
//     }else if(arr[index+runner+1] == value){
//         return true;
//     }else if (arr[index+runner] < value){
//         return binarySearch(arr, value, index + runner, runner);
//     }
//     return binarySearch(arr, value, index , runner);
// }

// console.log(binarySearch(x, 68)); //true
// console.log(binarySearch(x, 51)); //false
// console.log(binarySearch(x, 2)); //true
// console.log(binarySearch(x, 100)); //true
// console.log(binarySearch(x, 1)); //false
// console.log(binarySearch(x, 101)); //false
// console.log(binarySearch(x, 90)); //true


let x = [2,4,5,7,8,12,22,24,27,45,55,56,58,66,67,68,90,100];

function binarySearch(arr, value, runner=null, count=0){
    if (runner == null){
        runner = Math.floor(arr.length/2);
    }else if (runner < 0 || runner > arr.length - 1){
        return false;
    }
    count++;
    if(count > arr.length/2){
        return false;
    }
    if (arr[runner] == value){
        return true;
    }else if (arr[runner] < value){
        return binarySearch(arr, value, runner + Math.floor((arr.length - runner)/2), count);
    }
    return binarySearch(arr, value, Math.floor(runner/2), count);
}

console.log(binarySearch(x, 68)); //true
console.log(binarySearch(x, 51)); //false
console.log(binarySearch(x, 2)); //true
console.log(binarySearch(x, 100)); //true
console.log(binarySearch(x, 1)); //false
console.log(binarySearch(x, 101)); //false
console.log(binarySearch(x, 90)); //true
