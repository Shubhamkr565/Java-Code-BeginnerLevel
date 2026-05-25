What are Byte Streams?

Byte-Oriented Streams are used to read and write data in the form of bytes (8 byt).


Byte Streams are used to handle: binary data 
such as :
images, videos, audio, pdf, zip files


Why Do We Need Byte Streams?🤔

Character Streams are best for:
text files

But binary files contain: 
row bytes

so we use
Byte Streams


Main Byte Stream Classes

Class                       Purpose

FileInputStream             Read bytes
FileOutputStream            Write bytes
BufferedInputStream         Fast byte reading
BufferedOutputStream        Fast byte writing



First topic 
FileInputStream

A FileInputStream is used to read data from a file in byte form. 

it is commmonly uesd for: Images, Videos, Audio files, Binary files.

Real-life Eamples:
Imagine:
file = water tank
stream = pipe
bytes = water drops

FileInputStream (reads bytes one by one)

Basic Systax:

FileInputStream fis = new FileInputStream("abc.txt")




Important Difference

FileReader                  VS                  FileInputStream

Charcter Stram                                  Byte Stream
Text Files                                      Binary files
char-based                                      byte-based


