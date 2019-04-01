package classes0331.lesson12;

/**
 * Created by student on 3/31/2019.
 */
public class Person {
    private String fullName;
    private int age;
    private boolean retired;

    public Person() {
    }

    public Person(String fullName, int age, boolean retired) {
        this.fullName = fullName;
        this.age = age;
        this.retired = retired;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    @Override
    public String toString() {
        return String.format("Person: %s\t Age: %s\t Retired %s", getFullName(), getAge(), isRetired());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        if (getAge() != person.getAge()) {
            return false;
        }
        if (isRetired() != person.isRetired()) {
            return false;
        }
        return getFullName() != null
                ? getFullName().equals(person.getFullName())
                : person.getFullName() == null;

    }

    @Override
    public int hashCode() {
        int result = getFullName() != null ? getFullName().hashCode() : 0;
        result = 31 * result + getAge();
        result = 31 * result + (isRetired() ? 1 : 0);
        return result;
    }

}
