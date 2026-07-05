## File Handling :Managing the file.

## File I/O : Managing the data inside the file.

### Stream (I/O Stream)

- stream never stores data , it just carries
- A stream is a logical connection that allows data to flow continuously between a source and a destination.
- What it is: A logical sequence or channel of data flowing from a source (input) to a destination (output).
- Do not confuse this with Java 8 Streams (java.util.stream).
- I/O Streams process raw binary/text data sequentially.
- Java 8 Streams process collections of objects in memory using functional programming.

Why did Java introduce Streams?
Answer:
Java introduced streams to provide a uniform way of reading and writing data from different sources such as files,
keyboard, network sockets, memory, images, and other resources.

Question 2: Why do we need Streams?
Suppose Java didn't have streams.

### How would Java read:

- File
- Keyboard
- Network
- Printer
- Memory
- Image
- PDF
- Camera
- Microphone

# INPUT STREAM : An Input Stream is used to read data from a source into a Java program.

# OUTPUT STREAM : An Output Stream is used to write data from a Java program to a destination.

# InputStream is abstract because it defines a common contract for all byte input sources. It provides shared functionality while allowing subclasses to implement the actual reading mechanism.

Any operation involving external resources can fail unexpectedly, which is why checked exceptions are used.