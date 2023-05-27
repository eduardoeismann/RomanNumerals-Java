package enums;

public enum RomanValues {
    M(1000,100,"M","C"),
    D(500,100,"D","C"),
    C(100,10,"C","X"),
    L(50,10,"L","X"),
    X(10,1,"X","I"),
    V(5,1,"V","I"),
    I(1,0,"I",null);

    public int value;
    public int smallerValue;
    public String romanValue;
    public String smallerRomanValue;

    private RomanValues(int value, int smallerValue, String romanValue, String smallerRomanValue) {
        this.value = value;
        this.smallerValue = smallerValue;
        this.romanValue = romanValue;
        this.smallerRomanValue = smallerRomanValue;
    }
}
