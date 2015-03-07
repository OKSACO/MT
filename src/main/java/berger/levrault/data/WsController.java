package berger.levrault.data;

import berger.levrault.Compteur.Compteur;
import berger.levrault.Compteur.CompteurService;
import berger.levrault.Normalisation.Normalisation;
import berger.levrault.Normalisation.NormalisationService;
import berger.levrault.account.Account;
import berger.levrault.account.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by abdelhamid on 30/12/2014.
 */


@RestController
@RequestMapping(value = "/data")
public class WsController {

    @Autowired
    private AccountService accountService ;


    @Autowired
    private CompteurService compteurService ;

    @Autowired
    private NormalisationService normalisationService ;



    @RequestMapping(value = "getAllAccounts")
    public List<Account> getAllAccounts() {

        return accountService.findAll();
    }


    @RequestMapping(value = "getAllCompteurs")
    public List<Compteur> getAllCompteurs() {
        return compteurService.findAll();
    }

    @RequestMapping(value = "getAllNormalisations")
         public List<Normalisation> getNormalisations() {
        return normalisationService.findAll();
    }



}
