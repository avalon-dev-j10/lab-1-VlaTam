package ru.avalon.java.dev.j10.labs.models;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    /*
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
    private int serialAndNumber;
    private static int counterOfPassports = 1; //Количество выданных паспортов

    private String firstName;
    private String secondName;
    private String middleName;
    private String lastName;

    private String birthday = "not defined";
    private String dateOfIssue = "not defined";
    private String organization = "not defined";

    public Passport(String firstName){
        this.firstName = firstName;
    }

    public Passport(String lastName, String firstName){
        this(firstName);
        this.lastName = lastName;
        serialAndNumber = counterOfPassports++;
    }

    public Passport(String lastName, String firstName, String middleName){
        this(lastName, firstName);
        this.middleName = middleName;
    }

    public Passport(String firstName, String secondName, String lastName, String middleName){
        this(lastName, firstName);
        this.secondName = secondName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void setSerialAndNumber(int serialAndNumber) {
        this.serialAndNumber = serialAndNumber;
    }



    public int getSerialAndNumber() {
        return serialAndNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public String getOrganization() {
        return organization;
    }

    @Override
    public String toString() {
        String passportInfo = "firstName: " + firstName + "\n";

        if (secondName != null)
            passportInfo += "secondName: " + secondName + "\n";
        else
            passportInfo += "secondName: not defined" + "\n";

        if (middleName != null)
            passportInfo += "middleName: " + middleName + "\n";
        else
            passportInfo += "middleName: not defined" + "\n";

        passportInfo += "lastName: " + lastName + "\n" +
                    "serialAndNumber: " + serialAndNumber + "\n" +
                    "birthday: " + birthday + "\n" +
                    "dateOfIssue: " + dateOfIssue + "\n" +
                    "organization: " + organization;

        return passportInfo;
    }
}
