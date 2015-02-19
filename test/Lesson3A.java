public class Lesson3A {

 // Variable assignment
 
  // Format
  Type name = data;

  // - Type int,byte,float...etc.
  // - name may only consist of regx[a-z,A-z,0-9,_,$] must start w/ letter
  // - = is the assignment operator takes right data and stores it to the data on the left
  // - data the data to be evaluated must correspond w/ type
  // - ; all statements must end with a ;(semicolon)
  
  // camelBack
  Type cammelBackName;

  // Dangers

  Type name = data; Type name = data;
  // do not ever do this, I is extreemly hard to read and in some cases might even fail
  

  // Things to note
  Type name;

  // uninitalized variables are automaticall assigned a value if you try to use them
  Type name2 = name;

  // Variable chaining
  Type name, name, name, name;

  // This is very valid to the Compiler
  // you can also try this

  Type name = data, name = data, name = data;

  // both are valid
  // just be sure not to mix up the types like so

  Type1 name = t1data;
  
  Type2 name = t2data, name = t1data;

  // the above example will fail because the types do not match
 
}
