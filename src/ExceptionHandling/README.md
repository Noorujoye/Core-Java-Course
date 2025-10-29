📌 Rules to Remember

Finally always executes (except System.exit() or JVM crash).

If finally has return, it overrides try/catch return or exception.

Best practice → avoid return in finally.

For checked exceptions:

Must catch OR declare with throws.

If main() doesn’t handle exception → JVM prints stack trace and terminates.


Java Exception Handling — Quick Notes
🔑 Basics

Exception = An unwanted event that disrupts normal program flow.

Checked Exceptions → Checked at compile time (e.g., IOException, SQLException).
Must be handled (try-catch) or declared (throws).

Unchecked Exceptions → Subclasses of RuntimeException (e.g., NullPointerException, ArithmeticException).
Not mandatory to handle.

Errors → Serious problems (e.g., OutOfMemoryError) → usually not handled.

🔑 Keywords

try → Block of code that may throw exception.

catch → Handles the exception.

finally → Always executes (cleanup, close resources).

throw → Used to throw an exception object.

throws → Declares that a method may throw exception(s).

🔄 Exception Propagation

If an exception is not caught in a method, it propagates (travels) to its caller.

👉 Example:

static void m1() throws IOException {
throw new IOException("Problem in file");
}
static void m2() throws IOException {
m1(); // exception propagates here
}
public static void main(String[] args) throws IOException {
m2(); // exception propagates to JVM
}
➡ If no catch exists, JVM handles it by printing stack trace.

🔄 Control Flow with try-catch-finally
Case 1: Normal flow (no exception)

try {
return 10;
} catch (Exception e) {
return 20;
} finally {
System.out.println("Finally block");
}


Case 2: Exception occurs, caught by catch
try {
int x = 10 / 0;
return 10;
} catch (Exception e) {
return 20;
} finally {
System.out.println("Finally block");
}
✔ Output: Finally block printed, return = 20


Case 3: Return inside finally
try {
return 10;
} catch (Exception e) {
return 20;
} finally {
return 30;
}
✔ Return = 30 (finally overrides try/catch)

Case 4: Exception, no catch, only finally
try {
int x = 10 / 0;
return 10;
} finally {
System.out.println("Finally block");
}
✔ Output: Finally block printed, program crashes with ArithmeticException


Case 5: Exception, finally has return (exception suppressed)
try {
int x = 10 / 0;
return 10;
} finally {
return 30;
}
✔ Return = 30, exception is lost (dangerous)


Case 6: System.exit() inside try
try {
System.exit(0);
} finally {
System.out.println("Finally block");
}
✔ Finally does not execute (JVM terminates immediately)





