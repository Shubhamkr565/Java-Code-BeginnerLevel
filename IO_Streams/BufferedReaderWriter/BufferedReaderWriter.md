What is BufferedReader?
BufferredReader is used to read text data faster and efficiently.

It reads data using a buffer memory.


Simple Definition

BufferredReader is a class used to read text efficienlty from a character-input stream.


The main advantage of BufferredReader over the FileReader is we can read the data line by line instead of character by character.

Internally performance is better.

BufferredReader can't communicate directly with the file, It will communicate with file via some Reader object.

Syntax:

BufferedReader br = new BufferedReader(Reader r);


Why do we need BufferedReader?

fr.read() only one character at a time this is slower for large files.


Real-Life Example

Imagine:
Without Buffer
You go to market and bring 1 apple at a time (Very Slow)

With Buffer
Full bag of apples  much faster (That bag = buffer memory)

Basic Systax:
BufferedReader br = new BufferedReader(new FileReader("abc.txt"));





BufferedWriter
We can use BufferedWriter class to write character data to the file.

Note: BufferedWriter class never communicate directly with the file. It communicate via some writer object.


BufferedWriter is used to: Write text data efficiently into a file
it uses: Butter memory to improve performance.


FileWriter vs BufferedWriter

Problem with FileWriter: fw.write() writes data directly to file for lerge data Slower❌.  

Solution: 
using BufferedWriter
It stores data temporarily in buffer, Writes large chucks together, improves speed

Real-life Example
Without buffer:
sending 1 letter at a time

With buffer:
sending full packet together
Fast ✅

Basic Syntax:
BufferedWriter bw = new BufferesWriter(new FileWriter("abc.txt"));


inner part 
new FileWriter("abc.txt) => Opens file for writing.



