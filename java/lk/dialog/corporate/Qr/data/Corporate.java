package lk.dialog.corporate.Qr.data;
// Generated Sep 3, 2012 11:08:46 AM by Hibernate Tools 3.2.1.GA


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * Corporate generated by hbm2java
 */
@Component
public class Corporate  implements Serializable {


     private Integer corporateId;
     private String corporateAccount;
     private String address;
     private String telephone;
     private String fax;
     private String email;
     private String contactName;
     private Date licenseStartDate;
     private Date licenseEndDate;
     private String corporateName;
     private int corporateStatus;
     private String description;
     private Long createdUserId;
     private Date dateCreated;
     private Set<User> users = new HashSet<User>(0);
     private Set<LobGroup> lobGroups = new HashSet<LobGroup>(0);

    public Corporate() {
    }

	
    public Corporate(String corporateAccount, String email, String contactName, String corporateName, int corporateStatus) {
        this.corporateAccount = corporateAccount;
        this.email = email;
        this.contactName = contactName;
        this.corporateName = corporateName;
        this.corporateStatus = corporateStatus;
    }
    public Corporate(String corporateAccount, String address, String telephone, String fax, String email, String contactName, Date licenseStartDate, Date licenseEndDate, String corporateName, int corporateStatus, String description, Long createdUserId, Date dateCreated, Set<User> users, Set<LobGroup> lobGroups) {
       this.corporateAccount = corporateAccount;
       this.address = address;
       this.telephone = telephone;
       this.fax = fax;
       this.email = email;
       this.contactName = contactName;
       this.licenseStartDate = licenseStartDate;
       this.licenseEndDate = licenseEndDate;
       this.corporateName = corporateName;
       this.corporateStatus = corporateStatus;
       this.description = description;
       this.createdUserId = createdUserId;
       this.dateCreated = dateCreated;
       this.users = users;
       this.lobGroups = lobGroups;
    }
   
    public Integer getCorporateId() {
        return this.corporateId;
    }
    
    public void setCorporateId(Integer corporateId) {
        this.corporateId = corporateId;
    }
    public String getCorporateAccount() {
        return this.corporateAccount;
    }
    
    public void setCorporateAccount(String corporateAccount) {
        this.corporateAccount = corporateAccount;
    }
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTelephone() {
        return this.telephone;
    }
    
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getContactName() {
        return this.contactName;
    }
    
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
    public Date getLicenseStartDate() {
        return this.licenseStartDate;
    }
    
    public void setLicenseStartDate(Date licenseStartDate) {
        this.licenseStartDate = licenseStartDate;
    }
    public Date getLicenseEndDate() {
        return this.licenseEndDate;
    }
    
    public void setLicenseEndDate(Date licenseEndDate) {
        this.licenseEndDate = licenseEndDate;
    }
    public String getCorporateName() {
        return this.corporateName;
    }
    
    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }
    public int getCorporateStatus() {
        return this.corporateStatus;
    }
    
    public void setCorporateStatus(int corporateStatus) {
        this.corporateStatus = corporateStatus;
    }
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getCreatedUserId() {
        return this.createdUserId;
    }
    
    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
    public Set<User> getUsers() {
        return this.users;
    }
    
    public void setUsers(Set<User> users) {
        this.users = users;
    }
    public Set<LobGroup> getLobGroups() {
        return this.lobGroups;
    }
    
    public void setLobGroups(Set<LobGroup> lobGroups) {
        this.lobGroups = lobGroups;
    }




}


