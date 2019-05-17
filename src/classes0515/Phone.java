package classes0515;

import java.util.Objects;

public class Phone {
    private int id;
    private int user_id;
    private String phone_number;

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Phone(int id, int user_id, String phone_number) {
        this.id = id;
        this.user_id = user_id;
        this.phone_number = phone_number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return id == phone.id &&
                user_id == phone.user_id &&
                Objects.equals(phone_number, phone.phone_number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user_id, phone_number);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }
}
