package bear

import grails.web.api.WebAttributes
import groovy.transform.CompileStatic
import groovy.transform.TypeCheckingMode
import groovy.util.logging.Slf4j

@Slf4j
//@CompileStatic
class UserSessionService implements WebAttributes {

//    @CompileStatic(TypeCheckingMode.SKIP)
    User findUserByUserNameAndSiteId(String userName, Integer siteId = siteService.getCurrentSiteId()) {
        log.info("loading user by by name : " + userName + " and siteid : " + siteId)
        User user = null
        User.withTransaction {
            user = User.findByUserNameAndCmsSiteId(userName?.trim(), siteId)
        }
        log.info("loaded user by by name : " + userName + " : and site id : " + siteId + " and received user : " + user?.userName)
        user
    }
}
