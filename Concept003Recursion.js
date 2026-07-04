// Recursion 
function subtractionToZero(number) {
    console.log("Subtracting the number: ", number);
    if(number === 0) {
        return number; // Base case or Caso base
    } else {
        subtractionToZero(number - 1); // Recursive Case or Caso Recursivo
    }
}
subtractionToZero(100);