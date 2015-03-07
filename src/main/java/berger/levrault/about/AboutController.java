package berger.levrault.about;

import berger.levrault.account.Account;
import berger.levrault.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by abdelhamid on 30/12/2014.
 */


@Controller
public class AboutController {

    private static final String ABOUT_VIEW_NAME = "about/about";


    @Autowired
    private AccountRepository accountRepository ;

    @RequestMapping(value = "about",method = RequestMethod.GET)
    public String about(Model model){
        List<Account> accounts = accountRepository.findAll();
        model.addAttribute("accounts",accounts);
        return ABOUT_VIEW_NAME;
    }
}
