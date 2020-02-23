public class Rectangle

{  
	
     Point A, B, C, D;    
     double length, width;  

      public Rectangle(Point A, Point B, Point C, Point D)

     {    
      //Write the missing statements in the answer script         ……………
      this.A = A;
      this.B = B;
      this.C = C;
      this.D = D;

     }    
      public Rectangle(Point A, Point B,  Point C, Point D, double length, double width)

     {    
        //Write the missing statements in the answer script         ……………
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.length = length;
        this.width = width;

     }

      public Rectangle(Point B, double length, double width)

     {      
       //Write the missing statements in the answer script         ………………   
       this.B = B;
       this.length = length;
       this.width = width;

     }

        void draw()

        {
            System.out.println("Rectangle------------");    
            System.out.println("Point A: "+ this.A.getX()+", "+ this.A.getY());  
            System.out.println("Point B: "+ this.B.getX()+", "+ this.B.getY());    
            System.out.println("Point C: "+ this.C.getX()+", "+ this.C.getY());      
            System.out.println("Point D: "+ this.D.getX()+", "+ this.D.getY());    
            System.out.println("Length: "+ this.length +" cm");        
            System.out.println("Width: "+ this.width +" cm");  
            System.out.println("Rectangle------------");    
            System.out.println(); 

        }

        public static void main(String[] args)

        {  
        	
          Point p1 = new Point(1,5);      
          Point p2 = new Point(1, 1);
          Point p3 = new Point(9, 1); 
          Point p4 = new Point(9, 9);
          
          Rectangle R1 = new Rectangle(p1, p2, p3, p4, 8, 4);
          R1.draw();
         

          
          Point p5 = new Point(2, 6);  
          Point p6 = new Point(2, 2);    
          Point p7 = new Point(10, 2);      
          Point p8 = new Point(10, 6); 
          
          Rectangle R2 = new Rectangle(p5, p6, p7, p8, 8, 4);  
          R2.draw();
   
      }
        
        
 }
