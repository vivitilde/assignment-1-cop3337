import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        University uni1 = new University();
        uni1.getName();
        uni1.getInfo();
        uni1.getEstablishmentYear();
        uni1.getStudentPopulation();
        uni1.getFacultyPopulation();
        uni1.getFacultyNum();
        uni1.getDepartmentNum();
        uni1.getFacilities();
    }
}
class University {
    private String name;
    private String info;
    private int establishmentYear;
    private int studentPopulation;
    private int facultyPopulation;
    private int facultyNum;
    private int departmentNum;
    private String[] facilities;
    public University() {
        name = "test";
        info = " lorem ipsum ";
        establishmentYear = 0;
        studentPopulation = 1111;
        facultyPopulation = 2222;
        facultyNum = 3333;
        departmentNum = 4444;
        facilities = new String[]{"AAAA", "BBBB", "CCCC"};
        }
    public void getName() {
        System.out.print(name);
    }
    public void setName(String name) {
        this.name = name;
    }
    public void getInfo() {
        System.out.print(info);
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public void getEstablishmentYear() {
         System.out.print(establishmentYear);
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }
    public void getStudentPopulation() {
        System.out.print(studentPopulation);
    }
    public void setStudentPopulation(int studentPopulation) {
        this.studentPopulation = studentPopulation;
    }

    public void getFacultyPopulation() {
        System.out.print(facultyPopulation);
    }

    public void getFacultyNum() {
        System.out.print(facultyNum);
    }

    public void setFacultyNum(int facultyNum) {
        this.facultyNum = facultyNum;
    }

    public void getDepartmentNum() {
        System.out.print(departmentNum);
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }
    public void getFacilities() {
       System.out.print(facilities[0]+facilities[1]);
        }
    }
