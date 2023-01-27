public class Main {
    public static void main(String[] args) {
        //create default University and get all properties
        University uni1 = new University();
        uni1.getName();
        uni1.getInfo();
        uni1.getEstablishmentYear();
        uni1.getStudentPopulation();
        uni1.getFacultyPopulation();
        uni1.getFacultyNum();
        uni1.getDepartmentNum();
        uni1.getFacilityA();
        uni1.getFacilityB();
        uni1.getFacilityC();
        //This is used to create a line between each University so that it remains clear which is which.
        //They also serve the important role of being cute.
        System.out.println("\nd(*⌒▽⌒*)b");
        //Creating a new instance of the University class through the second constructor
        //And subsequently getting all properties.
        University uni2 = new University("Kita High","with a long and storied history",2003,400,50,5,6,"Roof","Pool","Library");
        uni2.getName();
        uni2.getInfo();
        uni2.getEstablishmentYear();
        uni2.getStudentPopulation();
        uni2.getFacultyPopulation();
        uni2.getFacultyNum();
        uni2.getDepartmentNum();
        uni2.getFacilityA();
        uni2.getFacilityB();
        uni2.getFacilityC();
        System.out.println("\nd(*⌒▽⌒*)b");
        //Setting all properties for the first University object and subsequently printing them
        uni1.setName("Genuine University");
        uni1.setInfo("with an authentic history");
        uni1.setEstablishmentYear(1995);
        uni1.setStudentPopulation(500);
        uni1.setFacultyPopulation(50);
        uni1.setFacultyNum(4);
        uni1.setDepartmentNum(5);
        uni1.setFacilityA("Library");
        uni1.setFacilityB("Computer Lab");
        uni1.setFacilityC("3D Printer");
        uni1.getName();
        uni1.getInfo();
        uni1.getEstablishmentYear();
        uni1.getStudentPopulation();
        uni1.getFacultyPopulation();
        uni1.getFacultyNum();
        uni1.getDepartmentNum();
        uni1.getFacilityA();
        uni1.getFacilityB();
        uni1.getFacilityC();
    }
}
//Defining Properties of the University class
class University {
    private String name;
    private String info;
    private int establishmentYear;
    private int studentPopulation;
    private int facultyPopulation;
    private int facultyNum;
    private int departmentNum;
    private String facilityA;
    private String facilityB;
    private String facilityC;
    //Creating the default constructor and initializing all values to null or 0;
    public University() {
        name = "";
        info = "";
        establishmentYear = 0;
        studentPopulation = 0;
        facultyPopulation = 0;
        facultyNum = 0;
        departmentNum = 0;
        facilityA = "";
        facilityB = "";
        facilityC = "";
        }
        //Creating the second constructor which assigns properties the value of the parameters passed.
        public University(String name, String info, int establishmentYear, int studentPopulation, int facultyPopulation, int facultyNum, int departmentNum,String facilityA, String facilityB, String facilityC) {
            this.name = name;
            this.info = info;
            this.establishmentYear = establishmentYear;
            this.studentPopulation = studentPopulation;
            this.facultyPopulation = facultyPopulation;
            this.facultyNum = facultyNum;
            this.departmentNum = departmentNum;
            this.facilityA = facilityA;
            this.facilityB = facilityB;
            this.facilityC = facilityC;
        }

   //Creating all the getters and setters in pairs
   //The getters have a space appended to them for formatting reasons
   //The setters set the value of the property to the parameter passed to them.
    public void getName() {
        System.out.print(name+" ");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getInfo() {
        System.out.print(info+" ");
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public void getEstablishmentYear() {
         System.out.print(establishmentYear+" ");
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
    public void getStudentPopulation() {
        System.out.print(studentPopulation+" ");
    }
    public void setStudentPopulation(int studentPopulation) {
        this.studentPopulation = studentPopulation;
    }

    public void getFacultyPopulation() {
        System.out.print(facultyPopulation+" ");
    }
    public void setFacultyPopulation(int facultyPopulation) {
        this.facultyPopulation = facultyPopulation;
    }

    public void getFacultyNum() {
        System.out.print(facultyNum+" ");
    }

    public void setFacultyNum(int facultyNum) {
        this.facultyNum = facultyNum;
    }

    public void getDepartmentNum() {
        System.out.print(departmentNum+" ");
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }

    public void getFacilityA() {
        System.out.print(facilityA+" ");
    }

    public void setFacilityA(String facilityA) {
        this.facilityA = facilityA;
    }

    public void getFacilityB() {
        System.out.print(facilityB+" ");
    }

    public void setFacilityB(String facilityB) {
        this.facilityB = facilityB;
    }

    public void getFacilityC() {
        System.out.print(facilityC+" ");
    }

    public void setFacilityC(String facilityC) {
        this.facilityC = facilityC;
    }
}
