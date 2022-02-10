let x = [
    [12, 34, 45, 56],
    [98, 87, 76, 65],
    [56, 67, 78, 89],
    [54, 43, 32, 21]
]

let y = [
    [67, 78],
    [43, 32]
]


let z = [
    [67, 77],
    [43, 32]
]

let z1 = [
    [56, 67],
    [32, 21]
]


function matrixSearch(bigArr, smallArr){
    let i = 0;
    let j = 0;
    let k = 0;
    let count = 0;
    while(i < bigArr.length){
        while(j < bigArr[i].length){
            if(bigArr[i][j] == smallArr[k][0] && bigArr[i][j+1] == smallArr[k][1]){
                count += 3;
                i++;
                j--;
                k = 1;
                if(count > 3){
                    return true;
                }
                if(i > bigArr.length - 1){
                    return false;
                }
            }
            count--;
            j++;
        }
        count = 0;
        j = 0;
        i++;
    }
    return false;
}

console.log(matrixSearch(x,y)) //true
console.log(matrixSearch(x,z)) //false
console.log(matrixSearch(x,z1)) //false
