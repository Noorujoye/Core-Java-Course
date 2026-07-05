### Why File Handling Exists ???

```
Imagine Java had no file handling.
String name = "Nooru";
Program runs.
Program closes.
Data is gone.
Everything stored in RAM disappears when the process ends.
```

```So we need a way to store data permanently.

This is called:
Persistence
Persistence means:
Data survives after the program stops.

Examples:
   |
   |------->    User profiles
   |------->    Logs
   |------->    Configuration
   |------->    Images
   |------->    Videos
   |------->    PDFs
   |------->    CSV files
   |------->    AI model files
   |------->    Application data

All require persistence.
File Handling = Java's way of interacting with permanent storage.
```

### Architecture

     Application
         ↓
     Java API
         ↓
     Operating System
         ↓
     File System
         ↓
     Disk (SSD/HDD)  

### process

Files.write(...)
Java doesn't directly touch SSD.
Java asks OS.
OS talks to filesystem.
Filesystem writes bytes to disk.

### Absolute Path

complete address of a file or folder starting from the absolute beginning of the computer's storage system

### Relative Path

(Directions from where you are): 