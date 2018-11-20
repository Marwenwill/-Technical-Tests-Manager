/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import com.ensi.ilsi.TechnicalTesting.Service.ManagerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Toshiba-PC
 */
@RestController
@RequestMapping("/Managers")
public class ManagerResource {
    
    private final ManagerService managerServices;

    public ManagerResource(ManagerService managerServices) {
        this.managerServices = managerServices;
    }
    
    
    
}
