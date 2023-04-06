public class Rectangle implements Shape{
    float area,perimeter,b,l;
    public Rectangle(float i,float j){
        b=i;
        l=j;
    }
    @Override
    public float calculateArea() {
        area = b*l;
        return area;
    }

    @Override
    public float calculatePerimeter() {
        perimeter =2*(b+l);
        return perimeter;
    }
}
