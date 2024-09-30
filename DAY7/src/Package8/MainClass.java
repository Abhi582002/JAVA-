package Package8;
import java.util.Scanner;

public class MainClass {
    
    public static Hosteller getHostellerDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student ID: ");
        int studId = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Department ID: ");
        int deptId = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Hostel Name: ");
        String hostelName = sc.nextLine();
        
        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter Phone Number: ");
        String phoneNumber = sc.nextLine();

        return new Hosteller(studId, name, deptId, hostelName, roomNo, phoneNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           
        Hosteller hosteller = getHostellerDetails();
          
        System.out.println("\nHosteller Details:");
        hosteller.displayDetails();
        
        System.out.print("\nDo you want to modify the room number? (yes/no): ");
        String modifyRoom = sc.nextLine();
        if (modifyRoom.equalsIgnoreCase("yes")) {
            System.out.print("Enter new Room Number: ");
            int newRoomNo = sc.nextInt();
            hosteller.setRoomNo(newRoomNo);
        }

        sc.nextLine();

        System.out.print("Do you want to modify the phone number? (yes/no): ");
        String modifyPhone = sc.nextLine();
        if (modifyPhone.equalsIgnoreCase("yes")) {
            System.out.print("Enter new Phone Number: ");
            String newPhoneNumber = sc.nextLine();
            hosteller.setPhoneNumber(newPhoneNumber);
        }

        System.out.println("\nUpdated Hosteller Details:");
        hosteller.displayDetails();
        
        sc.close(); 
    }
}
