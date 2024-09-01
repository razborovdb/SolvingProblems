package remotask;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CryptosModel implements Serializable {
    @JsonProperty("cryptoName")
    private String cryptoName;

    @JsonProperty("cryptoType")
    private String cryptoType;

    @JsonProperty("image")
    private String image;

    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonProperty("cryptoDescription")
    private String cryptoDescription;

    @JsonProperty("cryptoAmount")
    private double cryptoAmount;

    @JsonProperty("cryptoCost")
    private double cryptoCost;

    public CryptosModel() {

    }
    public CryptosModel(String cryptoName, String cryptoType, String image, String imageUrl, String cryptoDescription, double cryptoAmount, double cryptoCost) {
        this.cryptoName = cryptoName;
        this.cryptoType = cryptoType;
        this.image = image;
        this.imageUrl = imageUrl;
        this.cryptoDescription = cryptoDescription;
        this.cryptoAmount = cryptoAmount;
        this.cryptoCost = cryptoCost;
    }

    public String getCryptoName() {
        return cryptoName;
    }

    public void setCryptoName(String cryptoName) {
        this.cryptoName = cryptoName;
    }

    public String getCryptoType() {
        return cryptoType;
    }

    public void setCryptoType(String cryptoType) {
        this.cryptoType = cryptoType;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCryptoDescription() {
        return cryptoDescription;
    }

    public void setCryptoDescription(String cryptoDescription) {
        this.cryptoDescription = cryptoDescription;
    }

    public double getCryptoAmount() {
        return cryptoAmount;
    }

    public void setCryptoAmount(double cryptoAmount) {
        this.cryptoAmount = cryptoAmount;
    }

    public double getCryptoCost() {
        return cryptoCost;
    }

    public void setCryptoCost(double cryptoCost) {
        this.cryptoCost = cryptoCost;
    }

    @Override
    public String toString() {
        return "CryptosModel{" +
                ", cryptoName='" + cryptoName + '\'' +
                ", cryptoType='" + cryptoType + '\'' +
                ", image='" + image + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", cryptoDescription='" + cryptoDescription + '\'' +
                ", cryptoAmount=" + cryptoAmount +
                ", cryptoCost=" + cryptoCost +
                '}';
    }
}
