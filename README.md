# java2.2

This repository contains Java exercises and small programs used for learning and practice (course: Java 2.2). The projects are organized as simple standalone .java files and small packages.

## Requirements

- Java JDK 8 or newer
- A shell/terminal or an IDE (IntelliJ IDEA, Eclipse, VS Code with Java extensions)

## How to build and run

If the repository contains plain .java files or small packages, you can compile and run them from the command line:

1. Compile all Java source files (from the repository root):

   ```
   javac -d out $(find . -name "*.java")
   ```

2. Run a program by specifying its fully-qualified main class name. For example:

   ```
   java -cp out com.example.Main
   ```

If you prefer an IDE, import the folder as a Java project and run the desired Main class from the IDE.

## Project structure

- src/        - (optional) Java source files
- lib/        - (optional) third-party libraries
- out/        - compiled classes (not committed)

Note: adjust paths and class names to match the actual layout in this repository.

## Contributing

Feel free to open issues or pull requests with improvements, bug fixes, or additional exercises.


