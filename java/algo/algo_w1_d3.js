//given an array, remove duplicate values from it. Do it in place (do not create a new array to do this with). If you're having difficulty, its okay to try an baby step it first by using a new array and making it work that way.

function removeDupes(arr){
    let i = 0;
    let k = 1;
    let x = arr.length;
    while(i < x){
        while(k < x){
            if(arr[i] === arr[k]){
                arr.splice(k, 1);
                k = k - 1;
                x = arr.length;
            }
            k++;
        }
        i++;
        k = i + 1;
    }
    return arr;
}

console.log(removeDupes([3,6,7,3,2,7,7,9,0,1,7,3,7,6,7])) //output-> [3,6,7,2,9,0,1]

