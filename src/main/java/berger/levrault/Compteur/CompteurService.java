package berger.levrault.Compteur;

import berger.levrault.account.Account;
import berger.levrault.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by abdelhamid on 26/02/15.
 */

@Service
@Repository
public class CompteurService {

    @Autowired
    private CompteurRepository compteurRepository;

    @Transactional(readOnly=true)
    public List<Compteur> findAll() {
        return compteurRepository.findAll();

    }

    @SuppressWarnings("AssignmentToMethodParameter")
    @Transactional
    public Compteur save(Compteur compteur) {

        if ( compteur != null ) {
            compteur = compteurRepository.saveAndFlush(compteur);
        }
        return compteur;
    }

    @Transactional
    public void delete(int id) {
        compteurRepository.delete(id);

    }
}
