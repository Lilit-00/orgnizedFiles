
Ըստ ընդլայման ֆայլերը դասավորել։

File Organizer
Serob Sayadyan
•
Вчера
100 баллов
You need to create a Java program that sorts files within a specified folder based on their file type. 
The program should ask the user for the folder path, create necessary subfolders (if they don't already exist), and relocate files to their respective categories.

Requirements:

1. Develop a Java program named FileOrganizer.
2. Implement the organize() method to perform the following tasks:
Prompt the user to provide the correct path of the folder/directory they wish to organize.
Establish essential directories (Audio, Images, PDFs, Texts, Videos) if they are not already present in the working directory.
Use the dirMap to keep track of these directories.
Call the fileFormatDetector() method for each file in the specified directory.
3. Create the createDirectoryIfDoesNotExist() method to generate directories (Audio, Images, PDFs, Texts, Videos) if they are not present in the working directory.
4. Develop the organizingInDirectories() method to transfer files to their corresponding destination directories (Images, Audio, etc.).
5. Implement the writeInLog() method to record the source file path and destination directory path in a log.txt file.
6. Create the fileFormatDetector() method to recognize the file format and invoke the relevant method to place the file in the appropriate directory.
7. Define an enum named FileTypes to represent various file types (Video, Audio, Image, Text, Application).
8. Ensure that the program handles exceptions and provides suitable error messages.


Additional Guidelines:
Add meaningful comments and explanations to your code.
Test the program with various file types and scenarios.
Consider situations where the specified directory does not exist.
Evaluation Criteria:
Your project will be assessed based on the following criteria:
Accurate implementation of methods for file organization.
Proper handling of file types and directories.
Effective utilization of enums and data structures.
Clarity, readability, and documentation of your code.
Appropriate error handling for cases like invalid directory paths.
Best of luck with your task! If you have any further questions, feel free to ask
