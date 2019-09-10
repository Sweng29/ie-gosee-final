package com.gosee.ie.model;

import com.gosee.ie.model.enums.AdvertType;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
@Table
public class AdvertDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ADVERT_DETAIL_ID")
    private Long advertDetailId;

    @Enumerated(EnumType.STRING)
    private AdvertType advertType;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "VEHICLE_DETAIL_ID", referencedColumnName = "VEHICLE_DETAIL_ID")
    private VehicleDetail vehicleDetail;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    // Created date and modified date needs to be added.

    @Max(1)
    @Min(0)
    private Short isActive;

    public Long getAdvertDetailId() {
        return advertDetailId;
    }

    public void setAdvertDetailId(Long advertDetailId) {
        this.advertDetailId = advertDetailId;
    }

    public AdvertType getAdvertType() {
        return advertType;
    }

    public void setAdvertType(AdvertType advertType) {
        this.advertType = advertType;
    }

    public VehicleDetail getVehicleDetail() {
        return vehicleDetail;
    }

    public void setVehicleDetail(VehicleDetail vehicleDetail) {
        this.vehicleDetail = vehicleDetail;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
    }
}
