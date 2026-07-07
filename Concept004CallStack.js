// Example of call Stack
function one() {
    console.log("Function One: Step 1");
    two();
    console.log("Function One: Step 5");
}

function two() {
    console.log("Function Two: Step 2");
    three()
    console.log("Function Two: Step 4");
}

function three() {
    console.log("OK STEP 3")
}


one();