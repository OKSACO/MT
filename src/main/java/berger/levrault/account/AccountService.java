package berger.levrault.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by abdelhamid on 30/12/2014.
 */

@Service
@Repository
public class AccountService  {

    @Autowired
    private AccountRepository accountRepository;


    @Transactional(readOnly=true)
    public List<Account> findAll() {
        return accountRepository.findAll();

    }


    @SuppressWarnings("AssignmentToMethodParameter")
    @Transactional
    public Account findByEmail(String email) {
        return accountRepository.findByEmail(email);
    }

    @SuppressWarnings("AssignmentToMethodParameter")
    @Transactional
    public Account save(Account account) {

        if ( account != null ) {
            account = accountRepository.saveAndFlush(account);
        }
        return account;
    }


    @Transactional
    public void delete(long id) {
        accountRepository.delete(id);

    }
}
