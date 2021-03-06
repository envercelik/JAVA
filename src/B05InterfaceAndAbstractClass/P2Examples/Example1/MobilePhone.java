package B05InterfaceAndAbstractClass.P2Examples.Example1;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing" + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is switched off");
        }

    }

    @Override
    public void answer() {

        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }


    @Override
    public boolean callPhone(int phoneNumber ) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("melody ring");
        } else {
            isRinging = false;
            System.out.println("Mobile phone not on or number different");
        }
        return isRinging;
    }

    @Override
    public boolean isRingging() {
        return isRinging;
    }
}
