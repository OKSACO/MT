package berger.levrault.Normalisation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by abdelhamid on 27/02/15.
 */


@Service
@Repository

public class NormalisationService {

    @Autowired
    private NormalisationRepository normalisationRepository;


    @Transactional(readOnly=true)
    public List<Normalisation> findAll() {
        return normalisationRepository.findAll();

    }
}
