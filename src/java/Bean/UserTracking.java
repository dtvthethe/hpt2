package Bean;


public class UserTracking {

    private String EmailAddress;
    private String LocationX;
    private String LocationY;
    private int Zoom;
    private int Size;

    public UserTracking() {
        this.Zoom = 17;
        this.Size = 640;
    }

    public UserTracking(String EmailAddress, String LocationX, String LocationY, int Zoom, int Size) {
        this.EmailAddress = EmailAddress;
        this.LocationX = LocationX;
        this.LocationY = LocationY;
        this.Zoom = Zoom;
        this.Size = Size;
    }

    public String getEmailAddress() {
        return EmailAddress.trim();
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getLocationX() {
        return LocationX.trim();
    }

    public void setLocationX(String LocationX) {
        this.LocationX = LocationX;
    }

    public String getLocationY() {
        return LocationY.trim();
    }

    public void setLocationY(String LocationY) {
        this.LocationY = LocationY;
    }

    public int getZoom() {
        return Zoom;
    }

    public void setZoom(int Zoom) {
        this.Zoom = Zoom;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }
    
    @Override
    public String toString(){
        //String EmailAddress, String LocationX, String LocationY, String Zoom, String Size
        return "{ \"email\":\""+EmailAddress+"\", \"x\":\""+LocationX+"\", \"y\":\""+LocationY+"\", \"zoom\":\""+Zoom+"\", \"size\":\""+Size+"\" }";
    }
}
