package com.devsuperior.dslearnbds.entities;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class EnrollmentPk implements Serializable {
    private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public EnrollmentPk(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public EnrollmentPk() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnrollmentPk that = (EnrollmentPk) o;

        if (!user.equals(that.user)) return false;
        return offer.equals(that.offer);
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + offer.hashCode();
        return result;
    }
}
