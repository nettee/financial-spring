package me.nettee.financial.financialspring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountsController {

    private Accounts accounts;

    public AccountsController(Accounts accounts) {
        this.accounts = accounts;
    }

    @GetMapping
    public String getAccountList() {
        return accounts.getAccountList();
    }

    @PostMapping
    public String postAccount() {
        return accounts.postAccount();
    }

    @GetMapping("/{uuid}")
    public String getAccount(@PathVariable String uuid) {
        return accounts.getAccount(uuid);
    }

    @DeleteMapping("/{uuid}")
    public String deleleAccount(@PathVariable String uuid) {
        return accounts.deleteAccount(uuid);
    }
}
