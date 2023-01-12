public class Pets {

    private String myPetName;
    private String myBreed;
    private int myAge;

    public Pets() {
    }

    public Pets(String name, String breed, int age) {
        myPetName = name;
        myBreed = breed;
        myAge = age;
    }

    // getters :
    public String GetName() {
        return myPetName;
    }

    public String GetBreed() {
        return myBreed;
    }

    public int GetAge() {
        return myAge;
    }

    // setters
    public void SetName(String name) {
        myPetName = name;
    }
    public void SetBreed(String breed) {
        myBreed = breed;
    }

    public void SetAge(int age) {
        myAge = age;
    }
}
