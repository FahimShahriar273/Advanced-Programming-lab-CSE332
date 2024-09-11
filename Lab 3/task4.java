class holiday{

    private String name,month;
    private int day;



    holiday(String name, String month, int day){
        this.name=name;
        this.month=month;
        this.day=day;

    }



    void display(){
        System.out.println("Name :"+ name);
        System.out.println("month :"+ month);
        System.out.println("day :"+ day);
    }

}

public class task4 {
    public static void main(String args[]){
        holiday t1= new holiday("fahim","dec",10);
        t1.display();

    }


}
