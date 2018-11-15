public class Landlord {
    public String name;
    public String phoneNumber;
    public String email;

    public String getContact() {
        return String.format("Email: %s, Phone Number: %s", email, phoneNumber);
    }

}