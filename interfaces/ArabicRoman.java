package interfaces;

public class ArabicRoman {
    private Integer arabic;
    private String roman;

    public ArabicRoman(String roman) {
        this.roman = roman;
    }

    public ArabicRoman(Integer arabic) {
        this.arabic = arabic;
    }

    public Integer getArabic() {
        return arabic;
    }

    public void setArabic(Integer arabic) {
        this.arabic = arabic;
    }

    public String getRoman() {
        return roman;
    }

    public void setRoman(String roman) {
        this.roman = roman;
    }
}
