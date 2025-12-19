**The List interface is implemented by several classes in the Java Collection Framework , such as ArrayList , LinkedList , Vector , and Stack
##key Features

1. Order Preservation
2. Indexed-Based Access
3. Allows Duplicate

HashMap 
Internal working of HashMap Insertion

step 1: Generate HashCode
step 2: Calculate Index = hashcode % arraySize
step 3: Storing in the Bucket , key value pair is stored in the bucket at the calculated index . each bucket can hold multiple key value pairs
(this called collision handling mechanism)

Internal steps:
Step 1: hashCode calculation
int hash = key.hashCode();

Step 2: index calculation
index = hash & (n - 1);

(n = array size, default = 16)