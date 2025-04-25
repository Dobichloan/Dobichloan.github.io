var x = prompt("Enter the radius of the circle");
const PI = 3.14;

if (x == null || x == "" || isNaN(x)) {
    alert("Radius is formatted incorrect");
}
else {
    var Perimeter = 2 * PI * parseFloat(x);
    alert("Result is :\n" +
        "Perimeter of the circle " + "2*" + PI + "*" + x + " = " + Perimeter);
    var Area = PI * parseFloat(x) * parseFloat(x);
    alert("Result is :\n" +
        "Area of the circle " + "*" + x + "*" + x  + PI + " = " + Area);
}

