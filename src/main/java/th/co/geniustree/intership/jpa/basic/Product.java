
package th.co.geniustree.intership.jpa.basic;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Table (name = "Product_ooo")
@Entity
public class Product implements Serializable{
    @Id
    @Column(name = "Product_Id",length=10, nullable=false)
    private Integer Id;
    @Column(name = "Product_name",length=30, nullable=false)
    private String name;
//-------------------------------------------------------------------------------
    @ManyToMany(mappedBy = "products")
    private List<Order> orders;
//-------------------------------------------------------------------------------   
    @Override
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
        final Product other = (Product) obj;
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        return true;
    }

    public Product() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    
}
