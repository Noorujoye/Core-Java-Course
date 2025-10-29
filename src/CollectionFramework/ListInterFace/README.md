**The List interface is implemented by several classes in the Java Collection Framework , such as ArrayList , LinkedList , Vector , and Stack
##key Features

1. Order Preservation
2. Indexed-Based Access
3. Allows Duplicate

HashMap 
Internal working of HashMap Insertion

step 1: Generate HashCode
step 2: Calculate Index = hashcode % arraySize
step 3: Storing in the Bucket , key value pair is stored in th ebucket at the calculated index . each bucket can hold multiple key value pairs
(this called collision handling mechanism)