interface polygon{
    void getArea(int length, int breadth);
    void getparimeter(int length, int breadth);

}

class rectangle implements polygon {

    public void getArea(int length, int breadth){
       System.out.println("the area of rectangle is :"+(length * breadth));


    }
    public void getparimeter(int length, int breadth){
        System.out.println("the perimeter of rectangle is :"+((length + breadth)*2));
    }

}


public class task1 {

public static void main (String args[]){

    rectangle a = new rectangle();
    a.getArea(7,5);
    a.getparimeter(7,5);

}

}
