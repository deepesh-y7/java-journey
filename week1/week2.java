class calc{



   int add(int x, int y, int z){
 
    int res = x+y+z;
    return (res);

   }

   void add(double x, int y){
    System.out.println(x+y);
   }
   void add(int x, double y){
    System.out.println(x+y);
   }


   double add(double x, double y, double z){
 
    double res = x+y+z;
    return (res);

   }
}

public class week2 {

    public static void main(String[] args) {

        int x= 5;
        int y= 5;
        int z= 5;

        double a =1.5;
        double b =2.5;
        double c =3.5;
        
        calc cadd = new calc();
        
       System.out.println(cadd.add(x,y,z)); 
       System.out.println(cadd.add(a,b,c)); 
       cadd.add(4,4.5); 
    }
    
}