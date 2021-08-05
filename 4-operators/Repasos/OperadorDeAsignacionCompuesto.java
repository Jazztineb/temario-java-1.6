class OperadorDeAsignacionCompuesto {
    
    x += 10; //sería igual a  x = x + 10;
    y -= 50; //sería igual a  y = y - 50;
    z *= 7;  // equivale a  z = z * 7;
    w /= 100; // equivale a w = w/100;

    //sería equilvalente a x *= (3+5), es decir x = x * (3 + 5)  y no x = (x * 3) + 5.
    x *= 3 + 5; 
}