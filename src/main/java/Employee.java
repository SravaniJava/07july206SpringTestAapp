public class Employee {
    private Integer eId;
    private String eName;
    private Double eSal;

    public Employee(Integer eId, String eName, Double eSal) {
        this.eId = eId;
        this.eName = eName;
        this.eSal = eSal;
    }

    public Employee() {
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public Double geteSal() {
        return eSal;
    }

    public void seteSal(Double eSal) {
        this.eSal = eSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eSal=" + eSal +
                '}';
    }
}
