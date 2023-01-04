package crudOperationsInStudentManagement.College;

public class Record {
    private int idNumber;
    private int contactNumber;
    private String name;

    public Record(){

    }
    public Record(int idNumber,int contactNumber, String name){
        this.contactNumber = contactNumber;
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }
    public String getName(){
        return name;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "Records{"
                + "name=" + name + ", idNumber=" + idNumber
                + ", contactNumber=" + contactNumber + '}';
    }
}
