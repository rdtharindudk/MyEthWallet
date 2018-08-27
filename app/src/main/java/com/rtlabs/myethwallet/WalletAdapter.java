package com.rtlabs.myethwallet;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class WalletAdapter extends ArrayAdapter<Wallet> {

    public WalletAdapter(Activity context, ArrayList<Wallet> wallets) {
        super(context, 0, wallets);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.card_view_row, parent, false);
        }

        Wallet currentWallet = getItem(position);

        TextView walletName = listItemView.findViewById(R.id.wallet_name);
        walletName.setText(currentWallet.getWalletName());

        TextView walletAddress = listItemView.findViewById(R.id.wallet_address);
        walletAddress.setText(currentWallet.getWalletAddress());

        return listItemView;
    }
}
