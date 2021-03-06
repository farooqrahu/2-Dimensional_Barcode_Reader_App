package lk.dialog.corporate.Qr.data;
// Generated Sep 3, 2012 11:08:46 AM by Hibernate Tools 3.2.1.GA

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.springframework.stereotype.Component;

/**
 * LobGroup generated by hbm2java
 */
@Component
public class LobGroup implements Comparable<LobGroup>, Serializable {

    private Integer lobId;
    private Corporate corporate;
    private String lobName;
    private long createdUserId;
    private Date dateCreated;
    private Set<User> users = new HashSet<User>(0);
    private Set<Campaign> campaigns = new HashSet<Campaign>(0);

    public LobGroup() {
    }

    public LobGroup(Corporate corporate, String lobName, long createdUserId) {
        this.corporate = corporate;
        this.lobName = lobName;
        this.createdUserId = createdUserId;
    }

    public LobGroup(Corporate corporate, String lobName, long createdUserId, Set<User> users, Set<Campaign> campaigns) {
        this.corporate = corporate;
        this.lobName = lobName;
        this.createdUserId = createdUserId;
        this.users = users;
        this.campaigns = campaigns;
    }

    public Integer getLobId() {
        return this.lobId;
    }

    public void setLobId(Integer lobId) {
        this.lobId = lobId;
    }

    public Corporate getCorporate() {
        return this.corporate;
    }

    public void setCorporate(Corporate corporate) {
        this.corporate = corporate;
    }

    public String getLobName() {
        return this.lobName;
    }

    public void setLobName(String lobName) {
        this.lobName = lobName;
    }

    public long getCreatedUserId() {
        return this.createdUserId;
    }

    public void setCreatedUserId(long createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Set<User> getUsers() {
        return this.users;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Set<Campaign> getCampaigns() {
        return this.campaigns;
    }

    public void setCampaigns(Set<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    public int compareTo(LobGroup o) {
        int compareto = this.getDateCreated().compareTo(o.getDateCreated());
        return (compareto != 0 ? compareto : this.lobName.compareTo(o.getLobName()));
        // return (compareto != 0 ? compareto : this.lobName.compareTo(o.lobName));
    }
}
