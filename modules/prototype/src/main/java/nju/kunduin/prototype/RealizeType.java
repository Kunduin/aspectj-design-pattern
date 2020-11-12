package nju.kunduin.prototype;

import java.util.Optional;

/** @author Kunduin */
public class RealizeType implements Cloneable {
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
    public Object clone() throws CloneNotSupportedException {
        RealizeType realizeType = (RealizeType) super.clone();
        realizeType.setEmail(this.email.orElse(null));
        realizeType.setPhone(this.phone.orElse(null));
        return realizeType;
    }
}
