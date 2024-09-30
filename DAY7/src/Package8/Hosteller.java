package Package8;

class Hosteller extends Student {
    private String hostelName;
    private int roomNo;
    private String phoneNumber;
    
    public Hosteller(int studId, String name, int deptId, String hostelName, int roomNo, String phoneNumber) {
        super(studId, name, deptId);
        this.hostelName = hostelName;
        this.roomNo = roomNo;
        this.phoneNumber = phoneNumber;
    }
    
    public String getHostelName() {
        return hostelName;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    
    public void setPhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber; 
    }
    
    public void displayDetails() {
        System.out.println("Student ID: " + getStudId());
        System.out.println("Name: " + getName());
        System.out.println("Department ID: " + getDeptId());
        System.out.println("Hostel Name: " + getHostelName());
        System.out.println("Room Number: " + getRoomNo());
        System.out.println("Phone Number: " + getPhoneNumber());
    }
}
