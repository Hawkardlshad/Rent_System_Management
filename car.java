
package rent.mangement.system;




public class car {
 private String color;  
private int  speed;
private String company;
    
class company extends car{
public String company="jeep";

    
}
class color extends car{

String color;



}

class speed extends car{

int speed;

class price extends speed{
int price;





}




}

public void setcolor(String newcolor){

color=newcolor;




}

public void setspeed(int newspeed){
speed=newspeed;




}

public void setcompany(String newcompany){
  company=newcompany;
  

}

public String getcolor(){

return color;

}
public int getspeed(){

return speed;



}
public String getcompany(){

return company;




}
}
class BMW  implements BMW_Company{
private int carspeed;
       private String model;
        public void car_Model() {
            System.out.println("This is BMW X5");  
        }

    @Override
    public int car_speed(int carspeed) {
        if (carspeed>400) {
            System.out.println("this car price 200$ per.week");   
        }
  
        
      
        
        return carspeed;
    }



public void setcarspeed(int newcarspeed){

carspeed=newcarspeed;

}
public int getcarspeed(int newcarspeed){

return newcarspeed;

}

public void setmodel(String newmodel){
model=newmodel;
}

public String getmodel(String newmodel){

return newmodel;

}
}



