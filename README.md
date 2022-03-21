# Task Title: Counter

# Task Description: 

Write a class Counter that represents a simple counter, defined in the following UML
class diagram. Write a class CounterTest to test it. Follow the steps below may help
you:

Counter
int count;
int max;
increase();
decrease();
reset();
increase(int n);
decrease(int n);
toString() : String;

a) Write the Counter class. The Counter class should have two private variables:
count and max. (count is the current count, max is the maximum count allowed).
Add a default constructor for the Counter class. This constructor should have no
parameters; it should assign value 0 to count and value 10 to max as default values.

b) Add accessors(getters) and mutators (setters) for the two private variables. The
get methods should be named getCount() and getMax(). The set methods
should be named setCount(int n) and setMax(int n).

c) Write the CounterTest class with a main method. Create a Counter object, call
the getter and setter methods to test them. Compile and run your program.

d) Add three methods in Counter class: increase() method to increase the count
by 1; decrease() method to decrease the count by 1; reset() method to reset
the count to 0 and print a message “Counter Reset!”. Test these methods by
invoking them from CounterTest class.

e) Add a toString() method in Counter class. Test this method in
CounterTest class.

f) Modify the increase()method so that it should reset the counter when the
count reaches the max value. Modify the decrease() method so that it should
NOT decrease the count when the count reaches 0. Test these methods in
CounterTest class. [Hint: you may use a loop in the CounterTest class to
invoke increase()and decrease()methods many times]

g) Method overloading: Add another two methods increase(int n)and
decrease(int n). These methods give the count n increments/decrements.
Test these methods in CounterTest class.

