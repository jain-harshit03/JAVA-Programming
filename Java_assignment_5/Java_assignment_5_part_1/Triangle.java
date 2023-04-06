public class Triangle implements Shape{
    float area,perimeter,b,l,h;
    public Triangle(float i,float j, float k){
        b=i;
        l=j;
        h=k;
    }
    @Override
    public float calculateArea() {
        area = (float) (h*b*0.5);
        return area;
    }

    @Override
    public float calculatePerimeter() {
        perimeter = b+l+h;
        return perimeter;
    }
}
