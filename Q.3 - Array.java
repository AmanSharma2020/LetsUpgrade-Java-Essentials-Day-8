class Car
{
 public int power; 
 public int Serial_no;
 public Car(int p, int s)
{
 power = p; Serial_no = s; 
}
 } 
class Ar1
{
 public static void main(String[] args)
{
 Car[] c; 
c = new Car[10]; 
c[0] = new Car(800,111); 
}
 }
