package youcode.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity(name = "Employee")
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Employee" , nullable = false)
    private Long idEmployee;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "entry_date")
    private Date entryDate;

    @Column(name = "departure_date")
    private Date departureDate;

    @OneToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Address", unique = false, referencedColumnName = "id_Address")
    private Address address;

    public Employee(Long idEmployee, String name, Date entryDate, Date departureDate, Address address) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.entryDate = entryDate;
        this.departureDate = departureDate;
        this.address = address;
    }

    public Employee() {

    }

    public Date getDepartureDate() {
        return departureDate;
    }



    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Long getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(Long idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", entryDate=" + entryDate +
                ", departureDate=" + departureDate +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
