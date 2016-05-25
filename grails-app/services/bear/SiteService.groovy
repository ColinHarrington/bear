package bear

import groovy.transform.CompileStatic

@CompileStatic
class SiteService {
    Integer currentSiteId = 222


    Integer getCurrentSiteId() {
        return currentSiteId
    }
}
