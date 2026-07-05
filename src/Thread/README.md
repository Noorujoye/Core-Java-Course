Thread creation ke concepts in Java

Java me thread banane ke 3 main tareeke hote hain:

Extending Thread class

Ek class banate ho jo Thread ko extend kare.

Fir run() method override karte ho.

Uske baad start() call karte ho.

Implementing Runnable interface (preferred way)

Ek class banate ho jo Runnable implement kare.

run() method override karte ho.

Fir Thread t = new Thread(object) karke thread start karte ho.

Lambda expression (short cut) (Runnable ke sath Java 8+)

Direct ek anonymous Runnable pass kar sakte ho.

👉 Har thread ke liye alag class banana compulsory nahi hai.
Tum ek hi Runnable bana kar, alag-alag kaam ke liye alag object bana sakte ho.