
package th.co.geniustree.intership.jpa.basic;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Table(name = "Order_ooo")
@Entity
public class Order implements Serializable {
    @Id
    @Column(name = "Order_Id",length=10, nullable=false)
    private Integer Id;
    @Column(name = "Order_Daybuy",length=30, nullable=false)
    private Date Daybuy;
//-------------------------------------------------------------------------------
    @ManyToMany
    @JoinTable( name = "OrderItem",
            joinColumns = {
                @JoinColumn(name = "Order_Id2",referencedColumnName = "Order_Id",insertable = false,updatable = false)
            },
            inverseJoinColumns = {
                @JoinColumn(name = "Product_Id2",referencedColumnName = "Product_Id",insertable = false,updatable = false)
            }
    )
    
    private List<Product> products;
    
   //------------------------------------------------------------------------------- 
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.Id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    public Order() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Date getDaybuy() {
        return Daybuy;
    }

    public void setDaybuy(Date Daybuy) {
        this.Daybuy = Daybuy;
    }

    void setName(String computer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
