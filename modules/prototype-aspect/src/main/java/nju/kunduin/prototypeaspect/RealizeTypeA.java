package nju.kunduin.prototypeaspect;

import java.util.Optional;

/** @author kunduin */
public class RealizeTypeA {
    private Optional<String> phone;
    private Optional<String> email;

    public Optional<String> getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = Optional.ofNullable(phone);
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Optional.ofNullable(email);
    }

    @Override
    public String toString() {
        return "RealizeTypeA{" + "phone=" + phone + ", email=" + email + '}';
    }
}
