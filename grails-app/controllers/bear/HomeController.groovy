package bear

class HomeController {
    UserSessionService userSessionService

    def hello(String id) {
        [msg: "message", user: userSessionService.findUserByUserNameAndSiteId(id)]
    }
}
