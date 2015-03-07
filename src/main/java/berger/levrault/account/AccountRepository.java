package berger.levrault.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by abdelhamid on 30/12/2014.
 */

public interface AccountRepository extends JpaRepository<Account,Long> {


    Account findByEmail(@Param("email") String email);
}
