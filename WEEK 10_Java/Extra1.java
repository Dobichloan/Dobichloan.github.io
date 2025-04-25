var x = prompt("Enter the height of the retangle");
var y = prompt("Enter a base of the retangle");

if (x == null || x == "" || isNaN(x)) {
    alert("Height is formatted incorrect");
}
else if (y == null || y == "" || isNaN(y)) {
    alert("Base is formatted incorrect");
}
else {
    var Perimeter = (parseFloat(x) * parseFloat(y)) * 2;
    alert("Result is :\n" +
        "Perimeter of the retangle " + "(" + x + "+" + y + ")" + "*2"  + " = " + Perimeter);
    var Area = parseFloat(x) * parseFloat(y);
    alert("Result is :\n" +
        "Area of the retangle " + x + "*" + y + " = " + Area);
}