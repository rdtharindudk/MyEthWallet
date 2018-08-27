package com.rtlabs.myethwallet;

public class Wallet {
    private String walletAddress;
    private String walletName;

    public Wallet(String walletAddress, String walletName) {
        this.walletAddress = walletAddress;
        this.walletName = walletName;
    }

    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public String getWalletName() {
        return walletName;
    }

    public void setWalletName(String walletName) {
        this.walletName = walletName;
    }
}
