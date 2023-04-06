public class Circle implements Shape{
    float area,perimeter,rad;

    public Circle(float i){
        rad=i;
    }
    @Override
    public float calculateArea(){
        area = (float)(Math.PI*Math.pow(rad,2));
        return area;
    }
    @Override
    public float calculatePerimeter(){
        perimeter = (float)(2*Math.PI*rad);
        return perimeter;
    }

}
