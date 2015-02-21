public class Lesson8 {

 // This lesson will explain while loops

//simple while loop
boolean condition = true;
int x = 10;
while( condition )
   System.out.println("x is now " + (x++));

// or 
while( condition ){
  // execute
}

// output
1 x is now 10 
2 x is now 11
3 x is now 12
4 x is now 13
5 x is now 14
6 x is now 15
7 x is now 16
8 x is now 17
9 x is now 18
10 x is now 19
...

// conditional while loops
int x = 8;
int y = 0;

while( x >= y )
   System.out.println("x is " + (x--));

}

// output
1 x is now 8
2 x is now 7
3 x is now 6
4 x is now 5
5 x is now 4
6 x is now 3
7 x is now 2
8 x is now 1
9 x is now 0



// do-while loops

do {
  // execute
}
while( condition );


// example
do {
  System.out.println("x is " + (x--));
}
while( x >= y );

// output
1 x is now 8
2 x is now 7
3 x is now 6
4 x is now 5
5 x is now 4
6 x is now 3
7 x is now 2
8 x is now 1
9 x is now 0

}
