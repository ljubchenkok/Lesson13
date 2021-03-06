package ru.com.penza.lesson13.datamodel;


import java.util.Comparator;



public class Person extends Contact {
    public static final String ID = "id";
    public static final String FIRST_NAME = "firstName";
    public static final String LAST_NAME = "lastName";
    public static final String SECOND_NAME = "secondName";
    public static final String COLOR = "color";
    public static final String PHONE = "phone";
    public static final String IMAGE_URL = "image";


    private String imageURL;
    private Integer id;

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getImageUrl() {

        return imageURL;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getColor() {

        return color;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person() {

    }


    public boolean isEmpty() {
        return firstName == null && lastName == null && secondName == null;
    }

    public static class MyNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {
            String fullname1 = person1.getLastName() + person1.getFirstName() + person1.getSecondName();
            String fullname2 = person2.getLastName() + person2.getFirstName() + person2.getSecondName();
            return fullname1.compareTo(fullname2);
        }
    }

    public static class MyReverseNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person person1, Person person2) {
            String fullname1 = person1.getLastName() + person1.getFirstName() + person1.getSecondName();
            String fullname2 = person2.getLastName() + person2.getFirstName() + person2.getSecondName();
            return fullname2.compareTo(fullname1);
        }
    }


}
