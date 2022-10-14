public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
       Use Math.PI for pi and use the pow method
     */
    public double area()
    { /* implement this method! */
        double pi = Math.PI;
        double r = radius;
        double area = pi * r * r;
        return area;
    }


    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * 2 * r
       Use Math.PI for pi
     */
    public double circumference()
    { /* implement this method! */
        double pi = Math.PI;
        double d = 2 * radius;
        double circumference = d * pi;
        return circumference;
    }


    /* Setter method to update the radius of the circle to newRadius
     */
    public void setRadius(double newRadius)
    { /* implement this method! */
        double r = newRadius;
        radius = r;
    }


    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below (Reminder: the new line escape
       sequence \n allows you to include new lines in Strings!)
       Note that this method should return a string -- it should NOT
       do any printing. This method should call your other methods!
     */
    public String getInfo()
    { /* implement this method! */
        String r = "The radius of the circle is : ";
        String c = "The circumference of the circle is : ";
        String a = "The area of the circle is : ";
        String info = r + radius + "\n" + c + circumference() + "\n" + a  + area();
        return info;
    }

}

