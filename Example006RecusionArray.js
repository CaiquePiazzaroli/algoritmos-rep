const array = [2, 3, 4, 6, 8]

// Adding element of array
function addArrayItens(array) {
    if (array.length == 0) {
        return 0;
    } else {
        return array[0] + addArrayItens(array.slice(1));
    }
}

// Counting itens of array
function countItens(array) {
    if(array[0] === undefined) {
        return 0;
    } else {
        return 1 + countItens(array.slice(1));
    }
}