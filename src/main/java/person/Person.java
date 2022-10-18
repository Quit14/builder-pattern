package person;

public class Person {
    private final String name;
    private final String surname;
    private int age;
    private boolean hasAge;
    private String address;
    private boolean hasAddress;

    protected Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.hasAge = age == 0 ? false : true;
        this.address = address;
        this.hasAddress = (address == null) ? false : true;
    }

    public boolean happyBirthday() {
        if (hasAge) {
            age++;
            return true;
        }
        return false;
    }

    public void setAddress(String city) {
        this.address = city;
        this.hasAddress = true;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(this.surname)
                .setAddress(this.address);


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person {" + "name = '" + name + '\'' +
                ", surname = '" + surname);
        if (hasAge) {
            sb.append(", age = " + age);
        }
        if (hasAddress) {
            sb.append(", address = '" + address + '\'');
        }
        sb.append("}");

        return sb.toString();
    }


}
