package remotask;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.Serializable;
import java.util.List;


public class Wallets implements Serializable {

    private String userId;
    private String walletName;

    private String walletDescription;

    private Double cryptosCount;

    private Double cryptosCost;


    private List<CryptosModel> cryptocurrenciesList;

    public Wallets() {

    }

    public Wallets(String userId, String walletName, String walletDescription, Double cryptosCount, Double cryptosCost, List<CryptosModel> cryptocurrenciesList) {
        this.userId = userId;
        this.walletName = walletName;
        this.walletDescription = walletDescription;
        this.cryptosCount = cryptosCount;
        this.cryptosCost = cryptosCost;
        this.cryptocurrenciesList = cryptocurrenciesList;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }

    public String getWalletDescription() {
        return walletDescription;
    }

    public void setWalletDescription(String walletDescription) {
        this.walletDescription = walletDescription;
    }

    public Double getCryptosCount() {
        return cryptosCount;
    }

    public void setCryptosCount(Double cryptosCount) {
        this.cryptosCount = cryptosCount;
    }

    public Double getCryptosCost() {
        return cryptosCost;
    }

    public void setCryptosCost(Double cryptosCost) {
        this.cryptosCost = cryptosCost;
    }

    public List<CryptosModel> getCryptocurrenciesList() {
        return cryptocurrenciesList;
    }

    public void setCryptocurrenciesList(List<CryptosModel> cryptocurrenciesList) {
        this.cryptocurrenciesList = cryptocurrenciesList;
    }

    @Override
    public String toString() {
        String s = "";
        for(CryptosModel cryptosModel: cryptocurrenciesList) {
            s = s + cryptosModel.toString();
            s = s + "\n";
        }
        return "Wallets{" +
                "userId='" + userId + '\'' +
                ", walletName='" + walletName + '\'' +
                ", walletDescription='" + walletDescription + '\'' +
                ", cryptosCount=" + cryptosCount +
                ", cryptosCost=" + cryptosCost +
                "\n" +
                s +
                '}';
    }
}