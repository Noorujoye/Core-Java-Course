Rule 1: Execution Order
try → catch → finally

Rule 2: If NO exception
try runs completely
catch is skipped
finally ALWAYS runs

Rule 3: If exception occurs
try stops immediately
matching catch runs , if handle block is not there program stops
finally ALWAYS runs

Rule 4: If exception NOT handled
try stops
no matching catch
finally STILL runs
then program crashes

Rule 5: finally block
runs in almost ALL cases
except:
System.exit(0)
JVM crash

Rule 6: Multiple catch blocks
Order must be specific => general
catch (ArithmeticException e) {} // first
catch (Exception e) {} // last

Rule 8: finally overrides return
try {
return 10;
} finally {
return 20;
}

## Best Practice

- Use throws for:
- checked exceptions
- Use try-catch for:
- handling logic

## how to create customException

create class with exception name , extending Exception class

if you'r using throws in method signature then no need to handle it in main method because u r handling
the main use of throws is , i can't handle , so the job of handling is for caller