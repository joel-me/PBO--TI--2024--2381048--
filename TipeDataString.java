public class TipeDataString {
    public static void main(String[] args) {

        String firstName ="joel";
        String lastName  =" sembiring";

       // String fullName = firstName + " " +lastName;

        String fullName1 = firstName.concat(" ").concat( lastName);
        System.out.println(fullName1);
    }
}
