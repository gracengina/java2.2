import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Details for student 1
        System.out.print("Enter Registration Number:");
        String RegistrationNumber1 = scanner.nextLine();
        System.out.print("Enter Full Name:");
        String FullName1 = scanner.nextLine();

        System.out.print("Enter Marks for unit 1 (ccs2211):");
        int ccs2211_1 = scanner.nextInt();
        System.out.print("Enter Marks for unit 2 (ccs2212):");
        int ccs2212_1 = scanner.nextInt();
        System.out.print("Enter Marks for unit 3 (ccs2213):");
        int ccs2213_1 = scanner.nextInt();
        System.out.print("Enter Marks for unit 4 (ccs2214):");
        int ccs2214_1 = scanner.nextInt();
        System.out.print("Enter Marks for unit 5 (ccs2215):");
        int ccs2215_1 = scanner.nextInt();
        System.out.print("Enter Marks for unit 6 (ccs2216):");
        int ccs2216_1 = scanner.nextInt();
        System.out.print("Enter Marks for unit 7 (ccs2217):");
        int ccs2217_1 = scanner.nextInt();

        int Total1 = ccs2211_1 + ccs2212_1 + ccs2213_1 + ccs2214_1 + ccs2215_1 + ccs2216_1 + ccs2217_1;
        double Average1 = (double)Total1 / 7;
        String Status1 = "";
        String Grade1 = "";

        // Clear input buffer
        scanner.nextLine();

        // Details for student 2
        System.out.print("Enter Registration Number:");
        String RegistrationNumber2 = scanner.nextLine();
        System.out.print("Enter Full Name:");
        String FullName2 = scanner.nextLine();

        System.out.print("Enter Marks for unit 1 (ccs2211):");
        int ccs2211_2 = scanner.nextInt();
        System.out.print("Enter Marks for unit 2 (ccs2212):");
        int ccs2212_2 = scanner.nextInt();
        System.out.print("Enter Marks for unit 3 (ccs2213):");
        int ccs2213_2 = scanner.nextInt();
        System.out.print("Enter Marks for unit 4 (ccs2214):");
        int ccs2214_2 = scanner.nextInt();
        System.out.print("Enter Marks for unit 5 (ccs2215):");
        int ccs2215_2 = scanner.nextInt();
        System.out.print("Enter Marks for unit 6 (ccs2216):");
        int ccs2216_2 = scanner.nextInt();
        System.out.print("Enter Marks for unit 7 (ccs2217):");
        int ccs2217_2 = scanner.nextInt();

        int Total2 = ccs2211_2 + ccs2212_2 + ccs2213_2 + ccs2214_2 + ccs2215_2 + ccs2216_2 + ccs2217_2;
        double Average2 = (double)Total2 / 7;
        String Status2 = "";
        String Grade2 = "";

        // Clear input buffer
        scanner.nextLine();

        // Details for student 3
        System.out.print("Enter Registration Number:");
        String RegistrationNumber3 = scanner.nextLine();
        System.out.print("Enter Full Name:");
        String FullName3 = scanner.nextLine();

        System.out.print("Enter Marks for unit 1 (ccs2211):");
        int ccs2211_3 = scanner.nextInt();
        System.out.print("Enter Marks for unit 2 (ccs2212):");
        int ccs2212_3 = scanner.nextInt();
        System.out.print("Enter Marks for unit 3 (ccs2213):");
        int ccs2213_3 = scanner.nextInt();
        System.out.print("Enter Marks for unit 4 (ccs2214):");
        int ccs2214_3 = scanner.nextInt();
        System.out.print("Enter Marks for unit 5 (ccs2215):");
        int ccs2215_3 = scanner.nextInt();
        System.out.print("Enter Marks for unit 6 (ccs2216):");
        int ccs2216_3 = scanner.nextInt();
        System.out.print("Enter Marks for unit 7 (ccs2217):");
        int ccs2217_3 = scanner.nextInt();

        int Total3 = ccs2211_3 + ccs2212_3 + ccs2213_3 + ccs2214_3 + ccs2215_3 + ccs2216_3 + ccs2217_3;
        double Average3 = (double)Total3 / 7;
        String Status3 = "";
        String Grade3 = "";

        // Clear input buffer
        scanner.nextLine();

        // Details for student 4
        System.out.print("Enter Registration Number:");
        String RegistrationNumber4 = scanner.nextLine();
        System.out.print("Enter Full Name:");
        String FullName4 = scanner.nextLine();

        System.out.print("Enter Marks for unit 1 (ccs2211):");
        int ccs2211_4 = scanner.nextInt();
        System.out.print("Enter Marks for unit 2 (ccs2212):");
        int ccs2212_4 = scanner.nextInt();
        System.out.print("Enter Marks for unit 3 (ccs2213):");
        int ccs2213_4 = scanner.nextInt();
        System.out.print("Enter Marks for unit 4 (ccs2214):");
        int ccs2214_4 = scanner.nextInt();
        System.out.print("Enter Marks for unit 5 (ccs2215):");
        int ccs2215_4 = scanner.nextInt();
        System.out.print("Enter Marks for unit 6 (ccs2216):");
        int ccs2216_4 = scanner.nextInt();
        System.out.print("Enter Marks for unit 7 (ccs2217):");
        int ccs2217_4 = scanner.nextInt();

        int Total4 = ccs2211_4 + ccs2212_4 + ccs2213_4 + ccs2214_4 + ccs2215_4 + ccs2216_4 + ccs2217_4;
        double Average4 = (double)Total4 / 7;
        String Status4 = "";
        String Grade4 = "";

        // Clear input buffer
        scanner.nextLine();

        // Details for student 5
        System.out.print("Enter Registration Number:");
        String RegistrationNumber5 = scanner.nextLine();
        System.out.print("Enter Full Name:");
        String FullName5 = scanner.nextLine();

        System.out.print("Enter Marks for unit 1 (ccs2211):");
        int ccs2211_5 = scanner.nextInt();
        System.out.print("Enter Marks for unit 2 (ccs2212):");
        int ccs2212_5 = scanner.nextInt();
        System.out.print("Enter Marks for unit 3 (ccs2213):");
        int ccs2213_5 = scanner.nextInt();
        System.out.print("Enter Marks for unit 4 (ccs2214):");
        int ccs2214_5 = scanner.nextInt();
        System.out.print("Enter Marks for unit 5 (ccs2215):");
        int ccs2215_5 = scanner.nextInt();
        System.out.print("Enter Marks for unit 6 (ccs2216):");
        int ccs2216_5 = scanner.nextInt();
        System.out.print("Enter Marks for unit 7 (ccs2217):");
        int ccs2217_5 = scanner.nextInt();

        int Total5 = ccs2211_5 + ccs2212_5 + ccs2213_5 + ccs2214_5 + ccs2215_5 + ccs2216_5 + ccs2217_5;
        double Average5 = (double)Total5 / 7;
        String Status5 = "";
        String Grade5 = "";

        System.out.println("\t                                                 Dedan Kimathi University of Technology");
        System.out.println("\t\t                                               School of Computer Science and IT");
        System.out.println("\t                                                    Department of Computer Science");
        System.out.println("\t                                                     Academic Year: 2024/2025");
        System.out.println(" \t                                                STUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Student Score Sheet");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Reg No.                Full Name       CCS 2211    CCS 2212    CCS 2213    CCS 2214    CCS 2215    CCS 2216    CCS 2217    TOTALS    AVERAGE    STATUS   GRADE");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(RegistrationNumber1+"    "+FullName1 +"        "+ccs2211_1 +"          "+ccs2212_1+"          "+ccs2213_1+"          "+ccs2214_1+"          "+ccs2215_1+"          "+ccs2216_1+"          "+ccs2217_1+"         "+Total1+"        "+Average1+Status1+Grade1);
        System.out.println(RegistrationNumber2+"    "+FullName2 +"          "+ccs2211_2 +"          "+ccs2212_2+"          "+ccs2213_2+"          "+ccs2214_2+"          "+ccs2215_2+"          "+ccs2216_2+"          "+ccs2217_2+"         "+Total2+"        "+Average2+Status2+Grade2);
        System.out.println(RegistrationNumber3+"    "+FullName3 +"        "+ccs2211_3 +"          "+ccs2212_3+"          "+ccs2213_3+"          "+ccs2214_3+"          "+ccs2215_3+"          "+ccs2216_3+"          "+ccs2217_3+"         "+Total3+"        "+Average3+Status3+Grade3);
        System.out.println(RegistrationNumber4+"    "+FullName4 +"        "+ccs2211_4 +"          "+ccs2212_4+"          "+ccs2213_4+"          "+ccs2214_4+"          "+ccs2215_4+"          "+ccs2216_4+"          "+ccs2217_4+"         "+Total4+"        "+Average4+Status4+Grade4);
        System.out.println(RegistrationNumber5+"    "+FullName5 +"        "+ccs2211_5 +"          "+ccs2212_5+"          "+ccs2213_5+"          "+ccs2214_5+"          "+ccs2215_5+"          "+ccs2216_5+"          "+ccs2217_5+"         "+Total5+"        "+Average5+Status5+Grade5);
    }
}