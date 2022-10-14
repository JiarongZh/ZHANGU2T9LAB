public class rightTriangle {
     double h = 0.0;
     double b = 0.0;

    public rightTriangle(double height, double base){
      h = height;
      b = base;

    }
        public double hypotenuse()
    {
             double sqr1 = Math.pow(h,2);
             double sqr2 = Math.pow(b,2);
             double sqr3 = sqr1 + sqr2;
             double hyp = Math.pow(sqr3,.5);
             return hyp;
        }
    }

