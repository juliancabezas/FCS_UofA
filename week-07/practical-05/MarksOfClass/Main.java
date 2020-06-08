import java.io.*; 

public class Main {
    public static void main(String[] args) throws Exception {

        // Read the students data, it is a space separated data
        System.out.println("Reading the data on the txt:");
        Student[] studentArray = readData("students.txt");

        // Print the info in a table
        System.out.println("");
        System.out.println("Student data:");
        printStudents(studentArray);

        // Use the sortStudent method inside the Student array
        Student[] sortedStudentArray = studentArray[0].sortStudents(studentArray);

        System.out.println("");
        System.out.println("-------------------------------");
        System.out.println("Sorted students:");

        // Print the table of sorted students
        printStudents(sortedStudentArray);
 
    }

    private static Student[] readData(String filename) throws Exception{

        //I am reading the file using relative paths
        File file = new File("students.txt"); 

        BufferedReader br = new BufferedReader(new FileReader(file)); 
        
        // I will first see how many lines are in the file, store it in NLines object
        int nLines = 0;
        String line; 
        boolean keepReading = true;

        while (keepReading) {
            line = br.readLine();

            // Stop if the line is empty
            if (line != null) {
                System.out.println(line); 
                nLines++;
            } else {
                keepReading = false;
                System.out.println("Number of Lines in File: " + nLines);
            }
        } 

        br.close();

        // Now I can make an empty Student array
        Student[] studentArray = new Student[nLines];
        int lineNumber = 0;

        // Open a new buffered Reader
        BufferedReader br2 = new BufferedReader(new FileReader(file)); 

        keepReading = true;

        while (keepReading) {
            // Read each line
            line = br2.readLine();

            if (line != null) {
            
                // Put each word in a place on a new array (lineTokens)
                String[] lineTokens = line.trim().split(" ");
                String name = lineTokens[0].trim();

                // The marks are integers so we need the parseInt method to convert Strings to integers
                int physic = Integer.parseInt(lineTokens[1].trim()) ;
                int chemistry = Integer.parseInt(lineTokens[2].trim()) ;
                int maths = Integer.parseInt(lineTokens[3].trim()) ;

                // Create a student with each line of data
                studentArray[lineNumber] = new Student(name, physic, chemistry, maths);
                lineNumber++; 

            } else {
                keepReading = false;
                System.out.println("Reading Complete");
            }
        }

        br2.close();
        return studentArray;

    }

    public static void printStudents(Student[] students){

        // Using formatter to make string columns of 15 characters wide
        // See java.util.Formatter  for examples
        String leftAlignFormat = "|%-15s | %-15s | %-15s | %-15s | %-15s |%n";

        int nStudents = students.length;

        // print the titles
        System.out.format(leftAlignFormat,"Student", "AverageScore","Physic","Chemistry","Maths");

        for (int i = 0; i < nStudents; i++) {

            // Print each student in a different line
            System.out.format(leftAlignFormat,students[i].getName(), students[i].getAverage(),students[i].getPhysic(), students[i].getPhysic(), students[i].getChemistry(), students[i].getMath());

        }
    }

}