package noe.basic.kotlin_basics_2

//these are PUBLIC PRIVATE PROTECTED AND INTERNAL
//PUBLIC lets classes, interfaces, methods and properties to be accessible from everywhere, its the default modifier assigned by kotlin and
// if any modifier has been specified, then kotlin assigns this modifier
// the elements with public modifier inside a class should be placed in the top

///PRIVATE
// Private members are only accessible where there have been declared
// Private modifier does not allow access outside of the scope where the member has been declared
//it also applies to packages

//Internal
//works the same as private but the scope of the restriction goes for only between modules

//PROTECTED
//allows members of a class to be visible only to there base class or sub class only
// open protected let us override the value of the member inherited


//OOP RELATED
//OPEN
//by default all classes are final in kotlin, this means that cant be inherited, but if we use the keyword open , it provides the functionality to the class
//of being inheritable


//FILE RELATED
// NESTED class, this class has the behaviour of a static class, these classes cannot access the members of the outer class
//Inner class, same as the nested but cannot be declared inside interfaces and non inner classes, the advantage of inner class is that can access the members of the outer class

