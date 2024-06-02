package es.pablomgdev.pfppersonalfinancialproject.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "limits")
public class Limit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "internal_id", unique = true)
    private Integer internalId;

    @Column(name = "category_id")
    private Integer categoryId;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "created_date")
    private Date createdDate;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

    @Column(name = "deleted_date")
    private Date deletedDate;

    @Column(name = "user_id")
    private UUID userId;

    public UUID getId() {
      return id;
    }

    public void setId(UUID id) {
      this.id = id;
    }

    public Integer getInternalId() {
      return internalId;
    }

    public void setInternalId(Integer internalId) {
      this.internalId = internalId;
    }

    public Integer getCategoryId() {
      return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
      this.categoryId = categoryId;
    }

    public BigDecimal getAmount() {
      return amount;
    }

    public void setAmount(BigDecimal amount) {
      this.amount = amount;
    }

    public Date getCreatedDate() {
      return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
      this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
      return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
      this.updatedDate = updatedDate;
    }

    public Boolean getIsDeleted() {
      return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
      this.isDeleted = isDeleted;
    }

    public Date getDeletedDate() {
      return deletedDate;
    }

    public void setDeletedDate(Date deletedDate) {
      this.deletedDate = deletedDate;
    }

    public UUID getUserId() {
      return userId;
    }

    public void setUserId(UUID userId) {
      this.userId = userId;
    }
}
