/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent.mangement.system;






public class RentMangementSystem {

   
    public static void main(String[] args) {
house obj=new house();
obj.setaddress("hawary shar");
obj.setarea(250);
obj.setcity("slemany");
obj.setcolor("black");
obj.setfloor(2);
        System.out.println("area is "+obj.getArea()+"\n"+"address is "+obj.getAddress()+"\n"+"city is "+obj.getCity()+"\n"+"color is "+obj.getColor()+"\n"+"floor is "+obj.getFloor());      
               if (obj.getArea()<200) {
           System.out.println("this house for rent");
       }
       else{
       System.out.println("this house for sale");
   }   
        
        
        
        
        
            System.out.println("______________________________________________________________________________");
    car ob=new car();
    ob.setcolor("blue");
    ob.setcompany("jeep");
    ob.setspeed(100);

        System.out.println("color is ;"+ob.getcolor()+"\n"+"company name is ;"+ob.getcompany()+"\n"+"car speed is ;"+ob.getspeed());
    
        if (ob.getcompany()=="jeep") {
            System.out.println("jeep value is 200"); 
        }
        System.out.println("__________________________________________________________________________________________");
    
     BMW m=new BMW();
m.car_Model();

m.car_speed(500);
    }
    
}
