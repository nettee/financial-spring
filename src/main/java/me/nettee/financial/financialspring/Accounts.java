package me.nettee.financial.financialspring;

import org.springframework.stereotype.Component;

@Component
public class Accounts {

    public String getAccountList() {
        return "getting account list";
    }

    public String postAccount() {
        return "posting account";
    }

    public String getAccount(String uuid) {
        return "getting account <" + uuid + ">";
    }

    public String deleteAccount(String uuid) {
        return "deleting account <" + uuid + ">";
    }
}
