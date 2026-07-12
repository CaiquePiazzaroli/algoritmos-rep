const myArray: number[] = [6, 2, 8, 4, 1, 3];

function quickSort(arr: number[]): number[] {
    if (arr.length < 2) {
        return arr;
    } else {
        let pivot: number = arr[0];
        let smaller: number[] = [];
        let larger: number[] = [];

        for (let i: number = 1; i < arr.length; i++) {
            if (arr[i] >= pivot) {
                larger.push(arr[i]);
            } else {
                smaller.push(arr[i]);
            }
        }

        return [...smaller, pivot, ...larger];
    }
}

console.log(quickSort(myArray));
