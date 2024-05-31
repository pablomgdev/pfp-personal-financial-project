package es.pablomgdev.pfppersonalfinancialproject.model;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private UUID id;

    @Column(name = "internal_id", unique = true)
    private Integer internalId;

    @Column(name = "name", unique = true, length = 50)
    private String name;

    @Column(name = "description", length = 255)
    private String description;

    @Column(name = "total_amount")
    private Double totalAmount;

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

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getDescription() {
      return description;
    }

    public void setDescription(String description) {
      this.description = description;
    }

    public Double getTotalAmount() {
      return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
      this.totalAmount = totalAmount;
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
