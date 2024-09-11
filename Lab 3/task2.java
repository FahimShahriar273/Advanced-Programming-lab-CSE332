import java.lang.Math;
interface polygn{
    void getArea(int a, int b, int c);

}

class Triangle implements polygn {

    public void getArea(int a, int b, int c){
        float s= (a+b+c)/2;

        System.out.println("the area of triangle is :"+(Math.sqrt(s*(s-a)*(s-b)*(s-c))));

    }


}

public class task2 {

    public static void main (String args[]){

        Triangle a = new Triangle();
        a.getArea(4,5,6);


    }

}
