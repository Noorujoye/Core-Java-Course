## Synchronize:

"synchronized is a keyword in Java used to achieve thread safety.
It creates a critical section, ensuring that only one
thread can execute a specific block of code or method at any given time on the same object."

## Volatile :

"volatile keyword in Java is used to solve the Visibility Problem between multiple threads. When a variable is declared
as volatile, Java ensures that all reads and writes to this variable happen directly from and to the Main Memory (RAM)
instead of the CPU Cache. This guarantees that any changes made by one thread are instantly visible to all other
threads. However, volatile does not provide atomicity (like synchronized), so it shouldn't be used for compound
operations like count++."

### SYNCHRONIZATION:

- The Resource : java has object , let it be "Object obj" , now this object has it's own lock that is called monitor,
  which is currently free.
- The Request : Thread-1 comes and reach to synchronized line.
- Acquiring lock : Thread-1 saw that object monitor is free, so the thread immediately becomes the owner of that
  Monitor , now obj is locked.
- Execution : Now, Thread-1 enter into the block, and start running the code.
- The Block : simultaneoulsy , Thread-2 also reaches the same sycnhronized(obj) line , but it observes that thread-1
  already have the monitor of obj
- Waiting state : now Thread-2 not have access to enter so ,, it reaches to "Blocked State" and wait outside in the
  queue.
- Release Lock : As soon as Thread-1's works finishes , it get outs from synchronized "}" closing bracket and leaves the
  ownership of that obj Monitor.
- Next Thread enters : now again the monitor is free, thread-2 is waiting in the queue ,and it owns the monitor and
  enters to block.

--- Why are wait(), notify(), notifyAll() in Object class and not Thread class?

"In Java, locks (Monitor Locks) belong to Objects, not Threads.
Every object has an intrinsic monitor lock associated with it.

- wait() tells the current thread to release this object's lock and go to sleep.
- notify() wakes up a thread that is waiting for this specific object's lock.
- Since the lock belongs to the Object, the tools to control that lock (wait and notify) must live inside the Object
  class.
- If these methods were in the Thread class,
- a thread would have no way of knowing which specific object's lock it is supposed to release or wait for.
- Simply put, a Thread is just an execution worker.
- It visits an Object, requests its monitor lock, executes the synchronized code, and returns the lock back to the
  object when done."

ताला किसका है? ताला (Monitor Lock) हमेशा Object का होता है।
चाबी किसके पास है? ताले को कंट्रोल करने वाले मेथड्स (wait() / notify()) हमेशा Object Class के पास होते हैं।
Thread का असली रोल क्या है? Thread सिर्फ एक मजदूर (worker) है। वह आता है, Object से ताले की चाबी मांगता है, synchronized
ब्लॉक का काम खत्म करता है, और चाबी वापस Object को सौंपकर चला जाता है।
अगर Thread क्लास में होता तो क्या होता? अगर यह Thread क्लास में होता, तो Thread को कभी पता ही नहीं चलता कि उसे किस
Object का ताला छोड़ना है या किस Object के लिए इंतज़ार करना है।

## Atomicity (एटॉमिकिटी) क्या है?

Atomicity का मतलब है "या तो पूरा काम एक बार में होगा, या बिल्कुल नहीं होगा" (All or Nothing)। बीच में कोई दूसरा Thread
आकर टांग नहीं अड़ा सकता।जब कोई ऑपरेशन Atomic होता है, तो वह इतना छोटा और अखंड होता है कि उसे बीच में ब्रेक नहीं किया जा
सकता।The Trap: count++ दिखने में छोटा है, पर Atomic नहीं है!इंटरव्यूअर अक्सर पूछते हैं कि क्या count++ एक Atomic ऑपरेशन
है? जवाब है: नहीं।बैकग्राउंड में CPU इस count++ को करने के लिए 3 अलग-अलग कदम (Steps) उठाता है:Read: RAM से count की
पुरानी वैल्यू पढ़ो (मानो count = 5)।Modify: उस वैल्यू में +1 जोड़ो (5 + 1 = 6)।Write: नई वैल्यू 6 को वापस RAM में
लिखो।दिक्कत (Problem): अगर Thread-1 ने सिर्फ Step 1 (Read) किया और तभी Thread-2 आ गया, तो दोनों को पुरानी वैल्यू ही
मिलेगी। इसे ही हम Race Condition कहते हैं, क्योंकि यहाँ Atomicity नहीं थी।

Java में Atomicity कैसे लाएं?अगर आपको किसी ऑपरेशन को Atomic बनाना है, तो आपके पास 2 रास्ते हैं:synchronized का इस्तेमाल
करें: पूरे ब्लॉक को लॉक कर दें ताकि तीनों स्टेप्स एक ही थ्रेड बिना रुके पूरे करे।Atomic Classes का इस्तेमाल करें: Java
में रेडीमेड क्लासेस हैं जैसे AtomicInteger, AtomicBoolean जो बिना लॉक के ही (CAS एल्गोरिथम का यूज़ करके) ऑपरेशन को
Atomic बनाती हैं।



