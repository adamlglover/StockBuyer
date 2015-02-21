public class Lesson6 {

 // This lesson will go over If statements 

 // SYNTAX
 bool condition = true;

 if( condition ){
    // execute
 }

 bool iLikeCake = true;

 if( iLikeCake ) {
    System.out.println("I Like Cake!");
 }

// single line if statements
  if( iLikeCake )
      System.out.println("I Like Cake!");

// Single line Dangers
   if( iLikeCake )
      System.out.println("I Like Cake!");
   int f = 6; // outside of if staement

// relational if statements
 int x = 10;
 int y = 3;

 if( x < y )
    System.out.println("x < y");

 if( x > y)
    System.out.println("x > y");

 if( x >= y )
    System.out.println("x >= y");

 if( !(x == y) )
    System.out.println("x != y");

 //  nested if statements

 if( x < y ) {
    
     if(x == 7)
         System.out.println("x < y and x == 7");

     if(x == 10){
         System.out.println("x < y and x == 10");
     }

 } 
 
// Logical AND
if( (x == 10) && (y == 3) )
      System.out.println("x == 10 && y == 3");

// Logical and chaining
if( (x > 5) && ((y < 4) && (y > 0 )) ) 
        System.out.println("");

// Logical and chaining
if( (x > 5) && ((y < 4) && (y > 0 )) )
        // do something


// Locical OR
if( (x == 10) || (y == 3) )
      System.out.println("x == 10 || y == 3");

// Logical OR chaining
if( (x > 5) || ((y < 4) || (y > 0 )) )
        // do something

// Complex Chaining
if( ((x == 10) && (y == 3)) || (x == 5) )
      // do something


// Complex  if statement
boolean isPositive = ( condition ) ? res1 : res1;

boolean isPosotive = ( y > 0 ) ? true : false;



}
